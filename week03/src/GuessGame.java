import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);
        System.out.print("1에서 100사이의 수 입력 : ");
        int guessNumber = scanner.nextInt();
        if(guessNumber == answer){
            System.out.println("정답!");
        }else{
            System.out.println("정답은 " + answer + "입니다!");
        }
    }
}
