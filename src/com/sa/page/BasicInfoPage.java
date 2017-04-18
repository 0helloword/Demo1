package com.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicInfoPage {
	private static WebElement element;
    
    public static WebElement issuingOrgan(WebDriver driver){
        element = driver.findElement(By.name("issuingOrgan"));//签发机关
        return element;
    }
    
    public static WebElement idCardValidity(WebDriver driver){
        element = driver.findElement(By.id("idCardValidity"));//有效期
        return element;
    }
    
    public static WebElement today(WebDriver driver){
        element = driver.findElement(By.className("today"));//有效期-today
        return element;
    }
    
    public static WebElement degree(WebDriver driver){
        element = driver.findElement(By.id("degree"));//教育程度
        return element;
    }
    
    public static WebElement emaill(WebDriver driver){
        element = driver.findElement(By.id("emaill"));//电子邮箱
        return element;
    }

    public static WebElement qqCode(WebDriver driver){
        element = driver.findElement(By.name("qqCode"));//QQ号码
        return element;
    }
    
    public static WebElement marry(WebDriver driver){
        element = driver.findElement(By.name("marry"));//婚姻状况
        return element;
    }
    
    public static WebElement liveCondition(WebDriver driver){
        element = driver.findElement(By.name("liveCondition"));//住房状况
        return element;
    }
    
    public static WebElement householdProv(WebDriver driver){
        element = driver.findElement(By.id("householdProv"));//户籍地址-省
        return element;
    }
    
    public static WebElement householdCity(WebDriver driver){
        element = driver.findElement(By.id("householdCity"));//户籍地址-市
        return element;
    }
    
    public static WebElement householdTown(WebDriver driver){
        element = driver.findElement(By.id("householdTown"));//户籍地址-区
        return element;
    }
    
    public static WebElement householdZhen(WebDriver driver){
        element = driver.findElement(By.id("householdZhen"));//户籍地址-镇
        return element;
    }
    
    public static WebElement householdStr(WebDriver driver){
        element = driver.findElement(By.id("householdStr"));//户籍地址-路
        return element;
    }
    
    public static WebElement householdRidge(WebDriver driver){
        element = driver.findElement(By.id("householdRidge"));//户籍地址-楼盘
        return element;
    }
    
    public static WebElement householdHome(WebDriver driver){
        element = driver.findElement(By.id("householdHome"));//户籍地址-门牌号
        return element;
    }
    
    public static WebElement addreRegist(WebDriver driver){
        element = driver.findElement(By.id("addreRegist"));//户籍与地址
        return element;
    }
    
    public static WebElement liveProv(WebDriver driver){
        element = driver.findElement(By.id("liveProv"));//居住地址-省
        return element;
    }
    
    public static WebElement liveCity(WebDriver driver){
        element = driver.findElement(By.id("liveCity"));//居住地址-市
        return element;
    }
    
    public static WebElement liveTown(WebDriver driver){
        element = driver.findElement(By.id("liveTown"));//居住地址-区
        return element;
    }
    
    public static WebElement liveZhen(WebDriver driver){
        element = driver.findElement(By.id("liveZhen"));//居住地址-镇
        return element;
    }
    
    public static WebElement liveStr(WebDriver driver){
        element = driver.findElement(By.id("liveStr"));//居住地址-路
        return element;
    }
    
    public static WebElement liveRidge(WebDriver driver){
        element = driver.findElement(By.id("liveRidge"));//居住地址-楼盘
        return element;
    }
    
    public static WebElement liveHome(WebDriver driver){
        element = driver.findElement(By.id("liveHome"));//居住地址-门牌号
        return element;
    }

    public static WebElement postState(WebDriver driver){
        element = driver.findElement(By.name("postState"));//邮寄地址
        return element;
    }
    
    public static WebElement monthlyIncome(WebDriver driver){
        element = driver.findElement(By.id("monthlyIncome"));//月收入
        return element;
    }
    
    public static WebElement familyIncome(WebDriver driver){
        element = driver.findElement(By.id("familyIncome"));//家庭收入
        return element;
    }
    
    public static WebElement monthlySpending(WebDriver driver){
        element = driver.findElement(By.id("monthlySpending"));//月支出
        return element;
    }
   
    public static WebElement firstWorktime(WebDriver driver){
        element = driver.findElement(By.id("firstWorktime"));//首次工作年份
        return element;
    }
    
    public static WebElement Worktime(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[6]/div[3]/table/tbody/tr/td/span[5]"));//首次工作年份-年份
        return element;
    }
    
    public static WebElement industry(WebDriver driver){
        element = driver.findElement(By.id("industry"));//行业类别
        return element;
    }
    
    public static WebElement unitname(WebDriver driver){
        element = driver.findElement(By.name("unitname"));//现单位名称
        return element;
    }
    
    public static WebElement department(WebDriver driver){
        element = driver.findElement(By.name("department"));//任职部门
        return element;
    }
   
    public static WebElement industryType(WebDriver driver){
        element = driver.findElement(By.id("industryType"));//行业细分
        return element;
    }
    
    public static WebElement careerType(WebDriver driver){
        element = driver.findElement(By.id("careerType"));//职业类别
        return element;
    }
    
    public static WebElement unitPhone(WebDriver driver){
        element = driver.findElement(By.name("unitPhone"));//单位电话
        return element;
    }
    
    public static WebElement duty(WebDriver driver){
        element = driver.findElement(By.name("duty"));//职位级别
        return element;
    }
  
    public static WebElement unitWorktime(WebDriver driver){
        element = driver.findElement(By.name("unitWorktime"));//现单位工作时长
        return element;
    }

    public static WebElement unitAddre(WebDriver driver){
        element = driver.findElement(By.id("unitAddre"));//单位地址-省
        return element;
    }
    
    public static WebElement unitCity(WebDriver driver){
        element = driver.findElement(By.id("unitCity"));//单位地址-市
        return element;
    }
    
    public static WebElement unitTown(WebDriver driver){
        element = driver.findElement(By.id("unitTown"));//单位地址-区
        return element;
    }
    
    public static WebElement unitZhen(WebDriver driver){
        element = driver.findElement(By.name("unitZhen"));//单位地址-镇
        return element;
    }
    
    public static WebElement unitRidge(WebDriver driver){
        element = driver.findElement(By.name("unitRidge"));//单位地址-路
        return element;
    }
    
    public static WebElement unitStr(WebDriver driver){
        element = driver.findElement(By.name("unitStr"));//单位地址-楼盘
        return element;
    }
    
    public static WebElement unitHome(WebDriver driver){
        element = driver.findElement(By.name("unitHome"));//单位地址-门牌号
        return element;
    }
    
  //联系人信息
    public static WebElement contractType(WebDriver driver){
        element = driver.findElement(By.id("contractType_0"));//家庭联系人
        return element;
    }
    
    public static WebElement contractname(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[0].contractName"));//家庭联系人-姓名
        return element;
    }
    
    public static WebElement contractphone(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[0].contractPhone"));//家庭联系人-电话
        return element;
    }
    
    public static WebElement contractWeixin(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[0].contactWeixin"));//家庭联系人-微信
        return element;
    }
    
    public static WebElement uncontractType(WebDriver driver){
        element = driver.findElement(By.id("contractType_1"));//非家庭联系人
        return element;
    }
    
    public static WebElement uncontractname(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[1].contractName"));//非家庭联系人-姓名
        return element;
    }
    
    public static WebElement uncontractphone(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[1].contractPhone"));//非家庭联系人-电话
        return element;
    }
    
    public static WebElement uncontractWeixin(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[1].contactWeixin"));//非家庭联系人-微信
        return element;
    }

    //协审信息
    public static WebElement xieshen1(WebDriver driver){
        element = driver.findElement(By.name("checkApplyInfo"));
        return element;
    }
    
    public static WebElement xieshen2(WebDriver driver){
        element = driver.findElement(By.name("mattersNeed"));
        return element;
    }
    
    public static WebElement xieshen3(WebDriver driver){
        element = driver.findElement(By.name("checkMobile"));
        return element;
    }
    
    public static WebElement xieshen4(WebDriver driver){
        element = driver.findElement(By.name("checkTel"));
        return element;
    }
    
    //其他信息
    public static WebElement accompany(WebDriver driver){
        element = driver.findElement(By.name("accompany"));//陪同人数
        return element;
    }
    
    public static WebElement accApply(WebDriver driver){
        element = driver.findElement(By.name("accApply"));//陪同人是否申请
        return element;
    }
    
    public static WebElement accName(WebDriver driver){
        element = driver.findElement(By.name("accName"));//陪同人姓名
        return element;
    }
    
    public static WebElement accMobile(WebDriver driver){
        element = driver.findElement(By.name("accMobile"));//陪同人电话
        return element;
    }

    public static WebElement mobileBrand(WebDriver driver){
        element = driver.findElement(By.name("mobileBrand"));//客户使用手机品牌
        return element;
    }

    public static WebElement stortFamKm(WebDriver driver){
        element = driver.findElement(By.name("stortFamKm"));//门店与家庭住址距离
        return element;
    }
    
    public static WebElement famComKm(WebDriver driver){
        element = driver.findElement(By.name("famComKm"));//门店与工作单位距离
        return element;
    }
    
    public static WebElement stortComKm(WebDriver driver){
        element = driver.findElement(By.name("stortComKm"));//家庭住址与工作单位距离
        return element;
    }
 
    //验证信息
    public static WebElement userEvaluate(WebDriver driver){
        element = driver.findElement(By.name("userEvaluate"));//内部代码
        return element;
    }
    
    public static WebElement userEvaluateCode(WebDriver driver){
        element = driver.findElement(By.name("userEvaluateCode"));//密码
        return element;
    }
  
    public static WebElement commit(WebDriver driver){
        element = driver.findElement(By.id("save_but"));//提交
        return element;
    }

    public static WebElement save(WebDriver driver){
        element = driver.findElement(By.id("draft_but"));//保存草稿
        return element;
    }
  
}
