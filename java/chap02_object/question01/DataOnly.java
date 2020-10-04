package chap02_object.question01;

public class DataOnly {
    public int val;
    public char c;

    public DataOnly(){}

    public DataOnly(int v, char _c) {
        this.val = v;
        this.c = _c;
    }

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        System.out.println("val = " + data.val);
        System.out.println("c = " + data.c);
    }
}
