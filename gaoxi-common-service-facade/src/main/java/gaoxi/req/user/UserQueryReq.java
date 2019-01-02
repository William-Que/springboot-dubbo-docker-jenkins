package gaoxi.req.user;

import gaoxi.req.QueryReq;

public class UserQueryReq extends QueryReq {
//    主键
    private String id;

//    用户名
    private String username;

//    密码
    private String password;

//    手机号
    private String phone;

//    邮箱
    private String mail;

//    注册时间 开始
    private String registerTimeStart;

//    注册时间 结束
    private String registerTimeEnd;

//    用户类型
    private String userType;
//    用户状态
    private Integer userState;

//    用户id
    private String roleId;

//    根据注册时间排序
    private Integer orderByRegisterTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRegisterTimeStart() {
        return registerTimeStart;
    }

    public void setRegisterTimeStart(String registerTimeStart) {
        this.registerTimeStart = registerTimeStart;
    }

    public String getRegisterTimeEnd() {
        return registerTimeEnd;
    }

    public void setRegisterTimeEnd(String registerTimeEnd) {
        this.registerTimeEnd = registerTimeEnd;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getOrderByRegisterTime() {
        return orderByRegisterTime;
    }

    public void setOrderByRegisterTime(Integer orderByRegisterTime) {
        this.orderByRegisterTime = orderByRegisterTime;
    }

    @Override
    public String toString() {
        return "UserQueryReq{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", registerTimeStart='" + registerTimeStart + '\'' +
                ", registerTimeEnd='" + registerTimeEnd + '\'' +
                ", userType='" + userType + '\'' +
                ", userState=" + userState +
                ", roleId='" + roleId + '\'' +
                ", orderByRegisterTime=" + orderByRegisterTime +
                ", page=" + page +
                ", numPerPage=" + numPerPage +
                ", currentPage=" + currentPage +
                '}';
    }
}
