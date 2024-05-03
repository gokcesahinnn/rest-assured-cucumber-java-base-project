package requests;

import io.restassured.response.ValidatableResponse;
import utils.ApiUtils;
import utils.ConfigUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CreateCardRequest extends ApiUtils {

    Random rnd = new Random();
    Map<String, String> queryParams = new HashMap<>();
    Map<String, String> headersOpt = new HashMap<>();

    public ValidatableResponse createCard(String listId) {
        queryParams.put("idList", listId);
        queryParams.put("name", "TrelloCard" + rnd.nextInt(1000));
        queryParams.put("key", ConfigUtils.getProperties("api_key"));
        queryParams.put("token", ConfigUtils.getProperties("token"));
        headersOpt.put("Content-Type", "application/json");
        return postRequestWithParam(baseUrl, "/cards", queryParams, headersOpt);
    }
}
