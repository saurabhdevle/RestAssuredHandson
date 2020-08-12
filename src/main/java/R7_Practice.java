import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class R7_Practice {

    public static void main(String[] args) {

        RestAssured.baseURI="https://gorest.co.in";
        given()
                .header("ContentType","application/json")
                .header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
                .log().all()
                .body("{\n" +
                        "    \"first_name\": \"Jr.Brian K\",\n" +
                        "    \"last_name\": \"lara\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"email\": \"BL2@roberts.com\",\n" +
                        "    \"status\": \"active\"\n" +
                        "}")
                .log().all()
                .when()
                .post("/public-api/users")
                .then().log().all();

    }

}
