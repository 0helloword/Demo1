//系统主页面的菜单对象
package com.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    
    private static WebElement element;
	
	
     public static WebElement AddApp(WebDriver driver){
        element = driver.findElement(By.linkText("新增工单"));//新增工单
        return element;
    }
    
  
    
   
  
  
}  
