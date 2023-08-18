package standardOAuth2;

public class AuthorizeUrlResponse {
    //https://nicememe.website/?code=NhhvTDYsFcdgNLnnLijcl7Ku7bEEeee&state=15773059ghq9183habn
    private String code;
    private String state;
    private AuthorizeUrlResponse(Builder builder) {
        this.code = builder.code;
        this.state = builder.state;
    }
    public String getCode() {
        return code;
    }
    public String getState() {
        return state;
    }

    public static class Builder {
        private String code;
        private String state;

        public Builder code(String code) {
            this.code = code;
            return this;
        }
        public Builder state(String state) {
            this.state = state;
            return this;
        }
        public AuthorizeUrlResponse build() {
            return new AuthorizeUrlResponse(this);
        }
    }
}
