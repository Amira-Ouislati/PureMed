package CreationNvPatient;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener {

	public class Listener_ImpEcr implements ITestListener {

		@Override
		public void onTestFailure(ITestResult result) {
			Base base = new Base();
			try {
				base.Imprime_Ecran();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
