package com.oc.action;


import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.oc.basic.*;
import com.oc.page.AppQueryPage;
import com.oc.page.LoginPage;

public class AppQueryAction {

	  private WebDriver driver;
	  	    
	  public AppQueryAction(WebDriver driver){
		  this.driver = driver;
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	  
	    //������ѯ
	  public void AppQueryButton() throws InterruptedException{
		  Log.info("��֤������ѯ���水������");
		  Thread.sleep(2000);
		  AppQueryPage.QueryButton(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.ResetButton(driver).click();//������ð���
		  Thread.sleep(2000);
		  AppQueryPage.QueryButton(driver).click();
		  Thread.sleep(2000);
		  ComElement.NextPage(driver).click();
		  Thread.sleep(2000);
		  ComElement.PageInput(driver).sendKeys("2");
		  ComElement.Go(driver).click();
		  Thread.sleep(2000);
		  ComElement.LastPage(driver).click();
		  Thread.sleep(3000);
		  ComElement.PreviousPage(driver).click();
		  Thread.sleep(3000);
		  ComElement.FirstPage(driver).click();
		  Thread.sleep(3000);
		  AppQueryPage.UpButton(driver).click();
		  Thread.sleep(2000);
	  }
	  
	    public void AppQueryState(String appstate) throws InterruptedException{
	    	Thread.sleep(2000);
	    	Log.info("��֤����״̬���ɸѡ");
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    new Select(AppQueryPage.AppState(driver)).selectByVisibleText(appstate);//ѡ�񹤵�״̬ɸѡ��ѯ
		    AppQueryPage.QueryButton(driver).click();
		    Table table = new Table(driver);
		    table.TableTest(appstate);
		    Thread.sleep(2000);
	    }
	   
	    public void AppLoanType(String loantype) throws InterruptedException{
	    	Thread.sleep(2000);
	    	Log.info("��֤�����������ͽ��ɸѡ");
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    new Select(AppQueryPage.AppLoanType(driver)).selectByVisibleText(loantype);//ѡ�񹤵�״̬ɸѡ��ѯ
		    AppQueryPage.QueryButton(driver).click();
		    Table table = new Table(driver);
		    table.TableTest(loantype);
		    Thread.sleep(2000);
	    }
	    
	    public void AppDtail(String app) throws InterruptedException{
	    	Thread.sleep(2000);
	    	Log.info("��֤�����������");
	    	AppQueryPage.AppId(driver).sendKeys(app);
	    	Thread.sleep(1000);
	    	AppQueryPage.QueryButton(driver).click();
	    	Thread.sleep(2000);
		    AppQueryPage.App(driver,app).click();
		    Thread.sleep(2000);
		    String verify=AppQueryPage.AppDtail(driver).getText();
		    assert verify.contains("��������");// ������ assertion
		    Thread.sleep(1000);
		    AppQueryPage.OpenButton(driver).click();
		    Thread.sleep(1000);
		    //AppQueryPage.UpButton(driver).click();
		 	//Thread.sleep(2000);
		    AppQueryPage.HetongZiliao(driver).click();
		    Thread.sleep(1000);
		    AppQueryPage.XieshenXinxi(driver).click();
		    Thread.sleep(1000);
		    AppQueryPage.ShangpinXinxi(driver).click();
		    Thread.sleep(1000);
		    AppQueryPage.BackButton1(driver).click();
		    Thread.sleep(2000);
	    }
	    
	    public void CheckInfo() throws InterruptedException{
	    	Thread.sleep(2000);
	    	Log.info("��֤�����Ϣ����");
		    AppQueryPage.Check(driver).click();
		    Thread.sleep(2000);
		    String verify=AppQueryPage.CheckLog(driver).getText();
		    assert verify.contains("��˼�¼");// ������ assertion
		    Thread.sleep(2000);
		    AppQueryPage.BackButton2(driver).click();
	    }
}
