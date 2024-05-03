package utils;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import java.util.Map;

public class ApiUtils {

    public static String baseUrl = ConfigUtils.getProperties("base_url");

    public static ValidatableResponse getRequest(String uri, String path) {
        return RestAssured.get(uri + path).then();
    }

    public static ValidatableResponse deleteRequest(String uri, String path, Map<String, String> query) {
        return RestAssured.given().relaxedHTTPSValidation().queryParams(query).delete(uri + path).then();
    }

    public static ValidatableResponse getRequest(String uri, String path, Map<String, String> header,Map<String, String> query) {
        return RestAssured.given().relaxedHTTPSValidation().headers(header).queryParams(query).get(uri + path).then();
    }

    public static ValidatableResponse getRequestWithAllResponse(String uri, String path, Map<String, String> options) {
        return RestAssured.given().relaxedHTTPSValidation().headers(options).get(uri + path).then();
    }

    public static ValidatableResponse getRequestWithQuery(String uri, String path, String query, Map<String, String> header) {
        return RestAssured.given().relaxedHTTPSValidation().headers(header).queryParam(query).get(uri + path).then();
    }

    public static ValidatableResponse postRequest(String uri, String path, String body, Map<String, String> options) {
        return RestAssured.given().relaxedHTTPSValidation().headers(options).body(body).post(uri + path).then();
    }

    public static ValidatableResponse postRequestWithParam(String uri, String path, Map<String, String> query, Map<String, String> options) {
        return RestAssured.given().relaxedHTTPSValidation().headers(options).queryParams(query).post(uri + path).then();
    }

    public static ValidatableResponse putRequestWithParam(String uri, String path, Map<String, String> query, Map<String, String> options) {
        return RestAssured.given().relaxedHTTPSValidation().headers(options).queryParams(query).put(uri + path).then();
    }
}