package com;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Parameterizedconstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std std1=new Std(2,"balu");
		Std std2=new Std(10,"prashanti");
		std1.display();
		std2.display();


	}

}
