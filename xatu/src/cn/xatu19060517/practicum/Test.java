package cn.xatu19060517.practicum;
/*
测试类
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manage manage = new Manage();
        ArrayList<Student> arr = new ArrayList<>();
        int num = 0;//用于判断是否结束程序
        do {
            System.out.println("****************************学生成绩管理系统******************************");
            System.out.println("1.添加学生信息\t\t\t\t2.查看学生成绩\t\t\t\t3.修改学生成绩");
            System.out.println("4.删除学生成绩\t\t\t\t5.查找学生成绩\t\t\t\t6.统计学科信息");
            System.out.println("7.全体学生排名\t\t\t\t8.退出程序系统\t\t\t\t0.返回到主菜单");
            System.out.println("************************************************************************");
            System.out.println("请选择您所需的服务：");
            int choice = input.nextInt();//定义变量choose用于菜单栏的选择
            switch (choice) {

                case 1://添加功能
                    manage.add(arr);
                    break;
                case 2://查看功能
                    manage.show(arr);
                    break;
                case 3://修改功能
                    manage.change(arr);
                    break;
                case 4://删除功能
                    manage.delete(arr);
                    break;
                case 5://查询功能
                    manage.search(arr);
                    break;
                case 6://统计功能
                    manage.mathAverage(arr);
                    manage.englishAverage(arr);
                    manage.javaAverage(arr);
                    manage.computerAverage(arr);
                    break;
                case 7://排序功能
                    manage.sorts(arr);
                    manage.show(arr);
                    break;
                case 8://退出功能
                    manage.exit();
                    break;
                default:
                    break;
            }
            if (num != 2) {
                System.out.println("输入0返回主程序");
                int riback = input.nextInt();//键盘输入一个数确定是否返回
                if (riback != 0) {
                    System.out.println("error!!1");
                    num = 2;
                }
            }
        } while (num == 0);
        System.out.println("over");
    }

}


