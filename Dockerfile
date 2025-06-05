FROM openjdk:17-jdk-slim

# Устанавливаем необходимые зависимости
RUN apt-get update  \
    && apt-get install -y \
        curl \
        maven \
    && rm -rf /var/lib/apt/lists/*

# Устанавливаем переменные окружения для Keycloak
ENV KEYCLOAK_VERSION=26.2.5
ENV KEYCLOAK_HOME=/opt/keycloak

COPY . /opt/keycloak

WORKDIR $KEYCLOAK_HOME

CMD ["bin/kc.sh", "start-dev"]