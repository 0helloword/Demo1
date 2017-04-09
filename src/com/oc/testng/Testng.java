package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

public class Testng{
	
    LoginAction login = null;
    HomePageAction appquery=null;
    LogOutAction logout=null;
    AppQueryAction appinfo=null;
	WebDriver webdriver = new FirefoxDriver();
      
	@BeforeTest
      public void beforeMethod() { 
       	  Log.startTestCase("开始testcase001");
          //初始化类，并打开链接
//  		String ChromeDriver = "D:/Program Files (x86)/Google/Chrome/Application/chrome.exe"; 
//  		System.setProperty("webdriver.chrome.driver", ChromeDriver); 
          login = new LoginAction(webdriver);
          webdriver.get("http://123.57.56.45:7778/OC/initLogin");
          webdriver.manage().window().maximize();
	                }
    
      @Test(priority=1)
      public void LoginA()  {
          //登录
        login.Login("999111", "cyj111");
      }   
      
      @Test(priority=2)
      public void AppQuery() throws InterruptedException {
          //工单查询
      	  appquery=new HomePageAction(webdriver);//左侧菜单栏工单查询
    	  appquery.appquery();
    	  appinfo=new AppQueryAction(webdriver);//右侧工单查询功能
    	  appinfo.AppQueryButton();//工单查询界面按键验证
    	  //appinfo.AppQuery("未提交");//筛选功能验证
    	 appinfo.AppDtail("35441732");//工单详情验证
    	  appinfo.CheckInfo();//工单审核记录验证
      }
//      @Test(priority=3)
//      public void ManualAudit() throws InterruptedException {
//          //工单查询
//      	  appquery=new HomePageAction(webdriver);
//    	  appquery.appquery();
//    	  appquertbutton=new AppQueryAction(webdriver);
//       	  appquertbutton.AppQueryButton();
//       	  appquertbutton.AppQuery("待签章");
//      }
//      @Test(priority=3)
//      public void LogOut(){
//          //退出登录
//		logout=new LogOutAction();
//          Log.endTestCase("退出登录");
//      } 
	
//	 @AfterMethod
//     public void afterMethod(){
//         //关闭浏览器
//         login.ReturnDriver().close();
//     } 
}  