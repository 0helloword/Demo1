package com.sa.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sa.page.UploadPage;

public class UploadAction {
	private WebDriver driver;

	public UploadAction(WebDriver driver) {
		this.driver = driver;
	}

	public void upload (String picpath) throws InterruptedException{
		Thread.sleep(2000);
		String appid=UploadPage.appid(driver).getText();
		System.out.print("\n\n\n该订单编号为:"+appid+"\n\n");
		UploadPage.uploadbutton(driver).getAttribute("id");
		Thread.sleep(2000);
	    String s1=UploadPage.uploadbutton(driver).getAttribute("id");
	    String ss1=s1.substring(0,16);//获取file_0_35440869_
	    Thread.sleep(2000);
	    int ss2=Integer.parseInt(s1.substring(16, 23));//获取1000001
	    int ss4=Integer.parseInt(s1.substring(24,s1.length()));//获取72
	    String s2=ss1+Integer.toString(ss2+1)+"_"+Integer.toString(ss4+1);//第二个上传按键id file_0_35440869_1000002_73
	    String s3=ss1+Integer.toString(ss2+2)+"_"+Integer.toString(ss4+2);//第三个上传按键id file_0_35440869_1000003_74
	    String s4=ss1+Integer.toString(ss2+3)+"_"+Integer.toString(ss4+3);//第四个上传按键id file_0_35440869_1000004_75
	    driver.findElement(By.id(s1)).sendKeys(picpath); //修改图片路径
	    Thread.sleep(3000);
	    driver.findElement(By.id(s2)).sendKeys(picpath); 
	    Thread.sleep(3000);
	    driver.findElement(By.id(s3)).sendKeys(picpath); 
	    Thread.sleep(3000);
	    driver.findElement(By.id(s4)).sendKeys(picpath); 
	    Thread.sleep(3000);
	    UploadPage.next(driver).click();
	}
	
//	public String getappid(){
//		String appid=UploadPage.appid(driver).getText();
//		return appid;
//	}
}
