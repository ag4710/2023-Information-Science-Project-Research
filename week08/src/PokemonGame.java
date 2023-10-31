import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임 시작~");
        Scanner s = new Scanner(System.in);
        System.out.print("플레이어 포켓몬 선택\n1) 피카츄   2) 꼬부기 : ");
        int pick = s.nextInt();
        Pokemon playerPokemon = null;

        if (pick == 1){
            playerPokemon = new Pikachu();
        } else if(pick == 2){
            playerPokemon = new Squirtle();
        }

        while(true){
            System.out.println("1) 전투   2) 도망   3) 종료 :");
            int menu = s.nextInt();
            if (menu == 1){
                System.out.println("전투를 시작합니다");
                playerPokemon.attack("몸통박치기");
            } else if (menu == 2){
                System.out.println("지역을 탈출 합니다.");
            } else if (menu == 3){
                System.out.println("프로그램을 종료합니다!");
                break;
            }
        }
    }
}
