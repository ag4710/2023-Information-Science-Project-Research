public class Pikachu extends Pokemon{ // Pikachu is a Pokemon, Inheritance

    public Pikachu() {
        // hp = 100;
        this.setHp(100);
        // name = "피카츄";
        this.setName("피카츄");
        this.level = 23;
        System.out.println("피카피카~");
    }

    public Pikachu(int hp, String name, int level) {  // 가독성을 위해 매개변수 이름을 name으로
//        this.name = name;  // 매개변수와 멤버변수(필드)를 구분하기 위해 this 키워드 사용
//        this.hp = hp;
        super(hp, name, level);  // 부모 클래스(Pokemon)의 매개변수 생성자를 호출
        System.out.println("라이츄라이츄~");
    }

    public void attack(String skill) {
        System.out.println(skill + " 공격시전(전기속성)!");
    }
}