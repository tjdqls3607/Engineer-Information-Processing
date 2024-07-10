package H;

public class Problem {
    public static void main(String[] args) {
        byte a = 15, b = 19;
        System.out.printf("%d\n", ~a);      /* ~ 각 비트의 부정을 만드는 연산자 java에서
                                               byte변수는 정수형 1바이트이므로 각 변수의 값을
                                               1바이트 2진수로 변환한 다음 비트에 대해 부정 연산을 한다.*/
        System.out.printf("%d\n", a^b);     // ^는 두 비트가 모두 같으면 0 서로 다르면 1이 되는 비트연산자
        System.out.printf("%d\n", a&b);     // & 두비트가 모두 1일때만 1이되는 비트 연산자
        System.out.printf("%d\n", a|b);     // | 두 비트중 한 비트라도 1이면 1이되는 비트 연산자
    }
}

/*answer = -16
            28
            3
            31 */
