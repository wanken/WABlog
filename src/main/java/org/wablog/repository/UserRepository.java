package org.wablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wablog.entity.User;

/**
 * @author waver
 * @date 2018/10/25 16:18
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return User
     */
    User findByUsername(String username);

    /**
     * 根据用户名密码获取用户
     *
     * @param username 用户名
     * @param password 密码
     * @return User
     */
    User findByUsernameAndPassword(String username, String password);

    /**
     * 根据 ID 查询用户
     *
     * @param id 用户ID
     * @return User
     */
    User findUserById(Long id);
}
