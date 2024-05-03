package caller;

import globals.BoardGlobal;
import requests.DeleteBoardRequest;

public class DeleteBoardCaller {
    DeleteBoardRequest deleteBoardRequest = new DeleteBoardRequest();

    public void deleteBoard() {
        deleteBoardRequest.deleteBoard(BoardGlobal.getInstance().getId());
    }

}
