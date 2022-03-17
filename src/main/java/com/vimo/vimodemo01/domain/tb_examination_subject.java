package com.vimo.vimodemo01.domain;

import javax.xml.crypto.Data;

public class tb_examination_subject {
    private int id;     //
    private String name;        //学科名称
    private int grade_id;       //年级id
    private float all_score;     //总分
    private float high_score;    //高分
    private float excellent_score;   //优分
    private float pass_score;    //及格分
    private float low_score;     //低分
    private int belong_dept_id;     //机构id
    private int  create_by;     //创建人id
    private Data create_time;       //创建时间
    private Data update_time;       //修改时间

    public tb_examination_subject(){}

    public tb_examination_subject(int id, String name, int grade_id, float all_score, float high_score, float excellent_score, float pass_score, float low_score, int belong_dept_id, int create_by, Data create_time, Data update_time) {
        this.id = id;
        this.name = name;
        this.grade_id = grade_id;
        this.all_score = all_score;
        this.high_score = high_score;
        this.excellent_score = excellent_score;
        this.pass_score = pass_score;
        this.low_score = low_score;
        this.belong_dept_id = belong_dept_id;
        this.create_by = create_by;
        this.create_time = create_time;
        this.update_time = update_time;
    }

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

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public float getAll_score() {
        return all_score;
    }

    public void setAll_score(float all_score) {
        this.all_score = all_score;
    }

    public float getHigh_score() {
        return high_score;
    }

    public void setHigh_score(float high_score) {
        this.high_score = high_score;
    }

    public float getExcellent_score() {
        return excellent_score;
    }

    public void setExcellent_score(float excellent_score) {
        this.excellent_score = excellent_score;
    }

    public float getPass_score() {
        return pass_score;
    }

    public void setPass_score(float pass_score) {
        this.pass_score = pass_score;
    }

    public float getLow_score() {
        return low_score;
    }

    public void setLow_score(float low_score) {
        this.low_score = low_score;
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

    public Data getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Data create_time) {
        this.create_time = create_time;
    }

    public Data getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Data update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "tb_examination_subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade_id=" + grade_id +
                ", all_score=" + all_score +
                ", high_score=" + high_score +
                ", excellent_score=" + excellent_score +
                ", pass_score=" + pass_score +
                ", low_score=" + low_score +
                ", belong_dept_id=" + belong_dept_id +
                ", create_by=" + create_by +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
