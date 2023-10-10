public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu1 = new Pikachu();
        Pikachu pikachu2 = new Pikachu();
        Squirtle squirtle1 = new Squirtle();
        squirtle1.attack();
        pikachu2.attack();
        System.out.println(squirtle1.name);
        System.out.println(squirtle1.hp);
        System.out.println(pikachu1.name);
        System.out.println(pikachu1.hp);
    }
}
