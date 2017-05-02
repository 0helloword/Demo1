package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

import listeners.*;

//@Listeners({ myListener.class })
public class OcProcess {

	LoginAction login = null;
	LogoutAction logout = null;
	HomePageAction app = null;
	AppQueryAction appquery = null;
	ManualAuditAction manualaudit=null;
	ManualAllotAction auditallot=null;
	ExpertAllotAction expertallot=null;
	ExpertAuditAction expertaudit=null;
	String appid_pos=null;
	
	WebDriver webdriver = new FirefoxDriver();
	

	@Parameters({"url_oc"})
	@BeforeTest
	public void beforeTest(String url_oc) {
		Log.startTestCase("开始testcase001");
		// 初始化类，并打开链接
		login = new LoginAction(webdriver);
		webdriver.get(url_oc);
		webdriver.manage().window().maximize();
		app=new HomePageAction(webdriver);
	}
	
	@Parameters({"username", "password" })
	@Test(priority = 0)  
	public void Login(String username,String password) {
		// 登录
		login.Login(username, password);
	}
	
	@Parameters({"loginname","appid_pos" })
	 @Test(priority = 1)  
	 public void ManualAllot_pos(String loginname,String appid_pos) throws Exception {
		 Log.info("人工审核分单-pos");
		 app.ManualAudit();//人工审核
		 app.ManualAllotPos();//人工审核分单—pos
		 auditallot=new ManualAllotAction(webdriver);
		 auditallot.AllotApp(loginname, appid_pos);
		 	 }
	
	 @Test(priority = 2)  
	 public void ManualAudit_pos() throws Exception {
		 Log.info("人工审核-继续审核-pos");
		 //app.ManualAudit();  //人工审核
		 app.ManualAuditPos();//初步审核-pos
		 manualaudit=new ManualAuditAction(webdriver);
		 manualaudit.ContinueAudit();
		 manualaudit.Audit1("信息和照片均一致", "照片一致");
		 manualaudit.Audit2("社保单位名称与申请表一致","学信网一致","照片一致","照片一致");
		 manualaudit.Audit3();
		 manualaudit.Audit4("信息已验证","信息已验证", "RES05", "信息已验证", "信息已验证", "信息已验证", "公司名和地址均一致");
	 }
	 
	 @Test(priority = 2)  
	 public void ManualAuditReturn_pos() throws Exception {
		 Log.info("人工审核-退回-pos");
		 //app.ManualAudit();  //人工审核
		 app.ManualAuditPos();//初步审核-pos
		 manualaudit=new ManualAuditAction(webdriver);
		 manualaudit.ContinueAudit();
		 manualaudit.AuditReturn();
	
	 }
	 
	 @Parameters({"loginname","appid_pos"})
	 @Test(priority = 3)  
	 public void ExpertAllot_pos(String loginname,String appid_pos) throws Exception {
		 Log.info("专家审批分单-pos");
		 app.ExpertAudit();//专家审批
		 app.ExpertAllotPos();//专家审批分单—pos贷
		 expertallot=new ExpertAllotAction(webdriver);
		 expertallot.AllotApp(loginname, appid_pos);
	 }
	
	 @Test(priority = 4)  
	 public void ExpertAudit_pos() throws Exception {
		 Log.info("专家审批-继续审核-pos");
		 //app.ManualAudit();  //专家审批
		 app.ExpertAuditPos();//初步审批-pos
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.Audit1();
		 expertaudit.Audit2();
		 expertaudit.Audit3();
		 expertaudit.Audit4();
	 }
	 
	 @Test(priority = 4) 
	 public void ExpertAuditRefuse_pos() throws Exception {
		 Log.info("专家审批-拒绝-pos");
		 //app.ManualAudit();  //专家审批
		 app.ExpertAuditPos();//初步审批-pos
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.AuditRefuse();
			 }
	 
	 @Test(priority = 4) 
	 public void ExpertAuditReturn_pos() throws Exception {
		 Log.info("专家审批-退回-pos");
		 app.ExpertAudit();  //专家审批
		 app.ExpertAuditPos();//初步审批-pos
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.AuditReturn();
			 }
	
	 @Parameters({"loginname", "appid_cash" })
	 @Test(priority = 5) 
	 public void AuditAllot_cash(String loginname,String appid_cash) throws Exception {
		 Log.info("人工审核分单-cash");
		 app.ManualAudit();//人工审核
		 app.ManualAllotCash();//人工审核分单—cash
		 auditallot=new ManualAllotAction(webdriver);
		 auditallot.AllotApp(loginname, appid_cash);
	 }
	 
	 @Test(priority = 6) 
	 public void ManualAudit_cash() throws Exception {
		 Log.info("人工审核-继续审核-cash");
		 //app.ManualAudit();  //人工审核
		 app.ManualAuditCash();//初步审核-cash
		 manualaudit=new ManualAuditAction(webdriver);
		 manualaudit.ContinueAudit();
		 manualaudit.Audit1("信息和照片均一致", "照片一致");
		 manualaudit.Audit2("社保单位名称与申请表一致","学信网一致","照片一致","照片一致");
		 manualaudit.Audit3();
		 manualaudit.Audit4("信息已验证","信息已验证", "RES01", "信息已验证", "信息已验证", "信息已验证", "公司名和地址均一致");
	 }
	 
	 @Test(priority = 6) 
	 public void ManualAuditReturn_cash() throws Exception {
		 Log.info("人工审核-退回-cash");
		 //app.ManualAudit();  //人工审核
		 app.ManualAuditCash();//初步审核-cash
		 manualaudit=new ManualAuditAction(webdriver);
		 manualaudit.ContinueAudit();
		 manualaudit.AuditReturn();
	 }
	 
	 @Parameters({"loginname", "appid_cash" })
	 @Test(priority = 7) 
	 public void ExpertAllot_cash(String loginname,String appid_cash) throws Exception {
		 Log.info("专家审批分单-cash");
		 app.ExpertAudit();//专家审批
		 app.ExpertAllotCash();//专家审批分单—cash
		 expertallot=new ExpertAllotAction(webdriver);
		 expertallot.AllotApp(loginname, appid_cash);
	 }
	
	 @Test(priority = 8) 
	 public void ExpertAudit_cash() throws Exception {
		 Log.info("专家审批-继续审核-cash");
		 //app.ManualAudit();  //专家审批
		 app.ExpertAuditCash();//初步审批-cash
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.Audit1();
		 expertaudit.Audit2();
		 expertaudit.Audit3();
		 expertaudit.Audit4();
	 }
	 
	 @Test(priority = 8) 
	 public void ExpertAuditRefuse_cash() throws Exception {
		 Log.info("专家审批-拒绝-cash");
		 //app.ManualAudit();  //专家审批
		 app.ExpertAuditCash();//初步审批-cash
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.AuditRefuse();
			 }
	 
	 @Test(priority = 8) 
	 public void ExpertAuditReturn_cash() throws Exception {
		 Log.info("专家审批-退回-cash");
		 //app.ExpertAudit();  //专家审批
		 app.ExpertAuditCash();//初步审批-cash
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.AuditReturn();
			 }
	 
	 @Test(priority=9)
	 public void LogOut(){
	 //退出登录
		 Log.info("退出登录");
		 logout=new LogoutAction(webdriver);
		 logout.logout();
	 }

	@AfterTest()
	 public void afterTest(){
	 //关闭浏览器
		 logout.ReturnDriver().close();
	 }
}