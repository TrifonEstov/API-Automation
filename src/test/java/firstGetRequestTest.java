import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class firstGetRequestTest {

    @Test
    public void GetInfo_VerifyStatuscode() {

        RestAssured.given()
            .baseUri("https://m-staging.phyreapp.com/api/12/1")
        .when()
            .get("/info")
        .then()
            .statusCode(200)
            .statusLine("HTTP/1.1 200 ")
            .body("environment", Matchers.equalTo("staging"))
            .body("version", Matchers.equalTo("release-12.2.3-51-g75c7640"));

    }
}
