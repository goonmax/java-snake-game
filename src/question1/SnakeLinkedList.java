package question1;

import java.awt.Color;

	 public class SnakeLinkedList {
	 		SnakeNode head;
	 		
	 		public SnakeLinkedList() {
	 			head = null; 
	 		}
	 		
	 		public void addHead(int x, int y, Color color) {
	 			head = new SnakeNode(x, y, color);
	 		}
	 		
	 		public void addJoint(int x, int y, Color color) {
	 			SnakeNode newJoint = new SnakeNode(x, y, color); 
	 			newJoint.setNext(head.getNext());
	 			head.setNext(newJoint);
	 		}

	 		// Implement getHead, getJoint, and snakeMove here
	 		
	 		public SnakeNode getHead() {
	 		   // Add your code to get head
	 			return head;
	 		}

	 		public SnakeNode getJoint(int i) {

	 			SnakeNode curr = head;
	 			for(int j = 0; j < i; j++) {
	 				curr = curr.getNext();
	 			}
				return curr;
	 		}

	 		public void snakeMove(int dots, boolean left, boolean right, boolean up, boolean down, final int SIZE) {

	 			for(int z = dots-1; z > 0; z--) {
	 				
	 			SnakeNode jointz = getJoint(z);
		 		SnakeNode jointz_1 = getJoint(z-1);	
		 		jointz.setX(jointz_1.getX());
	 			jointz.setY(jointz_1.getY()); 
	 			}
	 			
	 			if (left) {
	 				head.setX(head.getX() - SIZE);
	 			}
	 			
	 			if(right) {
	 				head.setX(head.getX() + SIZE);
	 			}
	 		
	 			
	 			if(up) {
	 				head.setY(head.getY() - SIZE);
	 			}
		 		
	 			
	 			if(down) {
	 				head.setY(head.getY() + SIZE);
		 		}
	 	}
	 }
