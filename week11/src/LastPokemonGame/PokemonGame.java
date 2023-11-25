package LastPokemonGame;

import java.util.Scanner;

public class PokemonGame {

    static Pokemon enemyPokemon = null;  // 정적 필드

    public  static  void createEnemy(){
        System.out.println("야생의 포켓몬이 나타났습니다");
        int pickEnemy = (int)(Math.random() * 4);  // 0 ~ 3
        if (pickEnemy == 0){
            enemyPokemon = new Pikachu();
        } else if(pickEnemy == 1){
            enemyPokemon = new Squirtle();
        } else if(pickEnemy == 2){
            enemyPokemon = new Magikarp();
        } else if(pickEnemy == 3){
            enemyPokemon = new Charizard();
        }
    }

    public static void main(String[] args) {
        System.out.println("포켓몬 게임 시작~");
        Scanner s = new Scanner(System.in);
        System.out.print("플레이어 포켓몬 선택\n1) 피카츄   2) 꼬부기   3) 잉어킹   4) 리자몽: ");
        int pick = s.nextInt();

        Pokemon playerPokemon = null;
        if (pick == 1){
            playerPokemon = new Pikachu();
        } else if(pick == 2){
            playerPokemon = new Squirtle();
        } else if(pick == 3){
            playerPokemon = new Magikarp();
        } else if(pick == 4){
            playerPokemon = new Charizard();
            playerPokemon.fly();
        }

        createEnemy();

        while(true){
            System.out.print("1) 전투   2) 도망   3)물약(체력)   4)물약(공격력)   5) 종료 : ");
            int menu = s.nextInt();
            if (menu == 1) {
                System.out.println("전투를 시작합니다");
                System.out.print("사용할 기술 : 1)" + playerPokemon.skills[0] + " 2) " + playerPokemon.skills[1] + " 3) " + playerPokemon.skills[2] + " : ");
//                int skill = s.nextInt();
//                playerPokemon.attack(enemyPokemon, skill-1);
                playerPokemon.attack(enemyPokemon, s.nextInt()-1);  // 플레이어 공격
                System.out.println("======");
                enemyPokemon.attack(playerPokemon, (int)(Math.random() * 3));  // 적군 공격
            } else if (menu == 2) {
                System.out.println("지역을 탈출 합니다.");
                createEnemy();  // 적군 다시 생성
            } else if (menu == 3) {
                System.out.println("현재 체력은 " + playerPokemon.getHp() + "입니다.  +50hp 물약을 마십니다.");
                playerPokemon.setHp(playerPokemon.getHp() + 50);
                System.out.println("업데이트된 체력은 " + playerPokemon.getHp());
            } else if (menu == 4) {
                System.out.println("현재 공격력은 " + playerPokemon.attackRate + "입니다.  +40 attack point 물약을 마십니다.");
                playerPokemon.attackRate = playerPokemon.attackRate + 40;
                System.out.println("업데이트된 공격력은 " + playerPokemon.attackRate);
            } else if (menu == 5) {
                System.out.println("프로그램을 종료합니다!");
                break;
            }
        }
    }
}
