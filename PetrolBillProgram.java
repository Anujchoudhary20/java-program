package javaproject;
	import java.util.*;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

    class PetrolSllip  {
	    public static void main(String[] args) {
	       
	        int i = 1;
	        while (i <= 2) { 
	        	 System.out.println("Vijay laxmi .ill.st indore ujjain road sanwer");
	  	       
	 	        Scanner sc = new Scanner(System.in);
	 	        System.out.println("Enter Rs value: ");
	 	        
	 	        // Get current date and time
	 	        LocalDateTime currentDateTime = LocalDateTime.now();

	 	        // Date and time format
	 	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	 	       
	            float Rs = sc.nextFloat();
	            int billno = 332211 + 1;
	            
	            int Trnid = 89111 + i;
	            System.out.println("Bill no: " + billno + " ORGNL");
	            System.out.println("Trns no: 00000" + Trnid);

	            String formattedDateTime = currentDateTime.format(formatter);
	            System.out.println("Date and Time " + i + ": " + formattedDateTime);
	            
	            System.out.println("Density : 7576kg/m3");
	            System.out.println("Prest   : Rs. " + Rs);
	            System.out.println("Rate    : Rs. 106.47");
	            System.out.println("Volume  : " + Rs / 106.47);
	            System.out.println("Thank you ");
	            System.out.println();
	            
	            // Add 1 hour to the current date and time for the next iteration
	            currentDateTime = currentDateTime.plusHours(1);
	            
	        }
	    }
	}
