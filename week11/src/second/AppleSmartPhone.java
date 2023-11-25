package second;

public class AppleSmartPhone extends Phone implements SMS, Camera{
    String os = "ios";

    public AppleSmartPhone(String number, String telecom) {
        super(number, telecom);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("ios message send: " + msg + "전송");
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("ios message receibe: " + msg);
    }

    @Override
    public void takePicture() {
        System.out.println("찰칵");
    }

    @Override
    public void recordVideo() {
        System.out.println("녹화를 시작합니다.");
    }


}
