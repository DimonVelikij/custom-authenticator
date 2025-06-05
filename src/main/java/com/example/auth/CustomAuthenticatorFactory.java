package com.example.auth;

import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSessionFactory;

import java.util.List;

public class CustomAuthenticatorFactory implements AuthenticatorFactory {
    public static final String ID = "custom-authenticator";

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public Authenticator create(KeycloakSession session) {
        return new CustomAuthenticator();
    }

    @Override
    public String getDisplayType() {
        return "Custom Authenticator";
    }

    @Override
    public String getHelpText() {
        return "Custom authenticator example";
    }

    @Override
    public boolean isConfigurable() { return false; }

    @Override
    public void init(Config.Scope scope) {}

    @Override
    public void postInit(KeycloakSessionFactory factory) {}

    @Override
    public void close() {}

    @Override
    public List<org.keycloak.provider.ProviderConfigProperty> getConfigProperties() {
        return null;
    }

    @Override
    public boolean isUserSetupAllowed() {
        return false;
    }

    @Override
    public String getReferenceCategory() {
        return null;
    }

    @Override
    public boolean isRequirementChoicesAllowed() {
        return true;
    }

    @Override
    public org.keycloak.authentication.AuthenticatorRequirement[] getRequirementChoices() {
        return new org.keycloak.authentication.AuthenticatorRequirement[]{
                org.keycloak.authentication.AuthenticatorRequirement.REQUIRED,
                org.keycloak.authentication.AuthenticatorRequirement.DISABLED
        };
    }
}
