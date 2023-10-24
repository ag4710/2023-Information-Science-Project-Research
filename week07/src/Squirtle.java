public class Squirtle extends Pokemon{ // Squirtle is a Pokemon, Inheritance

    public Squirtle() {
        // hp = 110;
        this.setHp(110);
        // name = "꼬부기";
        this.setName("꼬부기");
        System.out.println("꼬북꼬북~");
    }

    public void attack(String skill) {
        System.out.println(skill + "공격시전!");
    }
}
