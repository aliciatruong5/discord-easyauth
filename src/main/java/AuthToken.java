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
    private String accessToken;
    private String tokenType;
    private String expiresIn;
    private String refreshToken;
    private String scope;

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

    private AuthToken(AuthBuilder builder) {
        this.accessToken = builder.accessToken;
        this.tokenType = builder.tokenType;
        this.expiresIn = builder.expiresIn;
        this.refreshToken = builder.refreshToken;
        this.scope = `builder.scope;
    }

    public static class AuthBuilder() {
        private String accessToken;
        private String tokenType;
        private String expiresIn;
        private String refreshToken;
        private String scope;

        public AuthBuilder(String aT, String tT, String eI, String rT, String s) {
            this.accessToken = aT;
            this.tokenType = tT;
            this.expiresIn = eI;
            this.refreshToken = rT;
            this.scope = s;
        }

        public AuthToken build() {
            return new AuthToken(this);
        }
    }

}
