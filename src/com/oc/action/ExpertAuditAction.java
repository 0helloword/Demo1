package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.oc.basic.Log;
import com.oc.page.ExpertAuditPage;

public class ExpertAuditAction {
	private WebDriver driver;

	public ExpertAuditAction(WebDriver driver) {
		this.driver = driver;
	}

	// ��ȡ����
	public void Getapp() throws InterruptedException {
		Thread.sleep(2000);
		String appnum = ExpertAuditPage.AppNumber(driver).getText();
		Log.info("��ǰ����˹�����Ϊ" + appnum);
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
	
	// }
	public void AuditReturn(String returnCause, String returnDesc)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���˻�");
		ExpertAuditPage.Return(driver).click();
		new Select(ExpertAuditPage.ReturnCause(driver))
				.selectByVisibleText(returnCause);
		ExpertAuditPage.ReturnDesc(driver).sendKeys(returnDesc);
		ExpertAuditPage.ReturnSubmit(driver).click();
	}
	
	public void AuditRefuse(String refuseCause1,String refuseCause2,String refuseDesc)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���ܾ�");
		ExpertAuditPage.Refuse(driver).click();
		new Select(ExpertAuditPage.RefuseCause1(driver))
				.selectByVisibleText(refuseCause1);
		Thread.sleep(1000);
		new Select(ExpertAuditPage.RefuseCause2(driver))
		.selectByVisibleText(refuseCause2);
		Thread.sleep(1000);
		ExpertAuditPage.RefuseOpinion(driver).sendKeys(refuseDesc);
		Thread.sleep(1000);
		ExpertAuditPage.RefuseCommit(driver).click();
		Thread.sleep(1000);
		ExpertAuditPage.RefuseConfirm(driver).click();
	}
	

	public void Audit1()throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬��ר������");
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
		// Log.info(cardinfo+"\n"+sellinfo+"\n"+pysdt); //��������޷���ȡ���۱�ע��ѧ������ѯ�����
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
		ExpertAuditPage.Commit(driver).click();//�ύ
		Thread.sleep(2000);
		ExpertAuditPage.CommitCom(driver).sendKeys("test");;//���뱸ע
		Thread.sleep(1000);
		ExpertAuditPage.CommitConfirm(driver).click();//ȷ��
		Thread.sleep(1000);
		ExpertAuditPage.Determine(driver).click();//ȷ��
	}
}
