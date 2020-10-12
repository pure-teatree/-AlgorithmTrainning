package programers2;

import java.util.Arrays;

//최댓값과 최솟값
/*
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
	예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.
 */
public class MaxAndMin {
	public static String solution(String s) {
        String answer = "";//최소 최대
        int[] arr = Arrays.asList(s.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
        	max = Math.max(max, arr[i]);//최대
        	min = Math.min(min, arr[i]);//최소
        }
        answer = min+" "+max;
        return answer;
    }

	public static void main(String[] args) {
		String s = "1 2 3 4";
		System.out.println(solution(s));

	}

}
