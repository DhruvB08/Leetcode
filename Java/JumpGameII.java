
public class JumpGameII {
	public static void main(String[] args){
		
	}
	
	public int jump(int[] A){
		int sc = 0;			//step count
		int prevMax = 0;	//last jump max
		int max = 0;		//current max
		
		for(int i=0; i<A.length-1; i++){
			max = Math.max(max, i+A[i]);
			if(i==prevMax){
				sc++;
				prevMax = max;
			}
		}
		
		return sc;
	}
}
