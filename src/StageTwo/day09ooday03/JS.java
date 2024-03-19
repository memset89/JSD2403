package StageTwo.day09ooday03;

public class JS extends Staff implements Book,comper{

    JS(int age,int salary,String name) {
        super(age,salary,name);
    }
    public void  work(){
        System.out.println("JS is working");
    }
    public void  EditBook(){
        System.out.println("JS is editingbook");
    }
    public void  Slove(){
        System.out.println("JS is solving");
    }
    public void  Train(){
        System.out.println("JS is training");
    }
}
