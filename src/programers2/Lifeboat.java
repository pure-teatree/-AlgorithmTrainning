package programers2;

import java.util.Arrays;

public class Lifeboat {
	public static int solution(int[] people, int limit) {
		Arrays.sort(people); //오름차순정렬 
		int answer = 0;
		
		int min = 0; //최소값
		for(int max=people.length-1;min<=max;max--){//최대값이 줄어든다.
			if(people[min]+people[max]<=limit) {//최소값과 최대값의 합이 같거나 작을 때 구명보트 수 증가, 다음 최소값으로 넘어감. 
				min++; //다음 인덱스
			}
			answer++; //합이 if문에 걸리거나 걸리지 않으면 구명보트 수 증가
		}
  
		return answer;
	}

	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50};//50,50,70,80
		int limit = 100;
		System.out.println(solution(people, limit));

	}

}
