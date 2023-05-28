import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {


    @Test(dataProvider = "provider", dataProviderClass = TestProvider.class)
 public void method(int a, int b, int c){
     System.out.println(a+b);
 }
}

