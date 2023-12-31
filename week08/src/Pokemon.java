public abstract class Pokemon {
    // 필드
    private int hp;
    //public String name;
    private String name;  // 외부 클래스에서 직접 접근 못하도록 캡슐화
    protected int level;  // 부모 자식 간에는 직접 접근 가능하도록 캡슐화

    // 기본 생성자
    public Pokemon() {
    }
    // 매개변수 생성자
    public Pokemon(int hp, String name, int level) {
        this.hp = hp;
        this.name = name;
        this.level = level;
    }

    // getter, setter method
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getName() {  // getter 메서드. 외부에서 name변수에 값을 리턴 받는다
        return name;
    }

    public void setName(String name) {  // setter 메서드. 외부에서 name변수에 접근해 이름을 바꾼다
        this.name = name;
    }

    // method
    public abstract void attack(Pokemon p, String s);  // 추상 메서드, 반드시 상속 받는 자식 클래스는 본체를 구현해야 한다
    // Pokemon을 상속 받는 모든 자식 클래스가 공격 대상
}
