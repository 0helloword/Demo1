package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//TestListenerAdapter 已经实现 ITestListener，并且提供了一些有用的方法，
//比如分别获取所有成功失败跳过三种测试结果的测试方法的方法，并且 ITestListner 
//中有很多方法而 TestListenerAdapter 已给出了默认实现。
//因此，继承 TestListenerAdapter 后，便只需关注需要修改的方法。
public class myListener extends TestListenerAdapter{
     
    @Override // @Override是伪代码,表示重写(当然不写也可以)
    public void onTestFailure(ITestResult tr) {
        log(tr.getName()+ "--执行失败\n");
    }
     
    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr.getName()+ "--执行跳过\n");
    }
     
    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr.getName()+ "--执行成功\n");
    }
     
    private void log(String string) {
       System.out.print(string);
    }

}