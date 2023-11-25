package InterfaceExample;

public class Knife implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("단검으로 찌릅니다!");
    }
}
