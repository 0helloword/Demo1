package com.oc.action;

import org.openqa.selenium.WebDriver;
import com.oc.page.HomePage;



public class HomePageAction {

	private WebDriver driver;

	// 1�����췽���ķ�����������������ͬ��
	// 2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
	// 3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ��������������
	
	public HomePageAction(WebDriver driver) {
		this.driver = driver;
	}

	// ������ѯ
	public void appquery() {
		HomePage.AppQuery(driver).click();
	
	}
	
    //����driver
    public WebDriver ReturnDriver(){
        return this.driver;
    }   
    
}
    
   
 