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
		 app.ManualAudit();//�˹����
		 app.AuditAllotPos();//�˹���˷ֵ���pos
		 auditallot_pos=new ManualAllotAction_pos(webdriver);
		 auditallot_pos.AllotApp("С��", "35441321");
	 }
	 @Test(priority=3)
	 public void ManualAudit_pos() throws Exception {
		 //app.ManualAudit();  //�˹����
		 app.FirstAuditPos();//�������-pos
		 manualaudit_pos=new ManualAuditAction_pos(webdriver);
		 manualaudit_pos.ContinueAudit();
		 manualaudit_pos.Audit1("��Ϣ����Ƭ��һ��", "��Ƭһ��");
		 manualaudit_pos.Audit2("�籣��λ�����������һ��","ѧ����һ��","��Ƭһ��","��Ƭһ��");
		 manualaudit_pos.Audit3();
		 manualaudit_pos.Audit4("��Ϣ����֤","��Ϣ����֤", "RES05", "��Ϣ����֤", "��Ϣ����֤", "��Ϣ����֤", "��˾���͵�ַ��һ��");
	 }
	 
	 @Test(priority=4)
	 public void ExpertAllot_pos() throws Exception {
		 app.ExpertAudit();//ר������
		 app.ExpertAllotPos();//ר�������ֵ���pos��
		 expertallot_pos=new ExpertAllotAction_pos(webdriver);
		 expertallot_pos.AllotApp("С��", "35441321");
	 }
	
	 @Test(priority=5)
	 public void ExpertAudit_pos() throws Exception {
		 //app.ManualAudit();  //ר������
		 app.ExpertAuditPos();//��������-pos
		 expertaudit_pos=new ExpertAuditAction_pos(webdriver);
		 expertaudit_pos.ContinueAudit();
		 expertaudit_pos.Audit1();
		 expertaudit_pos.Audit2();
		 expertaudit_pos.Audit3();
		 expertaudit_pos.Audit4();
	 }
	
	// @Test(priority=3)
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