package chap03_operator.question02;
class Tank {
    public float f;
}
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.f = 3.21f;
        t2.f = 11.11f;
        System.out.println("t1 = " + t1.f + ", t2 = " + t2.f);
        t1 = t2;
        System.out.println("t1 = " + t1.f + ", t2 = " + t2.f);
        t1.f = 9.9f;
        System.out.println("t1 = " + t1.f + ", t2 = " + t2.f);
    }
}
