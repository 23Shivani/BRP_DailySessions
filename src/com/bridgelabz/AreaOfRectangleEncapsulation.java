package com.bridgelabz;

public class AreaOfRectangleEncapsulation {
	    //private members of class
	    private int length;
	    private int breadth;
	    //public method to set the length and breadth of rectangle
	    public void setLength(int length){
	        this.length = length;
	    }
	    public void setBreadth(int width){
	        this.breadth = width;
	    }
	    //public method to get the length and breadth of rectangle
	    public int getLength(){
	        return this.length;
	    }
	    public int getBreadth(){
	        return this.breadth;
	    }
	 public static void main(String[] args) {
		 AreaOfRectangleEncapsulation AreaofRec = new AreaOfRectangleEncapsulation();
		 AreaofRec.setLength(6);
	     AreaofRec.setBreadth(8);
	        System.out.println("The area of rectangle is" + " " + AreaofRec.getLength() * AreaofRec.getBreadth());
	 }
}