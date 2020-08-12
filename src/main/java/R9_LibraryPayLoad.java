import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class R9_LibraryPayLoad {
    public static void main(String[] args) throws IOException {
        /*
        String path = "./src/main/resources/LibraryPayLoad.json";
        String payLoad = generateStringFromResource(path);
        String updatedPayLoad = String.format(payLoad, "chkjhbh", "1657834");
        System.out.println(payLoad);
        System.out.println(updatedPayLoad);*/
createBook();

    }

    public static String generateStringFromResource(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));

    }
public static void createBook() throws IOException {



    String path = "./src/main/resources/LibraryPayLoad.json";
    String payLoad = generateStringFromResource(path);
    String updatedPayLoad = String.format(payLoad, "chkjhbh", "1657834");
    System.out.println(payLoad);
    System.out.println(updatedPayLoad);


    RestAssured.baseURI ="http://216.10.245.166";
    given()
                .header("Content_Type","application/json")
                .log().all()
                .when()
                .post("/Library/Addbook.php")
                .then().log().all();
    



}

}
