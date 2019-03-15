package miscellaneous;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(1);
		reverseLinkedList(list);
		
		}

	public static void reverseLinkedList(LinkedList<Integer> li) {
		
		for(int i=li.size()-1;i>=0;i--) {
			System.out.print(li.get(i)+" ");
		}
		
	}
	
	}

