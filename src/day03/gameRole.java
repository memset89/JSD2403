package day03;

import java.util.Random;
//import java.util.Thread;
class role{
    int attack;
    int HP;
    int MP;
    enum six{men,romen}
    six size;
}
public class gameRole {
    public static void main(String[] args) throws InterruptedException {
        role jjboy = new role();
        jjboy.attack=425;
        jjboy.HP=5000;
        jjboy.MP=140;
        role thunder =new role();
        thunder.attack=560;
        thunder.HP=3820;
        thunder.MP=120;
        Random x=new Random();
        int x1=x.nextInt(100);
        int x2=x.nextInt(100);
        boolean inChess=(x1>=x2);
        if (inChess){
            System.out.println("由jjboy先手");
        }
        else {
            System.out.println("由thunder先手");
        }
        boolean die =jjboy.HP>0&&thunder.HP>0;
        while (die){
            if (inChess){

                Thread.sleep(1000);
                if (jjboy.MP>=40){
                    System.out.println("jjboy释放了技能，对thunder造成了"+jjboy.attack*1.5+"点伤害！");
                    thunder.HP-=jjboy.attack*1.5;
                    Thread.sleep(1000);
                    jjboy.MP-=40;
                    Thread.sleep(1000);
                    System.out.println("jjboy消耗了40点MP");
                }
                else {
                    thunder.HP-=jjboy.attack;
                    System.out.println("jjboy的普通攻击对thunder造成了"+jjboy.attack+"点伤害");
                    Thread.sleep(1000);
                }
                System.out.println("thunder的剩余生命值"+thunder.HP);
                if (thunder.HP<=0){
                    System.out.println("thunder阵亡");
                    Thread.sleep(1000);
                    break;
                }
                Thread.sleep(1000);
                if (thunder.MP>=40){
                    System.out.println("thunder释放了技能，对jjboy造成了"+thunder.attack*1.5+"点伤害！");
                    jjboy.HP-= thunder.attack*1.5;
                    Thread.sleep(1000);
                    System.out.println("thunder消耗了40点MP");
                    thunder.MP-=40;
                    Thread.sleep(1000);
                }
                else {
                    Thread.sleep(1000);
                    System.out.println("thunder的普通攻击对jjboy造成了"+thunder.attack+"点伤害");
                    jjboy.HP-= thunder.attack;
                }
                Thread.sleep(1000);
                System.out.println("jjboy的剩余生命值"+jjboy.HP);
                if (jjboy.HP<=0){
                    Thread.sleep(1000);
                    System.out.println("jjboy阵亡");
                    break;
                }
                Thread.sleep(1000);
                jjboy.MP+=10;thunder.MP+=10;
                System.out.println("jjboy和thunder回复了10点MP");
                Thread.sleep(1000);
            }
            else {

                if (thunder.MP>=40){
                    System.out.println("thunder释放了技能，对jjboy造成了"+thunder.attack*1.5+"点伤害！");
                    jjboy.HP-= thunder.attack*1.5;
                    Thread.sleep(1000);
                    System.out.println("thunder消耗了40点MP");
                    thunder.MP-=40;
                    Thread.sleep(1000);
                }
                else {
                    Thread.sleep(1000);
                    System.out.println("thunder的普通攻击对jjboy造成了"+thunder.attack+"点伤害");
                    jjboy.HP-= thunder.attack;
                }
                Thread.sleep(1000);
                System.out.println("jjboy的剩余生命值"+jjboy.HP);
                if (jjboy.HP<=0){
                    Thread.sleep(1000);
                    System.out.println("jjboy阵亡");
                    break;
                }
                Thread.sleep(1000);
                if (jjboy.MP>=40){
                    System.out.println("jjboy释放了技能，对thunder造成了"+jjboy.attack*1.5+"点伤害！");
                    thunder.HP-=jjboy.attack*1.5;
                    Thread.sleep(1000);
                    jjboy.MP-=40;
                    Thread.sleep(1000);
                    System.out.println("jjboy消耗了40点MP");
                }
                else {
                    thunder.HP-=jjboy.attack;
                    System.out.println("jjboy的普通攻击对thunder造成了"+jjboy.attack+"点伤害");
                    Thread.sleep(1000);
                }
                System.out.println("thunder的剩余生命值"+thunder.HP);
                if (thunder.HP<=0){
                    System.out.println("thunder阵亡");
                    Thread.sleep(1000);
                    break;
                }
                Thread.sleep(1000);
                jjboy.MP+=10;thunder.MP+=10;
                System.out.println("jjboy和thunder回复了10点MP");
                Thread.sleep(1000);
            }
        }
        if (jjboy.HP>0){
            System.out.println("jjboy win!!");
        }
        else {
            System.out.println("thunder win!!");
        }
    }
}
