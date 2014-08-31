package ReverseWordInString;
/**
 * 
 * @author tsai_yaochih
 * 
 * Given an input string, reverse the string word by word.
 *
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * Solution: To reverse a string, we split input string into array of strings
 *           by setting " " as delimiter. Once array of string is created, we
 *           traverse array from ending index to begin index. If string in array
 *           is not empty, string is appended into end of result. Once traversal
 *           is done, result is return. 
 *           To make more efficient, we use stringBuilder object instead of directly  
 *           utilizing string object
 */
public class ReverseWordInString {
   
	public static void main(String[] args){
		String input = ""; 
		System.out.println("\"" +ReverseWordInString(input)+"\"");
	}
	
	public static String ReverseWordInString(String s){
		
		String[] container;
		container = s.split("\\s");
		StringBuilder result = new StringBuilder();
		System.out.println(container.length);
		if(s==null || s.length()==0){
			return "";
		}
		for(int i= container.length-1 ; i >=0;i--){
			System.out.println("\""+ container[i]+"\"");			
			if(!container[i].equals("")){
				result.append(container[i]+ " ");
			}
		}
		
		return result.length()==0 ? "" : result.substring(0, result.length()-1);
	 
	}
}
