public abstract class Pokemon {
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
}
