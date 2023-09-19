import java.sql.SQLOutput;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int computer = (int) (Math.random() * 6) + 1;
            System.out.println("computer dice number : " + computer);

            System.out.print("1) Roll a dice   2) Exit program : ");
            int menu = scanner.nextInt();
            if (menu == 1){
                int player = (int) (Math.random() * 6) + 1;
                if(player == computer){
                    System.out.println("Draw...");
                }else if(player > computer){
                    System.out.println("You win!");
                }else{
                    System.out.println("You lost~!");
                }
                System.out.println("player dice number : " + player);
            }else if(menu == 2) {
                System.out.println("program terminated");
                break;
            }else {
                System.out.println("check menu and select number again.");
            }
        }
    }
}
