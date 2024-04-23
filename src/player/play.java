package player;

import java.util.Scanner;

   public class play{
	String name;
	String email;
	String mbl;
	public void setdetails(String name,String email,String mbl) {
		this.name=name;
		this.email=email;
		this.mbl=mbl;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		  return  this.name;
	} 
	public void getdetails() {
		System.out.println("name :"+this.name);
		System.out.println("email :"+this.email);
		System.out.println("mbl num :"+this.mbl);
		
	}
	public void getFromUserInputs() {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter details");
            System.out.println("Enter name");
            String name = scn.nextLine();
            System.out.println("Enter email");
            String email = scn.nextLine();
            System.out.println("Enter number");
            String numbr = scn.nextLine();
            this.setdetails(name, email, numbr);
        }
    }
}

