package caller;

import globals.BoardGlobal;
import io.restassured.response.ValidatableResponse;
import requests.GetBoardRequest;

public class GetBoardCaller {
    GetBoardRequest getBoardRequest = new GetBoardRequest();
    public ValidatableResponse getBoard() {
        return getBoardRequest.getBoardWithId(BoardGlobal.getInstance().getId());
    }

    public void verifyBoardIsExist(){
        getBoard().assertThat().statusCode(200);
    }

    public void verifyBoardIsNotExist(){
        getBoard().assertThat().statusCode(404);
    }

}
