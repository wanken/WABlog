package org.wablog.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/31 11:57
 */
@Entity
@Table(name = "group_role", schema = "wablog")
public class GroupRole {
    private long id;
    private long refRoleId;
    private long refGroupId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ref_role_id")
    public long getRefRoleId() {
        return refRoleId;
    }

    public void setRefRoleId(long refRoleId) {
        this.refRoleId = refRoleId;
    }

    @Basic
    @Column(name = "ref_group_id")
    public long getRefGroupId() {
        return refGroupId;
    }

    public void setRefGroupId(long refGroupId) {
        this.refGroupId = refGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupRole that = (GroupRole) o;
        return id == that.id &&
                refRoleId == that.refRoleId &&
                refGroupId == that.refGroupId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refRoleId, refGroupId);
    }
}
