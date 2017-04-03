package com.myssm.bean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pwd")
    private String userPwd;

    @Column(name = "user_realname")
    private String userRealname;

    @Column(name = "user_age")
    private Integer userAge;

    @Column(name = "user_gender")
    private Integer userGender;

    @Column(name = "user_tel")
    private String userTel;

    @Column(name = "user_adress")
    private String userAdress;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_edu")
    private String userEdu;

    @Column(name = "user_borth")
    private Date userBorth;

    @Column(name = "user_workplace")
    private String userWorkplace;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_pwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * @return user_realname
     */
    public String getUserRealname() {
        return userRealname;
    }

    /**
     * @param userRealname
     */
    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    /**
     * @return user_age
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * @param userAge
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * @return user_gender
     */
    public Integer getUserGender() {
        return userGender;
    }

    /**
     * @param userGender
     */
    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    /**
     * @return user_tel
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * @param userTel
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * @return user_adress
     */
    public String getUserAdress() {
        return userAdress;
    }

    /**
     * @param userAdress
     */
    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    /**
     * @return user_mail
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * @param userMail
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    /**
     * @return user_edu
     */
    public String getUserEdu() {
        return userEdu;
    }

    /**
     * @param userEdu
     */
    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu;
    }

    /**
     * @return user_borth
     */
    public Date getUserBorth() {
        return userBorth;
    }

    /**
     * @param userBorth
     */
    public void setUserBorth(Date userBorth) {
        this.userBorth = userBorth;
    }

    /**
     * @return user_workplace
     */
    public String getUserWorkplace() {
        return userWorkplace;
    }

    /**
     * @param userWorkplace
     */
    public void setUserWorkplace(String userWorkplace) {
        this.userWorkplace = userWorkplace;
    }
}