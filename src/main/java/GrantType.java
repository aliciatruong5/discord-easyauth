
public enum GrantType {
    AuthorizationCode("authorization_code"),
    RefreshToken("refresh_token"),
    ClientCredentials("client_credentials");

    private final String value;

    private GrantType(final String value) {
        this.value = value;
    }
}
