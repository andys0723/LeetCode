package Candy;


/* 
 *  There are N chid standing in a line. Each child is assigned a rating value.
 *  
 *  you are giving candies to these child subjected to the following
 *  requirements:
 *  
 *  Each child must have at least one candy
 *  Children with a higher rating get more candies than their neighbors
 *  
 *  Solution : A User scans two times.
 *             One scan is from left. The other scan is from right.
 *             Each child is promised to have a candy.
 *             If current rating is greater then previous rating,
 *             candy is given to current child.
 *             if current rating is less then previous rating,
 *             candy is not given to current children.
 *             if current rating is equal to previous,
 *             candy is not given to current children
 */

public class Candy {
   
	public static void main(String[] args){
	   int[]  rating  = {4, 2, 3, 4, 1};
	   System.out.print(giveCandy(rating));
	}
	
	public static int giveCandy(int[] rating){
		int size = rating.length;
        int[] result = new int[size];
        int total = 0;
        if(size==0){
        	return 0;
        }
        
        if(size==1){
        	return 1;
        }
        result[0]=1;
		for(int i=1; i< size;i++){
			result[i]=1;
		   if(rating[i] > rating [i-1]){
			   result[i]++;
		   }
		}
		
		for(int i = size-2 ; i >= 0 ; i-- ){
			if(rating[i] > rating[i+1]){
				result[i]++;
			}
		}
		for(int element:result){
			total = element + total;
		}
		return total;
	}
	

}
