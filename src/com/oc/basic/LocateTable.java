package com.oc.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocateTable {
	 private static WebDriver driver;
	    
	  public LocateTable(WebDriver driver){
		  LocateTable.driver = driver;
	    }
	
	
	  public static void LocateTableTest() {  
	      WebElement table =driver.findElement(By.id("table"));  
	      List<WebElement> rows = table.findElements(By.tagName("tr"));  
// 	      assertEquals(5,rows.size());  
	      for(WebElement row:rows){  
	          List<WebElement> cols= row.findElements(By.tagName("td"));  
	          for(WebElement col:cols){  
	              System.out.println(col.getText()+"\t");               
	          }  
	          System.out.println("");  
	      }  
	  }  
	}  

