import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTest extends TestBase{

    @BeforeMethod(enabled = false)
    public void preconditions(){
        app.alert().selectItemAlert();
        app.windows().selectBrowserWindows();
    }

    @Test
    public void fromToWindowsTest(){
        app.windows().selectBrowserWindows();
        app.alert().clickNewWindow();
        Assert.assertTrue(app.windows().getTextNewTab().contains("sample"));

    }
}
