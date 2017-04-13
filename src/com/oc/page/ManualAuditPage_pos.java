package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManualAuditPage_pos {
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
	    //人工初步审核界面公共元素
	    public static WebElement OpenButton(WebDriver driver){
	        element = driver.findElement(By.className("collapse"));//标题伸缩按键
	        return element;
	    }
	    
	    public static WebElement Back(WebDriver driver){
	        element = driver.findElement(By.linkText("返回"));//返回按键
	        return element;
	    }
	    
	    public static WebElement SaveOff(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.grey-steel"));//暂存按键
	        return element;
	    }
	    
	    public static WebElement SaveOffComfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[10]"));//暂存确定
	        return element;
	    }
	    
	    public static WebElement Return(WebDriver driver){
	        element = driver.findElement(By.linkText("退回"));//退回审核按键
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
	    
	    public static WebElement NciicCheck(WebDriver driver){
	        element = driver.findElement(By.name("MCRG01"));//NCIIC人工检查
	        return element;
	    }
	    
	    public static WebElement NciicPic(WebDriver driver){
	        element = driver.findElement(By.name("MCRG02"));//NCIIC照片对比
	        return element;
	    }
	    
	    public static WebElement Remarks(WebDriver driver){
	        element = driver.findElement(By.name("MCRG0T"));//备注
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
	    
	    public static WebElement SheBao(WebDriver driver){
	        element = driver.findElement(By.name("MCRG03"));//社保核实
	        return element;
	    }
	    
	    public static WebElement XueXin(WebDriver driver){
	        element = driver.findElement(By.name("MCRG11"));//学信网核实
	        return element;
	    }
	    
	    public static WebElement StorePic(WebDriver driver){
	        element = driver.findElement(By.name("MCRG17"));//门店照片比对
	        return element;
	    }
	    
	    public static WebElement SellPic(WebDriver driver){
	        element = driver.findElement(By.name("PSA01"));//销售照片比对
	        return element;
	    }
	    //贷款信息核实
	    //电话仓库
	    public static WebElement Phone(WebDriver driver){
	        element = driver.findElement(By.xpath("(//a[contains(text(),'电话仓库')])[2]"));//电话仓库
	        return element;
	    }
	    
	    public static WebElement AddSelf(WebDriver driver){
	        element = driver.findElement(By.id("addSelfBtn"));//本人联系信息-新增
	        return element;
	    }
	    
	    public static WebElement Type(WebDriver driver){
	        element = driver.findElement(By.id("contactCategoryPhone"));//本人联系信息-类型
	        return element;
	    }
	    
	    public static WebElement Contact(WebDriver driver){
	        element = driver.findElement(By.id("contact"));//联系号码
	        return element;
	    }
	    
	    public static WebElement State(WebDriver driver){
	        element = driver.findElement(By.id("state"));//状态
	        return element;
	    }
	    
	    public static WebElement Remark(WebDriver driver){
	        element = driver.findElement(By.id("remark"));//备注
	        return element;
	    }
	    
	    public static WebElement Save(WebDriver driver){
	        element = driver.findElement(By.linkText("保存"));//保存
	        return element;
	    }
	    
	    public static WebElement Cancle(WebDriver driver){
	        element = driver.findElement(By.linkText("取消"));//取消
	        return element;
	    }
	    
	    public static WebElement Disable(WebDriver driver){
	        element = driver.findElement(By.linkText("禁用"));//禁用
	        return element;
	    }
	    
	    public static WebElement UpButton(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//向上按键
	        return element;
	    }
	    
	    public static WebElement AddOther(WebDriver driver){
	        element = driver.findElement(By.id("addOtherBtn"));//其他联系人-新增
	        return element;
	    }
	    
	    public static WebElement Name(WebDriver driver){
	        element = driver.findElement(By.id("name"));//其他联系人-姓名
	        return element;
	    }
	    
	    public static WebElement TypeOther(WebDriver driver){
	        element = driver.findElement(By.id("contactRelativesPhone"));//其他联系人-类型
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
	
	    public static WebElement OfficeTelephone(WebDriver driver){
	        element = driver.findElement(By.name("MCRE02"));//办公电话核实
	        return element;
	    }
	    
	    public static WebElement OfficeTelephoneFail(WebDriver driver){
	        element = driver.findElement(By.name("MCRE020401"));//办公电话电话核实：验证失败
	        return element;
	    }

	    public static WebElement PhoneCheck(WebDriver driver){
	        element = driver.findElement(By.name("MCRE03"));//手机电话核实
	        return element;
	    }
	    
	    public static WebElement PhoneFail(WebDriver driver){
	        element = driver.findElement(By.name("MCRE030301"));//手机电话核实：验证失败
	        return element;
	    }

	    public static WebElement Check(WebDriver driver){
	        element = driver.findElement(By.name("MCRG07"));//主观判断
	        return element;
	    }
	    
	    public static WebElement FamilyPhone(WebDriver driver){
	        element = driver.findElement(By.name("MCRH07"));//家庭成员电话核实
	        return element;
	    }
	    
	    public static WebElement FamilyPhoneFail(WebDriver driver){
	        element = driver.findElement(By.name("MCRH070301"));//家庭成员电话核实:验证失败
	        return element;
	    }
	    
	    public static WebElement Familytelephone(WebDriver driver){
	        element = driver.findElement(By.name("MCRM05"));//申请人家庭座机电话核实
	        return element;
	    }
	    
	    public static WebElement Otherphone(WebDriver driver){
	        element = driver.findElement(By.name("MCRH06"));//申请人其他联系人的手机电话核实
	        return element;
	    }
	    
	    public static WebElement ID5(WebDriver driver){
	        element = driver.findElement(By.name("MCRG05"));//ID5办公电话核查
	        return element;
	    }
	    
	    public static WebElement Confirm(WebDriver driver){
	        element = driver.findElement(By.cssSelector("i.fa.fa-check"));//确认
	        return element;
	    }
	    
	    public static WebElement Commit(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.btn-primary"));//提交
	        return element;
	    }
	    
	    public static WebElement Determine(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[8]"));//确定
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
	        element = driver.findElement(By.className("reutrnAppSubmit"));//退回审核-退回提交
	        return element;
	    }
	    
	    public static WebElement SaveOffConfirm(WebDriver driver){
	        element = driver.findElement(By.className("btn green btn-sub myModalPop-ok"));//暂存-确定
	        return element;
	    }
}

