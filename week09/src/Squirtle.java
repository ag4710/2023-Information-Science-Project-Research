public class Squirtle extends Pokemon{ // Squirtle is a Pokemon, Inheritance

    public Squirtle() {
        this.setHp(44);  // private 접근자
        this.setName("꼬부기");
        this.attackRate = 48;
        this.defenceRate = 65;
        this.level = 1;  // protected 접근 제한자는 자식 클래스에서 직접 access 가능
        System.out.println("꼬북꼬북~");
    }

    public void attack(Pokemon targetPokemon, String skill) {
        int tempAttackRate = this.attackRate - targetPokemon.defenceRate;
        if (tempAttackRate < 0)  // 공격력은 최소 0으로 만든다
            tempAttackRate = 0;
        targetPokemon.setHp(targetPokemon.getHp() - tempAttackRate);  // 적군 체력 업데이트
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() + "에게 " + skill + " 공격시전(물)!");
        if (targetPokemon.getHp() <= 0)
            System.out.println("RIP! " + targetPokemon.getName());
        else {
            System.out.println(targetPokemon.getName() + "의 체력은 " + targetPokemon.getHp() + "입니다.");
        }
    }
}
