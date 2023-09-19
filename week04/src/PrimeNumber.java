import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = s.nextInt();

        int count = 0;

        for(int i=2; i<number; i++){  // 2부터 입력된 수까지 반복 (기존 코드대비 반복 횟수 -2)
            if(number % i == 0) {  // 약수가 발생하면
                count = count + 1;  // 약수 카운터 증가
                // System.out.println(i);
            }
        }

        if(count == 0)  // 한번 나누어 떨어지지 않았다면 count는 0으로 유지됨
            System.out.println(number + " is prime number!");
        else
            System.out.println(number + " is not prime number!");
    }
}