import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number : ");

        int number = s.nextInt();
        boolean isPrime = true;

        for(int i=2; i<number; i++){
            if(number % i == 0) {
                isPrime = false;
                break;  // 소스가 아닌 수의 경우 첫 번째 약수가 발견되면 반복문 탈출
            }
            // System.out.print(i + " " );  //  확인용
        }

        if(isPrime)
            System.out.println(number + " is prime number!");
        else
            System.out.println(number + " is not prime number!");
    }
}