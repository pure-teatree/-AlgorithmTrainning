package programers2;
/* 피보나치 수
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

예를들어

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
와 같이 이어집니다.

2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 */
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		List flist = new ArrayList<>();
		flist.add(0);//0
		flist.add(1);//1
		int n =9999;
		for(int i=1;i<n;i++) {
			int a = (int) flist.get(i-1);
			int b =(int)flist.get(i);
			flist.add((a+b)%1234567);//나머지가 1234567보다 클 수없음.그러므로 int로 안해도 됨.
		}
		int answer =(int) flist.get(n);
		System.out.println(answer);
	}

}
