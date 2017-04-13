package com.oc.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.oc.basic.Log;
import com.oc.page.ExpertAuditPage_pos;

public class ExpertAuditAction_pos {
	private WebDriver driver;

	public ExpertAuditAction_pos(WebDriver driver) {
		this.driver = driver;
	}

	// ��ȡ����
	public void Getapp() throws InterruptedException {
		Log.info("��ȡ����");
		Thread.sleep(2000);
		String appnum = ExpertAuditPage_pos.AppNumber(driver).getText();
		Log.info("��ǰ����˹�����Ϊ" + appnum);
		 int appnum1=Integer.parseInt(appnum);
		 if(appnum1>=1)
		 {
			 ExpertAuditPage_pos.GetApp(driver).click();
		 }

	}

	public void ContinueAudit() throws InterruptedException {
		Log.info("�������");
		Thread.sleep(2000);
		//ExpertAuditPage_pos.Go(driver).click();
		//Thread.sleep(2000);
		ExpertAuditPage_pos.ContinueAudit(driver).click();
	}
	
	// }
	public void AuditReturn(String returnCause, String returnDesc)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage_pos.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���˻�");
		ExpertAuditPage_pos.Return(driver).click();
		new Select(ExpertAuditPage_pos.ReturnCause(driver))
				.selectByVisibleText(returnCause);
		ExpertAuditPage_pos.ReturnDesc(driver).sendKeys(returnDesc);
		ExpertAuditPage_pos.ReturnSubmit(driver).click();
	}
	
	public void AuditRefuse(String refuseCause1,String refuseCause2,String refuseDesc)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage_pos.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���ܾ�");
		ExpertAuditPage_pos.Refuse(driver).click();
		new Select(ExpertAuditPage_pos.RefuseCause1(driver))
				.selectByVisibleText(refuseCause1);
		Thread.sleep(1000);
		new Select(ExpertAuditPage_pos.RefuseCause2(driver))
		.selectByVisibleText(refuseCause2);
		Thread.sleep(1000);
		ExpertAuditPage_pos.RefuseOpinion(driver).sendKeys(refuseDesc);
		Thread.sleep(1000);
		ExpertAuditPage_pos.RefuseCommit(driver).click();
		Thread.sleep(1000);
		ExpertAuditPage_pos.RefuseConfirm(driver).click();
	}
	

	public void Audit1()throws InterruptedException {
		Thread.sleep(5000);
		String app = ExpertAuditPage_pos.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬��ר������");
		Thread.sleep(2000);
		String nciicAuto = ExpertAuditPage_pos.NciicAuto(driver).getText();
		Log.info(nciicAuto);
		Thread.sleep(2000);
		ExpertAuditPage_pos.Next(driver).click();
	}

	public void Audit2()throws InterruptedException {
		Thread.sleep(2000);
		String cardinfo = ExpertAuditPage_pos.CardCheck(driver).getText();
		// String sellinfo=ExpertAuditPage_pos.SellRemarks(driver).getText();
		// String pysdt=ExpertAuditPage_pos.PySdt(driver).getText();
		// Log.info(cardinfo+"\n"+sellinfo+"\n"+pysdt); //��������޷���ȡ���۱�ע��ѧ������ѯ�����
		Log.info(cardinfo);
		Thread.sleep(2000);
		ExpertAuditPage_pos.Next(driver).click();
	}

	public void Audit3() throws InterruptedException {
		Thread.sleep(2000);
		ExpertAuditPage_pos.Next(driver).click();
	}

	public void RelatedInfo() throws InterruptedException {
		Thread.sleep(2000);
		ExpertAuditPage_pos.RelatedInfo(driver).click();
		Thread.sleep(2000);
		new Select(ExpertAuditPage_pos.ContactNum(driver)).selectByIndex(0); 
		Thread.sleep(2000);
		ExpertAuditPage_pos.Query(driver).click();
		Thread.sleep(2000);
		ExpertAuditPage_pos.Back(driver).click();
	}

	public void Audit4info() throws Exception {
		Thread.sleep(2000);
		String pycompany = ExpertAuditPage_pos.PyCompany(driver).getText();
		String rule = ExpertAuditPage_pos.Rule(driver).getText();
		String pysdt = ExpertAuditPage_pos.MobileRecord(driver).getText();
		Log.info(pycompany + "\n" + rule + "\n" + pysdt);
		Thread.sleep(2000);
	}

	public void Audit4() throws Exception {
		Thread.sleep(2000);
		ExpertAuditPage_pos.Commit(driver).click();//�ύ
		Thread.sleep(2000);
		ExpertAuditPage_pos.CommitCom(driver).sendKeys("test");;//���뱸ע
		Thread.sleep(1000);
		ExpertAuditPage_pos.CommitConfirm(driver).click();//ȷ��
		Thread.sleep(1000);
		ExpertAuditPage_pos.Determine(driver).click();//ȷ��
	}
}
