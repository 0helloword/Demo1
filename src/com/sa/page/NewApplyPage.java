package com.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewApplyPage {

	  
    private static WebElement element;
    
    public static WebElement storeId(WebDriver driver){
        element = driver.findElement(By.id("storeId"));//门店选择
        return element;
    }
 	    
    public static WebElement careerType(WebDriver driver){
        element = driver.findElement(By.id("careerType"));//职业选择
        return element;
    }
    
    public static WebElement productSeries(WebDriver driver){
        element = driver.findElement(By.id("productSeriesId"));//系列选择
        return element;
    }
    
    public static WebElement productType(WebDriver driver){
        element = driver.findElement(By.name("goodsReqs[0].cargoType"));//货物类别
        return element;
    }
    
    public static WebElement commodityType(WebDriver driver){
        element = driver.findElement(By.id("commodityClass_0"));//商品类型
        return element;
    }
    
    public static WebElement commodityBrand(WebDriver driver){
        //element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/form/div[3]/table/tbody/tr/td[3]/div/select"));//商品品牌
    	element = driver.findElement(By.id("commodityName_0"));
        return element;
    }
    
    public static WebElement commodityModel(WebDriver driver){
        element = driver.findElement(By.id("commodityType_0"));//商品型号
        return element;
    }
    
    public static WebElement commodityPrice(WebDriver driver){
        element = driver.findElement(By.name("goodsReqs[0].commodityPrice"));//商品价格
        return element;
    }
    
    public static WebElement commodityAmount(WebDriver driver){
        element = driver.findElement(By.id("amount"));//商品总价格
        return element;
    }
    
    public static WebElement downPaymentAmount(WebDriver driver){
        element = driver.findElement(By.id("downPaymentAmount"));//自付金额
        return element;
    }
    
    public static WebElement loanMoney(WebDriver driver){
        element = driver.findElement(By.id("loanMoney"));//商品余额
        return element;
    }
    
    public static WebElement calculation(WebDriver driver){
        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//计算按键
        return element;
    }
    
    public static WebElement productId(WebDriver driver){
        element = driver.findElement(By.name("productId"));//产品名称
        return element;
    }
    
    public static WebElement submitBtn(WebDriver driver){
        element = driver.findElement(By.id("submitBtn"));//提交
        return element;
    }
    
    public static WebElement ensure(WebDriver driver){
        element = driver.findElement(By.id("ensure_sn"));//提交确认
        return element;
    }
}
