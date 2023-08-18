package standardOAuth2;

public class AuthorizeUrlRequest {
    //https://discord.com/oauth2/authorize?response_type=code&client_id=157730590492196864&scope=identify%20guilds.join&state=15773059ghq9183habn&redirect_uri=https%3A%2F%2Fnicememe.website&prompt=consent

    private String responseType;
    private String clientId;
    private String scope;
    private String state;
    private String redirectUri;
    private String prompt;
    private AuthorizeUrlRequest(Builder builder) {
        this.responseType = builder.responseType;
        this.clientId = builder.clientId;
        this.scope = builder.scope;
        this.state = builder.state;
        this.redirectUri = builder.state;
        this.prompt = builder.prompt;
    }

    public String getResponseType() {
        return responseType;
    }
    public String getClientId() {
        return clientId;
    }
    public String getScope() {
        return scope;
    }
    public String getState() {
        return state;
    }
    public String getRedirectUri() {
        return redirectUri;
    }
    public String getPrompt() {
        return prompt;
    }

    public static class Builder {
        private String responseType;
        private String clientId;
        private String scope;
        private String state;
        private String redirectUri;
        private String prompt;

        public Builder responseType(String responseType) {
            this.responseType = responseType;
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }
        public Builder state(String state) {
            this.state = state;
            return this;
        }
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public AuthorizeUrlRequest build() {
            return new AuthorizeUrlRequest(this);
        }
    }
}
