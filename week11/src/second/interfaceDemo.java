package second;
/*
추상 클래스와 비슷한 점
- 인터페이스는 추상 클래스 처럼 객체(인스터스) 생성 불가
- 추상 클래스처럼 인터페이스도 필드, 추상 메서드를 가질 수 있다.

추상 클래스와 다른 점
- 추상 클래스와 다르게 일반(구현) 메서드, 생성자를 가질 수 없다.
- 단, 예외적으로 default 메서드랑 static 메서드는 구현 메서드를 가질 수 있다.
- extends 대신 implements 키워드 사용해서 인터페이스를 구현

인터페이스를 사용하는 이유
- 다형성(polymorphism) 지원을 위해 사용
- 자바는 기본적으로 다중상속을 미지원. 따라서, 비슷하게 구현해야 하는 경우 인터페이스를 사용
 */
public class interfaceDemo {
    public static void main(String[] args) {
//        Camera c = new Camera();
        SamsungSmartPhone galaxyUltra = new SamsungSmartPhone("01011112222", "SKT", "Android");
        AppleSmartPhone iPone13 = new AppleSmartPhone("01055557777", "KT");
        SamsungSmartPhone galaxyA10 = new SamsungSmartPhone("01012345678", "LG", "타이젠");

//        SMS.deleteAll();
        iPone13.deleteAll();

        System.out.println(iPone13.os);
        iPone13.sendMessage("안녕 나 아이폰 샀어~");
        iPone13.receiveMessage("뭐 샀어? 프로");

        galaxyUltra.takePicture();
        galaxyA10.receiveMessage("오늘 볼 수 있어?");
        System.out.println(galaxyA10.os);
        System.out.println(galaxyUltra.os);
        galaxyUltra.sendMessage("안돼 약속이 있어요...");
    }
}
