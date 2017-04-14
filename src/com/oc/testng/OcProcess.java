package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

public class OcProcess {

	LoginAction login = null;
	LogoutAction logout = null;
	HomePageAction app = null;
	AppQueryAction appquery = null;
	ManualAuditAction manualaudit=null;
	ManualAllotAction auditallot=null;
	ExpertAllotAction expertallot=null;
	ExpertAuditAction expertaudit=null;
	
	WebDriver webdriver = new FirefoxDriver();
	
	@Parameters({"url_oc"})
	@BeforeTest
	public void beforeMethod(String url_oc) {
		Log.startTestCase("��ʼtestcase001");
		// ��ʼ���࣬��������
		login = new LoginAction(webdriver);
		webdriver.get(url_oc);
		webdriver.manage().window().maximize();
		app=new HomePageAction(webdriver);
	}
	
	@Parameters({"username", "password" })
	@Test(priority = 1)
	public void Login(String username,String password) {
		// ��¼
		login.Login(username, password);
	}
	
	@Parameters({"loginname", "appid_pos" })
	 @Test(priority=2)
	 public void AuditAllot_pos(String loginname,String appid) throws Exception {
		 Log.info("�˹���˷ֵ�-pos");
		 app.ManualAudit();//�˹����
		 app.ManualAllotPos();//�˹���˷ֵ���pos
		 auditallot=new ManualAllotAction(webdriver);
		 auditallot.AllotApp(loginname, appid);
	 }
	
	 @Test(priority=3)
	 public void ManualAudit_pos() throws Exception {
		 Log.info("�˹����-�������-pos");
		 //app.ManualAudit();  //�˹����
		 app.ManualAuditPos();//�������-pos
		 manualaudit=new ManualAuditAction(webdriver);
		 manualaudit.ContinueAudit();
		 manualaudit.Audit1("��Ϣ����Ƭ��һ��", "��Ƭһ��");
		 manualaudit.Audit2("�籣��λ�����������һ��","ѧ����һ��","��Ƭһ��","��Ƭһ��");
		 manualaudit.Audit3();
		 manualaudit.Audit4("��Ϣ����֤","��Ϣ����֤", "RES05", "��Ϣ����֤", "��Ϣ����֤", "��Ϣ����֤", "��˾���͵�ַ��һ��");
	 }
	 
	 @Parameters({"loginname", "appid_pos" })
	 @Test(priority=4)
	 public void ExpertAllot_pos(String loginname,String appid_pos) throws Exception {
		 Log.info("ר�������ֵ�-pos");
		 app.ExpertAudit();//ר������
		 app.ExpertAllotPos();//ר�������ֵ���pos��
		 expertallot=new ExpertAllotAction(webdriver);
		 expertallot.AllotApp(loginname, appid_pos);
	 }
	
	 @Test(priority=5)
	 public void ExpertAudit_pos() throws Exception {
		 Log.info("ר������-�������-pos");
		 //app.ManualAudit();  //ר������
		 app.ExpertAuditPos();//��������-pos
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.Audit1();
		 expertaudit.Audit2();
		 expertaudit.Audit3();
		 expertaudit.Audit4();
	 }
	
	 @Parameters({"loginname", "appid_cash" })
	 @Test(priority=6)
	 public void AuditAllot_cash(String loginname,String appid_cash) throws Exception {
		 Log.info("�˹���˷ֵ�-cash");
		 app.ManualAudit();//�˹����
		 app.ManualAllotCash();//�˹���˷ֵ���cash
		 auditallot=new ManualAllotAction(webdriver);
		 auditallot.AllotApp(loginname, appid_cash);
	 }
	 
	 @Test(priority=7)
	 public void ManualAudit_cash() throws Exception {
		 Log.info("�˹����-�������-cash");
		 //app.ManualAudit();  //�˹����
		 app.ManualAuditCash();//�������-cash
		 manualaudit=new ManualAuditAction(webdriver);
		 manualaudit.ContinueAudit();
		 manualaudit.Audit1("��Ϣ����Ƭ��һ��", "��Ƭһ��");
		 manualaudit.Audit2("�籣��λ�����������һ��","ѧ����һ��","��Ƭһ��","��Ƭһ��");
		 manualaudit.Audit3();
		 manualaudit.Audit4("��Ϣ����֤","��Ϣ����֤", "RES01", "��Ϣ����֤", "��Ϣ����֤", "��Ϣ����֤", "��˾���͵�ַ��һ��");
	 }
	 
	 @Parameters({"loginname", "appid_cash" })
	 @Test(priority=8)
	 public void ExpertAllot_cash(String loginname,String appid_cash) throws Exception {
		 Log.info("ר�������ֵ�-cash");
		 app.ExpertAudit();//ר������
		 app.ExpertAllotCash();//ר�������ֵ���cash
		 expertallot=new ExpertAllotAction(webdriver);
		 expertallot.AllotApp(loginname, appid_cash);
	 }
	
	 @Test(priority=9)
	 public void ExpertAudit_cash() throws Exception {
		 Log.info("ר������-�������-cash");
		 //app.ManualAudit();  //ר������
		 app.ExpertAuditCash();//��������-cash
		 expertaudit=new ExpertAuditAction(webdriver);
		 expertaudit.ContinueAudit();
		 expertaudit.Audit1();
		 expertaudit.Audit2();
		 expertaudit.Audit3();
		 expertaudit.Audit4();
	 }
	 
	 
	// @Test(priority=10)
	// public void LogOut(){
	// //�˳���¼
	// logout=new LogOutAction();
	// Log.endTestCase("�˳���¼");
	// }

	// @AfterMethod
	// public void afterMethod(){
	// //�ر������
	// login.ReturnDriver().close();
	// }
}