package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

public class Testng {

	LoginAction login = null;
	LogoutAction logout = null;
	HomePageAction app = null;
	AppQueryAction appquery = null;
	ManualAuditAction manualaudit_pos=null;
	ManualAllotAction auditallot_pos=null;
	WebDriver webdriver = new FirefoxDriver();
	
	
	@BeforeTest
	public void beforeMethod() {
		Log.startTestCase("开始testcase001");
		// 初始化类，并打开链接
		login = new LoginAction(webdriver);
		webdriver.get("http://123.57.56.45:7778/OC/initLogin");
		webdriver.manage().window().maximize();
		app=new HomePageAction(webdriver);
	}

	@Test(priority = 1)
	public void LoginA() {
		// 登录
		login.Login("999111", "cyj111");
	}

	@Test(priority = 2)
	public void AppQuery() throws InterruptedException {
		// 工单查询
		app.AppQuery();// 左侧菜单栏工单查询
		appquery = new AppQueryAction(webdriver);// 右侧工单查询功能
		appquery.AppQueryButton();// 工单查询界面按键验证
		// appinfo.AppQuery("未提交");//筛选功能验证?
		appquery.AppDtail("35441771");// 工单详情验证
		appquery.CheckInfo();// 工单审核记录验证
	}
	
	 @Test(priority=3)
	 public void ManualAudit_pos() throws Exception {
		 //人工初步审核
		 app.ManualAudit();  //人工审核
		 app.ManualAuditPos();//初步审核
		 manualaudit_pos=new ManualAuditAction(webdriver);
		 manualaudit_pos.Getapp();
		 manualaudit_pos.Audit1("信息和照片均一致", "照片一致");
		 manualaudit_pos.Audit2("社保单位名称与申请表一致","学信网一致","照片一致","照片一致");
		 manualaudit_pos.Audit3();
		 //manualaudit.Audit4info();  //因滚动栏原因不好定位？
		 //manualaudit.Audit4phoneself("单位电话", "18956254412", "生效", "test");
		// manualaudit.Audit4phoneother("当康", "亲属", "16589784452", "失效", "test");
		 manualaudit_pos.Audit4("信息已验证","信息已验证", "RES01", "信息已验证", "信息已验证", "信息已验证", "公司名和地址均一致");
	 }
	 
	 @Test(priority=4)
	 public void AuditAllot_pos() throws Exception {
		 app.ManualAudit();//人工审核
		 app.ManualAllotPos();//人工审核分单——pos贷
		 auditallot_pos=new ManualAllotAction(webdriver);
		 auditallot_pos.Button();
		 auditallot_pos.AllotApp("小拉","35441143");
		 
	 }
	
	// @Test(priority=3)
	// public void LogOut(){
	// //退出登录
	// logout=new LogOutAction();
	// Log.endTestCase("退出登录");
	// }

	// @AfterMethod
	// public void afterMethod(){
	// //关闭浏览器
	// login.ReturnDriver().close();
	// }
}