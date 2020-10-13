package programers2;
//멀리뛰기
/*
 * 효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
(1칸, 1칸, 1칸, 1칸)
(1칸, 2칸, 1칸)
(1칸, 1칸, 2칸)
(2칸, 1칸, 1칸)
(2칸, 2칸)
의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 
멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 
여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 예를 들어 4가 입력된다면, 5를 return하면 됩니다.
- n은 1 이상, 2000 이하인 정수입니다.
 */
//피보나치 수열 풀이
//n=1,1 ->1a
//n=2,1 1,2 ->2b
//n=3, 1 1 1,1 2,2 1 ->3
//n=4, 1 1 1 1,1 1 2,1 2 1,2 1 1,2 2 ->5
//n=5, 3+5=8
//n=6, 5+8=13
//n일때 F(n-1)+F(n-2)
public class LongJump {

	public static long solution(int n) {
        long answer = 0;
        if(n<=3) {
        	return n;
        }
        long a = 1; //(n-2)값
        long b = 2;//(n-1)값
        for(int i =3;i<=n;i++) { 
        	answer = (a+b)%1234567; 
        	a=b%1234567;
        	b=answer; //n의 값 = (n-2)의 값 + (n-2)의 값(a+b)
//        	System.out.println(i+"------");
//        	System.out.println("n-1:"+a);
//        	System.out.println("n-2:"+b);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 2000;
		System.out.println(solution(n)); 

	}

}
