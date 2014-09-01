package AddTwoNumber;
/*
 *  Question: You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 7 -> 0 -> 8
 *  Solution: To add two numbers that stored in linked list, we are going to traverse
 *            each node in each linked list. We create two pointers. Two pointers point to current node
 *            for each linked list. we add two value in each node. The result of addition will be stored into
 *            a result node. If a carry exists from previous addition, carry will be added into result. 
 *            At the end, result Node will be linked.
 *             
 */
public class AddTwoNumber {
 
	
	public static void main(String[] arg){
         Node one 	= new Node(2);
         Node two 	= new Node(4);
         Node three = new Node(3);
         Node four  = new Node(5);
         Node five  = new Node(6);
         Node six   = new Node(4);
         one.setNext(two);
         two.setNext(three);
         
         four.setNext(five);
         five.setNext(six);
         
         Node head = null;
         head = addTwoNumbers(one,four);
         while(head!=null){
        	 System.out.println(head.getData());
        	 head = head.getNext();
         }
	}
	
    public static Node addTwoNumbers(Node l1, Node l2){
    	
    	Node h1 = l1,h2 = l2,h3= new Node(0);
    	Node reasultHead = h3;
    	int carry =0;
    	while(h1!=null || h2!=null){
    		if(h1!=null){
    			carry+=h1.getData();
    			h1 = h1.getNext();
    		}
    		
    		if(h2!=null){
    			carry += h2.getData();
    			h2 = h2.getNext();
    		}
    		
    		h3.setNext(new Node(carry%10));
    		carry /= 10;
    		h3 = h3.getNext();
    	}
    	
    	if(carry==1){
    		h3.setNext(new Node(1));
    	}
    	return reasultHead.getNext();
   
    }
	
}
