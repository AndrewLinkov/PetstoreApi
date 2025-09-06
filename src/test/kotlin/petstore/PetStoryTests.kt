package petstore

import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test

class PetStoryTests {

    var BASE_URL: String = "https://petstore.swagger.io/v2/"

    @Test
    fun getPet() {
        given()
            .baseUri(BASE_URL)
            .`when`()
            .get("pet/1")
            .then()
            .statusCode(200)
            .log().all()
    }

    @Test
    fun postNewPet() {
        given()
            .baseUri(BASE_URL)
            .`when`()
            .post("pet")
            .then()
            .statusCode(200) // Проверка статус-кода ответа
            .log().all() // Логирование всего ответа для отладки
    }

}
