package SmallestPositive;

public class Solution {
/*  Question:Given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set. 
 *           Expected time complexity is O(n).
 *  Solution: Complexity :O(n)
 *            1. We initialize result as 1 and input array[0...i-1]
 *            2. We traverse array from  0 to i-1, there are two possiblity
 *               a. If result is smaller then array[i]
 *                  , It means that there is a gap between array[i] and result;
 *               b. Otherwise, we should increase result by adding array[i] 
 *               
 * 
 */
	public static void main(String[] args){
		int[] input = {1,3,6,10,11,15};
		System.out.println(findSmallestPositive(input));
	}
	
	public static int findSmallestPositive(int[] input){
		int size = input.length;
		int sum = 1;
		for(int i=0;i<size && input[i] <= sum ;i++){
			sum += input[i];
		}
           return sum;    
			
			
		
		
	}
}
