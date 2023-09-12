public class BitOperator {
    public static void main(String[] args) {
        // 0100 0101(2)  69(10)
        // 0001 1111(2)  31(10)

        //& bit and (둘 다 1일때만 1)
        // 0000 0101(2) 5(10)

        //| bit or (둘 중 하나 이상이 1이면 1)
        // 0101 1111(2) 95(10)

        //^ bit exclusive or (둘의 값이 서로 다르면 1)
        // 0101 1010 90(10)

        //~ bit inversion(피연산자는 하나고 bit를 반전)
        // 0001 1111(2) // 31
        // 1110 0000(2) // 음수일 경우 2의 보수법, -32
        // 0010 0000(2) // 32

        System.out.println("69 & 31 = " + (69 & 31));  // 5
        System.out.println("69 | 31= " + (69 | 31));   // 95
        System.out.println("69 ^ 31 = " + (69 ^ 31));  // 90
        System.out.println("~31 = " + (~31));   // -32
        System.out.println("-------------------------------");
        System.out.println("~-1 = " + (~-1));
    }
}
