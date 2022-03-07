package com;

public class Mythread extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}


	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
	  		Mythread mt = new  Mythread();
	  		mt.start();


	}

}
