public class Student {
    private int ID;
    private String name;
    private String birDate;
    boolean gender;

    public Student(int id,String name, String birDate, boolean gender) {
        this.ID=id;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

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
