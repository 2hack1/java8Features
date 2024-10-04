package com.java.updates;


public class switchUpadates7to20 {

	public static void main(String[] args) {
		
		////before the java 8 only integer can accepted
		//int num=12;
		
		/*switch(num) {
		
		case 11: {
			
			System.out.println("its 11 no.");
		  break;
		}
		case 12:{
			 System.out.println("its 12 no..");
		break;
		}
		
		default:{
		     System.out.println("i don't no. what is tha no");
		 break;
		}
		
		}*/
		
		//after the java8 can use the string also
		
	/*	
		String str="monday";
		
				switch(str) {
				case "sunday": {
					
					System.out.println("its sunday  having fun day");
				  break;
				}
				case "monday":{
					 System.out.println("its monday its working day");
				break;
				}
				
				default:{
				     System.out.println("i don't knows");
				 break;
		
                	}
                       }   */
		
		//also use enum type like (content)
	/*	enum ex {Sunday,Monday,Tuesday};
		
		switch(ex.Sunday) {
		case Sunday: {
			
			System.out.println("its sunday  having fun day");
		  break;
		}
		case Monday:{
			 System.out.println("its monday its working day");
		break;
		}
		case Tuesday:{
			System.out.println("its Tuesday its working day");
			break;
		}
		
		default:{
		     System.out.println("i don't knows");
		 break;

        	}
               }
               */
		// something java11 return the value in the  switch
		
		
		
	/*	String str="monday";
		
		String string;
		string= switch(str) {
		case "sunday"->str.toLowerCase();		     
		case "monday"->str.toUpperCase();
		default -> str.substring(1);     
		
               };
	System.out.println(string);
	
      */
		
		// the java17 add obeject in the switch
		
		Object obj="kapkil";
		String str;
	str=switch(obj) {
		case String a->"value is String type";		     
		case Integer b->"value is Integer type";
		default -> "Unknown";   
		
               };
           System.out.println(str);
	}
}

