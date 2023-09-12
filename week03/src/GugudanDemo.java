import java.util.Scanner;

public class GugudanDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("단 입력 : ");
        int dan = s.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }
}
