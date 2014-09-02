package MedianOfTwoSortedArray;
/*
 *  Problem : There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays. 
 *  The overall run time complexity should be O(log (m+n)).
 *  
 *  Solution: My initial solution is to compare every element in both array.
 *            Traversal begins from starting of both arrays.
 *            If element in one array is less then the other array, the smaller element
 *            is put into result array. Then, array of smaller element will advance
 *            one index. Above process keeps running till the median of two sorted array is found.
 *            
 *            Complexity of this solution is O(m+n);
 */
public class Solution {
	
	public Solution(){
		
	}
	
	public static void main(String[] args){
		int[] A = {1,3,5,7,9,11,13};
		int[] B = {6,8,10,12,14,16,18};
		System.out.println(findMedianSortedArrays(A,B));
	}
	
    public static double findMedianSortedArrays(int A[], int B[]) {
       
    	int aSize = A.length;
    	int bSize = B.length;
    	int aIndex = 0;
    	int bIndex = 0;
    	int median = (aSize + bSize)/2;
    	int[] result = new int[median];
    	int resultIndex = 0;
    	//special case
    	if(aSize == 0){
    		return B[median];
    	}
    	
    	if(bSize == 0){
    		return A[median];
    	}
    	while(resultIndex < median){
    		
    		if(aIndex < aSize && bIndex <  aSize){
    			if(A[aIndex] < B[bIndex]){
    				result[resultIndex] = A[aIndex];
    				resultIndex++;
    				aIndex++;
    			}else{
    				result[resultIndex] = B[bIndex];
    				resultIndex++;
    				bIndex++;
    			}
    		}
    		
    		if(aIndex >= aSize){
    			result[resultIndex] = B[bIndex];
    			resultIndex++;
    			bIndex++;
    		}
    		
    		if(bIndex >= bSize){
    			result[resultIndex] =  A[aIndex];
    		    aIndex++;
    		    resultIndex++;
    		}
    	}
    	
    	
    	return result[median-1];    
    }
}
