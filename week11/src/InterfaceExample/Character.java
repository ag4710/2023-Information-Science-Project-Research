package InterfaceExample;

public class Character {
    private int hp;

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void useWeapon(){
        this.weaponBehavior.attack();
    }
}
