package com.oc.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.oc.basic.Log;
import com.oc.page.*;

public class LoginAction {
    
    private WebDriver driver;
    //1）构造方法的方法名必须与类名相同。
    //2）构造方法没有返回类型，也不能定义为void，在方法名前面不声明方法类型。
    //3）构造方法的主要作用是完成对象的初始化工作，它能够把定义对象时的参数传给对象的域。
    public LoginAction(WebDriver driver){
        this.driver = driver;
    }
    
    //登录
    public void Login(String user,String pw) {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage.userName(driver).sendKeys(user);
        Log.info("输入用户名："+user);
        LoginPage.passWord(driver).sendKeys(pw);
        Log.info("输入密码："+pw);
        LoginPage.loginButton(driver).click();
        Assert.assertEquals("小拉", LoginPage.loginname(driver).getText());
        Log.info("登录成功");
       
    }


        
    //返回driver
    public WebDriver ReturnDriver(){
        return this.driver;
    }        
} 