package com.oc.action;

import org.openqa.selenium.WebDriver;

import com.oc.page.HomePage;

public class HomePageAction {

	private WebDriver driver;

	// 1�����췽���ķ�����������������ͬ��
	// 2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
	// 3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ��������������

	public HomePageAction(WebDriver driver) {
		this.driver = driver;
	}

	// ������ѯ
	public void AppQuery() {
		HomePage.AppQuery(driver).click();

	}

	// �˹����
	public void ManualAudit() {
		HomePage.ManualAudit(driver).click();
	}

	// �������-pos
	public void ManualAuditPos() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ManualAuditPos(driver).click();
	}

	// ��˷ֵ�-pos
	public void ManualAllotPos() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ManualAllotPos(driver).click();
	}

	// �������-cash
	public void ManualAuditCash() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ManualAuditCash(driver).click();
	}

	// ��˷ֵ�-cash
	public void ManualAllotCash() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ManualAllotCash(driver).click();
	}

	// ר������
	public void ExpertAudit() throws InterruptedException {
		Thread.sleep(5000);
		HomePage.ExpertAudit(driver).click();
	}

	// ��������-pos
	public void ExpertAuditPos() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ExpertAuditPos(driver).click();
	}

	// �����ֵ�-pos
	public void ExpertAllotPos() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ExpertAllotPos(driver).click();
	}

	// ��������-cash
	public void ExpertAuditCash() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ExpertAuditCash(driver).click();
	}

	// �����ֵ�-cash
	public void ExpertAllotCash() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ExpertAllotCash(driver).click();
	}

	// ����driver
	public WebDriver ReturnDriver() {
		return this.driver;
	}

}
