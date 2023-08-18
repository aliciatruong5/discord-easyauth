package standardOAuth2;

public class AuthorizeUrlRequest {
    //https://discord.com/oauth2/authorize?response_type=code&client_id=157730590492196864&scope=identify%20guilds.join&state=15773059ghq9183habn&redirect_uri=https%3A%2F%2Fnicememe.website&prompt=consent

    private String responseType;
    private String clientId;
    private String scope;
    private String state;
    private String redirectUri;
    private String prompt;

}
