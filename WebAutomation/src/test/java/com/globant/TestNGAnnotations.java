package com.globant;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestNGAnnotations {
    
    @BeforeSuite
    public void launchBrowser(){
        
        System.out.println("open the browser");
        System.out.println("go to https://www.espn.com/?src=com&adblock=true");
        System.out.println("wait to adv to close");
      
    }
    public void createAccount(){
        
        System.out.println("click on user Icon");
        System.out.println("click on log in option");
        System.out.println("click on signup button");
        System.out.println("insert the firstName on the firstnameInput");
        System.out.println("insert the lastName on the lastnameInput");
        System.out.println("insert the emailAdress on the addressInput");
        System.out.println("insert the password on the passwordInput");
        System.out.println("click on signUp button");
    }


    @AfterSuite
    public void closeBrowser(){
        
        System.out.println("Closing browser");
    }
}
