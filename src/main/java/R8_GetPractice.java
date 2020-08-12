import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class R8_GetPractice {

    public static void main(String[] args) {
        RestAssured.baseURI="https://gorest.co.in";
        given()
                .header("ContentType","application/json")
                .header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
                .log().all()
                .queryParam("id","90198")
                .log().all()
                .when()
                .get("/public-api/users")
                .then().log().all();


    }
}
