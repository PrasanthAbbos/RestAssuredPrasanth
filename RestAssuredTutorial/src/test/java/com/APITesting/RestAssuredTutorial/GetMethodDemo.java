package com.APITesting.RestAssuredTutorial;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class GetMethodDemo {

	@Test
	public static void getResponseBody() {
		RestAssured.given()
		.when()
		.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
		.then()
		.log()
		.all();
	}

}
