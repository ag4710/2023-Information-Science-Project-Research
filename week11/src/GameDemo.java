public class GameDemo {
    public static void main(String[] args) {
        King king = new King(); // 왕 캐릭터 객체 생성
        Sword s = new Sword(); // 칼 객체 생성
        king.setWeaponBehavior(s); // 무기 장착
        king.useWeapon();
        king.setWeaponBehavior(new Bow());
        king.useWeapon();
    }
}
