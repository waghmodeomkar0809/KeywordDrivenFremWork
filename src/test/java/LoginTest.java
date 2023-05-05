import engine.KeywordEngine;
import org.testng.annotations.Test;

public class LoginTest {
    KeywordEngine keywordEngine;


    @Test
    public void facebookLoginTest(){
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("facebookFrameWork");
    }
    @Test
    public void loginTest(){
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("Login");
    }

}
