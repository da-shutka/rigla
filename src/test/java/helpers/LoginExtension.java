package helpers;

import auth.AuthorizationWeb;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class LoginExtension implements BeforeAllCallback{

    @Override
    public void beforeAll(ExtensionContext context) {

        AuthorizationWeb.addCookies();
    }
}
