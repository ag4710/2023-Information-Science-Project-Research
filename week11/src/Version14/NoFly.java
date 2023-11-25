package Version14;

public class NoFly implements Flyable  {
    @Override
    public void fly() {
        System.out.println("날 수가 없어 뛰어갑니다.");
    }
}