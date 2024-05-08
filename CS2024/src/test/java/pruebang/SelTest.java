package pruebang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelTest {
  @Test
  public void test01() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://github.com/Pandragor08/QAfinvero/blob/master/CS2024/src/test/java/pruebang/SelTest.java");
  }
}
