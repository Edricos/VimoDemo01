package com.vimo.vimodemo01.domain;

import javax.xml.crypto.Data;

public class tb_examination_score {
    private int id;     //成绩主键id
    private int	examination_id;	//考试id(对应考试信息表id)
    private int class_id;		//班级id
    private int student_id; //学生id
    private int	subject_id; 	//科目id
    private int level;		//等级（1高分2优分3及格4低分）
    private float  score; //	成绩
    private Data create_time;	   //创建时间
    private Data update_time;   //修改时间

    public tb_examination_score(int id, int examination_id, int class_id, int student_id, int subject_id, int level, float score, Data create_time, Data update_time) {
        this.id = id;
        this.examination_id = examination_id;
        this.class_id = class_id;
        this.student_id = student_id;
        this.subject_id = subject_id;
        this.level = level;
        this.score = score;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public tb_examination_score(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExamination_id() {
        return examination_id;
    }

    public void setExamination_id(int examination_id) {
        this.examination_id = examination_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
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
        return "tb_examination_score{" +
                "id=" + id +
                ", examination_id=" + examination_id +
                ", class_id=" + class_id +
                ", student_id=" + student_id +
                ", subject_id=" + subject_id +
                ", level=" + level +
                ", score=" + score +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
