package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.oc.basic.Log;
import com.oc.page.ExpertAuditPage;

public class ExpertAuditAction {
	private WebDriver driver;

	public ExpertAuditAction(WebDriver driver) {
		this.driver = driver;
	}

	// 获取工单
	public void Getapp() throws InterruptedException {
		Thread.sleep(2000);
		String appnum = ExpertAuditPage.AppNumber(driver).getText();
		Log.info("当前待审核工单数为" + appnum);
		 int appnum1=Integer.parseInt(appnum);
		 if(appnum1>=1)
		 {
			 ExpertAuditPage.GetApp(driver).click();
		 }

	}

	public void ContinueAudit() throws InterruptedException {
		Thread.sleep(2000);
		//ExpertAuditPage_pos.Go(driver).click();
		//Thread.sleep(2000);
		ExpertAuditPage.ContinueAudit(driver).click();
	}
	
	public void ContinueAudit2() throws InterruptedException {
		Thread.sleep(2000);
		//ExpertAuditPage_pos.Go(driver).click();
		//Thread.sleep(2000);
		ExpertAuditPage.ContinueAudit2(driver).click();
	}
	
	
	// }
	public void AuditReturn()
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage.App(driver).getText();
		Log.info("当前审核工单为：" + app + "审核状态：退回");
		ExpertAuditPage.Return(driver).click();
		Thread.sleep(2000);
		new Select(ExpertAuditPage.ReturnCause(driver)).selectByIndex(1);
		Thread.sleep(2000);
		ExpertAuditPage.ReturnDesc(driver).sendKeys("专家审批退回");
		Thread.sleep(2000);
		ExpertAuditPage.ReturnSubmit(driver).click();
		Thread.sleep(2000);
		ExpertAuditPage.ReturnSubmitConfirm(driver).click();
		Reporter.log("专家审批退回-pos");
	}
	
	public void AuditRefuse()
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage.App(driver).getText();
		Log.info("当前审核工单为：" + app + "审核状态：拒绝");
		ExpertAuditPage.Refuse(driver).click();
		Thread.sleep(2000);
		new Select(ExpertAuditPage.RefuseCause1(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(ExpertAuditPage.RefuseCause2(driver)).selectByIndex(1);
		Thread.sleep(1000);
		ExpertAuditPage.RefuseOpinion(driver).sendKeys("专家审批拒绝");
		Thread.sleep(1000);
		ExpertAuditPage.RefuseCommit(driver).click();
		Thread.sleep(1000);
		ExpertAuditPage.RefuseConfirm(driver).click();
		Reporter.log("专家审批拒绝-pos");
	}
	

	public void Audit1()throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage.App(driver).getText();
		Log.info("当前审核工单为：" + app + "审核状态：专家审批");
		Thread.sleep(2000);
		String nciicAuto = ExpertAuditPage.NciicAuto(driver).getText();
		Log.info(nciicAuto);
		Thread.sleep(2000);
		ExpertAuditPage.Next(driver).click();
	}

	public void Audit2()throws InterruptedException {
		Thread.sleep(2000);
		String cardinfo = ExpertAuditPage.CardCheck(driver).getText();
		// String sellinfo=ExpertAuditPage_pos.SellRemarks(driver).getText();
		// String pysdt=ExpertAuditPage_pos.PySdt(driver).getText();
		// Log.info(cardinfo+"\n"+sellinfo+"\n"+pysdt); //因滚动栏无法获取销售备注和学信网查询结果？
		Log.info(cardinfo);
		Thread.sleep(2000);
		ExpertAuditPage.Next(driver).click();
	}

	public void Audit3() throws InterruptedException {
		Thread.sleep(2000);
		ExpertAuditPage.Next(driver).click();
	}

	public void RelatedInfo() throws InterruptedException {
		Thread.sleep(2000);
		ExpertAuditPage.RelatedInfo(driver).click();
		Thread.sleep(2000);
		new Select(ExpertAuditPage.ContactNum(driver)).selectByIndex(0); 
		Thread.sleep(2000);
		ExpertAuditPage.Query(driver).click();
		Thread.sleep(2000);
		ExpertAuditPage.Back(driver).click();
	}

	public void Audit4info() throws Exception {
		Thread.sleep(2000);
		String pycompany = ExpertAuditPage.PyCompany(driver).getText();
		String rule = ExpertAuditPage.Rule(driver).getText();
		String pysdt = ExpertAuditPage.MobileRecord(driver).getText();
		Log.info(pycompany + "\n" + rule + "\n" + pysdt);
		Thread.sleep(2000);
	}

	public void Audit4() throws Exception {
		Thread.sleep(2000);
		ExpertAuditPage.Commit(driver).click();//提交
		Thread.sleep(2000);
		ExpertAuditPage.CommitCom(driver).sendKeys("test");;//输入备注
		Thread.sleep(2000);
		ExpertAuditPage.CommitConfirm(driver).click();//确认
		Thread.sleep(2000);
		ExpertAuditPage.Determine(driver).click();//确认
		Reporter.log("专家审批成功-pos");
	}
}
