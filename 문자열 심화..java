public class Problem {
    public static void main(String[] args) {    /* 문자열 변수 str선언 
                                                   str변수에 "Power overwhelming!"를 저장
                                                   %s는 문자열 출력 서식 문자열 %8.4s는 8자리 확보후 str
                                                   저장된 문자열중 앞의 4글자를 오른쪽에서부터 출력 결과는 
                                                   앞의 공백 4칸 후 Powe가 된다 */
        String str;
        str = "Power overwhelming!";
        System.out.printf("%8.4s\n", str);
    }
}

//answer =    Powe
