package StageTwo.day09ooday03;

abstract public class Staff {
    int age;
    int salary;
    String name;
    Staff(){}
    Staff(int age,int salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    void sighin(){
        System.out.println("滴，上班卡");
    }
    void sighout(){
        System.out.println("滴，下班卡");
    }
    abstract void work();
}
