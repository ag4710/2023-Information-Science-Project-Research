import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number : ");

        int number = s.nextInt();
        boolean isPrime = true;

        if(number <= 1)  // 소수 정의 참고
            isPrime = false;
        else{
            for(int i=2; i<number; i++){
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(number + " is prime number!");
        else
            System.out.println(number + " is not prime number!");
    }
}