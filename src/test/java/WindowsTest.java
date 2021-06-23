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

    @Test
    public void fromToNewWindowTest(){
        app.windows().selectBrowserWindows();
        app.alert().clickToOpenWindow();
        Assert.assertTrue(app.windows().getTextNewWindow().contains("sample page"));

    }

    @Test
    public void fromToNewWindowMassageTest(){
        app.windows().selectBrowserWindows();
        app.alert().clickToNewWindowMassage();
      //  Assert.assertTrue(app.windows().getTextMassage().contains("Knowledge increases"));
    }
}
