import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerMain implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		// ""
		System.out.println("STARTED "+ result.getMethod().toString());
		
		System.out.println(result.getClass().getCanonicalName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("SUCCESS "+ result.getMethod().toString());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// ""
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// ""
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// ""
		
	}

	@Override
	public void onStart(ITestContext context) {
		// ""
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// ""
		
	}

}
