package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExpertAllotPage {
	 private static WebElement element;
	    
	    public static WebElement QueryButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//��ѯ����
	        return element;
	    }
	    
	    public static WebElement ResetButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.red-pink"));//���ð���
	        return element;
	    }
	    
	    public static WebElement AllotState(WebDriver driver){
	        element = driver.findElement(By.id("assignStatus"));//��ѯ����-����״̬
	        return element;
	    }
	    
	    public static WebElement App(WebDriver driver){
	        element = driver.findElement(By.name("id"));//��ѯ����-�������
	        return element;
	    }
	    
	    public static WebElement Id(WebDriver driver){
	        element = driver.findElement(By.name("ids"));//��ѡ��
	        return element;
	    }
	    
	    public static WebElement Alloter(WebDriver driver){
	        element = driver.findElement(By.id("executorId"));//�����ɸѡ��
	        return element;
	    }
	    
	    public static WebElement Allot(WebDriver driver){
	        element = driver.findElement(By.xpath("//button[@onclick='validateAssign()']"));//��������
	        return element;
	    }
	    
	    public static WebElement Comfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[10]"));//��������ȷ������
	        return element;
	    }
	    
	    public static WebElement Up(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//���ϰ���
	        return element;
	    }
}
