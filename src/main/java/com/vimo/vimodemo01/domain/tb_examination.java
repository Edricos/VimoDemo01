package com.vimo.vimodemo01.domain;

import javax.xml.crypto.Data;

public class tb_examination {
    private int id; //考试信息主键id
    private String name;    //考试名称
    private String type;    //考试类型
    private int school_year; //学年id
    private int grade_id; //年纪id
    private int semester_id; //学期id
    private String subject_id;  //科目id，多个科目以逗号分割
    private int belong_dept_id; //机构id
    private int create_by;  //创建人id
    private Data creaee_time;     //创建时间
    private Data update_time;     //修改时间
    private int is_terminal;        //是否期末考试(1是0否)

    public tb_examination(int id, String name, String type, int school_year, int grade_id, int semester_id, String subject_id, int belong_dept_id, int create_by, Data creaee_time, Data update_time, int is_terminal) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.school_year = school_year;
        this.grade_id = grade_id;
        this.semester_id = semester_id;
        this.subject_id = subject_id;
        this.belong_dept_id = belong_dept_id;
        this.create_by = create_by;
        this.creaee_time = creaee_time;
        this.update_time = update_time;
        this.is_terminal = is_terminal;
    }

    public tb_examination(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSchool_year() {
        return school_year;
    }

    public void setSchool_year(int school_year) {
        this.school_year = school_year;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public int getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(int semester_id) {
        this.semester_id = semester_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public int getBelong_dept_id() {
        return belong_dept_id;
    }

    public void setBelong_dept_id(int belong_dept_id) {
        this.belong_dept_id = belong_dept_id;
    }

    public int getCreate_by() {
        return create_by;
    }

    public void setCreate_by(int create_by) {
        this.create_by = create_by;
    }

    public Data getCreaee_time() {
        return creaee_time;
    }

    public void setCreaee_time(Data creaee_time) {
        this.creaee_time = creaee_time;
    }

    public Data getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Data update_time) {
        this.update_time = update_time;
    }

    public int getIs_terminal() {
        return is_terminal;
    }

    public void setIs_terminal(int is_terminal) {
        this.is_terminal = is_terminal;
    }

    @Override
    public String toString() {
        return "tb_examination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", school_year=" + school_year +
                ", grade_id=" + grade_id +
                ", semester_id=" + semester_id +
                ", subject_id='" + subject_id + '\'' +
                ", belong_dept_id=" + belong_dept_id +
                ", create_by=" + create_by +
                ", creaee_time='" + creaee_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", is_terminal=" + is_terminal +
                '}';
    }
}
