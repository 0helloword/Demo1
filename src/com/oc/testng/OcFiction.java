package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

public class OcFiction {

	LoginAction login = null;
	LogoutAction logout = null;
	HomePageAction app = null;
	AppQueryAction appquery = null;
	ManualAuditAction manualaudit=null;
	ManualAllotAction manualallot=null;
	ExpertAllotAction expertallot=null;
	ExpertAuditAction expertaudit=null;
	
	WebDriver webdriver = new ChromeDriver();
	
	@BeforeTest
	public void beforeMethod() {
		Log.startTestCase("开始testcase001");
		// 初始化类，并打开链接
		login = new LoginAction(webdriver);
		webdriver.get("http://123.57.56.45:7778/OC/initLogin");
		webdriver.manage().window().maximize();
		app=new HomePageAction(webdriver);
		appquery = new AppQueryAction(webdriver);// 右侧工单查询功能
		manualallot=new ManualAllotAction(webdriver);//人工分单
		manualaudit=new ManualAuditAction(webdriver);//人工初步审核
		expertallot=new ExpertAllotAction(webdriver);//专家分单
		expertaudit=new ExpertAuditAction(webdriver);//专家审批
	}

	@Test(priority = 1)
	public void Login() {
		// 登录
		login.Login("999111", "cyj123");
	}

	@Test(priority = 2)
	public void AppQueryButton() throws InterruptedException {
		// 工单查询界面按键功能验证
		app.AppQuery();// 左侧菜单栏工单查询
		appquery.AppQueryButton();// 工单查询界面按键验证
	}
	
	@Test(priority = 3)
	public void AppQueryState() throws InterruptedException {
		// 工单查询界面工单状态筛选查询
		app.AppQuery();
		appquery.AppQueryState("待保理放款");//筛选功能验证
	}
	
	@Test(priority = 4)
	public void AppLoanType() throws InterruptedException {
		// 工单查询界面贷款类型筛选查询
		app.AppQuery();
		appquery.AppLoanType("农机贷");//筛选功能验证
	}
	
	@Test(priority = 5)
	public void AppDtail() throws InterruptedException {
		// 工单查询界面工单详情验证
		app.AppQuery();
		appquery.AppDtail("35442254");// 工单详情验证
	}
	
	@Test(priority = 6)
	public void AppCheckInfo() throws InterruptedException {
		// 工单查询界面审核记录验证
		appquery.CheckInfo();// 工单审核记录验证
	}
	
	@Test(priority=7)
	 public void ManualAllotButton_pos() throws Exception {
		app.ManualAudit();//人工审核
		app.ManualAllotPos();//人工审核分单——pos贷
		//auditallot.AuditAllotButton();	 
	 }
	
	@Test(priority=8)
	 public void ManualAllot_pos() throws Exception {
		manualallot.AllotApp("xiaola","35441775");
		manualallot.AllotApp("xiaola","35441848");	
	 }
	
	 @Test(priority=9)
	 public void ManualAudit_pos() throws Exception {
		 //app.ManualAudit();  //人工审核
		 app.ManualAuditPos();//初步审核
		 manualaudit.ContinueAudit();
		 manualaudit.Audit1(2,1);
		 manualaudit.Audit2(1,2,1,1);
		 manualaudit.Audit3();
		 //manualaudit.Audit4info();  //因滚动栏原因不好定位？
		 //manualaudit.Audit4phoneself("单位电话", "18956254412", "生效", "test");
		 //manualaudit.Audit4phoneother("当康", "亲属", "16589784452", "失效", "test");
		 manualaudit.Audit4();
	 }
	 
	 @Test(priority = 10)
	 public void ManualAuditReturn_pos() throws Exception {
			Log.info("人工审核-退回-pos");
			// app.ManualAudit(); //人工审核
			//app.ManualAuditPos();// 初步审核-pos
			manualaudit.ContinueAudit();
			manualaudit.AuditReturn();
			Reporter.log("人工审核退回-pos");
		}
	 
	 @Test(priority=11)
	 public void ExpertAllotButton_pos() throws Exception {
		app.ExpertAudit();//专家审批
		app.ExpertAllotPos();//专家审批分单——pos贷
		expertallot.Button();	 
	 }
	
	@Test(priority=12)
	 public void ExpertAllot_pos() throws Exception {
		expertallot.AllotApp("xiaola","35442019");	 
	 }
	 
	 @Test(priority=13)
	 public void ExpertAudit_pos() throws Exception {
		 //app.ExpertAudit();  //专家审批
		 app.ExpertAuditPos();//初步审批
		 expertaudit.ContinueAudit();
		 expertaudit.Audit1();
		 expertaudit.Audit2();
		 expertaudit.Audit3();
		 //manualaudit.Audit4info();  //因滚动栏原因不好定位？
		 //expertaudit.RelatedInfo();//关联信息调查
		 expertaudit.Audit4();
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