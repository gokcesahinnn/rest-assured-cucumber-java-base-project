package requests;

import io.restassured.response.ValidatableResponse;
import utils.ApiUtils;
import utils.ConfigUtils;

import java.util.HashMap;
import java.util.Map;

public class GetBoardRequest extends ApiUtils {
    Map<String, String> queryParams = new HashMap<>();
    Map<String, String> headersOpt = new HashMap<>();

    public ValidatableResponse getBoardWithId(String boardId) {
        queryParams.put("key", ConfigUtils.getProperties("api_key"));
        queryParams.put("token", ConfigUtils.getProperties("token"));
        headersOpt.put("Content-Type", "application/json");
        return getRequest(baseUrl, "/boards/" + boardId, headersOpt, queryParams);
    }
}
