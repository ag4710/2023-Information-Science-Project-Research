public class GuessGame {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int answer = (int) (Math.random() * 100) + 1;
            System.out.println(answer);
        }
    }
}
