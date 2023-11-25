package second;

public interface SMS {
    // 필드, 메서드
    void sendMessage(String msg);
    void receiveMessage(String msg);

    // static(정적) 메서드의 경우 구현(body) 부분을 가질 수 있다
//    static void deleteAll(){
//        System.out.println("전체 기기의 문자 메세지를 모두 삭제합니다.");
//    }

    // static(정적) 메서드의 경우 구현(body) 부분을 가질 수 있다
    default void deleteAll(){
        System.out.println("문자 메세지를 모두 삭제합니다.");
    }
}
