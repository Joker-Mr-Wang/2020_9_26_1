package cn.xatu19060517.practicum;
/*
功能实现类
　next()不会吸取字符前/后的空格/Tab键，只吸取字符，开始吸取字符（字符前后不算）直到遇到空格/Tab键/回车截止吸取；
　nextLine()吸取字符前后的空格/Tab键，回车键截止。
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Manage {

    Scanner input = new Scanner(System.in);
    ArrayList<Student> arry = new ArrayList<>();//建立一个动态数组（ArrayList<数据类型> 数组名 = new ArrayList<>()）

    //建立无参构造
    public Manage() {
    }


    //添加学生信息方法
    public void add(ArrayList<Student> arry) {
        Student students = new Student();
        System.out.println("请输入学生的姓名：");
        String names = input.next();
        System.out.println("请输入学生的学号： ");
        int nums = input.nextInt();
        System.out.println("请输入学生的应用数学成绩（0—100）：");
        double maths = input.nextDouble();
        if(maths<0 || maths>100){//如果成绩不在0-100之间，则重新输入
            System.out.println("对不起您输入的值不正确\r\n请重新输入：");
            maths=input.nextDouble();
        }
        System.out.println("请输入学生的大学英语成绩（0—100）：");
        double englishs = input.nextDouble();
        if(englishs<0 || englishs>100){
            System.out.println("对不起您输入的值不正确\r\n请重新输入：");
            englishs=input.nextDouble();
        }
        System.out.println("请输入学生的Java程序设计成绩（0—100)：");
        double javas = input.nextDouble();
        if(javas<0 || javas>100){
            System.out.println("对不起您输入的值不正确\r\n请重新输入：");
            javas=input.nextDouble();
        }
        System.out.println("请输入学生的计算机应用基础成绩(0—100）：");
        double computers = input.nextDouble();
        if(computers<0 || computers>100){
            System.out.println("对不起您输入的值不正确\r\n请重新输入：");
            computers=input.nextDouble();
        }
        //创建学生对象
        students.setName(names);
        students.setNum(nums);
        students.setMath(maths);
        students.setEnglish(englishs);
        students.setJava(javas);
        students.setComputer(computers);
        students.setSum(maths, englishs, javas, computers);
        //把学生对象添加到集合
        arry.add(students);//动态数组名.add（添加的对象）
        System.out.println("添加成功！");
    }


    //显示学生信息方法
    public void show(ArrayList<Student> arry) {
        if (arry.size() == 0) {//判断，当数组为空时，无法查看
            System.out.println("不好意思，目前还没有学生的信息可供查询，请返回重新操作！");
            return;
        }
        System.out.println("=============================================学员列表=============================================");
        System.out.println("学号\t\t姓名\t\t应用数学成绩\t\t大学英语成绩\t\tJava程序设计成绩\t\t计算机应用基础成绩\t\t平均成绩");

        for (int i = 0; i < arry.size(); i++) {
            Student students = arry.get(i);//get(int index)返回此列表中指定位置的元素。
            System.out.println(students.getNum() + "\t\t" + students.getName() + "\t\t\t" + students.getMath() + "\t\t\t"
                    + students.getEnglish() + "\t\t\t" + students.getJava() + "\t\t\t" + students.getComputer() + "\t\t\t" + students.getSum());
        }
        System.out.println("=================================================================================================\n");
    }


    //修改方法
    public void change(ArrayList<Student> arry) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要改变的姓名：");
        String changeId = input.nextLine();//定义一个变量输入所需修改学生姓名
        int index = -1;//定义一个变量，用于替换所需修改的学生位置
        for (int i = 0; i < arry.size(); i++) {
            Student students = arry.get(i);
            if (students.getName().equals(changeId)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("您要改变的学生不存在，请重新操作！");
        } else {
            System.out.println("请输入新的学生的姓名：");
            String names = input.next();

            System.out.println("请输入新的学生的学号： ");
            int nums = input.nextInt();

            System.out.println("请输入新的学生的应用数学成绩（0—100）：");
            double maths = input.nextDouble();
            if(maths<0 || maths>100){
                System.out.println("对不起您输入的值不正确\r\n请重新输入：");
                maths=input.nextDouble();
            }

            System.out.println("请输入新的学生的大学英语成绩（0—100）：");
            double englishs = input.nextDouble();
            if(englishs<0 || englishs>100){
                System.out.println("对不起您输入的值不正确\r\n请重新输入：");
                englishs=input.nextDouble();

            }
            System.out.println("请输入新的学生的Java 程序设计成绩（0—100）：");
            double javas = input.nextDouble();
            if(javas<0 || javas>100){
                System.out.println("对不起您输入的值不正确\r\n请重新输入：");
                javas=input.nextDouble();
            }

            System.out.println("请输入新的学生的计算机应用基础成绩（0—100）：");
            double computers = input.nextDouble();
            if(computers<0 || computers>100){
                System.out.println("对不起您输入的值不正确\r\n请重新输入：");
                computers=input.nextDouble();
            }

            //创建学生对象
            Student students = new Student();
            students.setName(names);
            students.setNum(nums);
            students.setMath(maths);
            students.setEnglish(englishs);
            students.setJava(javas);
            students.setComputer(computers);
            students.setSum(maths, englishs, javas, computers);
            //把学生对象添加到集合
            arry.set(index, students);//动态数组名.set（位置信息，添加的对象）
            System.out.println("修改学生成功！！！");
        }
    }


    //删除方法
    public void delete(ArrayList<Student> arry) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要删除的学生姓名：");
        String del = input.nextLine();//定义一个变量输入所需删除学生姓名
        int index = -1;//定义一个变量，用于替换所需删除的学生位置
        for (int i = 0; i < arry.size(); i++) {//遍历数组
            Student students = arry.get(i);
            if (students.getName().equals(del)) {
                index = i;//替换所需删除的学生位置
            }
            if (index == -1) {
                System.out.println("你要删除的学生不存在，请重新选择！");
            } else {
                arry.remove(index);//动态数组名.remove（位置信息）
                System.out.println("删除学生成功！！");
            }
        }
    }


    //查询某个学生信息方法
    public void search(ArrayList<Student> arry) {
        System.out.print("请输入您要查询成绩的学生的姓名：");
        Scanner input = new Scanner(System.in);
        String searchId = input.next();//定义一个变量用于输入查询姓名
        Student students = new Student();
        int index = -1;//定义一个变量index确定查找名字在数组中的位置
        boolean flag = false;//定义一个boolean类型，所查询用于判断是否在数组中
        for (int i = 0; i < arry.size(); i++) {//遍历数组
            students = arry.get(i);
            if (students.getName().equals(searchId)) {
                index = i;
                flag = true;//所查内容在数组中
            }
        }
        if (flag) {
            students = arry.get(index);
            System.out.println("=================查找成功=======================");
            System.out.println(" 学号\t\t姓名\t\t应用数学成绩\t\t大学英语成绩\t\tJava 程序设计成绩\t\t计算机应用基础成绩\t\t平均成绩");
            System.out.println(students.getNum() + "\t\t" + students.getName() + "\t\t" + students.getMath() + "\t\t"
                    + students.getEnglish() + "\t\t" + students.getJava() + "\t\t" + students.getComputer() + "\t\t\t" + students.getSum());
            System.out.println("==============================================\n");
        } else {
            System.out.println("查无此人！请核对后重新输入姓名");
        }


    }


    //数学平均分、最大最小值方法
    public void mathAverage(ArrayList<Student> arry) {
        double sum = 0.0;//总值
        double max = 0.0;//最大值
        double min = 100.0;//最小值

        for (int i = 0; i < arry.size(); i++) {//遍历数组
            Student students = arry.get(i);
            sum += students.getMath();//将数学成绩求和
            max = max > students.getMath() ? max : students.getMath();//三目运算法  ？前为true，则结果为：的前项，反之则为后项
            min = min < students.getMath() ? min : students.getMath();
        }

        System.out.printf("应用数学的平均成绩为: %.2f\t\t", sum / arry.size());//%.2f自动四舍五入
        System.out.print("最高分为: " + max + "\t\t" + "最低分为: " + min + "\t\t\n");
    }


    //java平均分、最大最小值方法
    public void javaAverage(ArrayList<Student> arry) {
        double sum = 0.0;
        double max = 0.0;
        double min = 100.0;

        for (int i = 0; i < arry.size(); i++) {
            Student students = arry.get(i);
            sum += students.getJava();//将java成绩求和
            max = max > students.getJava() ? max : students.getJava();//三目运算法  ？前为true，则结果为：的前项，反之则为后项
            min = min < students.getJava() ? min : students.getJava();
        }

        System.out.printf("Java程序设计的平均成绩为: %.2f\t\t", sum / arry.size());//%.2f自动四舍五入
        System.out.print("最高分为: " + max + "\t\t" + "最低分为: " + min + "\t\t\n");
    }


    //英语平均分、最大最小值方法
    public void englishAverage(ArrayList<Student> arry) {
        double sum = 0.0;
        double max = 0.0;
        double min = 100.0;

        for (int i = 0; i < arry.size(); i++) {
            Student students = arry.get(i);
            sum += students.getEnglish();//将大学英语成绩求和
            max = max > students.getEnglish() ? max : students.getEnglish();//三目运算法  ？前为true，则结果为：的前项，反之则为后项
            min = min < students.getEnglish() ? min : students.getEnglish();
        }

        System.out.printf("大学英语的平均成绩为: %.2f\t\t", sum / arry.size());//%.2f自动四舍五入
        System.out.print("最高分为: " + max + "\t\t" + "最低分为: " + min + "\t\t\n");
    }


    //计算机平均分、最大最小值方法
    public void computerAverage(ArrayList<Student> arry) {
        double sum = 0.0;
        double max = 0.0;
        double min = 100.0;

        for (int i = 0; i < arry.size(); i++) {
            Student students = arry.get(i);
            sum += students.getComputer();//将计算机应用基础成绩求和
            max = max > students.getComputer() ? max : students.getComputer();//三目运算法  ？前为true，则结果为：的前项，反之则为后项
            min = min < students.getComputer() ? min : students.getComputer();
        }

        System.out.printf("计算机应用基础的平均成绩为: %.2f\t\t", sum / arry.size());//%.2f自动四舍五入
        System.out.print("最高分为: " + max + "\t\t" + "最低分为: " + min + "\t\t\n");
    }


    //成绩降序排列
    public void sorts(List<Student> list) {
        //排序
        Collections.sort(list);//根据指定比较器产生的顺序对指定列表进行排序。
    }







    //退出方法
    public void exit() {
        System.out.println("你确定退出嘛？（y/n）");
        Scanner input = new Scanner(System.in);
        String choose = input.next();//定义一个string类型进行输入y/n
        if (choose.equals("n")) {//当输入“n”时，进行下个判断
        } else {
            System.out.println("谢谢您的使用，欢迎下次光临！\n");
            System.exit(1);//退出程序
        }
    }


}



