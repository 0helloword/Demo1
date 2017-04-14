package com.sa.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.oc.action.LoginAction;
import com.oc.basic.Log;
import com.sa.action.*;


public class Sa {
	LoginAction login = null;
	HomePageAction homepage=null;
	NewApplyAction newapply=null;
	WebDriver webdriver = new FirefoxDriver();
	
	@Parameters({"url_sa"})
	@BeforeTest
	public void beforeMethod(String url_sa) {
		Log.startTestCase("开始testcase001");
		// 初始化类，并打开链接
		login = new LoginAction(webdriver);
		//webdriver.get("http://123.57.56.45:10080/cnsa/initLogin");
		webdriver.get(url_sa);
		webdriver.manage().window().maximize();
	}
	
	@Parameters({"username", "password" })
	@Test(priority = 1)
	public void Login(String username,String password) {
		// 登录
		login.Login(username, password);
	}
	
	@Test(priority = 2)
	public void NewApply()throws InterruptedException {
		// 登录
		homepage=new HomePageAction(webdriver);
		homepage.AddApp();
		newapply=new NewApplyAction(webdriver);
		newapply.NewApply();
	}
}



