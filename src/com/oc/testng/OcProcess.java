package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

public class OcProcess {

	LoginAction login = null;
	LogoutAction logout = null;
	HomePageAction app = null;
	AppQueryAction appquery = null;
	ManualAuditAction_pos manualaudit_pos=null;
	ManualAllotAction_pos auditallot_pos=null;
	ExpertAllotAction_pos expertallot_pos=null;
	ExpertAuditAction_pos expertaudit_pos=null;
	
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
	
	 @Test(priority=2)
	 public void AuditAllot_pos() throws Exception {
		 app.ManualAudit();//人工审核
		 app.AuditAllotPos();//人工审核分单—pos
		 auditallot_pos=new ManualAllotAction_pos(webdriver);
		 auditallot_pos.AllotApp("小拉", "35441321");
	 }
	 @Test(priority=3)
	 public void ManualAudit_pos() throws Exception {
		 //app.ManualAudit();  //人工审核
		 app.FirstAuditPos();//初步审核-pos
		 manualaudit_pos=new ManualAuditAction_pos(webdriver);
		 manualaudit_pos.ContinueAudit();
		 manualaudit_pos.Audit1("信息和照片均一致", "照片一致");
		 manualaudit_pos.Audit2("社保单位名称与申请表一致","学信网一致","照片一致","照片一致");
		 manualaudit_pos.Audit3();
		 manualaudit_pos.Audit4("信息已验证","信息已验证", "RES05", "信息已验证", "信息已验证", "信息已验证", "公司名和地址均一致");
	 }
	 
	 @Test(priority=4)
	 public void ExpertAllot_pos() throws Exception {
		 app.ExpertAudit();//专家审批
		 app.ExpertAllotPos();//专家审批分单—pos贷
		 expertallot_pos=new ExpertAllotAction_pos(webdriver);
		 expertallot_pos.AllotApp("小拉", "35441321");
	 }
	
	 @Test(priority=5)
	 public void ExpertAudit_pos() throws Exception {
		 //app.ManualAudit();  //专家审批
		 app.ExpertAuditPos();//初步审批-pos
		 expertaudit_pos=new ExpertAuditAction_pos(webdriver);
		 expertaudit_pos.ContinueAudit();
		 expertaudit_pos.Audit1();
		 expertaudit_pos.Audit2();
		 expertaudit_pos.Audit3();
		 expertaudit_pos.Audit4();
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