package third;

import second.Camera;

class Icon{
    interface Touchable{ // 중첩 인터페이스
        void touch();
    }
}

public class TabletDemo implements Icon.Touchable, Camera {
    @Override
    public void takePicture() {
        System.out.println("태블릿으로 사진 촬영~~");
    }

    @Override
    public void recordVideo() {
        System.out.println("4k 동영상 촬영");
    }
    @Override
    public void touch() {
        System.out.println("태블릿 아이콘을 터치함");
    }
    public static void main(String[] args) {
        TabletDemo app = new TabletDemo();
        app.touch();
//        Icon.Touchable app = new TabletDemo();
//        app.touch();
        app.recordVideo();
        app.takePicture();
    }
}
