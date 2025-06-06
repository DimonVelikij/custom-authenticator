package com.example.auth;

import org.keycloak.authentication.ConfigurableAuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;

import java.util.List;

public class CustomAuthenticatorFactory implements ConfigurableAuthenticatorFactory {
    public static final String ID = "custom-authenticator";

    @Override
    public String getDisplayType() {
        return "Custom Authenticator";
    }

    @Override
    public String getHelpText() {
        return "Custom authenticator example";
    }

    @Override
    public boolean isConfigurable() {
        return false;
    }

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
    public AuthenticationExecutionModel.Requirement[] getRequirementChoices() {
        return new AuthenticationExecutionModel.Requirement[]{
                AuthenticationExecutionModel.Requirement.REQUIRED,
                AuthenticationExecutionModel.Requirement.DISABLED
        };
    }
}
