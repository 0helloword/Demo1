package com.oc.action;

import org.openqa.selenium.WebDriver;

import com.oc.basic.Log;
import com.oc.page.HomePage;

public class LogOutAction {
	  private WebDriver driver;
	    //1�����췽���ķ�����������������ͬ��
	    //2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
	    //3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ��������������
	    public LogOutAction(){
	       // this.driver = driver;
	    }
	    public void logout(){
	    	HomePage.LogOut(driver).click();
	        Log.info("�˳���¼");
	    }
	    
	    //����driver
	    public WebDriver ReturnDriver(){
	        return this.driver;
	    }   
}
