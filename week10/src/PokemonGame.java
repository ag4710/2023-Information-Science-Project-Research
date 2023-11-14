import java.util.Scanner;

public class PokemonGame {

    static Pokemon enemyPokemon = null;  // 정적 필드

    public  static  void createEnemy(){
        System.out.println("야생의 포켓몬이 나타났습니다");
        int pickEnemy = (int)(Math.random()*3);  // 0 ~ 2
        if (pickEnemy == 0){
            enemyPokemon = new Pikachu();
        } else if(pickEnemy == 1){
            enemyPokemon = new Squirtle();
        } else if(pickEnemy == 2){
            enemyPokemon = new Magikarp();
        }
    }

    public static void main(String[] args) {
        System.out.println("포켓몬 게임 시작~");
        Scanner s = new Scanner(System.in);
        System.out.print("플레이어 포켓몬 선택\n1) 피카츄   2) 꼬부기   3) 잉어킹 : ");
        int pick = s.nextInt();

        Pokemon playerPokemon = null;
        if (pick == 1){
            playerPokemon = new Pikachu();
        } else if(pick == 2){
            playerPokemon = new Squirtle();
        } else if(pick == 3){
            playerPokemon = new Magikarp();
        }

        createEnemy();

        while(true){
            System.out.print("1) 전투   2) 도망   3) 종료 : ");
            int menu = s.nextInt();
            if (menu == 1){
                System.out.println("전투를 시작합니다");
                System.out.print("사용할 기술 : 1)" + playerPokemon.skills[0] + " 2) " + playerPokemon.skills[1] + " 3) " + playerPokemon.skills[2] + " : ");
//                int skill = s.nextInt();
//                playerPokemon.attack(enemyPokemon, skill-1);
                playerPokemon.attack(enemyPokemon, s.nextInt()-1);  // 플레이어 공격
                System.out.println("======");
                enemyPokemon.attack(playerPokemon, (int)(Math.random() * 3));  // 적군 공격
            } else if (menu == 2){
                System.out.println("지역을 탈출 합니다.");
                createEnemy();
            } else if (menu == 3){
                System.out.println("프로그램을 종료합니다!");
                break;
            }
        }
    }
}
