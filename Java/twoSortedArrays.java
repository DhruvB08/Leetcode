import java.util.*;

public class twoSortedArrays{
	public static void main(String[] args){
		int[] A = {1, 2, 4, 6, 7, 8, 12, 23, 53};
		int[] B = {4, 8, 10, 12, 15, 16, 32, 43};

		System.out.println(kthSmallest(A, B));
	}

	private static double kthSmallest(int[] A, int[] B){
		if((A.length+B.length)%2 != 0){
			return median(A, B, (A.length+B.length)/2, 0, A.length-1, 0, B.length-1);
		}

		return (median(A, B,(A.length+B.length)/2, 0, A.length-1, 0, B.length-1) + median(A, B, (A.length+B.length)/2 -1, 0, A.length-1, 0, B.length-1))/2;
	}

	private static double median(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd){
		int aLen = aEnd - aStart +1;
		int bLen = bEnd - bStart +1;

		if(aLen == 0){
			return B[bStart + k];
		}

		if(bLen == 0){
			return A[aStart + k];
		}

		if(k==0){
			return A[aStart]<B[bStart] ? A[aStart]:B[bStart];
		}

		int aMid = aLen*k / (aLen+bLen);
		int bMid = k - aMid - 1;

		aMid = aMid + aStart;
		bMid = bMid + bStart;

		if(A[aMid] > B[bMid]){
			k = k - (bMid - bStart + 1);
			aEnd = aMid;
			bStart = bMid + 1;
		}

		if(A[aMid] < B[bMid]){
			k = k - (aMid - aStart + 1);
			bEnd = bMid;
			aStart = aMid + 1;
		}

		return median(A, B, k, aStart, aEnd, bStart, bEnd);
	}
}

/*
time: log(n)
space: O(n)
*/