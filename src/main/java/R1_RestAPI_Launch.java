
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
public class R1_RestAPI_Launch {

    public static void main(String[] args) {

System.out.println("Test Rest");

        RestAssured.baseURI ="http://216.10.245.166";
        given()
                .body("{\n" +
                        "    \"name\": \"Bhagvad Geeta\",\n" +
                        "    \"isbn\": \"BGBRSK\",\n" +
                        "    \"aisle\": \"8957202\",\n" +
                        "    \"author\": \"Krisha\"\n" +
                        "}")
                .header("Content_Type","application/json")
                .log().all()
                .when()
                .post("/Library/Addbook.php")
                .then().log().all();



    }
}
