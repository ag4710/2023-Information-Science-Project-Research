public class Squirtle extends Pokemon{ // Squirtle is a Pokemon, Inheritance

    public Squirtle() {
        // hp = 110;
        this.setHp(110);  // private 접근자
        // name = "꼬부기";
        this.setName("꼬부기");
        this.level = 1;  // protected 접근 제한자는 자식 클래스에서 직접 access 가능
        System.out.println("꼬북꼬북~");
    }

    public void attack(Pokemon targetPokemon, String skill) {
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() + "에게 " + skill + " 공격시전(물)!");
    }
}
