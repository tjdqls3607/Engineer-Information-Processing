public class Main {
	public static void check(int[] x, int[] y) {
		if(x==y) System.out.print("O");
		else System.out.print("N");
	}
	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3, 4};
		int b[] = new int[] {1, 2, 3, 4};
		int c[] = new int[] {1, 2, 3};
		check(a, b);
		check(b, c);
		check(a, c);
	}
}

answer : nnn heap 영역에 저장된 배열들은 .length 로 비교되는게 아닌 이상 모두 다름
