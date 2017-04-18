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
	LoanInfoAction loaninfo=null; 
	UploadAction upload=null;
	BasicInfoAction basicinfo=null;
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
		// 新建贷款申请
		homepage=new HomePageAction(webdriver);
		homepage.AddApp();
		newapply=new NewApplyAction(webdriver);
		newapply.NewApply();
	}
	
	@Parameters({"customername","cardId", "mobile","repayAcc" })
	@Test(priority = 3)
	public void LoanInfo(String customername,String cardId,String mobile,String repayAcc)throws InterruptedException {
		// 贷款信息
		loaninfo=new LoanInfoAction(webdriver);
		loaninfo.loaninfo(customername,cardId, mobile, repayAcc);
	}
	
	@Parameters({"picpath" })
	@Test(priority = 3)
	public void Upload(String picpath)throws InterruptedException {
		// 贷款信息
		upload=new UploadAction(webdriver);
		upload.upload(picpath);
	}
	
	@Parameters({"email","qq","contractphone","uncontractphone","password" })
	@Test(priority = 3)
	public void BasicInfo(String email,String qq,String contractphone,String uncontractphone,String password)throws InterruptedException {
		// 基础信息
		basicinfo=new BasicInfoAction(webdriver);
		basicinfo.basicinfo(email, qq, contractphone, uncontractphone, password);

	}
}



