package org.example.ra01;

import io.restassured.RestAssured;

public class Lab01 {
    public static void main(String[] args) {

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);

        System.out.println("Test passed");
    }
}
