package chap04_processControl.question08;

public class SwitchDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println(i);
//                    break;
                case 1:
                    System.out.println(i);
//                    break;
                case 2:
                    System.out.println(i);
//                    break;
                default:
                    System.out.println("error num");
            }
        }
    }
}
