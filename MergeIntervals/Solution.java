package MergeIntervals;
/*
 *  Problem: Given a collection of intervals, merge all overlapping intervals.
 *
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *  
 *  Solution: To merge interval, user has to find out intersection of two intervals.
 *            Intersection happens if ending position of one interval is greater then 
 *            starting position of the other position. In addition, 
 *            to easy merge interval, list of interval needs to be ordered 
 *            by interval's starting position.
 *  
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
  
   public Solution(){
	   
   }
   public static void main(String[] args){
	   List<Interval> intervals = new ArrayList<Interval>();
	   Interval one = new Interval(1,4);
	   Interval two = new Interval(2,4);
	   Interval three = new Interval(8,10);
	   Interval four = new Interval(15,18);
	   intervals.add(one);
	   intervals.add(two);
	   intervals.add(three);
	   intervals.add(four);
	   Collections.sort(intervals, new IntervalComparater());
	   List<Interval> result= null;
	   result = merge(intervals);
	   for(Interval element:intervals){
		   System.out.println(element.start +" " + element.end);
	   }
   }
   
   public static List<Interval> merge(List<Interval> intervals) {
       
     Collections.sort(intervals, new Comparator<Interval>(){

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}
    	 
     });
	   
	   
	   List<Interval> result = new ArrayList<Interval>();
	   int i=0;
	   while(i< intervals.size()-1){
		   if(intervals.get(i).end >= intervals.get(i+1).start){
			   intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
			   intervals.remove(i+1);
		       
		   }else{
			 i++;
		   }	   
	   };
	   return intervals;
   }
   

}

class IntervalComparater implements Comparator<Interval>{

	@Override
	public int compare(Interval arg0, Interval arg1) {
    
		return arg0.start - arg1.start;
	}
	
}
