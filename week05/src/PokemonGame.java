public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.hp = 100;
        pikachu.name = "피카츄";
        pikachu.attack();
        System.out.println(pikachu.name);
        System.out.println(pikachu.hp);
    }
}
