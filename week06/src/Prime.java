public class Prime {
    public Prime() {

    }

    public boolean isPrime(int n){          //method 이름으로 사용
        if(n <= 1)  // 소수 정의 참고
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
