package StandardMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_4153 {
	
	public static void main(String[] args) throws IOException {
	    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
       
 
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	int z = Integer.parseInt(st.nextToken());
        	
        	
			// 0 0 0 을 입력받으면 종료
        	if(x == 0 && y == 0 && z == 0) break;
            
        	
        	if((x * x + y * y) == z * z) {
				sb.append("right").append('\n');
			}
        	else if(x * x == (y * y + z * z)) {
				sb.append("right").append('\n');
			}
        	else if(y * y == (z * z + x * x)) {
				sb.append("right").append('\n');
			}
        	else {
				sb.append("wrong").append('\n');
			}
        	
		}
		System.out.println(sb);
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		while(true) {
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");
//			
//			int[] array = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
//			Arrays.sort(array);
//			
//			int x = array[0], y = array[1], z = array[2];
//			
//			if(x == 0 && y == 0 && z == 0) break;
//			
//			String res = triangle(x,y,z);
//			
//			sb.append(res).append('\n');
//		}
//		System.out.println(sb);
//		br.close();
//	}
//	
//	public static String triangle(int a, int b, int c) {
//		String answer = "worng";
//		
//		if(c*c == a*a + b*b) answer = "rignt";
//		
//		return answer;
//	}

}
