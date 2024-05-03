package requests;

import globals.ListGlobal;
import io.restassured.response.ValidatableResponse;
import utils.ApiUtils;
import utils.ConfigUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CreateListRequest extends ApiUtils {

    Random rnd = new Random();
    Map<String, String> queryParams = new HashMap<>();
    Map<String, String> headersOpt = new HashMap<>();


    public ValidatableResponse createList(String boardId) {
        String name = "TrelloList" + rnd.nextInt(1000);
        ListGlobal.getInstance().setName(name);
        queryParams.put("idBoard", boardId);
        queryParams.put("name", name);
        queryParams.put("key", ConfigUtils.getProperties("api_key"));
        queryParams.put("token", ConfigUtils.getProperties("token"));
        headersOpt.put("Content-Type", "application/json");
        return postRequestWithParam(baseUrl, "/lists", queryParams, headersOpt);
    }

}
