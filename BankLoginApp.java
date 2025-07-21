import java.util.HashMap;
import java.util.Scanner;
   
     public class BankLoginApp{
		 private HashMap<String,String>users= new HashMap<>();
		 private Scanner sc= new Scanner(System.in);
		 
		 // pre- populate users
		  public BankLoginApp(){
			  users.put("Doli","Doli123");
			   users.put("Mbali","mba345");
			    users.put("Sindi","Sindi789");
		  }
		  //promt for login detais 
		  private void loginUser(){
			  System.out.println("Enter username");
			  String username= sc.nextLine();
			  System.out.println("Enter password");
			  String password= sc.nextLine();
			  
			  if(user.containsKey(username)&&users.get(username).equals(password)){
				  System.out.printIn("Login successful.Welcome"+username+);
				 
			  }else{
				  System.out.println("Login failed.Incorrect username or password");
			  }
		  }
		  public static void main(String[]args){
			  BankLoginApp app= new BankLoginApp();
			  System.out.println("----Bank Login----");
			  app.loginUser();
		  }
	 }