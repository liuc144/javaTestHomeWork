
import java.util.*;

//菜单选项：程序不断显示如下“菜单”选项，等待用户输入选项（1~5），之后执行相应功能；
//插入功能：将“实验4”中的学生类（最多20个）插入数组中（可以使用Java集合类），要求学生信息从键盘输入，每次只插入一个学生的信息；每插入一个名字后学生仍要求按学号递增排序；
//输出功能：输出所有学生信息；
//查找功能：按姓名查找，若找到显示相关信息，否则提示未找到。
//退出功能：退出整个程序。
//删除功能：按姓名删除，即按姓名查找后删除该学生信息；
//修改功能：按姓名查找后修改学生年龄等信息；（可选择，若实现请标出）

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true) {
            boolean isExit=false; //定义退出

//app显示界面

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
            StudentMannger mannger=new StudentMannger();
            switch(command) {
                case 1: //获取用户基本信息
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
                    Student s1=new Student(id,name,birDate,gender); //创建学生信息
                    mannger.addStudent(s1);
                    break;
                case 2:// 根据姓名查找信息
                    System.out.println("请输入要查找的姓名：");
                    name=sc.next();
                    Student queryS=mannger.query(name);
                    System.out.println(queryS.toString());
                    break;
                case 3:/根据姓名删除信息
                    System.out.println("请输入要删除的姓名：");
                    name=sc.next();
                    mannger.deleteStudent(name);
                    break;
                case 4://修改学生信息
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
                    Student oldS=mannger.query(oldName);
                    mannger.updateStudent(oldS,newS);
                    break;
                case 5://更新
                    mannger.outPutAll();
                    break;
                case 6://退出
                    isExit=mannger.exit();
                    break;

            }
            if(isExit){
                break;//退出
            }
        }
    }
}
