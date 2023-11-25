package Version14;

public class Magikarp extends Pokemon{
    public Magikarp() {
        this.setHp(20);
        this.setName("잉어킹");
        this.attackRate = (int)(Math.random() * 7) + 10;  // 10 ~ 16
        this.defenceRate = 55;
        this.level = 1;
        System.out.println("잉잉~");

        this.skills = new String[]{"튀어오르기", "몸통박치기", "바둥바둥"};
        this.skillPoints = new int[]{10, 40, 50};
    }

    public Magikarp(int hp, String name, int level) {
        super(hp, name, level);
        System.out.println("갸라갸라!");
    }

    public void attack(Pokemon targetPokemon, int skill) {
        int tempAttackRate = (this.attackRate+ this.skillPoints[skill]) - targetPokemon.defenceRate;
        if (tempAttackRate < 0)  // 공격력은 최소 0으로 만든다
            tempAttackRate = 0;
        targetPokemon.setHp(targetPokemon.getHp() - tempAttackRate);  // 적군 체력 업데이트
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() + "에게 " + this.skills[skill] + " 공격시전(노말)!");
        if (targetPokemon.getHp() <= 0)
            System.out.println("RIP! " + targetPokemon.getName());
        else {
            System.out.println(targetPokemon.getName() + "의 체력은 " + targetPokemon.getHp() + "입니다.");
        }
    }
}
