import java.util.Scanner;
// 두 수를 입력받아 두 수를 포함한 사이의 소수를 출력하라.

public class PrimeNumber {
    public static void main(String[] args) {
        Prime p1 = new Prime();

        Scanner s = new Scanner(System.in);
        System.out.print("Input start number : ");
        int number1 = s.nextInt();
        System.out.print("Input end number : ");
        int number2 = s.nextInt();

        if(number1 > number2){  // 먼저 입력된 수가 클 경우 두 수 swqp
            int temp;
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        for(int k=number1; k<=number2; k++) {  // 입력된 두 수 사이의 모든 수를 체크
            if(p1.isPrime(k)) System.out.print(k + " ");
        }
    }
}