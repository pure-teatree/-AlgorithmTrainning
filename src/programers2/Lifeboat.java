package programers2;

import java.util.Arrays;

public class Lifeboat {
	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int sum=0;
        for(int i=0;i<people.length/2;i++) {
        	sum = people[i]+people[people.length-(i+1)];
        	if(sum>=limit) {
        		answer++;
        		
        	}
        }
        
        System.out.println("최종합:"+sum);
  
		return answer;
	}

	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50};
		int limit = 100;
		System.out.println(solution(people, limit));

	}

}
