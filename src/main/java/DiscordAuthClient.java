import java.util.ArrayList;
import java.util.List;

public class DiscordAuthClient {
    private AuthorizationCodeHandler authorizationCodeHandler;
    private ClientCredentialsHandler clientCredentialsHandler;
    private RefreshTokenHandler refreshTokenHandler;
    private List<GrantHandler> handlers;

    public DiscordAuthClient() {
        this.handlers = new ArrayList<>();
        authorizationCodeHandler = new AuthorizationCodeHandler();
        refreshTokenHandler = new RefreshTokenHandler();
        clientCredentialsHandler = new ClientCredentialsHandler();
        handlers.add(authorizationCodeHandler);
        handlers.add(refreshTokenHandler);
        handlers.add(clientCredentialsHandler);
    }


    /**
     * import requests
     *
     * API_ENDPOINT = 'https://discord.com/api/v10'
     * CLIENT_ID = '332269999912132097'
     * CLIENT_SECRET = '937it3ow87i4ery69876wqire'
     * REDIRECT_URI = 'https://nicememe.website'
     *
     * def exchange_code(code):
     *   data = {
     *     'client_id': CLIENT_ID,
     *     'client_secret': CLIENT_SECRET,
     *     'grant_type': 'authorization_code',
     *     'code': code,
     *     'redirect_uri': REDIRECT_URI
     *   }
     *   headers = {
     *     'Content-Type': 'application/x-www-form-urlencoded'
     *   }
     *   r = requests.post('%s/oauth2/token' % API_ENDPOINT, data=data, headers=headers)
     *   r.raise_for_status()
     *   return r.json()
     *
     *   {
     *      "access_token": "6qrZcUqja7812RVdnEKjpzOL4CvHBFG",
     *      "token_type": "Bearer",
     *      "expires_in": 604800,
     *      "refresh_token": "D43f5y0ahjqew82jZ4NViEr2YafMKhue",
     *      "scope": "identify"
     *      }
     */

    public AuthorizeResponse authenticate(final AuthorizeRequest request) {
        final GrantType grantType = request.getGrantType();
        AuthToken token;
        switch (grantType) {
            case AuthorizationCode:
                token = authorizationCodeHandler.handle(request);
                break;
            case ClientCredentials:
                token = clientCredentialsHandler.handle(request);
                break;
            case RefreshToken:
                token = refreshTokenHandler.handle(request);
                break;
            default:
                return null; //invalid grant type
        }
        return new AuthorizeResponse();
    }
}
