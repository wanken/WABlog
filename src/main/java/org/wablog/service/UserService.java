package org.wablog.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.wablog.entity.User;

/**
 * @author waver
 * @date 2018/10/27 12:04
 */
public interface UserService extends PagingAndSortingRepository<User, Long> {


    /**
     * 根据用户名查询用户
     * @param id 用户名
     * @return User
     */
    User findUserById(Long id);

    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return User
     */
    User findByUsername(String username);

}
