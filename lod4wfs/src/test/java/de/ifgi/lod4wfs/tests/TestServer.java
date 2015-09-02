package de.ifgi.lod4wfs.tests;

import de.ifgi.lod4wfs.factory.FactoryFDAFeatures;


public class TestServer {

	class BagOfPrimitives {
		  private int value1 = 1;
		  private String value2 = "abc";
		  private transient int value3 = 3;
		  BagOfPrimitives() {
		    // no-args constructor
		  }
		}
	
	public static void main(String[] args) 
	{

		
		System.out.println(FactoryFDAFeatures.isFeatureNameValid("heiß"));

	

		
	}
}
