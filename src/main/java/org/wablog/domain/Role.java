package org.wablog.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "role", schema = "wablog")
public class Role {
    private int id;
    private String roleName;
    private String rolePhoto;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_photo")
    public String getRolePhoto() {
        return rolePhoto;
    }

    public void setRolePhoto(String rolePhoto) {
        this.rolePhoto = rolePhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role that = (Role) o;
        return id == that.id &&
                Objects.equals(roleName, that.roleName) &&
                Objects.equals(rolePhoto, that.rolePhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName, rolePhoto);
    }
}
