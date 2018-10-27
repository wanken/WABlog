package org.wablog.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "user", schema = "wablog")
public class User {
    private long id;
    private String email;
    private String username;
    private String password;
    private Long refSettingsId;
    private Integer passwdErrorCount;
    private int status;
    private Timestamp createTiem;
    private Timestamp updateTime;
    private Timestamp lastSignTime;

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

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
    @Column(name = "passwd_error_count")
    public Integer getPasswdErrorCount() {
        return passwdErrorCount;
    }

    public void setPasswdErrorCount(Integer passwdErrorCount) {
        this.passwdErrorCount = passwdErrorCount;
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

    @Basic
    @Column(name = "last_sign_time")
    public Timestamp getLastSignTime() {
        return lastSignTime;
    }

    public void setLastSignTime(Timestamp lastSignTime) {
        this.lastSignTime = lastSignTime;
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
                Objects.equals(passwdErrorCount, that.passwdErrorCount) &&
                Objects.equals(createTiem, that.createTiem) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(lastSignTime, that.lastSignTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username, password, refSettingsId, passwdErrorCount, status, createTiem, updateTime, lastSignTime);
    }
}
