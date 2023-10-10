public class PokemonGame {
    public static void main(String[] args) {
        // Pokemon pokemon = new Pokemon();  // 추상클래스는 객체(인스턴스) 생성 불가
        Squirtle squirtle1 = new Squirtle();
        Pikachu pikachu1 = new Pikachu();

        pikachu1.attack("전기쇼크 ");
        squirtle1.attack("물대포 ");
    }
}
