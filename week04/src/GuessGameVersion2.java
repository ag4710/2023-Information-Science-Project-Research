import java.util.Scanner;

public class GuessGameVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chance = 10;
        int count = chance; // for구문의 반복 횟수를 확정
        int answer = (int) (Math.random() * 100) + 1;
        // for(int i=1; i<=10; i++) { // 정답을 맞출 기회는 10번
        // for(int i=1; i<=chance; i++) { // 정답을 맞출 기회는 chance 횟수만큼, 하지만 for문의 chance가 줄어드는 문제 발생
        for(int i=1; i<=count; i++) {
            System.out.print("1에서 100사이의 수 입력 : ");
            int guessNumber = scanner.nextInt();
            if (guessNumber == answer) {
                System.out.println("정답!");
                break; //for문 탈출 (가장 가까운 반복문 탈출 시 사용)
            } else if(guessNumber > answer){ // 추측한 수가 정답보다 클 때
                System.out.println("입력하신 숫자는 정답보다 큰 수 입니다! 좀 더 작은 숫자를 입력해보세요.");
                --chance;
                System.out.println("기회는 " + chance + "번 남았습니다!");
            } else{ // 추측한 수가 정답보다 작을 때
                System.out.println("입력하신 숫자는 정답보다 작은 수 입니다! 좀 더 큰 숫자를 입력해보세요.");
                --chance;
                System.out.println("기회는 " + chance + "번 남았습니다!");
            }
        }
    }
}