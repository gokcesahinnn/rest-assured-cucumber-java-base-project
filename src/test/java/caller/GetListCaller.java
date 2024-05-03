package caller;

import globals.BoardGlobal;
import globals.ListGlobal;
import io.restassured.response.ValidatableResponse;
import requests.GetListRequest;


import static org.hamcrest.Matchers.*;

public class GetListCaller {
    GetListRequest getListRequest = new GetListRequest();

    public ValidatableResponse getList() {
        return getListRequest.getListOnBoard(BoardGlobal.getInstance().getId());
    }

    public void verifyListIsExist() {
        getList().assertThat().body("id", hasItem(ListGlobal.getInstance().getId()));
    }

}
