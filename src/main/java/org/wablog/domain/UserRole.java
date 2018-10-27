package org.wablog.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "user_role", schema = "wablog")
public class UserRole {
    private long id;
    private long refUserId;
    private long refRoleId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ref_user_id")
    public long getRefUserId() {
        return refUserId;
    }

    public void setRefUserId(long refUserId) {
        this.refUserId = refUserId;
    }

    @Basic
    @Column(name = "ref_role_id")
    public long getRefRoleId() {
        return refRoleId;
    }

    public void setRefRoleId(long refRoleId) {
        this.refRoleId = refRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRole that = (UserRole) o;
        return id == that.id &&
                refUserId == that.refUserId &&
                refRoleId == that.refRoleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refUserId, refRoleId);
    }
}
