package InterfaceExample;

public class Axe implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("도끼로 내려 찍습니다!");
    }
}
