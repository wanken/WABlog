package org.wablog.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "authority", schema = "wablog")
public class Authority {
    private int id;
    private String authorityName;
    private int owner;
    private int group;
    private int others;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "permission_name")
    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String permissionName) {
        this.authorityName = permissionName;
    }

    @Basic
    @Column(name = "owner")
    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "group")
    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Basic
    @Column(name = "others")
    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Authority that = (Authority) o;
        return id == that.id &&
                owner == that.owner &&
                group == that.group &&
                others == that.others &&
                Objects.equals(authorityName, that.authorityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorityName, owner, group, others);
    }
}
