package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExpertAuditPage {
	 private static WebElement element;
	    
	    public static WebElement GetApp(WebDriver driver){
	        element = driver.findElement(By.id("autoGetLnApp"));//��ȡ��������
	        return element;
	    }
	    
	    public static WebElement AppNumber(WebDriver driver){
	        element = driver.findElement(By.id("unAssignAppCount"));//����˹�������
	        return element;
	    }
	    
	    public static WebElement Go(WebDriver driver){
	        element = driver.findElement(By.linkText("go"));//go����
	        return element;
	    }
	    
	    public static WebElement ContinueAudit(WebDriver driver){
	        element = driver.findElement(By.linkText("�������"));//������˰���
	        return element;
	    }
	    
	    public static WebElement ContinueAudit2(WebDriver driver){
	        element = driver.findElement(By.xpath("(//a[contains(text(),'�������')])[2]"));//�������2����
	        return element;
	    }
	    
	    public static WebElement ContinueAudit3(WebDriver driver){
	        element = driver.findElement(By.xpath("(//a[contains(text(),'�������')])[3]"));//�������3����
	        return element;
	    }
	    //�˹�������˽��湫��Ԫ��
	    public static WebElement OpenButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("a.collapse"));//������������
	        return element;
	    }
	    
	    public static WebElement Back(WebDriver driver){
	        element = driver.findElement(By.linkText("����"));//���ذ���
	        return element;
	    }
	    
	    public static WebElement Next(WebDriver driver){
	        element = driver.findElement(By.linkText("��һ��"));//��һ������
	        return element;
	    }
	    
	    public static WebElement App(WebDriver driver){
	       element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[2]"));//�������
	       return element;
	    }
	    //ͼƬ��ʵԪ��
	    public static WebElement NciicAuto(WebDriver driver){
	    	element=driver.findElement(By.xpath("//*[contains(text(),'NCIIC�Զ����')]"));//NCIIC�Զ����
	        return element;
	    }
	    
	   
	    //֤����ʵ
	    public static WebElement CardCheck(WebDriver driver){
	        element = driver.findElement(By.xpath("//*[contains(text(),'���п�')]"));//���п��鿨��Ϣ
	        return element;
	    }
	    
	    public static WebElement SellRemarks(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[4]/div[2]"));//���۱�ע
	        return element;
	    }

	    public static WebElement PySdt(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[5]/div[2]"));//ѧ������ѯ���
	        return element;
	    }
	    

	    //������Ϣ��ʵ
	    
	 
	    //������Ϣ����
	    public static WebElement RelatedInfo(WebDriver driver){
	        element = driver.findElement(By.linkText("������Ϣ����"));//������Ϣ����
	        return element;
	    }
	    
	    public static WebElement ContactNum(WebDriver driver){
	        element = driver.findElement(By.name("phoneNum"));//������Ϣ����-��ϵ�绰
	        return element;
	    }
	    
	    public static WebElement Query(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.btn-primary"));//������Ϣ����-��ѯ
	        return element;
	    }
	    
	    //������Ϣ��ʵ
	    public static WebElement PyCompany(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[5]"));//��ҵ����/�绰������
	        return element;
	    }
	    
	    public static WebElement Rule(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[6]"));//������ʾ
	        return element;
	    }
	    
	    public static WebElement MobileRecord(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[7]"));//��Ӫ�̲�ѯ���
	        return element;
	    }
 
	    public static WebElement Commit(WebDriver driver){
	        element = driver.findElement(By.linkText("�ύ"));//�ύ
	        return element;
	    }
	    
	    public static WebElement CommitCom(WebDriver driver){
	        element = driver.findElement(By.id("passComment"));//�ύ��ע
	        return element;
	    }
	    
	    public static WebElement CommitConfirm(WebDriver driver){
	        element = driver.findElement(By.id("passSubmit"));//�ύȷ��
	        return element;
	    }
	    
	    public static WebElement Determine(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//ȷ��
	        return element;
	    }
	    
	    public static WebElement Return(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.red-sunglo"));//�˻�
	        return element;
	    }
	    
	    public static WebElement ReturnCause(WebDriver driver){
	        element = driver.findElement(By.id("returnCauseSelect"));//�˻����-�˻�ԭ��
	        return element;
	    }
	    
	    public static WebElement ReturnDesc(WebDriver driver){
	        element = driver.findElement(By.id("returnCauseDesc"));//�˻����-�˻����
	        return element;
	    }
	    
	    public static WebElement ReturnCancle(WebDriver driver){
	        element = driver.findElement(By.className("btn grey"));//�˻����-�˻�ȡ��
	        return element;
	    }
	    
	    public static WebElement ReturnSubmit(WebDriver driver){
	        element = driver.findElement(By.id("reutrnAppSubmit"));//�˻����-�˻��ύ
	        return element;
	    }
	    
	    public static WebElement ReturnSubmitConfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//�˻����-�˻��ύȷ��
	        return element;
	    }
	    
	    public static WebElement Refuse(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.yellow-gold"));//�ܾ�����
	        return element;
	    }
	    
	    public static WebElement RefuseCause1(WebDriver driver){
	        element = driver.findElement(By.id("refuseCodes_1Select"));//�ܾ�ԭ�����
	        return element;
	    }
	    
	    public static WebElement RefuseCause2(WebDriver driver){
	        element = driver.findElement(By.id("refuseCodes_2Select"));//�ܾ�ԭ��С��
	        return element;
	    }
	    
	    public static WebElement RefuseOpinion(WebDriver driver){
	        element = driver.findElement(By.id("refuseCauseDesc"));//�ܾ����
	        return element;
	    }
	    
	    public static WebElement RefuseCommit(WebDriver driver){
	        element = driver.findElement(By.cssSelector("#refuseCauseForm > div.modal-footer > #reutrnAppSubmit"));//�ܾ��ύ
	        return element;
	    }
	    
	    public static WebElement RefuseConfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//�ܾ��ύȷ��
	        return element;
	    }
}

