package StageTwo.day08ooday02;
class Aoo {
    Aoo() {
        System.out.println("Aoo");
    }
}
class Boo extends Aoo {
    Boo() {
        System.out.println("Boo");
    }
}
class Coo {
    Coo(int i) {
        System.out.println(i);
    }
}
class Doo extends Coo {
    Doo(int i) {
        super(i);
        System.out.println("Doo");
    }
}