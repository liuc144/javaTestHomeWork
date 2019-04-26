import java.util.ArrayList;
import java.util.Scanner;

public class StudentMannger {
    public static ArrayList<Student> list=new ArrayList<>();
    public void addStudent(Student s){
        list.add(s);
    }
   
   
    public Student query(String name){
        for(Student s:list)
            if (s.getName().equals(name)) {
                return s;
            }
        System.out.println("未找到");
        return null;
    }
    public void App(){
        Scanner sc=new Scanner(System.in);

        while(true) {
            boolean isExit=false;
            System.out.println("请选择操作：");
            System.out.println("**********************************************************************");
            System.out.println("*                           1  插入                                  *");
            System.out.println("*                           2  查找                                  *");
            System.out.println("*                           3  删除                                  *");
            System.out.println("*                           4  修改                                  *");
            System.out.println("*                           5  输出                                  *");
            System.out.println("*                           6  退出                                  *");
            System.out.println("**********************************************************************");
            int command=sc.nextInt();
            switch(command) {
                case 1:
                    System.out.println("请输入学号：");
                    int id=sc.nextInt();
                    System.out.println("请输入姓名：");
                    String name=sc.next();
                    System.out.println("请输入出生日期：");
                    String birDate=sc.next();
                    System.out.println("请输入性别：");
                    String sex=sc.next();
                    boolean gender=false;
                    if(sex.equals("男"))
                        gender=true;
                    Student s1=new Student(id,name,birDate,gender);
                    addStudent(s1);
                    break;
                case 2:
                    System.out.println("请输入要查找的姓名：");
                    name=sc.next();
                    Student queryS=query(name);
                    System.out.println(queryS.toString());
                    break;
                case 3:
                    System.out.println("请输入要删除的姓名：");
                    name=sc.next();
                    deleteStudent(name);
                    break;
                case 4:
                    System.out.println("修改前学生姓名为：");
                    String oldName=sc.next();
                    System.out.println("修改学生学号为：");
                    id=sc.nextInt();
                    System.out.println("修改学生姓名为：");
                    name=sc.next();
                    System.out.println("修改学生出生日期为：");
                    birDate=sc.next();
                    System.out.println("修改学生性别为：");
                    sex=sc.next();
                    gender=false;
                    if(sex.equals("男"))
                        gender=true;
                    Student newS=new Student(id,name,birDate,gender);
                    Student oldS=query(oldName);
                    updateStudent(oldS,newS);
                    break;
                case 5:
                    outPutAll();
                    break;
                case 6:
                    isExit=exit();
                    break;

            }
            if(isExit)
                break;
        }
    }
}
