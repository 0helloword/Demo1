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
       	  Log.startTestCase("��ʼtestcase001");
          //��ʼ���࣬��������
//  		String ChromeDriver = "D:/Program Files (x86)/Google/Chrome/Application/chrome.exe"; 
//  		System.setProperty("webdriver.chrome.driver", ChromeDriver); 
          login = new LoginAction(webdriver);
          webdriver.get("http://123.57.56.45:7778/OC/initLogin");
          webdriver.manage().window().maximize();
	                }
    
      @Test(priority=1)
      public void LoginA()  {
          //��¼
        login.Login("999111", "cyj111");
      }   
      
      @Test(priority=2)
      public void AppQuery() throws InterruptedException {
          //������ѯ
      	  appquery=new HomePageAction(webdriver);//���˵���������ѯ
    	  appquery.appquery();
    	  appinfo=new AppQueryAction(webdriver);//�Ҳ๤����ѯ����
    	  appinfo.AppQueryButton();//������ѯ���水����֤
    	  //appinfo.AppQuery("δ�ύ");//ɸѡ������֤
    	 appinfo.AppDtail("35441732");//����������֤
    	  appinfo.CheckInfo();//������˼�¼��֤
      }
//      @Test(priority=3)
//      public void ManualAudit() throws InterruptedException {
//          //������ѯ
//      	  appquery=new HomePageAction(webdriver);
//    	  appquery.appquery();
//    	  appquertbutton=new AppQueryAction(webdriver);
//       	  appquertbutton.AppQueryButton();
//       	  appquertbutton.AppQuery("��ǩ��");
//      }
//      @Test(priority=3)
//      public void LogOut(){
//          //�˳���¼
//		logout=new LogOutAction();
//          Log.endTestCase("�˳���¼");
//      } 
	
//	 @AfterMethod
//     public void afterMethod(){
//         //�ر������
//         login.ReturnDriver().close();
//     } 
}  