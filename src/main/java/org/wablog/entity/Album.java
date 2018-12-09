package org.wablog.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/31 11:57
 */
@Entity
@Table(name = "album", schema = "wablog")
public class Album {
    private long id;
    private long refUserId;
    private String name;
    private String description;
    private long coverId;
    private String encrypted;
    private Timestamp createTiem;
    private Timestamp updateTime;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "cover_id")
    public long getCoverId() {
        return coverId;
    }

    public void setCoverId(long coverId) {
        this.coverId = coverId;
    }

    @Basic
    @Column(name = "encrypted")
    public String getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

    @Basic
    @Column(name = "create_tiem")
    public Timestamp getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(Timestamp createTiem) {
        this.createTiem = createTiem;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Album that = (Album) o;
        return id == that.id &&
                refUserId == that.refUserId &&
                coverId == that.coverId &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(encrypted, that.encrypted) &&
                Objects.equals(createTiem, that.createTiem) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refUserId, name, description, coverId, encrypted, createTiem, updateTime);
    }
}
