//ϵͳ��ҳ��Ĳ˵�����
package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    
    private static WebElement element;
	
	
     public static WebElement AppQuery(WebDriver driver){
        element = driver.findElement(By.xpath("//li[3]/a/span"));//������ѯ
        return element;
    }
    
    public static WebElement ManualAudit(WebDriver driver){
        element = driver.findElement(By.xpath("//li[4]/a/span"));//�˹����
        return element;
    }
    
    public static WebElement ManualAuditPos(WebDriver driver){
        element = driver.findElement(By.linkText("������ˣ�POS��"));//�������pos
        return element;
    }
    
    public static WebElement ManualAllotPos(WebDriver driver){
        element = driver.findElement(By.linkText("��˷ֵ���POS��"));//��˷ֵ�pos
        return element;
    }
    
    public static WebElement ManualAuditCash(WebDriver driver){
        element = driver.findElement(By.linkText("������ˣ�CASH��"));//�������cash
        return element;
    }
    
    public static WebElement ManualAllotCash(WebDriver driver){
        element = driver.findElement(By.linkText("��˷ֵ���CASH��"));//��˷ֵ�cash
        return element;
    }
    
    public static WebElement ExpertAudit(WebDriver driver){
        element = driver.findElement(By.xpath("//li[5]/a/span"));//ר������
        return element;
    }
    
    public static WebElement ExpertAuditPos(WebDriver driver){
        element = driver.findElement(By.linkText("����������POS��"));//��������pos
        return element;
    }
    
    public static WebElement ExpertAllotPos(WebDriver driver){
        element = driver.findElement(By.linkText("�����ֵ���POS��"));//�����ֵ�pos
        return element;
    }
    
    public static WebElement ExpertAuditCash(WebDriver driver){
        element = driver.findElement(By.linkText("����������CASH��"));//��������cash
        return element;
    }
    
    public static WebElement ExpertAllotCash(WebDriver driver){
        element = driver.findElement(By.linkText("�����ֵ���CASH��"));//�����ֵ�cash
        return element;
    }
    
    public static WebElement CustInfo(WebDriver driver){
        element = driver.findElement(By.xpath("//li[6]/a/span"));//�ͻ���Ϣ
        return element;
    }
    
    public static WebElement TeleRepertory(WebDriver driver){
        element = driver.findElement(By.linkText("�绰�ֿ�"));//�绰�ֿ�
        return element;
    }  
    
    public static WebElement LogOut(WebDriver driver){
        element = driver.findElement(By.className("icon-logout"));//�˳���¼
        return element;
    }  
}  
