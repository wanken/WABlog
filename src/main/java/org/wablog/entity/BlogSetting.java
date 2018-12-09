package org.wablog.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/31 11:57
 */
@Entity
@Table(name = "blog_setting", schema = "wablog")
public class BlogSetting {
    private long id;
    private int visible;
    private String commentable;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "visible")
    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "commentable")
    public String getCommentable() {
        return commentable;
    }

    public void setCommentable(String commentable) {
        this.commentable = commentable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlogSetting that = (BlogSetting) o;
        return id == that.id &&
                visible == that.visible &&
                Objects.equals(commentable, that.commentable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, visible, commentable);
    }
}
