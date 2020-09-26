package cn.xatu19060517.practicum;

/*
标准学生类
 */
public class Student implements Comparable {//实现Comparable接口

    //实现一个类的对象之间比较大小，该类要实现Comparable接口
    //重写compareTo()方法
    //编写一个比较规则，让当前学员对象和传过来的学员对象比较
    //比较规则，以平均分为比较规则
    //大于返回1，等于返回0小于-1
    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.sum == student.sum) {
            return 0;
        } else if (student.sum > this.sum) {
            return 1;
        } else {
            return -1;
        }
    }


    private int num = 0;//学号
    private String name = "";//学生姓名
    private double math = 0.0;//应用数学成绩
    private double english = 0.0;//大学英语成绩
    private double java = 0.0;//Java 程序设计成绩
    private double computer = 0.0;//计算机应用基础成绩
    private double sum = 0.0;//平均成绩

    //无参构造
    public Student() {
    }

    //含参构造
    public Student(int num, String name, double math, double english, double java, double computer, double sum) {
        this.num = num;
        this.name = name;
        this.math = math;
        this.english = english;
        this.java = java;
        this.computer = computer;
        this.sum = sum;
    }

    //getter和setter方法
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {

        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getComputer() {

        return computer;
    }

    public void setComputer(double computer) {
        this.computer = computer;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double math, double english, double java, double computer) {
        this.sum = (math + english + java + computer) / 4;//平均成绩为四个数和的平均值
    }
    //实现一个类的对象之间比较大小，该类要实现Comparable接口
    //重写compareTo()方法
    //编写一个比较规则，让当前学员对象和传过来的学员对象比较
    //比较规则，以平均分为比较规则
    //大于返回1，等于返回0小于-1


}
