package org.wablog.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "blog", schema = "wablog")
public class Blog {
    private long id;
    private long refContextId;
    private long authorId;
    private long asGroupId;
    private long asOrgId;
    private long refCategorieId;
    private long refTagsId;
    private Timestamp createTime;
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
    @Column(name = "ref_context_id")
    public long getRefContextId() {
        return refContextId;
    }

    public void setRefContextId(long refContextId) {
        this.refContextId = refContextId;
    }

    @Basic
    @Column(name = "author_id")
    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "as_group_id")
    public long getAsGroupId() {
        return asGroupId;
    }

    public void setAsGroupId(long asGroupId) {
        this.asGroupId = asGroupId;
    }

    @Basic
    @Column(name = "as_org_id")
    public long getAsOrgId() {
        return asOrgId;
    }

    public void setAsOrgId(long asOrgId) {
        this.asOrgId = asOrgId;
    }

    @Basic
    @Column(name = "ref_categorie_id")
    public long getRefCategorieId() {
        return refCategorieId;
    }

    public void setRefCategorieId(long refCategorieId) {
        this.refCategorieId = refCategorieId;
    }

    @Basic
    @Column(name = "ref_tags_id")
    public long getRefTagsId() {
        return refTagsId;
    }

    public void setRefTagsId(long refTagsId) {
        this.refTagsId = refTagsId;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
        Blog that = (Blog) o;
        return id == that.id &&
                refContextId == that.refContextId &&
                authorId == that.authorId &&
                asGroupId == that.asGroupId &&
                asOrgId == that.asOrgId &&
                refCategorieId == that.refCategorieId &&
                refTagsId == that.refTagsId &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refContextId, authorId, asGroupId, asOrgId, refCategorieId, refTagsId, createTime, updateTime);
    }
}
