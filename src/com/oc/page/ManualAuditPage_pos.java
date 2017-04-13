package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManualAuditPage_pos {
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
	    //�˹�������˽��湫��Ԫ��
	    public static WebElement OpenButton(WebDriver driver){
	        element = driver.findElement(By.className("collapse"));//������������
	        return element;
	    }
	    
	    public static WebElement Back(WebDriver driver){
	        element = driver.findElement(By.linkText("����"));//���ذ���
	        return element;
	    }
	    
	    public static WebElement SaveOff(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.grey-steel"));//�ݴ水��
	        return element;
	    }
	    
	    public static WebElement SaveOffComfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[10]"));//�ݴ�ȷ��
	        return element;
	    }
	    
	    public static WebElement Return(WebDriver driver){
	        element = driver.findElement(By.linkText("�˻�"));//�˻���˰���
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
	    
	    public static WebElement NciicCheck(WebDriver driver){
	        element = driver.findElement(By.name("MCRG01"));//NCIIC�˹����
	        return element;
	    }
	    
	    public static WebElement NciicPic(WebDriver driver){
	        element = driver.findElement(By.name("MCRG02"));//NCIIC��Ƭ�Ա�
	        return element;
	    }
	    
	    public static WebElement Remarks(WebDriver driver){
	        element = driver.findElement(By.name("MCRG0T"));//��ע
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
	    
	    public static WebElement SheBao(WebDriver driver){
	        element = driver.findElement(By.name("MCRG03"));//�籣��ʵ
	        return element;
	    }
	    
	    public static WebElement XueXin(WebDriver driver){
	        element = driver.findElement(By.name("MCRG11"));//ѧ������ʵ
	        return element;
	    }
	    
	    public static WebElement StorePic(WebDriver driver){
	        element = driver.findElement(By.name("MCRG17"));//�ŵ���Ƭ�ȶ�
	        return element;
	    }
	    
	    public static WebElement SellPic(WebDriver driver){
	        element = driver.findElement(By.name("PSA01"));//������Ƭ�ȶ�
	        return element;
	    }
	    //������Ϣ��ʵ
	    //�绰�ֿ�
	    public static WebElement Phone(WebDriver driver){
	        element = driver.findElement(By.xpath("(//a[contains(text(),'�绰�ֿ�')])[2]"));//�绰�ֿ�
	        return element;
	    }
	    
	    public static WebElement AddSelf(WebDriver driver){
	        element = driver.findElement(By.id("addSelfBtn"));//������ϵ��Ϣ-����
	        return element;
	    }
	    
	    public static WebElement Type(WebDriver driver){
	        element = driver.findElement(By.id("contactCategoryPhone"));//������ϵ��Ϣ-����
	        return element;
	    }
	    
	    public static WebElement Contact(WebDriver driver){
	        element = driver.findElement(By.id("contact"));//��ϵ����
	        return element;
	    }
	    
	    public static WebElement State(WebDriver driver){
	        element = driver.findElement(By.id("state"));//״̬
	        return element;
	    }
	    
	    public static WebElement Remark(WebDriver driver){
	        element = driver.findElement(By.id("remark"));//��ע
	        return element;
	    }
	    
	    public static WebElement Save(WebDriver driver){
	        element = driver.findElement(By.linkText("����"));//����
	        return element;
	    }
	    
	    public static WebElement Cancle(WebDriver driver){
	        element = driver.findElement(By.linkText("ȡ��"));//ȡ��
	        return element;
	    }
	    
	    public static WebElement Disable(WebDriver driver){
	        element = driver.findElement(By.linkText("����"));//����
	        return element;
	    }
	    
	    public static WebElement UpButton(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//���ϰ���
	        return element;
	    }
	    
	    public static WebElement AddOther(WebDriver driver){
	        element = driver.findElement(By.id("addOtherBtn"));//������ϵ��-����
	        return element;
	    }
	    
	    public static WebElement Name(WebDriver driver){
	        element = driver.findElement(By.id("name"));//������ϵ��-����
	        return element;
	    }
	    
	    public static WebElement TypeOther(WebDriver driver){
	        element = driver.findElement(By.id("contactRelativesPhone"));//������ϵ��-����
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
	
	    public static WebElement OfficeTelephone(WebDriver driver){
	        element = driver.findElement(By.name("MCRE02"));//�칫�绰��ʵ
	        return element;
	    }
	    
	    public static WebElement OfficeTelephoneFail(WebDriver driver){
	        element = driver.findElement(By.name("MCRE020401"));//�칫�绰�绰��ʵ����֤ʧ��
	        return element;
	    }

	    public static WebElement PhoneCheck(WebDriver driver){
	        element = driver.findElement(By.name("MCRE03"));//�ֻ��绰��ʵ
	        return element;
	    }
	    
	    public static WebElement PhoneFail(WebDriver driver){
	        element = driver.findElement(By.name("MCRE030301"));//�ֻ��绰��ʵ����֤ʧ��
	        return element;
	    }

	    public static WebElement Check(WebDriver driver){
	        element = driver.findElement(By.name("MCRG07"));//�����ж�
	        return element;
	    }
	    
	    public static WebElement FamilyPhone(WebDriver driver){
	        element = driver.findElement(By.name("MCRH07"));//��ͥ��Ա�绰��ʵ
	        return element;
	    }
	    
	    public static WebElement FamilyPhoneFail(WebDriver driver){
	        element = driver.findElement(By.name("MCRH070301"));//��ͥ��Ա�绰��ʵ:��֤ʧ��
	        return element;
	    }
	    
	    public static WebElement Familytelephone(WebDriver driver){
	        element = driver.findElement(By.name("MCRM05"));//�����˼�ͥ�����绰��ʵ
	        return element;
	    }
	    
	    public static WebElement Otherphone(WebDriver driver){
	        element = driver.findElement(By.name("MCRH06"));//������������ϵ�˵��ֻ��绰��ʵ
	        return element;
	    }
	    
	    public static WebElement ID5(WebDriver driver){
	        element = driver.findElement(By.name("MCRG05"));//ID5�칫�绰�˲�
	        return element;
	    }
	    
	    public static WebElement Confirm(WebDriver driver){
	        element = driver.findElement(By.cssSelector("i.fa.fa-check"));//ȷ��
	        return element;
	    }
	    
	    public static WebElement Commit(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.btn-primary"));//�ύ
	        return element;
	    }
	    
	    public static WebElement Determine(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//ȷ��
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
	        element = driver.findElement(By.className("reutrnAppSubmit"));//�˻����-�˻��ύ
	        return element;
	    }
	    
	    public static WebElement SaveOffConfirm(WebDriver driver){
	        element = driver.findElement(By.className("btn green btn-sub myModalPop-ok"));//�ݴ�-ȷ��
	        return element;
	    }
}

