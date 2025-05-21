package com.example.TicTacToe;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

//Starts a web server on a random port for testing
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HealthCheckTest {

    //Spring injects a random port number here
    @LocalServerPort
    private int port;

    @Test
    void returnJsonResponseForHealthCheckEndpoint() {
        given()//given the following context
                .port(port) // Use the random port that Spring assigned earlier
                .when()
                .get("/actuator/health") // Request the health endpoint url
                .then()
                .assertThat().contentType(ContentType.JSON) // Verify that it's JSON
                .assertThat().body("status", equalTo("UP")); // Verify that the status is UP
    }

}