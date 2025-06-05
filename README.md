docker build -t keycloak-extension .
docker exec -it --rm -v $(pwd):/opt/keycloak keycloak-extension bash