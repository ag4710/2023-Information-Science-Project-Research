import java.util.Scanner;

public class CinemaDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이는 : ");
        int age = s.nextInt();
        if(age < 15){
            System.out.println("15세 미만 미성년자 관람불가!");
        }else if(age < 19){
            System.out.println("15세 등급영화 관람 가능");
            System.out.println("19세 미만 미성년자 관람불가!");
        }else{
            System.out.print("19세 이상이므로 ");
            System.out.println("모든 등급 관람 가능. 입장하세요.");
        }
    }
}
