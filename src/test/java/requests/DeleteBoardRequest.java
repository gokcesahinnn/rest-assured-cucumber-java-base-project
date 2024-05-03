package requests;

import io.restassured.response.ValidatableResponse;
import utils.ApiUtils;
import utils.ConfigUtils;

import java.util.HashMap;
import java.util.Map;

public class DeleteBoardRequest extends ApiUtils {
    Map<String, String> queryParams = new HashMap<>();
    Map<String, String> headersOpt = new HashMap<>();

    public ValidatableResponse deleteBoard(String boardId) {
        queryParams.put("key", ConfigUtils.getProperties("api_key"));
        queryParams.put("token", ConfigUtils.getProperties("token"));
        headersOpt.put("Content-Type", "application/json");
        return deleteRequest(baseUrl, "/boards/" + boardId, queryParams);
    }
}
