package com.test.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Uistore.LoginUiStore;
import com.test.Utilities.PropertyFile;


public class TestResume extends LoginUiStore{
	
    public static void main(String[] args) {
    	PropertyFile rc=new PropertyFile();
    	
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/gnanamuthup/Desktop/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.naukri.com/nlogin/login");
            driver.manage().window().maximize();
            Thread.sleep(5000);
            
        } catch(Exception e)
		{
			System.out.println("cannot able to Hit the URL");
			
		}
        try
		{
        	Thread.sleep(5000);
			WebElement EnterLogin=driver.findElement(Username);
			EnterLogin.sendKeys("gnanamuthugmg@gmail.com");
			Thread.sleep(2000L);
			WebElement EnterPassword=driver.findElement(Password);
			EnterPassword.sendKeys("muthuGMAHA@0810");
			WebElement ClickLogin=driver.findElement(Login);
			ClickLogin.click();
			Thread.sleep(10000);
			WebElement ClickViewProfile=driver.findElement(ViewProfile);
			//ClickViewProfile.wait();
			ClickViewProfile.click();
			Thread.sleep(5000);
			//WebElement ClickUpdateResume=driver.findElement(UpdateResume);
			//ClickUpdateResume.click();
			
			WebElement fileInput = driver.findElement(Fileupload);
			String filePath = "/Users/gnanamuthup/Documents/GNANAMUTHUPRESUME1.pdf";
			String filePath2 = "/Users/gnanamuthup/Documents/GNANAMUTHUENGINEER.pdf";
			 fileInput.sendKeys(filePath);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to LoginData");
			
		}
    }
}