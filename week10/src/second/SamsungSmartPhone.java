package second;

public class SamsungSmartPhone extends Phone implements SMS, Camera{
    // String os = "Android";
    String os;

    public SamsungSmartPhone(String number, String telecom, String os) {
        super(number, telecom);
        this.os = os;
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS: " + msg + "전송");
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("수신: " + msg);
    }

    @Override
    public void takePicture() {
        System.out.println("철칵");
    }

    @Override
    public void recordVideo() {
        System.out.println("영상 녹화 시작");
    }
}
