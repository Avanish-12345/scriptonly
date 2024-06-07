package Demo;

public class s
{
	
	    public static void main(String[] args) {
	        String amountWithSpaces = "Rs.   799.00";

	        // Split the string by non-digit characters
	        String[] parts = amountWithSpaces.split("\\D+");

	        // Take the numerical part as the integer representation
	        int amountWithoutDecimal = Integer.parseInt(parts[1]);

	        System.out.println("Original amount: " + amountWithSpaces);
	        System.out.println("Amount without decimal: " + amountWithoutDecimal);
	       
}
}