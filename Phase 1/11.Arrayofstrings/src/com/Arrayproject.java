package com;
import java.util.ArrayList;
import java.util.Iterator;

public class Arrayproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <String> list = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      list.add("JavaFX");
	      list.add("Java");
	      list.add("WebGL");
	      list.add("OpenCV");
	      list.add("OpenNLP");
	      list.add("JOGL");
	      list.add("Hadoop");
	      list.add("Haase");
	      list.add("Java Script");
	      list.add("Flume");
	      list.add("Mahout");
	      list.add("Hapala");
	      System.out.println("Contents of the array list: ");
	      for (String element : list){
	         if (element.contains("Ha")){
	               System.out.println(element);
	         }
	      }

	}

}
