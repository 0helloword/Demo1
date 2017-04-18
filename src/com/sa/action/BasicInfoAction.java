package com.sa.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.page.BasicInfoPage;

public class BasicInfoAction {
	private WebDriver driver;

	public BasicInfoAction(WebDriver driver) {
		this.driver = driver;
	}
	
	public void basicinfo(String email,String qq,String contractphone,String uncontractphone,String password) throws InterruptedException{
		Thread.sleep(2000);
		BasicInfoPage.issuingOrgan(driver).sendKeys("公安局");
		Thread.sleep(1000);
		BasicInfoPage.idCardValidity(driver).click();
		Thread.sleep(2000);
		BasicInfoPage.today(driver).click();
		Thread.sleep(2000);
		new Select(BasicInfoPage.degree(driver)).selectByVisibleText("大本");
		Thread.sleep(1000);
		BasicInfoPage.emaill(driver).sendKeys(email);
		Thread.sleep(1000);
		BasicInfoPage.qqCode(driver).sendKeys(qq);
		Thread.sleep(1000);
		new Select(BasicInfoPage.marry(driver)).selectByVisibleText("未婚");
		Thread.sleep(1000);
		new Select(BasicInfoPage.liveCondition(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.householdProv(driver)).selectByIndex(19);
		Thread.sleep(1000);
		new Select(BasicInfoPage.householdCity(driver)).selectByIndex(2);
		Thread.sleep(1000);
		new Select(BasicInfoPage.householdTown(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.householdZhen(driver).sendKeys("1");
		Thread.sleep(1000);
		BasicInfoPage.householdStr(driver).sendKeys("1");
		Thread.sleep(1000);
		BasicInfoPage.householdRidge(driver).sendKeys("1");
		Thread.sleep(1000);
		BasicInfoPage.householdHome(driver).sendKeys("1");
		Thread.sleep(1000);
		new Select(BasicInfoPage.addreRegist(driver)).selectByVisibleText("不同");
		Thread.sleep(1000);
		new Select(BasicInfoPage.liveProv(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.liveCity(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.liveTown(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.liveZhen(driver).sendKeys("2");
		Thread.sleep(1000);
		BasicInfoPage.liveStr(driver).sendKeys("2");
		Thread.sleep(1000);
		BasicInfoPage.liveRidge(driver).sendKeys("2");
		Thread.sleep(1000);
		BasicInfoPage.liveHome(driver).sendKeys("2");
		Thread.sleep(1000);
		new Select(BasicInfoPage.postState(driver)).selectByIndex(1);
		//收入信息
		Thread.sleep(1000);
		BasicInfoPage.monthlyIncome(driver).sendKeys("10000");
		BasicInfoPage.familyIncome(driver).sendKeys("10000");
		BasicInfoPage.monthlySpending(driver).sendKeys("2000");
		//职业信息
		Thread.sleep(2000);
		BasicInfoPage.firstWorktime(driver).click();
		Thread.sleep(1000);
		BasicInfoPage.Worktime(driver).click();
		Thread.sleep(1000);
		new Select(BasicInfoPage.industry(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.industryType(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.careerType(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.unitname(driver).sendKeys("玖富");
		BasicInfoPage.department(driver).sendKeys("信息技术");
		Thread.sleep(1000);
		BasicInfoPage.unitPhone(driver).sendKeys("07557894562");
		Thread.sleep(1000);
		new Select(BasicInfoPage.duty(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.unitWorktime(driver).sendKeys("10");
		Thread.sleep(1000);
		new Select(BasicInfoPage.unitAddre(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.unitCity(driver)).selectByIndex(1);
		Thread.sleep(1000);
		new Select(BasicInfoPage.unitTown(driver)).selectByIndex(1);
		BasicInfoPage.unitZhen(driver).sendKeys("3");
		Thread.sleep(1000);
		BasicInfoPage.unitStr(driver).sendKeys("3");
		Thread.sleep(1000);
		BasicInfoPage.unitRidge(driver).sendKeys("3");
		Thread.sleep(1000);
		BasicInfoPage.unitHome(driver).sendKeys("3");
		Thread.sleep(2000);
		new Select(BasicInfoPage.contractType(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.contractname(driver).sendKeys("周树人");
		Thread.sleep(1000);
		BasicInfoPage.contractphone(driver).sendKeys(contractphone);
		Thread.sleep(1000);
		BasicInfoPage.contractWeixin(driver).sendKeys("78945125");
		Thread.sleep(1000);
		new Select(BasicInfoPage.uncontractType(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.uncontractname(driver).sendKeys("鲁迅");
		Thread.sleep(1000);
		BasicInfoPage.uncontractphone(driver).sendKeys(uncontractphone);
		Thread.sleep(1000);
		BasicInfoPage.uncontractWeixin(driver).sendKeys("45612345");
		Thread.sleep(1000);
		//协审信息
		BasicInfoPage.xieshen1(driver).click();
		Thread.sleep(1000);
		BasicInfoPage.xieshen2(driver).click();
		Thread.sleep(1000);
		BasicInfoPage.xieshen3(driver).click();
		Thread.sleep(1000);
		BasicInfoPage.xieshen4(driver).click();
		Thread.sleep(1000);
		//其他信息
		new Select(BasicInfoPage.accompany(driver)).selectByIndex(1);
		Thread.sleep(1000);
		BasicInfoPage.accApply(driver).click();
		Thread.sleep(1000);
		BasicInfoPage.accName(driver).sendKeys("陪同人");
		Thread.sleep(1000);
		BasicInfoPage.accMobile(driver).sendKeys("18956741125");
		Thread.sleep(1000);
		BasicInfoPage.mobileBrand(driver).sendKeys("小米");
		Thread.sleep(1000);
		BasicInfoPage.stortFamKm(driver).sendKeys("1");
		Thread.sleep(1000);
		BasicInfoPage.famComKm(driver).sendKeys("1");
		Thread.sleep(1000);
		BasicInfoPage.stortComKm(driver).sendKeys("1");
		Thread.sleep(1000);
		new Select(BasicInfoPage.userEvaluate(driver)).selectByVisibleText("1");
		Thread.sleep(1000);
		BasicInfoPage.userEvaluateCode(driver).sendKeys(password);
		Thread.sleep(1000);
		BasicInfoPage.commit(driver).click();
	}
}
