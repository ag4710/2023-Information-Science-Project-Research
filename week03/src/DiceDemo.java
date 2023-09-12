public class DiceDemo {
    public static void main(String[] args) {
        int dice = (int)(Math.random()*6)+1;
        if(dice == 1){
            System.out.println("1!");
        } else if(dice == 2){
            System.out.println("2!");
         }else if(dice == 3){
            System.out.println("3!");
        } else if(dice == 4){
            System.out.println("4!");
        } else if(dice == 5){
            System.out.println("5!");
        } else if(dice == 6){
            System.out.println("6!");
        } else{
            System.out.println("여긴 영원히 실행되지 않습니다!");
        }
    }
}
