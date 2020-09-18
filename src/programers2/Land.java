package programers2;
/*섬 연결하기
 * 
 */
public class Land {
	public static int solution(int n, int[][] costs) {
        int answer = 0;
      //costs의 길이는 ((4-1)*4)/2=6. 겹치지 않고 섬연결 경우의 수?
        int length = ((n-1) * n) / 2; 
        int a; //리스트?
        int b;//리스트?
        int cost;//리스트?
        //각각의 값을 리스트에 담아서? 
        for(int i=0;i<length;i++) {
        	a = costs[i][0];
        	b = costs[i][1];
        	cost = costs[i][2];
        }
        return answer;
    }

	public static void main(String[] args) {
		//n=4
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		System.out.println(solution(4,costs));

	}

}
