import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends TestBase{

    @BeforeMethod(enabled = false)
    public void preconditions(){
        app.alert().selectItemAlert();
        app.alert().selectAlerts();
    }

    @Test
    public void alertTest(){
        app.alert().selectAlerts();
        app.alert().clickToSeeAlert();
        app.alert().pause(4000);

    }

    @Test
    public void alertTestConfirm(){
        app.alert().selectAlerts();
        app.alert().confirmAlert("Ok");
        Assert.assertTrue(app.alert().confirmResult().contains("Ok"));
    }

    @Test
    public void alertTestAfter5Second(){
        app.alert().selectAlerts();
        app.alert().clickOkButton();
    }

    @Test
    public void alertTestPrompt(){
        app.alert().selectAlerts();
        app.alert().enterMessage();
        Assert.assertTrue(app.alert().promptResult().contains("Anna"));
    }
}


