public class Magikarp extends Pokemon{
    public Magikarp() {
        this.setHp(20);
        this.setName("잉어킹");
        this.attackRate = 10;
        this.defenceRate = 55;
        this.level = 1;
        System.out.println("잉잉~");
    }

    public Magikarp(int hp, String name, int level) {
        super(hp, name, level);
        System.out.println("갸라갸라!");
    }

    public void attack(Pokemon targetPokemon, String skill) {
        int tempAttackRate = this.attackRate - targetPokemon.defenceRate;
        if (tempAttackRate < 0)  // 공격력은 최소 0으로 만든다
            tempAttackRate = 0;
        targetPokemon.setHp(targetPokemon.getHp() - tempAttackRate);  // 적군 체력 업데이트
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() + "에게 " + skill + " 공격시전(노말)!");
        if (targetPokemon.getHp() <= 0)
            System.out.println("RIP! " + targetPokemon.getName());
        else {
            System.out.println(targetPokemon.getName() + "의 체력은 " + targetPokemon.getHp() + "입니다.");
        }
    }
}
