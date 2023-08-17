public interface GrantHandler {
    AuthToken handle(AuthorizeRequest request);
}
