package com.oc.action;

import org.openqa.selenium.WebDriver;

import com.oc.basic.Log;
import com.oc.page.HomePage;

public class LogOutAction {
	  private WebDriver driver;
	    //1）构造方法的方法名必须与类名相同。
	    //2）构造方法没有返回类型，也不能定义为void，在方法名前面不声明方法类型。
	    //3）构造方法的主要作用是完成对象的初始化工作，它能够把定义对象时的参数传给对象的域。
	    public LogOutAction(){
	       // this.driver = driver;
	    }
	    public void logout(){
	    	HomePage.LogOut(driver).click();
	        Log.info("退出登录");
	    }
	    
	    //返回driver
	    public WebDriver ReturnDriver(){
	        return this.driver;
	    }   
}
