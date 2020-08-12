import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class R8_PayLoad {

    public static void main(String[] args) throws IOException {
        String path = "./src/main/resources/userPayload.json";
        String payLoad = generateStringFromResource(path);

        String updatedPayLoad = String.format(payLoad, "Iron", "Man", "IR001@gmail.com");
        System.out.println(payLoad);
        System.out.println(updatedPayLoad);

    }

    public static String generateStringFromResource(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));

    }

    public static void createNewUser() throws IOException {
        String path = "src\\test\\resources\\userPayload.json";
        String payLoad = generateStringFromResource(path);
        RestAssured.baseURI = "https://gorest.co.in/public-api";
        given()
                .relaxedHTTPSValidation()
                .body(payLoad)
                .header("Authorization", "Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
                .header("Content-Type", "application/json")
                .log().all()
                .when().post("/users")
                .then().log().all();

    }
}

