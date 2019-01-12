import java.util.Scanner;

public class MadLips {
	
	 public static void main(String []args){
	        Scanner input = new Scanner(System.in);               
	        System.out.println("Hello, let me tell you a story,\n"
	        		+ "but first tell me a few things.\n"
	        		+ "A color, an animal, an adjective,\na country"
	        		+ " and your name.");
	        
	   	      
	   	   	        
	    String color;
	     color = input.nextLine();
	    
	    String animal;
	     animal = input.nextLine();
	    
	    String adjective;
	     adjective = input.nextLine();
	    
	    String country;
	     country = input.nextLine();
	    
	    String name;
	     name = input.nextLine();
	    
	   System.out.print("There once was an ogre with colorful \n" 
	   + color + " eyes." + " It had a " + adjective + " "
	   + animal + " \nas its pet. \n");
	   System.out.println("He lived in " +country+ 
			   " up in the \nhidden mountains."
	   		+ " And its name was "+ name + ".");
	 }
}
