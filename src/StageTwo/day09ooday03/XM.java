package StageTwo.day09ooday03;

public class XM extends Staff implements Book,comper {
    XM(int age,int salary,String name) {
        super(age,salary,name);
    }
    public void  EditBook(){
        System.out.println("XM is working");
    }
    public void  work(){
        System.out.println("XM is working");
    }
    public void  Slove(){
        System.out.println("XM is solving");
    }
    public void  Train(){
        System.out.println("XM is training");
    }

}
