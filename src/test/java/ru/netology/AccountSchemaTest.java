package ru.netology;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class AccountSchemaTest {

    @Test
    void shouldMatchJsonSchema() {

        RestAssured
                .given()
                .baseUri("http://localhost:8080")
                .when()
                .get("/accounts")
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("accounts.schema.json"));
    }
}