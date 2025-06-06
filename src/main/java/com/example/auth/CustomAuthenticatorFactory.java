package com.example.auth;

import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderFactory;

import org.keycloak.Config;
import java.util.ArrayList;
import java.util.List;

public class CustomAuthenticatorFactory implements AuthenticatorFactory, ProviderFactory<Authenticator> {
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
    public List<ProviderConfigProperty> getConfigProperties() {
        return new ArrayList<>(); // Возвращаем пустой список, если нет конфигурации
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

    @Override
    public Authenticator create(KeycloakSession session) {
        return new CustomAuthenticator(); // Предполагается, что у вас есть класс CustomAuthenticator
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public void init(Config.Scope config) {
        // Инициализация, если требуется
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
        // Действия после инициализации, если требуется
    }

    @Override
    public void close() {
        // Освобождение ресурсов, если требуется
    }
}
