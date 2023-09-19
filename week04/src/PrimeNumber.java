import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number : ");

        int number = s.nextInt();
        boolean isPrime = true;  // int -> boolean 메모리 공간 절약, 가독성 up

        for(int i=2; i<number; i++){
            if(number % i == 0) {
                //count = count + 1;
                isPrime = false;  // 더하기 연산 제거
            }
        }

        if(isPrime) {  // == 비교연산자 제거
            System.out.println(number + " is prime number!");
        }else {
            System.out.println(number + " is not prime number!");
        }
    }
}