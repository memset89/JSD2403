package StageOne.day03;

import java.util.Random;

/**
 * 角色类，定义了角色的基本属性和行为。
 */
class role{
    int attack; // 攻击力
    int HP; // 生命值
    int MP; // 魔法值
    enum six{men,romen} // 定义了一个枚举类型，表示角色的尺寸
    six size; // 角色尺寸
}

/**
 * 游戏角色类，负责游戏角色的创建和战斗逻辑。
 */
public class gameRole {
    public static void main(String[] args) throws InterruptedException {
        role jjboy = new role(); // 创建角色jjboy
        role thunder =new role(); // 创建角色thunder

        // 使用随机数为角色初始化属性
        Random x=new Random();
        jjboy.attack=x.nextInt(1000);
        jjboy.HP=x.nextInt(2000000000);
        jjboy.MP=x.nextInt(500);
        thunder.attack=x.nextInt(1000);
        thunder.HP=x.nextInt(2000000000);
        thunder.MP=x.nextInt(500);

        // 决定谁先手
        int x1=x.nextInt(100);
        int x2=x.nextInt(100);
        boolean inChess=(x1>=x2);
        if (inChess){
            System.out.println("由jjboy先手");
        }
        else {
            System.out.println("由thunder先手");
        }

        // 检查生命值，只要有一个角色生命值大于0，就继续游戏
        boolean die =jjboy.HP>0&&thunder.HP>0;
        while (die){
            if (inChess){
                // jjboy回合，判断是否使用技能
                if (jjboy.MP>=40){
                    System.out.println("jjboy释放了技能，对thunder造成了"+jjboy.attack*1.5+"点伤害！");
                    thunder.HP-=jjboy.attack*1.5;
                    jjboy.MP-=40;
                    System.out.println("jjboy消耗了40点MP");
                }
                else {
                    thunder.HP-=jjboy.attack;
                    System.out.println("jjboy的普通攻击对thunder造成了"+jjboy.attack+"点伤害");
                }
                System.out.println("thunder的剩余生命值"+thunder.HP);
                if (thunder.HP<=0){
                    System.out.println("thunder阵亡");
                    break;
                }

                // thunder回合，判断是否使用技能
                if (thunder.MP>=40){
                    System.out.println("thunder释放了技能，对jjboy造成了"+thunder.attack*1.5+"点伤害！");
                    jjboy.HP-= thunder.attack*1.5;
                    System.out.println("thunder消耗了40点MP");
                    thunder.MP-=40;
                }
                else {
                    System.out.println("thunder的普通攻击对jjboy造成了"+thunder.attack+"点伤害");
                    jjboy.HP-= thunder.attack;
                }
                System.out.println("jjboy的剩余生命值"+jjboy.HP);
                if (jjboy.HP<=0){
                    System.out.println("jjboy阵亡");
                    break;
                }

                // 回复魔法值
                jjboy.MP+=10;thunder.MP+=10;
                System.out.println("jjboy和thunder回复了10点MP");
            }
            else {
                // thunder回合，判断是否使用技能
                if (thunder.MP>=40){
                    System.out.println("thunder释放了技能，对jjboy造成了"+thunder.attack*1.5+"点伤害！");
                    jjboy.HP-= thunder.attack*1.5;
                    System.out.println("thunder消耗了40点MP");
                    thunder.MP-=40;
                }
                else {
                    System.out.println("thunder的普通攻击对jjboy造成了"+thunder.attack+"点伤害");
                    jjboy.HP-= thunder.attack;
                }
                System.out.println("jjboy的剩余生命值"+jjboy.HP);
                if (jjboy.HP<=0){
                    System.out.println("jjboy阵亡");
                    break;
                }

                // jjboy回合，判断是否使用技能
                if (jjboy.MP>=40){
                    System.out.println("jjboy释放了技能，对thunder造成了"+jjboy.attack*1.5+"点伤害！");
                    thunder.HP-=jjboy.attack*1.5;
                    jjboy.MP-=40;
                    System.out.println("jjboy消耗了40点MP");
                }
                else {
                    thunder.HP-=jjboy.attack;
                    System.out.println("jjboy的普通攻击对thunder造成了"+jjboy.attack+"点伤害");
                }
                System.out.println("thunder的剩余生命值"+thunder.HP);
                if (thunder.HP<=0){
                    System.out.println("thunder阵亡");
                    break;
                }

                // 回复魔法值
                jjboy.MP+=10;thunder.MP+=10;
                System.out.println("jjboy和thunder回复了10点MP");
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
