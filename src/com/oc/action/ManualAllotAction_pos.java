package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.oc.basic.ComElement;
import com.oc.basic.Log;
import com.oc.page.AppQueryPage;
import com.oc.page.ManualAllotPage_pos;

public class ManualAllotAction_pos {
	private WebDriver driver;

	public ManualAllotAction_pos(WebDriver driver) {
		this.driver = driver;
	}

	// 按键测试
	 public void Button() throws InterruptedException{
		  Log.info("验证人工审核分单界面按键功能");
		  Thread.sleep(2000);
		  ManualAllotPage_pos.QueryButton(driver).click();
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
		Log.info("人工审核分单");
		Thread.sleep(2000);
		//new Select(AuditAllotPage_pos.AllotState(driver)).selectByVisibleText("未分配");
		ManualAllotPage_pos.App(driver).sendKeys(app);
		Thread.sleep(2000);
		ManualAllotPage_pos.QueryButton(driver).click();
		Thread.sleep(2000);
		ManualAllotPage_pos.Id(driver).click();
		Thread.sleep(2000);
		new Select(ManualAllotPage_pos.Alloter(driver)).selectByVisibleText(username);
		Thread.sleep(2000);
		ManualAllotPage_pos.Allot(driver).click();
		Thread.sleep(2000);
		ManualAllotPage_pos.Comfirm(driver).click();

}

}
