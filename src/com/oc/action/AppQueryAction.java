package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.oc.basic.*;
import com.oc.page.AppQueryPage;

public class AppQueryAction {

	  private WebDriver driver;
	  	    
	  public AppQueryAction(WebDriver driver){
		  this.driver = driver;
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
		  AppQueryPage.NextPage(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.PageInput(driver).sendKeys("2");
		  AppQueryPage.Go(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.LastPage(driver).click();
		  Thread.sleep(3000);
		  AppQueryPage.PreviousPage(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.FirstPage(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.UpButton(driver).click();
		  Thread.sleep(2000);
	  }
	  
	    public void AppQuery(String appstate) throws InterruptedException{
	    	Log.info("��֤����״̬���ɸѡ");
	    	//Log.info(appstate);
	    	Thread.sleep(2000);
		    new Select(AppQueryPage.AppState(driver)).selectByVisibleText(appstate);//ѡ�񹤵�״̬ɸѡ��ѯ
		    Thread.sleep(1000);
		    AppQueryPage.QueryButton(driver).click();
		    //Thread.sleep(2000);
		    //��֤ɸѡ�����δ�ҵ����еķ�ʽ
//		   String pagenum=AppQueryPage.PageNumber(driver).getAttribute("value");
////		   Log.info(pagenum);
//		    //LocateTable.LocateTableTest();
////			String statevalue=AppQueryPage.AppStateValue(driver).getText();
////		    Log.info(statevalue);
////		    Assert.assertEquals(appstate,statevalue);//��֤��ѯ����й���״̬Ϊδ�ύ
	    }
	    
	    public void AppDtail(String app) throws InterruptedException{
	    	Log.info("��֤�����������");
		    AppQueryPage.App(driver,app).click();
		    Thread.sleep(2000);
		    String verify=AppQueryPage.AppDtail(driver).getText();
		    assert verify.contains("��������");// ������ assertion
		    Thread.sleep(2000);
		    AppQueryPage.OpenButton(driver).click();
		    Thread.sleep(2000);
		    //AppQueryPage.UpButton(driver).click();
		 	//Thread.sleep(2000);
		    AppQueryPage.HetongZiliao(driver).click();
		    Thread.sleep(2000);
		    AppQueryPage.XieshenXinxi(driver).click();
		    Thread.sleep(2000);
		    AppQueryPage.ShangpinXinxi(driver).click();
		    Thread.sleep(2000);
		    AppQueryPage.BackButton1(driver).click();
		    Thread.sleep(2000);
	    }
	    
	    public void CheckInfo() throws InterruptedException{
	    	Log.info("��֤�����Ϣ����");
		    AppQueryPage.Check(driver).click();
		    Thread.sleep(2000);
		    String verify=AppQueryPage.CheckLog(driver).getText();
		    assert verify.contains("��˼�¼");// ������ assertion
		    Thread.sleep(2000);
		    AppQueryPage.BackButton2(driver).click();
	    }
}
