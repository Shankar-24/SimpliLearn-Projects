package Validator;

import java.util.*;

public class EmailValidator {

	public static void main(String[] args) {
		
		boolean b=false;
		String[] Email={"logesh@gmail.com","sujith123@yahoo.com","aakash.43@yahoo.com","syed24hyder@gmail.com","manigandan@hotmail.com","stebin@protonmail.com"};
        System.out.println("Enter your Email ID");
        Scanner sc=new Scanner(System.in);
        String Mail=sc.nextLine();
        for(int i=0;i<Email.length;i++)
        {
        	if(Mail.equalsIgnoreCase(Email[i]))
        	{
        		b=true;
        	}
        }
        if(b==true)
        {
        	System.out.println("Entered Email ID is present");
        }
        else
        {
        	System.out.println("Entered Email ID is not present");
        }
        sc.close();
	}

}