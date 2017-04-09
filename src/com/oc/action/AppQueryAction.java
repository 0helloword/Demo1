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
	  
	    //工单查询
	  public void AppQueryButton() throws InterruptedException{
		  Log.info("验证工单查询界面按键功能");
		  Thread.sleep(2000);
		  AppQueryPage.QueryButton(driver).click();
		  Thread.sleep(2000);
		  AppQueryPage.ResetButton(driver).click();//点击重置按键
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
	    	Log.info("验证工单状态结果筛选");
	    	//Log.info(appstate);
	    	Thread.sleep(2000);
		    new Select(AppQueryPage.AppState(driver)).selectByVisibleText(appstate);//选择工单状态筛选查询
		    Thread.sleep(1000);
		    AppQueryPage.QueryButton(driver).click();
		    //Thread.sleep(2000);
		    //验证筛选结果暂未找到可行的方式
//		   String pagenum=AppQueryPage.PageNumber(driver).getAttribute("value");
////		   Log.info(pagenum);
//		    //LocateTable.LocateTableTest();
////			String statevalue=AppQueryPage.AppStateValue(driver).getText();
////		    Log.info(statevalue);
////		    Assert.assertEquals(appstate,statevalue);//验证查询结果中工单状态为未提交
	    }
	    
	    public void AppDtail(String app) throws InterruptedException{
	    	Log.info("验证工单详情界面");
		    AppQueryPage.App(driver,app).click();
		    Thread.sleep(2000);
		    String verify=AppQueryPage.AppDtail(driver).getText();
		    assert verify.contains("工单详情");// 做断言 assertion
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
	    	Log.info("验证审核信息界面");
		    AppQueryPage.Check(driver).click();
		    Thread.sleep(2000);
		    String verify=AppQueryPage.CheckLog(driver).getText();
		    assert verify.contains("审核记录");// 做断言 assertion
		    Thread.sleep(2000);
		    AppQueryPage.BackButton2(driver).click();
	    }
}
