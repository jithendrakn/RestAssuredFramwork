package api.endpoints;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {

	public static Response createUser(User payload){
		
		Response response = given()
		 	.contentType(ContentType.JSON)
		 	.accept(ContentType.JSON)
		 	.body(payload)
		.when()
			.post(Routes.create_User);
		return response;
	}
}
