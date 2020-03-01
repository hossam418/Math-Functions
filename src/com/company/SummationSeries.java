package com.company;


public class SummationSeries implements ISubscriber
{
	 public  void notifySubscriber(String input){
    	 
	    	/*int spaceCount = 1 , i=0 , sum = 0;
	     	String	temp = null;
			String[] tag = input.split(" "); //after each space

			for(int z=0 ; z<input.length();z++){ //only for count number of series element
				if(input.charAt(z)==' '){
					spaceCount++;
			    	}
		    	}
			while(spaceCount!=0){  //this while for sum every element in string 
		        	temp = tag[i];
		        	int intTemp  = Integer.parseInt(temp);
		        	sum += intTemp;
		        	++i; spaceCount--;
		        	}
			System.out.println("series summation = " + sum );*/

	    	int n = Integer.parseInt(input);
	    	long sum = (n*(n+1))/2;
		 	System.out.println("series summation = " + sum );
			
		}

	}
