package am.itspace.cafemanagementsystem.JWT;

import am.itspace.cafemanagementsystem.dao.UserDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerUsersDetailsService implements UserDetailsService {

    private final UserDao userDao;

    private am.itspace.cafemanagementsystem.POJO.User userDetail;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Inside loadUserByUsername {}", username);
        userDetail = userDao.findByEmail(username);
        if (!Objects.isNull(userDetail)) {
            return new User(userDetail.getEmail(), userDetail.getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found!");
        }
    }

    public am.itspace.cafemanagementsystem.POJO.User getUserDetail() {
//        am.itspace.cafemanagementsystem.POJO.User user = userDetail;
//        user.setPassword(null);
//        return user;
        return userDetail;
    }
}
