package InterfaceExample;

public class Sword implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("칼을 휘두릅니다!");
    }
}
