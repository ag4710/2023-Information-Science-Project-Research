import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        // (100°C × 9/5) + 32 = 212°F
        celsius = sc.nextDouble();
        fahrenheit = (celsius * (9.0/5.0)) + 32.0;
        System.out.println("섭씨 " + celsius + "도는 화씨 " + fahrenheit + "도 입니다");
    }
}