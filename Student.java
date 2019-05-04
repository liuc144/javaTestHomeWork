package entity;//database包

public class Student {//student类
    private int ID;//student相关属性
    private String name;
    private String birDate;
    boolean gender;

    //全参数构造方法
    public Student(int id,String name, String birDate, boolean gender) {
        this.ID=id;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    //获取出生日期
    public String getBirDate() {
        return birDate;
    }

    //设置出生日期
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    //获取性别
    public boolean isGender() {
        return gender;
    }

    //设置性别
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    //获取ID
    public int getID() {
        return ID;
    }

    //设置ID
    public void setID(int ID) {
        this.ID = ID;
    }

    //获取姓名
    public String getName() {
        return name;
    }

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", birDate='" + birDate + '\'' +
                ", gender=" + gender +
                '}';
    }
}
