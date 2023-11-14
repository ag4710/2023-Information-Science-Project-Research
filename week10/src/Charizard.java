public class Charizard extends Pokemon implements Flyable{
    public Charizard() {
        this.setHp(78);
        this.setName("리자몽");
        this.attackRate = 84;
        this.defenceRate = 78;
        this.level = 36;

        this.skills = new String[]{"할퀴기", "용의숨결", "플레어드라이브"};
        this.skillPoints = new int[]{40, 60, 120};

        System.out.println("리자~");
    }

    public Charizard(int hp, String name, int level) {
        super(hp, name, level);
        System.out.println("리자~");
    }

    @Override
    public void attack(Pokemon targetPokemon, int skill) {
        int tempAttackRate = (this.attackRate+ this.skillPoints[skill]) - targetPokemon.defenceRate;
        if (tempAttackRate < 0)
            tempAttackRate = 0;
        targetPokemon.setHp(targetPokemon.getHp() - tempAttackRate);
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() +  "에게 " + this.skills[skill] + " 공격시전(전기)!");
        if (targetPokemon.getHp() <= 0)
            System.out.println("RIP! " + targetPokemon.getName());
        else {
            System.out.println(targetPokemon.getName() + "의 체력은 " + targetPokemon.getHp() + "입니다.");
        }
    }

    @Override
    public void fly() {
        System.out.println("날개를 펼쳐 날아갑니다.");
    }
}
