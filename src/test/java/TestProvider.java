import org.testng.annotations.DataProvider;

public class TestProvider {
    @DataProvider(name = "provider")
    public static Object[][] dataProvider() {
        Object[][] newData = new Object[3][3];
        newData[0][0] = 123;
        newData[0][1] = 266477;
        newData[0][2] = 236;
        newData[1][0] = 536677878;
        newData[1][1] = 846638839;
        newData[1][2] = 575388999;
        newData[2][0] = 12564;
        newData[2][1] = 638665899;
        newData[2][2] = 123457838;

        return newData;
    }
}
