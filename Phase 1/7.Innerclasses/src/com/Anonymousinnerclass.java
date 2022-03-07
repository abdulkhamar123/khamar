package com;
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class Anonymousinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymousinnerclass i = new Anonymousinnerclass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	}

}
