package camt.se331.shoppingcart.entity.transfer;

/**
 * Created by raPhat on 4/24/16 AD.
 */
public class TokenTransfer {
    private final String token;

    public TokenTransfer(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
