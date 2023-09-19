import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = s.nextInt();
        int count = 0;

        for(int i=1; i<=number; i++){  // 1부터 입력된 수까지 반복
            if(number % i == 0) {  // 약수가 발생하면
                count = count + 1;  // 약수 카운터 증가
                // System.out.println(i);
            }
        }

        if(count == 2)
            System.out.println(number + " is prime number!");
        else
            System.out.println(number + " is not prime number!");
    }
}