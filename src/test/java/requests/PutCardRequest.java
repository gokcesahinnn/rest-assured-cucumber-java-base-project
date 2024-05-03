package requests;

import io.restassured.response.ValidatableResponse;
import utils.ApiUtils;
import utils.ConfigUtils;

import java.util.Random;
import java.util.HashMap;
import java.util.Map;


public class PutCardRequest extends ApiUtils {

    Random rnd = new Random();
    Map<String, String> queryParams = new HashMap<>();
    Map<String, String> headersOpt = new HashMap<>();

    public ValidatableResponse putCard(String cardId) {
        queryParams.put("name", "TrelloNewCard" + rnd.nextInt(1000));
        queryParams.put("key", ConfigUtils.getProperties("api_key"));
        queryParams.put("token", ConfigUtils.getProperties("token"));
        headersOpt.put("Content-Type", "application/json");
        return putRequestWithParam(baseUrl, "/cards/" + cardId, queryParams, headersOpt);
    }
}
