package Com.GumtreeAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CRUDRequest {
    public static void getdataforid2() {
        Response res = given().
                       when().get("users?id=2").
                       then().assertThat().statusCode(200).extract().response();
        String responseinString = res.asString();
        System.out.println(responseinString);

        //Grab the email FROM THE RESPONSE
        JsonPath JS = new JsonPath(responseinString);
        String email=JS.getString("email");
        System.out.println(email);

    }

}
