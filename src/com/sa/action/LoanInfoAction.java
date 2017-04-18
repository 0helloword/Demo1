package com.sa.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.page.LoanInfoPage;

public class LoanInfoAction {

		private WebDriver driver;

		public LoanInfoAction(WebDriver driver) {
			this.driver = driver;
		}

		// ´û¿îÐÅÏ¢
		public void loaninfo(String customername,String cardId,String mobile,String repayAcc)throws InterruptedException {
			Thread.sleep(2000);
			LoanInfoPage.customerName(driver).sendKeys(customername);
			Thread.sleep(1000);
			LoanInfoPage.cardId(driver).sendKeys(cardId);
			Thread.sleep(1000);
			LoanInfoPage.mobile(driver).sendKeys(mobile);
			Thread.sleep(1000);
			new Select(LoanInfoPage.repayType(driver)).selectByIndex(1);
			Thread.sleep(1000);
			new Select(LoanInfoPage.repayBank(driver)).selectByIndex(1);
			Thread.sleep(1000);
			LoanInfoPage.repayAcc(driver).sendKeys(repayAcc);
			Thread.sleep(1000);
			new Select(LoanInfoPage.repayBank(driver)).selectByIndex(1);
			Thread.sleep(1000);
			new Select(LoanInfoPage.province(driver)).selectByIndex(1);
			Thread.sleep(1000);
			new Select(LoanInfoPage.city(driver)).selectByIndex(1);
			Thread.sleep(1000);
			LoanInfoPage.bankTel(driver).sendKeys(mobile);
			Thread.sleep(1000);
			LoanInfoPage.next(driver).click();
}
}