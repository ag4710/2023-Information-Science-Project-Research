import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        // (100°F − 32) × 5/9 = 37.778°C
        fahrenheit = sc.nextDouble();
        System.out.println("화씨 " + fahrenheit + "도는 섭씨 " + ((fahrenheit - 32.0) * (5.0 / 9.0)) + "도 입니다");
    }
}