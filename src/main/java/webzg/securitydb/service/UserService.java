package webzg.securitydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import webzg.securitydb.bean.User;
import webzg.securitydb.mapper.UserMapper;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/10/29 0029
 * @Version V1.0
 **/
@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username"+username);
        User user=userMapper.loadUserByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        user.setRoles(userMapper.getUsersById(user.getId()));
        System.out.println(user);
        return user;
    }
}
