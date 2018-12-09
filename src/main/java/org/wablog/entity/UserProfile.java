package org.wablog.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/31 11:57
 */
@Entity
@Table(name = "user_profile", schema = "wablog")
public class UserProfile {
    private long id;
    private long refUserId;
    private long refProfileId;

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
    @Column(name = "ref_profile_id")
    public long getRefProfileId() {
        return refProfileId;
    }

    public void setRefProfileId(long refProfileId) {
        this.refProfileId = refProfileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserProfile that = (UserProfile) o;
        return id == that.id &&
                refUserId == that.refUserId &&
                refProfileId == that.refProfileId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refUserId, refProfileId);
    }
}
