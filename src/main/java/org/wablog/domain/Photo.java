package org.wablog.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "photo", schema = "wablog")
public class Photo {
    private long id;
    private long refAlbumId;
    private String path;
    private String desc;
    private Timestamp createTiem;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ref_album_id")
    public long getRefAlbumId() {
        return refAlbumId;
    }

    public void setRefAlbumId(long refAlbumId) {
        this.refAlbumId = refAlbumId;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "create_tiem")
    public Timestamp getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(Timestamp createTiem) {
        this.createTiem = createTiem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Photo that = (Photo) o;
        return id == that.id &&
                refAlbumId == that.refAlbumId &&
                Objects.equals(path, that.path) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(createTiem, that.createTiem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refAlbumId, path, desc, createTiem);
    }
}
