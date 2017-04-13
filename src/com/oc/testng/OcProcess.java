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
	ManualAuditAction manualaudit=null;
	ManualAllotAction auditallot=null;
	ExpertAllotAction expertallot=null;
	ExpertAuditAction expertaudit=null;
	
	WebDriver webdriver = new FirefoxDriver();
	
	
	@BeforeTest
	public void beforeMethod() {
		Log.startTestCase("��ʼtestcase001");
		// ��ʼ���࣬��������
		login = new LoginAction(webdriver);
		webdriver.get("http://123.57.56.45:7778/OC/initLogin");
		webdriver.manage().window().maximize();
		app=new HomePageAction(webdriver);
	}

	@Test(priority = 1)
	public void LoginA() {
		// ��¼
		login.Login("999111", "cyj111");
	}
	
	 @Test(priority=2)
	 public void AuditAllot_pos() throws Exception {
		 Log.info("�˹���˷ֵ�-pos");
		 app.ManualAudit();//�˹����
		 app.ManualAllotPos();//�˹���˷ֵ���pos
		 auditallot=new ManualAllotAction(webdriver);
		 auditallot.AllotApp("С��", "35441321");
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
	 
	 @Test(priority=4)
	 public void ExpertAllot_pos() throws Exception {
		 Log.info("ר�������ֵ�-pos");
		 app.ExpertAudit();//ר������
		 app.ExpertAllotPos();//ר�������ֵ���pos��
		 expertallot=new ExpertAllotAction(webdriver);
		 expertallot.AllotApp("С��", "35441321");
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
	
	 
	 @Test(priority=6)
	 public void AuditAllot_cash() throws Exception {
		 Log.info("�˹���˷ֵ�-cash");
		 app.ManualAudit();//�˹����
		 app.ManualAllotCash();//�˹���˷ֵ���cash
		 auditallot=new ManualAllotAction(webdriver);
		 auditallot.AllotApp("С��", "35441789");
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
	 
	 @Test(priority=8)
	 public void ExpertAllot_cash() throws Exception {
		 Log.info("ר�������ֵ�-cash");
		 app.ExpertAudit();//ר������
		 app.ExpertAllotCash();//ר�������ֵ���cash
		 expertallot=new ExpertAllotAction(webdriver);
		 expertallot.AllotApp("С��", "35441789");
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