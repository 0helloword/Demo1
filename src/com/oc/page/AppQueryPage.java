package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppQueryPage {

	    
	    private static WebElement element;
	    
	    public static WebElement QueryButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.btn-primary"));//��ѯ����"btn btn-primary"
	        return element;
	    }
	 	    
	    public static WebElement ResetButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.red-pink"));//���ð���
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
	    
	    
	    public static WebElement AppState(WebDriver driver){
	        element = driver.findElement(By.id("appState"));//��ѯ����-����״̬
	        return element;
	    }
	    
	    public static WebElement AppStateValue(WebDriver driver){
	        element = driver.findElement(By.className("label label-sm label-danger"));//��ѯ�������״̬��ֵ
	        return element;
	    }

	    public static WebElement PageNumber(WebDriver driver){
	        element = driver.findElement(By.xpath("//*[contains(.,'ÿҳ')]"));//��ѯ���ҳ��
	        return element;
	    }
	    
	    public static WebElement App(WebDriver driver,String app){
	        element = driver.findElement(By.linkText(app));//������������
	        return element;
	    }
	
	    public static WebElement AppDtail(WebDriver driver){
	        element = driver.findElement(By.className("page-title"));//��������ҳ�湤���������
	        return element;
	    }
	    
	    public static WebElement HetongZiliao(WebDriver driver){
	        element = driver.findElement(By.linkText("��ͬ����"));//��ͬ����
	        return element;
	    }
	    
	    public static WebElement XieshenXinxi(WebDriver driver){
	        element = driver.findElement(By.linkText("Э����Ϣ"));//Э����Ϣ
	        return element;
	    }
	    
	    public static WebElement ShangpinXinxi(WebDriver driver){
	        element = driver.findElement(By.linkText("��Ʒ��Ϣ"));//��Ʒ��Ϣ
	        return element;
	    }
	    
	    public static WebElement UpButton(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//���ϰ���
	        return element;
	    }
	    
	    public static WebElement OpenButton(WebDriver driver){
	        element = driver.findElement(By.className("collapse"));//������������
	        return element;
	    }
	    
	    public static WebElement BackButton1(WebDriver driver){
	        element = driver.findElement(By.name("back"));//��������ҳ�淵�ذ���
	        return element;
	    }
	    
	    public static WebElement Check(WebDriver driver){
	        element = driver.findElement(By.linkText("�鿴"));//�鿴��˼�¼����
	        return element;
	    }
	    
	    public static WebElement CheckLog(WebDriver driver){
	        element = driver.findElement(By.className("page-title"));//��˼�¼������˼�¼����
	        return element;
	    }
	    
	    public static WebElement BackButton2(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.grey-silver"));//��˼�¼���淵�ذ���
	        return element;
	    }
		}
	

