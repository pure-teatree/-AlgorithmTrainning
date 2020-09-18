package programers1;

import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		String s = "123231";
		
		int [] arr= Stream.of(s.split("")).mapToInt(Integer::parseInt).toArray();
		int len = arr.length/2; //4
        int half = len/2;//2
        int sum1=0;
        int sum2=0;
		for(int i =0;i<len;i++) {
		    sum1+=arr[i];
		}
		for(int j=len;j<arr.length;j++){
			 sum2+=arr[j];
		 }
		System.out.println(sum1 + "  "+sum2);
		    
		    
		 

	}

}
