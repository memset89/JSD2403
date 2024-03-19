package StageTwo.day09ooday03;

public class Test {
    public static void main(String[] args) {
        BZR bzr = new BZR(20,5000,"张三");
        bzr.sighin();
        bzr.work();
        bzr.sighout();
        JS js = new JS(22,6000,"李四");
        js.sighin();
        js.work();
        js.EditBook();
        js.sighout();
        XM xm = new XM(23,7000,"王五");
        xm.sighin();
        xm.work();
        xm.EditBook();
        xm.sighout();
        xm.Slove();
        xm.Train();
        ZJ zj = new ZJ(24,8000,"赵六");
        zj.sighin();
        zj.work();
        zj.EditBook();
        zj.sighout();
        zj.Slove();
        zj.Train();
    }
}
