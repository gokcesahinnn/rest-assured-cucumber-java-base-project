package caller;

import globals.BoardGlobal;
import globals.ListGlobal;
import io.restassured.response.ValidatableResponse;
import requests.CreateListRequest;

public class CreateListCaller {

    CreateListRequest createListRequest = new CreateListRequest();
    CreateBoardCaller createBoardCaller = new CreateBoardCaller();
    ListGlobal listGlobal = ListGlobal.getInstance();
    BoardGlobal boardGlobal = BoardGlobal.getInstance();

    public void createListWithBoard() {
        createBoardCaller.createBoard();
        ValidatableResponse response = createListRequest.createList(boardGlobal.getId());
        String id = response.extract().response().jsonPath().get("id");
        listGlobal.setId(id);
    }

    public void createListWithoutBoard() {
        ValidatableResponse response = createListRequest.createList(boardGlobal.getId());
        String id = response.extract().response().jsonPath().get("id");
        listGlobal.setId(id);
    }
}
