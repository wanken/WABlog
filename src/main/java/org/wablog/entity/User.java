package org.wablog.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

/**
 * @author waver
 * @date 2018/10/31 11:57
 */
@Entity
@Table(name = "user", schema = "wablog")
public class User implements UserDetails {
    private long id;
    private String email;
    private String username;
    private String password;
    private Long refSettingsId;
    private Integer passwordErrorCount;
    private int status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp lastSignTime;

    /**
     * 设置用户和角色的多对多关系
     */
    @ManyToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
    private List<Role> roles;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return  Collections.singletonList(new SimpleGrantedAuthority("READER"));
    }

    @Override
    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ref_settings_id")
    public Long getRefSettingsId() {
        return refSettingsId;
    }

    public void setRefSettingsId(Long refSettingsId) {
        this.refSettingsId = refSettingsId;
    }

    @Basic
    @Column(name = "password_error_count")
    public Integer getPasswordErrorCount() {
        return passwordErrorCount;
    }

    public void setPasswordErrorCount(Integer passwordErrorCount) {
        this.passwordErrorCount = passwordErrorCount;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    @Basic
    @Column(name = "last_sign_time")
    public Timestamp getLastSignTime() {
        return lastSignTime;
    }

    public void setLastSignTime(Timestamp lastSignTime) {
        this.lastSignTime = lastSignTime;
    }

    private List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User that = (User) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(email, that.email) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(refSettingsId, that.refSettingsId) &&
                Objects.equals(passwordErrorCount, that.passwordErrorCount) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(lastSignTime, that.lastSignTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username, password, refSettingsId, passwordErrorCount, status, createTime, updateTime, lastSignTime);
    }
}
