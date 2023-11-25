public class Pikachu extends Pokemon{ // Pikachu is a Pokemon, Inheritance

    public Pikachu() {
        // hp = 100;
        this.setHp(35);
        // name = "피카츄";
        this.setName("피카츄");
        this.attackRate = 55;
        this.defenceRate = 40;
        this.level = 1;

        this.skills = new String[]{"볼부비부비", "전기쇼크", "10만볼트"};
        this.skillPoints = new int[]{20, 40, 90};

        this.setFlyable(new NoFly());
        System.out.println("피카피카~");
    }

    public Pikachu(int hp, String name, int level) {  // 가독성을 위해 매개변수 이름을 name으로
//        this.name = name;  // 매개변수와 멤버변수(필드)를 구분하기 위해 this 키워드 사용
//        this.hp = hp;
        super(hp, name, level);  // 부모 클래스(Pokemon)의 매개변수 생성자를 호출
        System.out.println("라이츄라이츄~");
    }

    public void attack(Pokemon targetPokemon, int skill) {
        // 공격 주체가 피카츄 객체고 공격 대상이 잉어킹 객체일 때
        // 잉어킹 체력 - (피카츄 공격력 - 잉어킹 방어력)
        // 20 - 55
        int tempAttackRate = (this.attackRate+ this.skillPoints[skill]) - targetPokemon.defenceRate;
        if (tempAttackRate < 0)  // 공격력은 최소 0으로 만든다
            tempAttackRate = 0;
        targetPokemon.setHp(targetPokemon.getHp() - tempAttackRate);  // 적군 체력 업데이트
        System.out.println(this.getName() + "가(이) " + targetPokemon.getName() +  "에게 " + this.skills[skill] + " 공격시전(전기)!");
        if (targetPokemon.getHp() <= 0)
            System.out.println("RIP! " + targetPokemon.getName());
        else {
            System.out.println(targetPokemon.getName() + "의 체력은 " + targetPokemon.getHp() + "입니다.");
        }
    }
}