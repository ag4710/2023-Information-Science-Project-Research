package first;

interface Day{
    // 인터페이스의 필드들은 기본적으로 public static final로 동작
    String MON = "월", TUE = "화", WED = "수", THUR = "목", FRI = "금", SAT = "토", SUN = "일";
}

//class Day{
//    // 인터페이스의 필드들은 기본적으로 public static final로 동작
//    static final String  MON = "월", TUE = "화", WED = "수", THUR = "목", FRI = "금", SAT = "토", SUN = "일";
//}

public class DayDemo {
    public static void main(String[] args) {
//        Day.MON = "어떤요일";  //final
        System.out.println(Day.MON); // static
    }
}
