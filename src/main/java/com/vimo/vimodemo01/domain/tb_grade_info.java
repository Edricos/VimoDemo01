package com.vimo.vimodemo01.domain;

import javax.xml.crypto.Data;

public class tb_grade_info {
    private int id;     //
    private String name;        //年级名称
    private float sorts;        //年级编号
    private String status;      //状态(0-正常、1-停用、2-删除)
    private String remarks;     //备注
    private int belong_dept_id;     //所属机构ID
    private  String belong_dept_name;   //所属机构名称
    private int create_id;          //创建者
    private Data create_date;       //创建时间
    private int update_id;      //更新者
    private Data update_date;       //更新时间
    private String grade_teacher;       //年级主任
    private int grade_teacher_id;       //年级主任Id
    private String parent_code;         //年级类型(1:幼儿园 2:小学 3:初中 4:高中 )
    private String parent_codes;        //所有父级编号

    public tb_grade_info(int id, String name, float sorts, String status, String remarks, int belong_dept_id, String belong_dept_name, int create_id, Data create_date, int update_id, Data update_date, String grade_teacher, int grade_teacher_id, String parent_code, String parent_codes) {
        this.id = id;
        this.name = name;
        this.sorts = sorts;
        this.status = status;
        this.remarks = remarks;
        this.belong_dept_id = belong_dept_id;
        this.belong_dept_name = belong_dept_name;
        this.create_id = create_id;
        this.create_date = create_date;
        this.update_id = update_id;
        this.update_date = update_date;
        this.grade_teacher = grade_teacher;
        this.grade_teacher_id = grade_teacher_id;
        this.parent_code = parent_code;
        this.parent_codes = parent_codes;
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

    public float getSorts() {
        return sorts;
    }

    public void setSorts(float sorts) {
        this.sorts = sorts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getBelong_dept_id() {
        return belong_dept_id;
    }

    public void setBelong_dept_id(int belong_dept_id) {
        this.belong_dept_id = belong_dept_id;
    }

    public String getBelong_dept_name() {
        return belong_dept_name;
    }

    public void setBelong_dept_name(String belong_dept_name) {
        this.belong_dept_name = belong_dept_name;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public Data getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Data create_date) {
        this.create_date = create_date;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public Data getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Data update_date) {
        this.update_date = update_date;
    }

    public String getGrade_teacher() {
        return grade_teacher;
    }

    public void setGrade_teacher(String grade_teacher) {
        this.grade_teacher = grade_teacher;
    }

    public int getGrade_teacher_id() {
        return grade_teacher_id;
    }

    public void setGrade_teacher_id(int grade_teacher_id) {
        this.grade_teacher_id = grade_teacher_id;
    }

    public String getParent_code() {
        return parent_code;
    }

    public void setParent_code(String parent_code) {
        this.parent_code = parent_code;
    }

    public String getParent_codes() {
        return parent_codes;
    }

    public void setParent_codes(String parent_codes) {
        this.parent_codes = parent_codes;
    }

    @Override
    public String toString() {
        return "tb_grade_info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sorts=" + sorts +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                ", belong_dept_id=" + belong_dept_id +
                ", belong_dept_name='" + belong_dept_name + '\'' +
                ", create_id=" + create_id +
                ", create_date=" + create_date +
                ", update_id=" + update_id +
                ", update_date=" + update_date +
                ", grade_teacher='" + grade_teacher + '\'' +
                ", grade_teacher_id=" + grade_teacher_id +
                ", parent_code='" + parent_code + '\'' +
                ", parent_codes='" + parent_codes + '\'' +
                '}';
    }
}
