package org.wablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wablog.entity.Role;

/**
 * 角色 Repository
 * @author waver
 * @date 2018/11/1 10:28
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
