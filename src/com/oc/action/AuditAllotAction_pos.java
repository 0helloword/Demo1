package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.oc.basic.Log;
import com.oc.page.AppQueryPage;
import com.oc.page.AuditAllotPage_pos;

public class AuditAllotAction_pos {
	private WebDriver driver;

	public AuditAllotAction_pos(WebDriver driver) {
		this.driver = driver;
	}

	// ��������
	 public void Button() throws InterruptedException{
		  Log.info("��֤�˹���˷ֵ����水������");
		  Thread.sleep(2000);
		  AuditAllotPage_pos.QueryButton(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.NextPage(driver).click();
		  Thread.sleep(2000);
//		  AppQueryPage.PageInput(driver).sendKeys("2");
//		  AppQueryPage.Go(driver).click();
//		  Thread.sleep(2000);
		  AppQueryPage.LastPage(driver).click();
		  Thread.sleep(3000);
		  AppQueryPage.PreviousPage(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.FirstPage(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.UpButton(driver).click();
		  Thread.sleep(2000);
	  }
	  
	
	public void AllotApp(String username) throws InterruptedException {
		Log.info("�˹���˷ֵ�");
		Thread.sleep(2000);
		new Select(AuditAllotPage_pos.AllotState(driver)).selectByVisibleText("δ����");
		Thread.sleep(2000);
		AuditAllotPage_pos.QueryButton(driver).click();
		Thread.sleep(2000);
		AuditAllotPage_pos.Id(driver).click();
		Thread.sleep(2000);
		AuditAllotPage_pos.Alloter(driver).click();
		Thread.sleep(1000);
		AuditAllotPage_pos.Input(driver).sendKeys(username);
		Thread.sleep(2000);
		AuditAllotPage_pos.Allot(driver).click();
		Thread.sleep(2000);
		AuditAllotPage_pos.Comfirm(driver).click();
		Thread.sleep(2000);
		AuditAllotPage_pos.Comfirm(driver).click();
}
}
