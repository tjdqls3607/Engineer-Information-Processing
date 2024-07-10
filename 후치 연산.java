public class Problem {
    public static void main(String[] args) {
        int j, k, L, result;
        j = 10;
        k = 20;
        L = 30;
        result = j < k ? k++ : --L;     //j가 k보다 작으면 k++의 값을 result 에 저장 그렇지 않으면 --ㅣ result저장
        System.out.printf("%d %d %d\n", result, k, L );
    }
    
    //answer = 20 21 30
}
