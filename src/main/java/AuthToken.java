import java.util.Locale;

public class AuthToken {
    /*
     *    {
     *      "access_token": "6qrZcUqja7812RVdnEKjpzOL4CvHBFG",
     *      "token_type": "Bearer",
     *      "expires_in": 604800,
     *      "refresh_token": "D43f5y0ahjqew82jZ4NViEr2YafMKhue",
     *      "scope": "identify"
     *      }
     */
    private final String accessToken;
    private final String tokenType;
    private final String expiresIn;
    private final String refreshToken;
    private final String scope;
    private AuthToken(Builder builder) {
        this.accessToken = builder.accessToken;
        this.tokenType = builder.tokenType;
        this.expiresIn = builder.expiresIn;
        this.refreshToken = builder.refreshToken;
        this.scope = builder.scope;
    }

    public String getAccessToken() {
        return accessToken;
    }
    public String getTokenType() {
        return tokenType;
    }
    public String getExpiresIn() {
        return expiresIn;
    }
    public String getRefreshToken() {
        return refreshToken;
    }
    public String getScope() {
        return scope;
    }


    public static class Builder {
        private String accessToken;
        private String tokenType;
        private String expiresIn;
        private String refreshToken;
        private String scope;

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public Builder expiresIn(String expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }
        public AuthToken build() {
            return new AuthToken(this);
        }
    }
}
