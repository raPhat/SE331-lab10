package camt.se331.shoppingcart.entity.transfer;

import java.util.Map;

/**
 * Created by raPhat on 4/24/16 AD.
 */
public class UserTransfer {
    private final String name;
    private final Map<String, Boolean> roles;

    public UserTransfer(String name, Map<String, Boolean> roles) {
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public Map<String, Boolean> getRoles() {
        return roles;
    }
}
