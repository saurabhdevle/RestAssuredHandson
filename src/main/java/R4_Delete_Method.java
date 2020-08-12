import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class R4_Delete_Method {
    public static void main(String[] args) {

        RestAssured.baseURI ="http://dummy.restapiexample.com";
        given()
                .header("Content-Type","application/json")
                .queryParam("id","1656")
                .log().all()
                .when().delete("/public/api/v1/delete")
                .then()
                .log().all();
    }
}
