package com.oc.basic;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoesWebElementExist {
	
	public static boolean ElementExist(WebDriver driver) { 
	 try 
	         { 
	                 driver.findElement(By.xpath("(//button[@type='button'])[10]")); 
	               
	                 return true; 
	          } 
	          catch (NoSuchElementException e) 
	         { 
	                 return false; 
	         } 
}
}
