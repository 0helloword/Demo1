package com.oc.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	private WebDriver driver;

	public Table(WebDriver driver) {
		this.driver = driver;
	}

	public void TableTest(String appstate) throws InterruptedException {
			ComElement.LastPage(driver).click();//切换到最后一页，获取页码，通过（总页码数-1）*每页记录条数+最后一页记录条数=总条数
			Thread.sleep(2000);
			String pages = ComElement.PageInput(driver).getAttribute("value");
			int pagenum = Integer.parseInt(pages)-1;//总页码数减去1
			WebElement table = ComElement.table(driver);
			List<WebElement> rows = table.findElements(By.tagName("tr"));//获取最后一页的tr记录
			int lastpagerow = rows.size()-1;//获取tr的条数，包括标题栏
			int recordnum = 20 * pagenum + lastpagerow;
			Log.info(appstate+" 记录总条数为：" + recordnum);
		}	
	}

