package org.wablog.common.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.wablog.entity.User;
import org.wablog.repository.UserRepository;

/**
 * 自定义UserDetailsService实现类
 * @author waver
 * @date 2018/11/1 10:15
 */
public class WaUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在!");
        }
        return user;
    }
}
