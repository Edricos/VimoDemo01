package com.vimo.vimodemo01.domain;

import javax.xml.crypto.Data;

public class tb_student {
    private int id;     //
    private String school_year;     //入学段年份
    private String student_no;      //学号
    private int userid;     //学生userid
    private String name;        //姓名
    private Data date_of_birth;     //出生年月
    private String sex;     //性别（0男1女）
    private String identity_card;       //身份证
    private String guardian;        //监护人
    private String guardian_phone;      //监护人联系方式
    private int headmaster_id;      //班主任ID(不建议使用)
    private int class_id;       //当前所属班级ID
    private int create_id;      //创建人ID
    private Data create_time;       //创建时间
    private int update_id;      //修改人ID
    private Data update_time;       //修改时间
    private int status_id;      //状态ID
    private int grade_id;       //年级ID
    private int school_id;      //学校ID
    private String phone;       //手机号
    private String home_address;        //家庭地址
    private String national_platform_account;       //全国学籍平台账号
    private String city_platform_account;       //市学籍平台账号
    private String platform_account;        //学籍辅号
    private Data entrance_time;     //入学日期
    private int audit_status;       //审核状态(1未审核，2审核通过，3审核不通过)
    private String native_place;        //籍贯
    private String nation;      //民族
    private String family;      //家庭出身
    private int health;     //身体状况(0-优;1-良;2-差;)
    private Data join_time;     //加入组织时间
    private String hukou;       //户口所在地
    private int family_population;      //家庭人口
    private int political_status;       //政治面貌(0-中共党员;1-中共预备党员;2-共青团员;3-民革党员;4-民盟盟员;5-民建会员;6-民进会员;7-农工党党员;8-致公党党员;9-九三学社社员;10-台盟盟员;11-无党派人士;12-群众;)

    public tb_student(int id, String school_year, String student_no, int userid, String name, Data date_of_birth, String sex, String identity_card, String guardian, String guardian_phone, int headmaster_id, int class_id, int create_id, Data create_time, int update_id, Data update_time, int status_id, int grade_id, int school_id, String phone, String home_address, String national_platform_account, String city_platform_account, String platform_account, Data entrance_time, int audit_status, String native_place, String nation, String family, int health, Data join_time, String hukou, int family_population, int political_status) {
        this.id = id;
        this.school_year = school_year;
        this.student_no = student_no;
        this.userid = userid;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.sex = sex;
        this.identity_card = identity_card;
        this.guardian = guardian;
        this.guardian_phone = guardian_phone;
        this.headmaster_id = headmaster_id;
        this.class_id = class_id;
        this.create_id = create_id;
        this.create_time = create_time;
        this.update_id = update_id;
        this.update_time = update_time;
        this.status_id = status_id;
        this.grade_id = grade_id;
        this.school_id = school_id;
        this.phone = phone;
        this.home_address = home_address;
        this.national_platform_account = national_platform_account;
        this.city_platform_account = city_platform_account;
        this.platform_account = platform_account;
        this.entrance_time = entrance_time;
        this.audit_status = audit_status;
        this.native_place = native_place;
        this.nation = nation;
        this.family = family;
        this.health = health;
        this.join_time = join_time;
        this.hukou = hukou;
        this.family_population = family_population;
        this.political_status = political_status;
    }

    public tb_student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_year() {
        return school_year;
    }

    public void setSchool_year(String school_year) {
        this.school_year = school_year;
    }

    public String getStudent_no() {
        return student_no;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Data date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getGuardian_phone() {
        return guardian_phone;
    }

    public void setGuardian_phone(String guardian_phone) {
        this.guardian_phone = guardian_phone;
    }

    public int getHeadmaster_id() {
        return headmaster_id;
    }

    public void setHeadmaster_id(int headmaster_id) {
        this.headmaster_id = headmaster_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public Data getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Data create_time) {
        this.create_time = create_time;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public Data getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Data update_time) {
        this.update_time = update_time;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String getNational_platform_account() {
        return national_platform_account;
    }

    public void setNational_platform_account(String national_platform_account) {
        this.national_platform_account = national_platform_account;
    }

    public String getCity_platform_account() {
        return city_platform_account;
    }

    public void setCity_platform_account(String city_platform_account) {
        this.city_platform_account = city_platform_account;
    }

    public String getPlatform_account() {
        return platform_account;
    }

    public void setPlatform_account(String platform_account) {
        this.platform_account = platform_account;
    }

    public Data getEntrance_time() {
        return entrance_time;
    }

    public void setEntrance_time(Data entrance_time) {
        this.entrance_time = entrance_time;
    }

    public int getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(int audit_status) {
        this.audit_status = audit_status;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Data getJoin_time() {
        return join_time;
    }

    public void setJoin_time(Data join_time) {
        this.join_time = join_time;
    }

    public String getHukou() {
        return hukou;
    }

    public void setHukou(String hukou) {
        this.hukou = hukou;
    }

    public int getFamily_population() {
        return family_population;
    }

    public void setFamily_population(int family_population) {
        this.family_population = family_population;
    }

    public int getPolitical_status() {
        return political_status;
    }

    public void setPolitical_status(int political_status) {
        this.political_status = political_status;
    }

    @Override
    public String toString() {
        return "tb_student{" +
                "id=" + id +
                ", school_year='" + school_year + '\'' +
                ", student_no='" + student_no + '\'' +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", sex='" + sex + '\'' +
                ", identity_card='" + identity_card + '\'' +
                ", guardian='" + guardian + '\'' +
                ", guardian_phone='" + guardian_phone + '\'' +
                ", headmaster_id=" + headmaster_id +
                ", class_id=" + class_id +
                ", create_id=" + create_id +
                ", create_time=" + create_time +
                ", update_id=" + update_id +
                ", update_time=" + update_time +
                ", status_id=" + status_id +
                ", grade_id=" + grade_id +
                ", school_id=" + school_id +
                ", phone='" + phone + '\'' +
                ", home_address='" + home_address + '\'' +
                ", national_platform_account='" + national_platform_account + '\'' +
                ", city_platform_account='" + city_platform_account + '\'' +
                ", platform_account='" + platform_account + '\'' +
                ", entrance_time=" + entrance_time +
                ", audit_status=" + audit_status +
                ", native_place='" + native_place + '\'' +
                ", nation='" + nation + '\'' +
                ", family='" + family + '\'' +
                ", health=" + health +
                ", join_time=" + join_time +
                ", hukou='" + hukou + '\'' +
                ", family_population=" + family_population +
                ", political_status=" + political_status +
                '}';
    }
}
