
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class R6_pathParam {

    public static void main(String[] args) {

        RestAssured.baseURI ="http://dummy.restapiexample.com";
        given()
                .header("Content_Type","application/json")
                .log().all()
                .body("{\n" +
                        "    \"name\": \"Emp06\"\n" +
                        "    \"salary\": \"400000\",\n" +
                        "    \"age\": \"30\"\n" +
                        "}")
                .log().all()
                .when()
                .post("/api/v1/create")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .log().all();


// when we get random ids then to handle these kind of things we use path param
        String deleteEndPoint ="http://dummy.restapiexample.com/api/v1/delete/{id}";
        String id ="8720";
        String endPoint = deleteEndPoint + id;

        given()
                .log().all()
                .pathParam("id","id")
                .when()
                .delete(endPoint)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();



        String CreateBook = "http://216.10.245.166/Library/Addbook.php";

        given()
                .body("{\n" +
                        "    \"name\": \"ShriBhagvadGeetaRahasya\",\n" +
                        "    \"isbn\": \"ACEG1\",\n" +
                        "    \"aisle\": \"010203\",\n" +
                        "    \"author\": \"Saurabh\"\n" +
                        "}")
                .header("Content-Type","application/json")
                .log().all()
                .when()
                .post(CreateBook)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();


        String deleteBook = "http://216.10.245.166/Library/DeleteBook.php/{book}";
        String bookid = "ABCDF20200802";

        String End_Point = deleteBook + bookid;
        given()
                .log().all()
                .pathParam("book","id")
                .when()
                .delete(End_Point)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();






    }
}
