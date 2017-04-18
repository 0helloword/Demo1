package com.sa.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoanInfoPage {
	
	    private static WebElement element;
	    
	    public static WebElement customerName(WebDriver driver){
	        element = driver.findElement(By.id("customerName"));//申请人姓名
	        return element;
	    }
	    
	    public static WebElement cardId(WebDriver driver){
	        element = driver.findElement(By.id("cardId"));//申请人身份证号
	        return element;
	    }

	    public static WebElement mobile(WebDriver driver){
	        element = driver.findElement(By.id("mobile"));//手机号码
	        return element;
	    }
	    
	    public static WebElement repayType(WebDriver driver){
	        element = driver.findElement(By.id("repaymentType"));//还款类型
	        return element;
	    }
	    
	    public static WebElement repayBank(WebDriver driver){
	        element = driver.findElement(By.id("repaymentBank"));//开户银行
	        return element;
	    }
	    
	    public static WebElement repayAcc(WebDriver driver){
	        element = driver.findElement(By.id("repaymentAcc"));//银行账号
	        return element;
	    }
	    
	    public static WebElement province(WebDriver driver){
	        element = driver.findElement(By.id("province"));//开户行省份
	        return element;
	    }
	    
	    public static WebElement city(WebDriver driver){
	        element = driver.findElement(By.id("city"));//开户行城市
	        return element;
	    }
	    
	    public static WebElement bankTel(WebDriver driver){
	        element = driver.findElement(By.id("bankTel"));//开户手机号码
	        return element;
	    }
	    
	    public static WebElement next(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//下一步
	        return element;
	    }
}

