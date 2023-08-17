public class AuthorizeRequest {
    private final String clientId;
    private final String clientSecret;
    private final GrantType grantType;
    private final String refreshToken;
    private AuthorizeRequest(Builder builder) {
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.grantType = builder.grantType;
        this.refreshToken = builder.refreshToken;
    }

    public String getClientId() {
        return clientId;
    }
    public String getClientSecret() {
        return clientSecret;
    }
    public GrantType getGrantType() {
        return grantType;
    }
    public String getRefreshToken() {
        return refreshToken;
    }
    public static class Builder {
        private String clientId;
        private String clientSecret;
        private GrantType grantType;
        private String refreshToken;

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder grantType(GrantType grantType) {
            this.grantType = grantType;
            return this;
        }
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public AuthorizeRequest build() {
            return new AuthorizeRequest(this);
        }
    }
}
