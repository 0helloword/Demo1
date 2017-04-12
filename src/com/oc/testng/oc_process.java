package com.oc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oc.action.*;
import com.oc.basic.*;

public class oc_process {

	LoginAction login = null;
	LogOutAction logout = null;
	HomePageAction app = null;
	AppQueryAction appquery = null;
	ManualAuditAction_pos manualaudit_pos=null;
	AuditAllotAction_pos auditallot_pos=null;
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
		 app.AuditAllotPos();//�˹���˷ֵ�����pos��
		 auditallot_pos=new AuditAllotAction_pos(webdriver);
		 auditallot_pos.AllotApp("С��");
		 
	 }
//	 @Test(priority=3)
//	 public void ManualAudit_pos() throws Exception {
//		 //�˹��������
//		 app.ManualAudit();  //�˹����
//		 app.FirstAuditPos();//�������
//		 manualaudit_pos=new ManualAuditAction_pos(webdriver);
//		 manualaudit_pos.GetApp();
//		 manualaudit_pos.Audit1("��Ϣ����Ƭ��һ��", "��Ƭһ��");
//		 manualaudit_pos.Audit2("�籣��λ�����������һ��","ѧ����һ��","��Ƭһ��","��Ƭһ��");
//		 manualaudit_pos.Audit3();
//		 //manualaudit.Audit4info();  //�������ԭ�򲻺ö�λ��
//		 //manualaudit.Audit4phoneself("��λ�绰", "18956254412", "��Ч", "test");
//		// manualaudit.Audit4phoneother("����", "����", "16589784452", "ʧЧ", "test");
//		 manualaudit_pos.Audit4("��Ϣ����֤","��Ϣ����֤", "RES01", "��Ϣ����֤", "��Ϣ����֤", "��Ϣ����֤", "��˾���͵�ַ��һ��");
//	 }
	 
	
	
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