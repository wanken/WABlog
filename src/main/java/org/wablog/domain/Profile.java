package org.wablog.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author waver
 * @date 2018/10/25 11:42
 */
@Entity
@Table(name = "profile", schema = "wablog")
public class Profile {
    private long id;
    private String picture;
    private String motto;
    private Integer phone;
    private Integer gender;
    private Timestamp birthday;
    private String wechat;
    private Integer qq;
    private String resume;
    private String address;
    private String occupation;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "motto")
    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "wechat")
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "qq")
    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "resume")
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "occupation")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile that = (Profile) o;
        return id == that.id &&
                Objects.equals(picture, that.picture) &&
                Objects.equals(motto, that.motto) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(resume, that.resume) &&
                Objects.equals(address, that.address) &&
                Objects.equals(occupation, that.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, picture, motto, phone, gender, birthday, wechat, qq, resume, address, occupation);
    }
}
