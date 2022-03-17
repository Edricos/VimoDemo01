package com.vimo.vimodemo01.domain;

import javax.xml.crypto.Data;

public class tb_semester_info {
    private int id;     //
    private int parent_id;      //父级学年id
    private String num;     //学期编号
    private String semester_name;       //学期名称
    private String semester_status;     //学期状态（0未开始,1当前学期,2已结束）
    private String semester_allow;      //学期内是否可以新建数据(0-可以,1-不可以)
    private Data start_date;        //学期开始时间
    private Data end_date;      //学期结束时间
    private String semster_year;    //学年
    private int belong_dept_id;     //所属机构Id
    private String start_year;      //学期开始年份
    private String end_year;        //学期结束年份

    public tb_semester_info() {
    }

    public tb_semester_info(int id, int parent_id, String num, String semester_name, String semester_status, String semester_allow, Data start_date, Data end_date, String semster_year, int belong_dept_id, String start_year, String end_year) {
        this.id = id;
        this.parent_id = parent_id;
        this.num = num;
        this.semester_name = semester_name;
        this.semester_status = semester_status;
        this.semester_allow = semester_allow;
        this.start_date = start_date;
        this.end_date = end_date;
        this.semster_year = semster_year;
        this.belong_dept_id = belong_dept_id;
        this.start_year = start_year;
        this.end_year = end_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSemester_name() {
        return semester_name;
    }

    public void setSemester_name(String semester_name) {
        this.semester_name = semester_name;
    }

    public String getSemester_status() {
        return semester_status;
    }

    public void setSemester_status(String semester_status) {
        this.semester_status = semester_status;
    }

    public String getSemester_allow() {
        return semester_allow;
    }

    public void setSemester_allow(String semester_allow) {
        this.semester_allow = semester_allow;
    }

    public Data getStart_date() {
        return start_date;
    }

    public void setStart_date(Data start_date) {
        this.start_date = start_date;
    }

    public Data getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Data end_date) {
        this.end_date = end_date;
    }

    public String getSemster_year() {
        return semster_year;
    }

    public void setSemster_year(String semster_year) {
        this.semster_year = semster_year;
    }

    public int getBelong_dept_id() {
        return belong_dept_id;
    }

    public void setBelong_dept_id(int belong_dept_id) {
        this.belong_dept_id = belong_dept_id;
    }

    public String getStart_year() {
        return start_year;
    }

    public void setStart_year(String start_year) {
        this.start_year = start_year;
    }

    public String getEnd_year() {
        return end_year;
    }

    public void setEnd_year(String end_year) {
        this.end_year = end_year;
    }

    @Override
    public String toString() {
        return "tb_semester_info{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", num='" + num + '\'' +
                ", semester_name='" + semester_name + '\'' +
                ", semester_status='" + semester_status + '\'' +
                ", semester_allow='" + semester_allow + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", semster_year='" + semster_year + '\'' +
                ", belong_dept_id=" + belong_dept_id +
                ", start_year='" + start_year + '\'' +
                ", end_year='" + end_year + '\'' +
                '}';
    }
}
