package com.globant;



import org.testng.annotations.Test;



public class logIn extends TestNGAnnotations
{   
    
     
    @Test
    public void logInTest()
    {
        boolean userLogin= false;
        if (userLogin== false) {
            
            System.out.println("click on user Icon");
            System.out.println("click on log in option");
            System.out.println("insert the username on the usernameInput");
            System.out.println("insert the password on the passwordInput");
            System.out.println("click on log In button"); 
        }else{
            System.out.println("user is already logged");
        }
 
    }


}
