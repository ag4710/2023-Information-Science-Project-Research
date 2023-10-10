import java.sql.SQLOutput;

public class Pokemon {
    // fields (attributes)
    public int hp;
    public String name;
    // constructor method
    public  Pokemon(){
        hp = 100;
        name = "피카츄";
        System.out.println("피카피카~");
    }
    // methods (member function)
    public void attack(){ System.out.println("공격시전!"); }
}
