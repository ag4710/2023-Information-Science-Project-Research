package third;

import java.net.PortUnreachableException;

// 중첩클래스 : 멤버클래스, 지역클래스
public class OutDemo {
    // 필드
    private String s1 ="비밀";
    String s2 = "외부";

    // 멤버 클래스
    class InClass{
        String s2 = "내부";

        public void test1(){
            System.out.println(s2); // 내부
            System.out.println(s1); // 비밀
            System.out.println(OutDemo.this.s2); //외부
        }
    }

    public static void main(String[] args) {
        OutDemo o = new OutDemo();
        OutDemo.InClass o1 = o.new InClass();

        System.out.println(o1.s2); // 내부
        o1.test1();
    }
}
