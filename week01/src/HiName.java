import java.util.Scanner;

public class HiName {
    public static void main(String[] args) {
        // 키보드(system.in)로부터 입력 받은 객체 scanner를 생성
        Scanner scanner = new Scanner(System.in);
        // scanner 객체를 사용해서 키보드로부터 문자열을 입력받아 name 변수에 참조
        String name = scanner.next();
        // 출력
        System.out.println("당신의 이름은 " + name + "입니다.");
    }
}
