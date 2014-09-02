package MedianOfTwoSortedArray;
/*
 * 
 * There are two sorted arrays A and B of size m and n respectively. 
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * Description: The idea of algorithm is shown below.
 *    1. Calculate median of A array and B array.
 *    2. If median of A Array is equal of median of B Array, the result is returned.
 *    3. If median of A Array is less then median of B Array, the median of both array will
 *       be in below either size of sub array.
 *       A[median] to A[end] or B[start] to B[median]
 *    
 *    4. If median of A Array is greater then median of B Array, the median of both array
 *       will be in below either size of size array.
 *       B[median] to B[end] or A[start] to A[median] 
 *       
 *    5. Repeat step 2 to step 5 till k=0
 *       
 * 
 * Node: To calculate aMid, below method is suggested.
 *         aMid = aLen * k /(aLen + bLen)
 * 
 *        the reason to calculate is based on below
 *        aMid = aLen/2
 *        k = (aLen + bLen)/2
 *   
 */
public class SolutionBetter {
	public static void main(String[] args){
		int[] A = {1,3,5,7,9,11,13};
		int[] B = {6,8,10,12,14,16,18};
		System.out.println(findMedianSortedArrays(A,B));
	}
	
    public static double findMedianSortedArrays(int A[], int B[]) {
    	
    	int aSize = A.length;
    	int bSize = B.length;
    	if((aSize +bSize)%2 != 0){
    		// median is odd
    		return findKth(A,B, (aSize + bSize)/2 , 0, aSize - 1, 0, bSize-1);
    	}else{
    		return (findKth(A,B, (aSize + bSize)/2 , 0, aSize - 1, 0, bSize-1)
    				+ findKth(A,B, (aSize + bSize)/2 -1, 0, aSize - 1, 0, bSize-1))/2;    		
    	}
    }
    
    public static int findKth(int[] aArray, int[] bArray, int k, 
    		int aStart, int aEnd, int bStart, int bEnd){
    	
    	int aSize = aEnd - aStart + 1;
    	int bSize = bEnd - bStart + 1;
    	
    	if(aSize==0){
    		return bArray[bStart + k];
    	}
    	
    	if(bSize==0){
    		return aArray[aStart + k];
    	}
    	
    	if(k==0){
    		return aArray[aStart] < bArray[bStart]? aArray[aStart]: bArray[bStart];
    	}
    	
    	
    	int aMid =  k/(aSize + bSize) * aSize;
    	int bMid = k - aMid -1;
    	
    	if(aArray[aMid] > bArray[bMid]){
    	   k = k - (bMid-bStart + 1);
    	   aEnd = aMid;
    	   bStart = bMid + 1;
    	   
    	}else{
    		k = k -(aMid - aStart + 1);
    		bEnd = bMid;
    		aStart = aMid +1;
    	}
    	
    	return findKth(aArray,bArray,k,aStart,aEnd,bStart,bEnd);
    }
}
