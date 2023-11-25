public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("날아 갈 수 없습니다");
    }
}
