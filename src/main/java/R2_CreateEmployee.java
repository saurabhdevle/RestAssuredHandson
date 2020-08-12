import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class R2_CreateEmployee {

    public static void main(String[] args) {

        RestAssured.baseURI ="http://dummy.restapiexample.com";
        given()
                .body("{\n" +
                        "    \"name\": \"SaurabhD\",\n" +
                        "    \"salary\": \"300500\",\n" +
                        "    \"age\": \"30\"\n" +
                        "}")
                .header("Content-Type","application/json")
                .log().all()
                .when()
                .post("/api/v1/create")
                .then().log().all();
    }

}
