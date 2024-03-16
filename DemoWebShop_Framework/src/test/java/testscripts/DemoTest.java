package testscripts;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;

public class DemoTest extends BaseTest{
	@Test
	public void test() throws IOException {
		Reporter.log("Script_01",true);
	}
}
