public class PokemonGame {
    public static void main(String[] args) {
        // Pokemon pokemon = new Pokemon();  // 추상클래스는 객체(인스턴스) 생성 불가
        Squirtle squirtle1 = new Squirtle();  // 기본생성자 호출
        Pikachu pikachu1 = new Pikachu();  // 기본생성자 호출
        Pikachu pikachu2 = new Pikachu(150, "라이츄"); //매개변수 생성자 호출

        System.out.println(squirtle1.getName());
        pikachu1.attack("전기쇼크 ");
        squirtle1.attack("물대포 ");
        System.out.println(pikachu2.getName());
        System.out.println(pikachu2.getHp());
    }
}
