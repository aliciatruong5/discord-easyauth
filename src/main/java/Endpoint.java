public enum Endpoint {
    /**
    https://discord.com/oauth2/authorize	Base authorization URL
    https://discord.com/api/oauth2/token	Token URL
    https://discord.com/api/oauth2/token/revoke Token Revocation URL
     **/
    BASE_AUTH_URL("https://discord.com/oauth2/authorize"),
    TOKEN_URL("https://discord.com/api/oauth2/token"),
    TOKEN_REVOKE_URL("https://discord.com/api/oauth2/token/revoke");

    Endpoint(final String url) {
        this.url = url;
    }

    private String url;
}
