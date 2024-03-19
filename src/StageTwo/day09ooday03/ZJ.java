package StageTwo.day09ooday03;

public class ZJ extends Staff implements Book,comper{

    ZJ(int age,int salary,String name){
        super(age,salary,name);
    }
    public void  work(){
        System.out.println("ZJ is working");
    }
    public void  EditBook(){
        System.out.println("ZJ is editingbook");
    }
    public void  Slove(){
        System.out.println("ZJ is solving");
    }
    public void  Train(){
        System.out.println("ZJ is training");
    }

}
