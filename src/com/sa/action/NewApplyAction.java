package com.sa.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.page.NewApplyPage;

public class NewApplyAction {
	private WebDriver driver;

	public NewApplyAction(WebDriver driver) {
		this.driver = driver;
	}
	
	// 提交申请
	public void NewApply()
			throws InterruptedException {
		Thread.sleep(2000);
		new Select(NewApplyPage.storeId(driver)).selectByIndex(1);//门店
		Thread.sleep(2000);
		new Select(NewApplyPage.careerType(driver)).selectByIndex(1);//职业
		Thread.sleep(2000);
		new Select(NewApplyPage.productSeries(driver)).selectByIndex(1);// 系列
		Thread.sleep(1000);
		new Select(NewApplyPage.productType(driver)).selectByIndex(1);//货物类别
		Thread.sleep(1000);
		new Select(NewApplyPage.commodityType(driver)).selectByIndex(4);//商品类型
		Thread.sleep(1000);
		//new Select(NewApplyPage.commodityBrand(driver)).selectByIndex(1);//商品品牌
		NewApplyPage.commodityBrand(driver).sendKeys("充电器");
		Thread.sleep(1000);
		NewApplyPage.commodityModel(driver).sendKeys("001");//商品型号
		NewApplyPage.commodityPrice(driver).sendKeys("5000");//商品价格
		Thread.sleep(1000);
		NewApplyPage.commodityAmount(driver).click();
		NewApplyPage.downPaymentAmount(driver).sendKeys("2000");
		Thread.sleep(1000);
		NewApplyPage.loanMoney(driver).click();
		NewApplyPage.calculation(driver).click();
		Thread.sleep(2000);
		NewApplyPage.productId(driver).click();
		Thread.sleep(2000);
		NewApplyPage.submitBtn(driver).click();
		Thread.sleep(2000);
		NewApplyPage.ensure(driver).click();
	}
}