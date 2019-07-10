package question1;


/**
 * Write a description of class SnakeNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Color;

public class SnakeNode {


	private int x;
	private int y;
	private Color color;
	SnakeNode next;
	
	
	public SnakeNode() {
		
	}
	
	public SnakeNode(int x, int y, Color color) {
		this.setX(x);
		this.setY(y);
		this.color = color;
	}	
	
  	
	public SnakeNode(int x, int y, Color color, SnakeNode next) {
		this.setX(x);
		this.setY(y);
		this.color = color;
		this.next = next;
	}
	
	//get methods
	public int getx() {
        return getX() ;
    	}
	
 	public int gety() {
        return getY() ;
    	}
	public Color getcolor() {
        return color;
    	}
	public SnakeNode getNext() {
        return next;
    	}

	//set methods
	public void setx(int x) {
        this.setX(x);
   	 }
	public void sety(int y) {
        this.setY(y);
   	 }
	public void setcolor(Color color) {
        this.color = color;
   	 }
	public void setNext(SnakeNode next) {
        this.next = next;
   	 }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}