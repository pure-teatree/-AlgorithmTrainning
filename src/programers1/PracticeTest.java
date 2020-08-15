package programers1;

import java.util.ArrayList;

public class PracticeTest {
	//1 : 1, 2, 3, 4, 5
	//2 :2, 1, 2, 3, 2, 4, 2, 5
	//3 :3, 3, 1, 1, 2, 2, 4, 4, 5, 5
	public static void main(String[] args) {
		 int[] p1 = {1,2,3,4,5};
	        int[] p2 = {2,1,2,3,2,4,2,5};
	        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
	        int cnt1= 0, cnt2=0, cnt3=0;
	        int[] answers = {1,2,3,4,5};
	        for(int i =0; i<answers.length;i++){
	            if(answers[i]==p1[i%5]){
	                cnt1++;
	            }
	            if(answers[i]==p2[i%8]){
	                cnt2++;
	            }
	            if(answers[i]==p3[i%10]){
	                cnt3++;
	            }
	        }
	        
	        int maxp = Math.max(Math.max(cnt1,cnt2),cnt3);
	        ArrayList<Integer> arrList = new ArrayList<>();
	        if(maxp==cnt1){
	            arrList.add(1);
	        }
	        if(maxp==cnt2){
	            arrList.add(2);
	        }
	        if(maxp==cnt3){
	            arrList.add(3);
	        }
	        int[] answer = new int[arrList.size()];
	        for(int i=0;i<arrList.size();i++){
	            answer[i] =arrList.get(i);
	        }
	       for(int a : answer) {
	    	   System.out.println(a);
	       }
		
	}

}
