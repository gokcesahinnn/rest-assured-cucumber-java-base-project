package caller;

import globals.BoardGlobal;
import requests.CreateBoardRequest;

public class CreateBoardCaller {

    CreateBoardRequest createBoardRequest = new CreateBoardRequest();

    public void createBoard() {
        String id = createBoardRequest.createBoard().extract().response().jsonPath().get("id");
        BoardGlobal.getInstance().setId(id);
    }

}
