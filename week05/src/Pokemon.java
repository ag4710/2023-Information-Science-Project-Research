public class Pokemon {
    // 필드
    public int hp;
    public String name;
    // 기본생성자
    public Pokemon() {
    }
    // 매개변수 생성자
    public Pokemon(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }
    // 일반 메서드
    public void attack(String skill){
        System.out.println(skill + "공격시전!");
    }
}
