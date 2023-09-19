import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number : ");
        int number1 = s.nextInt();
        System.out.print("Input number : ");
        int number2 = s.nextInt();

        boolean isPrime = true;

        for(int k=number1; k<=number2; k++) {  // 입력된 두 수 사이의 모든 수를 체크
            isPrime = true;  // 각 수를 체크할 때 isPrime 변수를 true로 초기화한다.
            if(k <= 1)  // 소수 정의 참고
                isPrime = false;
            else {
                for (int i = 2; i < k; i++) {
                    if (k % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) System.out.print(k + " ");
            }
        }
    }
}