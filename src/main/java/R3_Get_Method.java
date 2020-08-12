import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class R3_Get_Method {

    public static void main(String[] args) {

        RestAssured.baseURI ="http://216.10.245.166";
        given()
                .header("Content_Type","application/json")
                .log().all()
                .queryParam("AuthorName","Krisha")
                .queryParam("username","skd")
                .when()
                .get("/Library/GetBook.php")
                .then().log().all();
    }
}
