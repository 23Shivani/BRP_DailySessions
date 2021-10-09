package com.bridgelabz;

	class GrandFather {
		  GrandFather() {
		    System.out.println("I am the grandfather!");
		  }
		}
	class Father extends GrandFather {
		  String familyName;
		  String houseaddress;
		  Father() {
		    System.out.println("I am the father! I inherit from Grandfather");
		  }
		}
	public class MultiLevelInheritance extends Father {
		  MultiLevelInheritance() {
		    System.out.println("I am the son and I inherit from my father.");
		  }
		  public static void main(String[] args) {
		    MultiLevelInheritance s1 = new MultiLevelInheritance();
		  }
		}
