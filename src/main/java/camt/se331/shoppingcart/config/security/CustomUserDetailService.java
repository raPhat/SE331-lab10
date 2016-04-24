package camt.se331.shoppingcart.config.security;

import camt.se331.shoppingcart.entity.Role;
import camt.se331.shoppingcart.entity.User;
import camt.se331.shoppingcart.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by raPhat on 4/24/16 AD.
 */
@Component
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserServiceImpl userService;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, DataAccessException {
        User user = userService.findByUserName(userName);
        if(user == null) {
            throw new UsernameNotFoundException("User name" + userName + "not found");
        }
        return new SecurityUser(user);
    }

}
