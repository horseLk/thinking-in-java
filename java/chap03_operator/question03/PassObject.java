package chap03_operator.question03;
class Letter {
    float f;
}

public class PassObject {
    public static void f(Letter l) {
        l.f = 0.321f;
    }

    public static void main(String[] args) {
        Letter l = new Letter();
        l.f = 7.22f;
        System.out.println("l = " + l.f);
        f(l);
        System.out.println("l = " + l.f);
    }
}
