public class Magikarp extends Pokemon{
    public Magikarp() {
        this.setHp(10);
        this.setName("잉어킹");
        this.level = 1;
        System.out.println("잉잉~");
    }

    public Magikarp(int hp, String name, int level) {
        super(hp, name, level);
        System.out.println("갸라갸라!");
    }

    public void attack(Pokemon targetPokemon, String skill) {
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() + "에게 " + skill + " 공격시전(노말)!");
    }
}
