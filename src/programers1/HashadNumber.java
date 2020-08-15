package programers1;

import java.util.stream.Stream;

public class HashadNumber {

	public static void main(String[] args) {

		int x = 18;
		int[] arr = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
		int sum=0;
		for(int a:arr) {
			sum +=a;
		}
		if(x%sum==0) {
			System.out.println("True");
			
		}
		
	}

}