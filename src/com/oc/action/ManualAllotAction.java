package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.oc.basic.*;
import com.oc.page.AppQueryPage;
import com.oc.page.ManualAllotPage;

public class ManualAllotAction {
	private WebDriver driver;

	public ManualAllotAction(WebDriver driver) {
		this.driver = driver;
	}
	
	// 按键测试
	 public void AuditAllotButton() throws InterruptedException{
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
		ManualAllotPage.App(driver).clear();
		ManualAllotPage.App(driver).sendKeys(app);
		Thread.sleep(2000);
		ManualAllotPage.QueryButton(driver).click();
		Thread.sleep(2000);
		ManualAllotPage.Id(driver).click();
		Thread.sleep(2000);
		new Select(ManualAllotPage.Alloter(driver)).selectByVisibleText(username);
		Thread.sleep(2000);
		ManualAllotPage.Allot(driver).click();
		Thread.sleep(2000);
		ManualAllotPage.Comfirm(driver).click();
		Thread.sleep(2000);
		if (DoesWebElementExist.ElementExist(driver)){
			ManualAllotPage.Comfirm(driver).click();//如果有弹窗出现，点击确定
		}
		else
		{
			System.out.println(" ");
		}


}
	

}
