public class AuthorizeResponse {
    private AuthToken authToken;
    private AuthorizeResponse(Builder builder) {
        this.authToken = builder.authToken;
    }
    public AuthToken getAuthToken() {
        return authToken;
    }
    public static class Builder {
        private AuthToken authToken;
        public Builder authToken(AuthToken authToken) {
            this.authToken = authToken;
            return this;
        }
        public AuthorizeResponse build() {
            return new AuthorizeResponse(this);
        }
    }
}
