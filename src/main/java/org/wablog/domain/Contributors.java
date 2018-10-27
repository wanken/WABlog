package org.wablog.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "contributors", schema = "wablog")
public class Contributors {
    private long id;
    private long refGroupId;
    private String refUserId;
    private int isBlogger;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ref_group_id")
    public long getRefGroupId() {
        return refGroupId;
    }

    public void setRefGroupId(long refGroupId) {
        this.refGroupId = refGroupId;
    }

    @Basic
    @Column(name = "ref_user_id")
    public String getRefUserId() {
        return refUserId;
    }

    public void setRefUserId(String refUserId) {
        this.refUserId = refUserId;
    }

    @Basic
    @Column(name = "is_blogger")
    public int getIsBlogger() {
        return isBlogger;
    }

    public void setIsBlogger(int isBlogger) {
        this.isBlogger = isBlogger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contributors that = (Contributors) o;
        return id == that.id &&
                refGroupId == that.refGroupId &&
                isBlogger == that.isBlogger &&
                Objects.equals(refUserId, that.refUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refGroupId, refUserId, isBlogger);
    }
}
