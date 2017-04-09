package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    
    private static WebElement element;
    
    public static WebElement userName(WebDriver driver){
        element = driver.findElement(By.id("username"));
        return element;
    }
    
    public static WebElement passWord(WebDriver driver){
        element = driver.findElement(By.id("password"));
        return element;
    }
    public static WebElement loginButton(WebDriver driver){
        element = driver.findElement(By.id("loginButton"));
        return element;
    }
        
}  
