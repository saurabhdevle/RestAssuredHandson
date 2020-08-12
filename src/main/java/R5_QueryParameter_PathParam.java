import io.restassured.RestAssured;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class R5_QueryParameter_PathParam {

    public static void main(String[] args) {

        RestAssured.baseURI ="http://216.10.245.166";

        HashMap map = new HashMap<String,String>();
        map.put("AuthorName","Krisha");
        map.put("username","india");
        map.put("password","Pune");
        map.put("age","30");
        given()
                .header("Content_Type","application/json")
                .log().all()
              //  .queryParam("AuthorName","Krisha")
               // .queryParam("username","skd")
                .queryParams(map)
                .when()
                .get("/Library/GetBook.php")
                .then().log().all();
    }
}
