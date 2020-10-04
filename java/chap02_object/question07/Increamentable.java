package chap02_object.question07;

public class Increamentable {
    static int val = 0; // 类成员，可以用于记录对象个数

    public Increamentable() {
        val++;
    }

    public static void main(String[] args) {
        System.out.println(Increamentable.val);
        new Increamentable();
        new Increamentable();
        new Increamentable();
        new Increamentable();
        System.out.println(Increamentable.val);
    }
}
