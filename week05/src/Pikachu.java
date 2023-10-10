public class Pikachu extends Pokemon{ // Pikachu is a Pokemon, Inheritance

    public Pikachu() {
        hp = 100;
        name = "피카츄";
        System.out.println("피카피카~");
    }

    public void attack(String skill) {
        System.out.println(skill + "공격시전!");
    }
}
