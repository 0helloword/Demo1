package com.oc.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.oc.basic.Log;
import com.oc.page.ManualAuditPage;

public class ManualAuditAction {
	private WebDriver driver;

	public ManualAuditAction(WebDriver driver) {
		this.driver = driver;
	}

	// 获取工单
	public void Getapp() throws InterruptedException {
		Log.info("获取工单");
		Thread.sleep(2000);
		String appnum = ManualAuditPage.AppNumber(driver).getText();
		Log.info("当前待审核工单数为" + appnum);
		 int appnum1=Integer.parseInt(appnum);
		 if(appnum1>=1)
		 {
			 ManualAuditPage.GetApp(driver).click();
		 }

	}

	public void ContinueAudit() throws InterruptedException {
		Log.info("继续审核");
		Thread.sleep(2000);
		//ManualAuditPage_pos.Go(driver).click();
		//Thread.sleep(2000);
		ManualAuditPage.ContinueAudit(driver).click();
	}
	
	// }
	public void AuditReturn(String returnCause, String returnDesc)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ManualAuditPage.App(driver).getText();
		Log.info("当前审核工单为：" + app + "审核状态：退回");
		ManualAuditPage.Return(driver).click();
		new Select(ManualAuditPage.ReturnCause(driver))
				.selectByVisibleText(returnCause);
		ManualAuditPage.ReturnDesc(driver).sendKeys(returnDesc);
		ManualAuditPage.ReturnSubmit(driver).click();
	}

	public void SaveOff() throws InterruptedException {
		Thread.sleep(5000);
		String app = ManualAuditPage.App(driver).getText();
		Log.info("当前审核工单为：" + app + "审核状态：暂存");
		ManualAuditPage.SaveOff(driver).click();
		ManualAuditPage.SaveOffConfirm(driver).click();
	}

	public void Audit1(String nciic, String nciicPic)
			throws InterruptedException {
		Thread.sleep(5000);
		String app = ManualAuditPage.App(driver).getText();
		Log.info("当前审核工单为：" + app + "审核状态：人工初步审核");
		Thread.sleep(2000);
		String nciicAuto = ManualAuditPage.NciicAuto(driver).getText();
		Log.info(nciicAuto);
		Thread.sleep(2000);
		new Select(ManualAuditPage.NciicCheck(driver))
				.selectByVisibleText(nciic);
		Thread.sleep(2000);
		new Select(ManualAuditPage.NciicPic(driver))
				.selectByVisibleText(nciicPic);
		Thread.sleep(2000);
		ManualAuditPage.Remarks(driver).sendKeys("test");
		Thread.sleep(2000);
		ManualAuditPage.Next(driver).click();
	}

	public void Audit2(String shebao, String xuexin,String storepic,String sellpic)
			throws InterruptedException {
		Thread.sleep(2000);
		String cardinfo = ManualAuditPage.CardCheck(driver).getText();
		// String sellinfo=ManualAuditPage.SellRemarks(driver).getText();
		// String pysdt=ManualAuditPage.PySdt(driver).getText();
		// Log.info(cardinfo+"\n"+sellinfo+"\n"+pysdt); //因滚动栏无法获取销售备注和学信网查询结果？
		Log.info(cardinfo);
		Thread.sleep(2000);
		new Select(ManualAuditPage.SheBao(driver)).selectByVisibleText(shebao);
		Thread.sleep(2000);
		new Select(ManualAuditPage.XueXin(driver)).selectByVisibleText(xuexin);
		Thread.sleep(2000);
		new Select(ManualAuditPage.StorePic(driver)).selectByVisibleText(storepic);
		Thread.sleep(2000);
		new Select(ManualAuditPage.SellPic(driver))
				.selectByVisibleText(sellpic);
		Thread.sleep(2000);
		ManualAuditPage.Next(driver).click();
	}

	public void Audit3() throws InterruptedException {
		Thread.sleep(2000);
		ManualAuditPage.Next(driver).click();
	}

	public void Audit4phoneself(String type, String contact, String state,
			String remark) throws InterruptedException {
		Thread.sleep(2000);
		ManualAuditPage.Phone(driver).click();
		Thread.sleep(2000);
		ManualAuditPage.AddSelf(driver).click();
		Thread.sleep(2000);
		new Select(ManualAuditPage.Type(driver)).selectByVisibleText(type);
		ManualAuditPage.Contact(driver).sendKeys(contact);
		new Select(ManualAuditPage.State(driver)).selectByVisibleText(state);
		Thread.sleep(2000);
		ManualAuditPage.Remark(driver).sendKeys(remark);
		ManualAuditPage.Save(driver).click();// 保存新增本人联系信息
		Thread.sleep(2000);
		ManualAuditPage.Determine(driver).click();
		Thread.sleep(1000);
		ManualAuditPage.Determine(driver).click();
		Thread.sleep(2000);
		ManualAuditPage.Disable(driver).click();
		Thread.sleep(2000);
		ManualAuditPage.Determine(driver).click();
	}

	public void Audit4phoneother(String name, String typeother, String contact,
			String state, String remark) throws InterruptedException {
		Thread.sleep(2000);
		// ManualAuditPage.Phone(driver).click();
		ManualAuditPage.AddOther(driver).click();
		Thread.sleep(2000);
		ManualAuditPage.Name(driver).sendKeys(name);
		new Select(ManualAuditPage.TypeOther(driver))
				.selectByVisibleText(typeother);
		ManualAuditPage.Contact(driver).sendKeys(contact);
		new Select(ManualAuditPage.State(driver)).selectByVisibleText(state);
		Thread.sleep(2000);
		ManualAuditPage.Remark(driver).sendKeys(remark);
		Thread.sleep(2000);
		ManualAuditPage.Cancle(driver).click();// 取消新增本人联系信息
		ManualAuditPage.Back(driver).click();
	}

	public void Audit4info() throws Exception {
		Thread.sleep(2000);
		String pycompany = ManualAuditPage.PyCompany(driver).getText();
		String rule = ManualAuditPage.Rule(driver).getText();
		String pysdt = ManualAuditPage.MobileRecord(driver).getText();
		Log.info(pycompany + "\n" + rule + "\n" + pysdt);
		Thread.sleep(2000);
	}

	public void Audit4(String OfficeTelephone, String Phone, String Check,
			String FamilyPhone, String Familytelephone, String Otherphone,
			String ID5) throws Exception {
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		int number = elements.size();// 分数大于525时总共有8个，小于等于525时共12个
		if (number == 8) {
			System.out.println("下拉框个数为4");
			Thread.sleep(2000);
			new Select(ManualAuditPage.OfficeTelephone(driver))
					.selectByVisibleText(OfficeTelephone);
			new Select(ManualAuditPage.PhoneCheck(driver))
					.selectByVisibleText(Phone);
			new Select(ManualAuditPage.Check(driver))
					.selectByVisibleText(Check);
			new Select(ManualAuditPage.FamilyPhone(driver))
					.selectByVisibleText(FamilyPhone);
		} else {
			if (number == 12) {//因滚动栏原因暂未解决定位问题
				System.out.println("下拉框个数为7");
				Thread.sleep(2000);
				// 控制滚动栏
				// driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/form/div/div[2]")).sendKeys(Keys.UP);
				// Thread.sleep(2000);
				new Select(driver.findElement(By.name("MCRE02")))
						.selectByVisibleText(OfficeTelephone);// 申请人办公电话核实:
				Thread.sleep(1000);
				new Select(driver.findElement(By.name("MCRG07")))
						.selectByVisibleText(Check);// 主观判断结果:
				// if (OfficeTelephone.equals("信息验证失败")){
				// new
				// Select(driver.findElement(By.name("MCRE020401"))).selectByVisibleText(OfficeTelephone1);
				// }

				new Select(driver.findElement(By.name("MCRE03")))
						.selectByVisibleText(Phone);// 申请人手机电话核实:
				// if (Phone.equals("信息验证失败")){
				// new
				// Select(driver.findElement(By.name("MCRE030301"))).selectByVisibleText(Phone1);
				// }
				new Select(driver.findElement(By.name("MCRG05")))
						.selectByVisibleText(ID5);// ID5办公电话核查
				Thread.sleep(1000);
				new Select(driver.findElement(By.name("MCRG07")))
						.selectByVisibleText(Check);// 主观判断结果:
				Thread.sleep(1000);
				new Select(driver.findElement(By.name("MCRH06")))
						.selectByVisibleText(Otherphone);// 申请人其他联系人的手机电话核实:

				new Select(driver.findElement(By.name("MCRH07")))
						.selectByVisibleText(FamilyPhone);// 申请人家庭成员电话核实:
				new Select(driver.findElement(By.name("MCRM05")))
						.selectByVisibleText(Familytelephone);// 申请人家庭座机电话核实:
			}
		}
		Thread.sleep(2000);
//		ManualAuditPage.SaveOff(driver).click();// 暂存
//		Thread.sleep(2000);
//		ManualAuditPage.SaveOffComfirm(driver).click();
		ManualAuditPage.Confirm(driver).click();
		Thread.sleep(2000);
		ManualAuditPage.Commit(driver).click();//提交
		Thread.sleep(2000);
		ManualAuditPage.Determine(driver).click();//确认
		Thread.sleep(2000);
		ManualAuditPage.Determine(driver).click();//确认
	}
}
