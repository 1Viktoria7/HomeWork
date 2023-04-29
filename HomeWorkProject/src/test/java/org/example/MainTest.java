package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @BeforeEach
    public void initEach(){
        RestAssured.baseURI = "https://api.openweathermap.org/data/2.5/weather";
    }

    //Тест проверяет успешно ли отправляется запрос с большим набором параметров.
    @Test
    public void shouldGetWeatherWithManyParams() {
        given()
                .param("q", "London")
                .param("units", "metric")
                .param("lang", "ru")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then().statusCode(200)
                .contentType(ContentType.JSON);
    }

    //Тест проверяет успешно ли отправляется запрос с малым набором параметров.
    @Test
    public void shouldGetWeatherWithFewParams() {
        given()
                .param("q", "London")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then().statusCode(200)
                .contentType(ContentType.JSON);
    }

    //Отправляется запрос с несуществующим городом
    @Test
    public void shouldGetWeatherNegative() {
        given()
                .param("q","MosLo")
                .param("units", "metric")
                .param("lang", "ru")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then().statusCode(404);
    }

    //Отправляем запрос с параметром и проверяем, что ответ содержит в себе название города.
    @Test
    public void shouldGetCityNameFromBody() {
        given()
                .param("q", "London")
                .param("units", "metric")
                .param("lang", "ru")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then().body("name", equalTo("Лондон"));
    }

   //Тест проверяет, что мы получаем корректные координаты.
   @Test
    public void shouldGetCoordFromBody() {
        given()
                .param("lon", "37")
                .param("lat", "55")
                .param("lang", "ru")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then()
                .body("coord.lon", equalTo(37))
                .body("coord.lat",equalTo(55));

    }

    // Тест проверяет, что ответ от сервера не Null.
    @Test
    public void shouldGetNotNullFromBody() {
        Response response = given()
                .param("q", "London")
                .param("units", "metric")
                .param("lang", "ru")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then().extract().response();
                assertNotNull(response.path(""));
    }

    //Получаем город по координатам.
    @Test
    public void shouldGetCityNameByCoord() {
        given()
                .param("lon", "37")
                .param("lat", "55")
                .param("lang", "ru")
                .param("mode", "json")
                .param("appid", "ab26a2beceb94848c646c4bcc3554a2b")
                .when().get()
                .then()
                .body("name", equalTo("Маринки"));
    }

    //Тест проверяет, что без апи ключа вернется 401 код ответа.
    @Test
    public void shouldGetFailed() {
        given()
                .param("q", "London")
                .param("units", "metric")
                .param("lang", "ru")
                .param("mode", "json")
                .when().get()
                .then().statusCode(401);
    }
}