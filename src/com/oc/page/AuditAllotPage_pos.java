package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuditAllotPage_pos {
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
	    
	    public static WebElement Id(WebDriver driver){
	        element = driver.findElement(By.name("ids"));//��ѡ��
	        return element;
	    }
	    
	    public static WebElement Alloter(WebDriver driver){
	        element = driver.findElement(By.id("select2-drop-mask"));//�����ɸѡ��
	        return element;
	    }
	    
	    public static WebElement Input(WebDriver driver){
	        element = driver.findElement(By.className("select2-input"));//����������
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
	    
	    public static WebElement NextPage(WebDriver driver){
	        element = driver.findElement(By.linkText("��һҳ"));//��һҳ����
	        return element;
	    }
	
	    public static WebElement PreviousPage(WebDriver driver){
	        element = driver.findElement(By.linkText("��һҳ"));//��һҳ����
	        return element;
	    }
	
	    public static WebElement FirstPage(WebDriver driver){
	        element = driver.findElement(By.linkText("��һҳ"));//��һҳ����
	        return element;
	    }
	    
	    public static WebElement LastPage(WebDriver driver){
	        element = driver.findElement(By.linkText("���һҳ"));//���һҳ����
	        return element;
	    }
	    
	    public static WebElement Go(WebDriver driver){
	        element = driver.findElement(By.linkText("go"));//go����
	        return element;
	    }
	    
	    public static WebElement PageInput(WebDriver driver){
	        element = driver.findElement(By.id("pageInput"));//����ҳ��
	        return element;
	    }
	    
	    public static WebElement Up(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//���ϰ���
	        return element;
	    }
}
