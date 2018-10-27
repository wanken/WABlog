package org.wablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wablog.domain.User;

/**
 * @author waver
 * @date 2018/10/25 16:18
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return User
     */
    User findByUsername(String username);

}
