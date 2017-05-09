package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExpertAuditPage {
	 private static WebElement element;
	    
	    public static WebElement GetApp(WebDriver driver){
	        element = driver.findElement(By.id("autoGetLnApp"));//获取工单按键
	        return element;
	    }
	    
	    public static WebElement AppNumber(WebDriver driver){
	        element = driver.findElement(By.id("unAssignAppCount"));//待审核工单数量
	        return element;
	    }
	    
	    public static WebElement Go(WebDriver driver){
	        element = driver.findElement(By.linkText("go"));//go按键
	        return element;
	    }
	    
	    public static WebElement ContinueAudit(WebDriver driver){
	        element = driver.findElement(By.linkText("继续审核"));//继续审核按键
	        return element;
	    }
	    
	    public static WebElement ContinueAudit2(WebDriver driver){
	        element = driver.findElement(By.xpath("(//a[contains(text(),'继续审核')])[2]"));//继续审核2按键
	        return element;
	    }
	    
	    public static WebElement ContinueAudit3(WebDriver driver){
	        element = driver.findElement(By.xpath("(//a[contains(text(),'继续审核')])[3]"));//继续审核3按键
	        return element;
	    }
	    //人工初步审核界面公共元素
	    public static WebElement OpenButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("a.collapse"));//标题伸缩按键
	        return element;
	    }
	    
	    public static WebElement Back(WebDriver driver){
	        element = driver.findElement(By.linkText("返回"));//返回按键
	        return element;
	    }
	    
	    public static WebElement Next(WebDriver driver){
	        element = driver.findElement(By.linkText("下一步"));//下一步按键
	        return element;
	    }
	    
	    public static WebElement App(WebDriver driver){
	       element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[2]"));//工单编号
	       return element;
	    }
	    //图片核实元素
	    public static WebElement NciicAuto(WebDriver driver){
	    	element=driver.findElement(By.xpath("//*[contains(text(),'NCIIC自动检查')]"));//NCIIC自动检查
	        return element;
	    }
	    
	   
	    //证件核实
	    public static WebElement CardCheck(WebDriver driver){
	        element = driver.findElement(By.xpath("//*[contains(text(),'银行卡')]"));//银行卡验卡信息
	        return element;
	    }
	    
	    public static WebElement SellRemarks(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[4]/div[2]"));//销售备注
	        return element;
	    }

	    public static WebElement PySdt(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[5]/div[2]"));//学信网查询结果
	        return element;
	    }
	    

	    //贷款信息核实
	    
	 
	    //关联信息调查
	    public static WebElement RelatedInfo(WebDriver driver){
	        element = driver.findElement(By.linkText("关联信息调查"));//关联信息调查
	        return element;
	    }
	    
	    public static WebElement ContactNum(WebDriver driver){
	        element = driver.findElement(By.name("phoneNum"));//关联信息调查-联系电话
	        return element;
	    }
	    
	    public static WebElement Query(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.btn-primary"));//关联信息调查-查询
	        return element;
	    }
	    
	    //基础信息核实
	    public static WebElement PyCompany(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[5]"));//企业名称/电话互查结果
	        return element;
	    }
	    
	    public static WebElement Rule(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[6]"));//规则提示
	        return element;
	    }
	    
	    public static WebElement MobileRecord(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[7]"));//运营商查询结果
	        return element;
	    }
 
	    public static WebElement Commit(WebDriver driver){
	        element = driver.findElement(By.linkText("提交"));//提交
	        return element;
	    }
	    
	    public static WebElement CommitCom(WebDriver driver){
	        element = driver.findElement(By.id("passComment"));//提交备注
	        return element;
	    }
	    
	    public static WebElement CommitConfirm(WebDriver driver){
	        element = driver.findElement(By.id("passSubmit"));//提交确认
	        return element;
	    }
	    
	    public static WebElement Determine(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//确定
	        return element;
	    }
	    
	    public static WebElement Return(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.red-sunglo"));//退回
	        return element;
	    }
	    
	    public static WebElement ReturnCause(WebDriver driver){
	        element = driver.findElement(By.id("returnCauseSelect"));//退回审核-退回原因
	        return element;
	    }
	    
	    public static WebElement ReturnDesc(WebDriver driver){
	        element = driver.findElement(By.id("returnCauseDesc"));//退回审核-退回意见
	        return element;
	    }
	    
	    public static WebElement ReturnCancle(WebDriver driver){
	        element = driver.findElement(By.className("btn grey"));//退回审核-退回取消
	        return element;
	    }
	    
	    public static WebElement ReturnSubmit(WebDriver driver){
	        element = driver.findElement(By.id("reutrnAppSubmit"));//退回审核-退回提交
	        return element;
	    }
	    
	    public static WebElement ReturnSubmitConfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//退回审核-退回提交确定
	        return element;
	    }
	    
	    public static WebElement Refuse(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.yellow-gold"));//拒绝申请
	        return element;
	    }
	    
	    public static WebElement RefuseCause1(WebDriver driver){
	        element = driver.findElement(By.id("refuseCodes_1Select"));//拒绝原因大类
	        return element;
	    }
	    
	    public static WebElement RefuseCause2(WebDriver driver){
	        element = driver.findElement(By.id("refuseCodes_2Select"));//拒绝原因小类
	        return element;
	    }
	    
	    public static WebElement RefuseOpinion(WebDriver driver){
	        element = driver.findElement(By.id("refuseCauseDesc"));//拒绝意见
	        return element;
	    }
	    
	    public static WebElement RefuseCommit(WebDriver driver){
	        element = driver.findElement(By.cssSelector("#refuseCauseForm > div.modal-footer > #reutrnAppSubmit"));//拒绝提交
	        return element;
	    }
	    
	    public static WebElement RefuseConfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//拒绝提交确定
	        return element;
	    }
}

