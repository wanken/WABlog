package org.wablog.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/31 11:57
 */
@Entity
@Table(name = "role", schema = "wablog")
public class Role {
    private int id;
    private String name;
    private String photo;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
                Objects.equals(name, that.name) &&
                Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, photo);
    }
}
