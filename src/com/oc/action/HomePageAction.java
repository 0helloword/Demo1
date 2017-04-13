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
	public void AppQuery() {
		HomePage.AppQuery(driver).click();
	
	}
	
	// �˹����
	public void ManualAudit() {
		HomePage.ManualAudit(driver).click();
		}
	
	//�������-pos
	public void FirstAuditPos() throws InterruptedException {
		Thread.sleep(2000);
		HomePage.FirstAuditPos(driver).click();
		}
	
	//��˷ֵ�-pos
	public void AuditAllotPos() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.AuditAllotPos(driver).click();
		}
	
	// ר������
	public void ExpertAudit() throws InterruptedException {
		Thread.sleep(5000);
		HomePage.ExpertAudit(driver).click();
		}
	
	//��������-pos
		public void ExpertAuditPos() throws InterruptedException {
			Thread.sleep(2000);
			HomePage.ExpertAuditPos(driver).click();
			}
		
	//�����ֵ�-pos
		public void ExpertAllotPos() throws InterruptedException {
			Thread.sleep(1000);
			HomePage.ExpertAllotPos(driver).click();
			}
	
	
    //����driver
    public WebDriver ReturnDriver(){
        return this.driver;
    }   
    
}
    
   
 