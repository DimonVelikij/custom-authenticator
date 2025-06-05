docker build -t keycloak-extension .
docker run -it --rm -v $(pwd):/opt/keycloak keycloak-extension bash