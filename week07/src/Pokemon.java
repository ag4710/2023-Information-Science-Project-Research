public abstract class Pokemon {
    private int hp;
    private String name;  // 외부 클래스에서 접근 모하도록 캡슐화

    protected  int level;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {  // getter 메서드, 외부에서 name 변수에 값을 리턴 받는다.
        return name;
    }

    public void setName(String name) {  // setter 메서드, 외부에서 name변수에 접근해 이름을 바꾼다.
        this.name = name;
    }

    // 기본생성자
    public Pokemon() {
    }
    // 매개변수 생성자
    public Pokemon(int hp, String name, int level) {
        this.hp = hp;
        this.name = name;
        this.level = level;
    }
}
