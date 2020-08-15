package programers1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisionArray {

	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor =10;
		ArrayList<Integer> alist =new ArrayList<>();
		for(int a:arr) {
			if(a%divisor==0) {
				alist.add(a);
			}
		}
		if(alist.isEmpty()) {
			alist.add(-1);
		}
		int [] answer = alist.stream().mapToInt(Integer::valueOf).toArray();
		Arrays.sort(answer);
	}

}
