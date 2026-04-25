import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AuthIntergrationTest {
    @BeforeAll
    static void setUp(){
        RestAssured.baseURI="http://localhost:4004";
    }
   @Test
    public void shouldReturnOKWithValidToken(){
        
    }
}
