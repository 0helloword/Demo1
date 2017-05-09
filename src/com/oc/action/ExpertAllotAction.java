package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.oc.basic.ComElement;
import com.oc.basic.Log;
import com.oc.page.AppQueryPage;
import com.oc.page.ManualAllotPage;
import com.oc.page.ExpertAllotPage;

public class ExpertAllotAction {
	private WebDriver driver;

	public ExpertAllotAction(WebDriver driver) {
		this.driver = driver;
	}

	// 按键测试
	 public void Button() throws InterruptedException{
		  Thread.sleep(2000);
		  ManualAllotPage.QueryButton(driver).click();
		  Thread.sleep(2000);
		  ComElement.NextPage(driver).click();
		  Thread.sleep(2000);
//		  AppQueryPage.PageInput(driver).sendKeys("2");
//		  AppQueryPage.Go(driver).click();
//		  Thread.sleep(2000);
		  ComElement.LastPage(driver).click();
		  Thread.sleep(3000);
		  ComElement.PreviousPage(driver).click();
		  Thread.sleep(2000);
		  ComElement.FirstPage(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.UpButton(driver).click();
		  Thread.sleep(2000);
	  }
	  
	
	public void AllotApp(String username,String app) throws InterruptedException {
		Thread.sleep(2000);
		//new Select(AuditAllotPage_pos.AllotState(driver)).selectByVisibleText("未分配");
		ExpertAllotPage.App(driver).sendKeys(app);
		Thread.sleep(2000);
		ExpertAllotPage.QueryButton(driver).click();
		Thread.sleep(2000);
		ExpertAllotPage.Id(driver).click();
		Thread.sleep(2000);
		new Select(ExpertAllotPage.Alloter(driver)).selectByVisibleText(username);
		Thread.sleep(2000);
		ExpertAllotPage.Allot(driver).click();
		Thread.sleep(2000);
		ExpertAllotPage.Comfirm(driver).click();

}

}
