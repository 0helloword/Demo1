package com.oc.action;

import org.openqa.selenium.WebDriver;

import com.oc.page.HomePage;

public class HomePageAction {

	private WebDriver driver;

	// 1）构造方法的方法名必须与类名相同。
	// 2）构造方法没有返回类型，也不能定义为void，在方法名前面不声明方法类型。
	// 3）构造方法的主要作用是完成对象的初始化工作，它能够把定义对象时的参数传给对象的域。

	public HomePageAction(WebDriver driver) {
		this.driver = driver;
	}

	// 工单查询
	public void AppQuery() {
		HomePage.AppQuery(driver).click();

	}

	// 人工审核
	public void ManualAudit() {
		HomePage.ManualAudit(driver).click();
	}

	// 初步审核-pos
	public void ManualAuditPos() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ManualAuditPos(driver).click();
	}

	// 审核分单-pos
	public void ManualAllotPos() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ManualAllotPos(driver).click();
	}

	// 初步审核-cash
	public void ManualAuditCash() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ManualAuditCash(driver).click();
	}

	// 审核分单-cash
	public void ManualAllotCash() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ManualAllotCash(driver).click();
	}

	// 专家审批
	public void ExpertAudit() throws InterruptedException {
		Thread.sleep(5000);
		HomePage.ExpertAudit(driver).click();
	}

	// 初步审批-pos
	public void ExpertAuditPos() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ExpertAuditPos(driver).click();
	}

	// 审批分单-pos
	public void ExpertAllotPos() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ExpertAllotPos(driver).click();
	}

	// 初步审批-cash
	public void ExpertAuditCash() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.ExpertAuditCash(driver).click();
	}

	// 审批分单-cash
	public void ExpertAllotCash() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.ExpertAllotCash(driver).click();
	}

	// 返回driver
	public WebDriver ReturnDriver() {
		return this.driver;
	}

}
