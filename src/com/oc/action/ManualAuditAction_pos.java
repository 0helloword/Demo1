package com.oc.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.oc.basic.Log;
import com.oc.page.ManualAuditPage_pos;

public class ManualAuditAction_pos {
	private WebDriver driver;

	public ManualAuditAction_pos(WebDriver driver) {
		this.driver = driver;
	}

	// ��ȡ����
	public void GetApp() throws InterruptedException {
		Log.info("��ȡ����");
		Thread.sleep(2000);
		String appnum = ManualAuditPage_pos.AppNumber(driver).getText();
		Log.info("��ǰ����˹�����Ϊ" + appnum);
		// int appnum1=Integer.parseInt(appnum);
		// if(appnum1>=1)
		// {
		// ManualAuditPage.GetApp(driver).click();
		// }
		// else
		// {
		ManualAuditPage_pos.Go(driver).click();
		Thread.sleep(2000);
		ManualAuditPage_pos.ContinueAudit(driver).click();
	}

	// }
	public void AuditReturn(String returnCause, String returnDesc)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ManualAuditPage_pos.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���˻�");
		ManualAuditPage_pos.Return(driver).click();
		new Select(ManualAuditPage_pos.ReturnCause(driver))
				.selectByVisibleText(returnCause);
		ManualAuditPage_pos.ReturnDesc(driver).sendKeys(returnDesc);
		ManualAuditPage_pos.ReturnSubmit(driver).click();
	}

	public void SaveOff() throws InterruptedException {
		Thread.sleep(5000);
		String app = ManualAuditPage_pos.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���ݴ�");
		ManualAuditPage_pos.SaveOff(driver).click();
		ManualAuditPage_pos.SaveOffConfirm(driver).click();
	}

	public void Audit1(String nciic, String nciicPic)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ManualAuditPage_pos.App(driver).getText();
		Log.info("��ǰ��˹���Ϊ��" + app + "���״̬���˹��������");
		Thread.sleep(2000);
		String nciicAuto = ManualAuditPage_pos.NciicAuto(driver).getText();
		Log.info(nciicAuto);
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.NciicCheck(driver))
				.selectByVisibleText(nciic);
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.NciicPic(driver))
				.selectByVisibleText(nciicPic);
		Thread.sleep(2000);
		ManualAuditPage_pos.Remarks(driver).sendKeys("test");
		Thread.sleep(2000);
		ManualAuditPage_pos.Next(driver).click();
	}

	public void Audit2(String shebao, String xuexin,String storepic,String sellpic)
			throws InterruptedException {
		Thread.sleep(2000);
		String cardinfo = ManualAuditPage_pos.CardCheck(driver).getText();
		// String sellinfo=ManualAuditPage.SellRemarks(driver).getText();
		// String pysdt=ManualAuditPage.PySdt(driver).getText();
		// Log.info(cardinfo+"\n"+sellinfo+"\n"+pysdt); //��������޷���ȡ���۱�ע��ѧ������ѯ�����
		Log.info(cardinfo);
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.SheBao(driver)).selectByVisibleText(shebao);
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.XueXin(driver)).selectByVisibleText(xuexin);
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.StorePic(driver)).selectByVisibleText(storepic);
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.SellPic(driver))
				.selectByVisibleText(sellpic);
		Thread.sleep(2000);
		ManualAuditPage_pos.Next(driver).click();
	}

	public void Audit3() throws InterruptedException {
		Thread.sleep(2000);
		ManualAuditPage_pos.Next(driver).click();
	}

	public void Audit4phoneself(String type, String contact, String state,
			String remark) throws InterruptedException {
		Thread.sleep(2000);
		ManualAuditPage_pos.Phone(driver).click();
		Thread.sleep(2000);
		ManualAuditPage_pos.AddSelf(driver).click();
		Thread.sleep(2000);
		new Select(ManualAuditPage_pos.Type(driver)).selectByVisibleText(type);
		ManualAuditPage_pos.Contact(driver).sendKeys(contact);
		new Select(ManualAuditPage_pos.State(driver)).selectByVisibleText(state);
		Thread.sleep(2000);
		ManualAuditPage_pos.Remark(driver).sendKeys(remark);
		ManualAuditPage_pos.Save(driver).click();// ��������������ϵ��Ϣ
		Thread.sleep(2000);
		ManualAuditPage_pos.Determine(driver).click();
		Thread.sleep(1000);
		ManualAuditPage_pos.Determine(driver).click();
		Thread.sleep(2000);
		ManualAuditPage_pos.Disable(driver).click();
		Thread.sleep(2000);
		ManualAuditPage_pos.Determine(driver).click();
	}

	public void Audit4phoneother(String name, String typeother, String contact,
			String state, String remark) throws InterruptedException {
		Thread.sleep(2000);
		// ManualAuditPage.Phone(driver).click();
		ManualAuditPage_pos.AddOther(driver).click();
		Thread.sleep(2000);
		ManualAuditPage_pos.Name(driver).sendKeys(name);
		new Select(ManualAuditPage_pos.TypeOther(driver))
				.selectByVisibleText(typeother);
		ManualAuditPage_pos.Contact(driver).sendKeys(contact);
		new Select(ManualAuditPage_pos.State(driver)).selectByVisibleText(state);
		Thread.sleep(2000);
		ManualAuditPage_pos.Remark(driver).sendKeys(remark);
		Thread.sleep(2000);
		ManualAuditPage_pos.Cancle(driver).click();// ȡ������������ϵ��Ϣ
		ManualAuditPage_pos.Back(driver).click();
	}

	public void Audit4info() throws Exception {
		Thread.sleep(2000);
		String pycompany = ManualAuditPage_pos.PyCompany(driver).getText();
		String rule = ManualAuditPage_pos.Rule(driver).getText();
		String pysdt = ManualAuditPage_pos.MobileRecord(driver).getText();
		Log.info(pycompany + "\n" + rule + "\n" + pysdt);
		Thread.sleep(2000);
	}

	public void Audit4(String OfficeTelephone, String Phone, String Check,
			String FamilyPhone, String Familytelephone, String Otherphone,
			String ID5) throws Exception {
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		int number = elements.size();// ��������525ʱ�ܹ���8����С�ڵ���525ʱ��12��
		if (number == 8) {
			System.out.println("���������Ϊ4");
			Thread.sleep(2000);
			new Select(ManualAuditPage_pos.OfficeTelephone(driver))
					.selectByVisibleText(OfficeTelephone);
			new Select(ManualAuditPage_pos.PhoneCheck(driver))
					.selectByVisibleText(Phone);
			new Select(ManualAuditPage_pos.Check(driver))
					.selectByVisibleText(Check);
			new Select(ManualAuditPage_pos.FamilyPhone(driver))
					.selectByVisibleText(FamilyPhone);
		} else {
			if (number == 12) {//�������ԭ����δ�����λ����
				System.out.println("���������Ϊ7");
				Thread.sleep(2000);
				// ���ƹ�����
				// driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/form/div/div[2]")).sendKeys(Keys.UP);
				// Thread.sleep(2000);
				new Select(driver.findElement(By.name("MCRE02")))
						.selectByVisibleText(OfficeTelephone);// �����˰칫�绰��ʵ:
				Thread.sleep(1000);
				new Select(driver.findElement(By.name("MCRG07")))
						.selectByVisibleText(Check);// �����жϽ��:
				// if (OfficeTelephone.equals("��Ϣ��֤ʧ��")){
				// new
				// Select(driver.findElement(By.name("MCRE020401"))).selectByVisibleText(OfficeTelephone1);
				// }

				new Select(driver.findElement(By.name("MCRE03")))
						.selectByVisibleText(Phone);// �������ֻ��绰��ʵ:
				// if (Phone.equals("��Ϣ��֤ʧ��")){
				// new
				// Select(driver.findElement(By.name("MCRE030301"))).selectByVisibleText(Phone1);
				// }
				new Select(driver.findElement(By.name("MCRG05")))
						.selectByVisibleText(ID5);// ID5�칫�绰�˲�
				Thread.sleep(1000);
				new Select(driver.findElement(By.name("MCRG07")))
						.selectByVisibleText(Check);// �����жϽ��:
				Thread.sleep(1000);
				new Select(driver.findElement(By.name("MCRH06")))
						.selectByVisibleText(Otherphone);// ������������ϵ�˵��ֻ��绰��ʵ:

				new Select(driver.findElement(By.name("MCRH07")))
						.selectByVisibleText(FamilyPhone);// �����˼�ͥ��Ա�绰��ʵ:
				new Select(driver.findElement(By.name("MCRM05")))
						.selectByVisibleText(Familytelephone);// �����˼�ͥ�����绰��ʵ:
			}
		}
		Thread.sleep(2000);
//		ManualAuditPage.SaveOff(driver).click();// �ݴ�
//		Thread.sleep(2000);
//		ManualAuditPage.SaveOffComfirm(driver).click();
		ManualAuditPage_pos.Confirm(driver).click();
		Thread.sleep(2000);
		ManualAuditPage_pos.Commit(driver).click();//�ύ
		Thread.sleep(1000);
		ManualAuditPage_pos.Determine(driver).click();//ȷ��
		Thread.sleep(1000);
		ManualAuditPage_pos.Determine(driver).click();//ȷ��
	}
}
