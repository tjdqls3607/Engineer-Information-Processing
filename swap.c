void swap() {        //swap 함수에 출력하는 것도 없고 main함수에 영향 미치지 않음.  a랑 b는 지역 변수이니 swap 함수 끝나면 메모리에서 사라짐
           int a = 11;
           int b = 19;
           int t = a;
           a = b;
           b = t;
}

int main() {
           int a = 11;
           int b = 19;
           swap();


           switch(a) {       //a = 11 이므로 case 11로 갑시다
                       case 1:
                                   b += 1;
                       case 11: 
                                   b += 2;        // b + 2 = 19 + 2 = 21;
                       default:  
                                   //case 11에 break문 없어서 default도 계산
                                   b += 3;        // b + 3 = 21 + 3 = 24;
                                   break;
            }


           printf("%d", a-b);      //a = 11, b = 24 이므로11 - 24 는 - 13 
}
 
