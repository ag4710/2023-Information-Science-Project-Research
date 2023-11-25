package fourth;

public class OutDemo {
    private String x = "외부";

    void y() {
        int k = 5; // 지역변수
        //다른 클래스의 메서드 안에 선언된 지역클래스
        class LocalClass{
            String z = "내부";
            String q = x;
            public void r(){
                System.out.println("지역");
                System.out.println(k);
//                k = 10; // final // 값을 바꿀 수 없음, 읽기 전용 변수가 됨
            }
        }
        LocalClass l = new LocalClass();
        System.out.println(l.z);
        l.r();
    }

    public static void main(String[] args) {
        OutDemo o = new OutDemo();
        o.y();
    }
}
