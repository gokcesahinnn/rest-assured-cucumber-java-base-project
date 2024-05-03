package stepDefinitions;

import caller.CreateCardCaller;
import caller.DeleteCardCaller;
import caller.GetBoardCaller;
import caller.PutCardCaller;
import io.cucumber.java.en.And;

public class CardSteps {
    CreateCardCaller createCardCaller = new CreateCardCaller();
    PutCardCaller putCardCaller = new PutCardCaller();
    DeleteCardCaller deleteCardCaller = new DeleteCardCaller();
    GetBoardCaller getBoardCaller = new GetBoardCaller();

    @And("create card")
    public void createCard() {
        createCardCaller.createCard();
    }

    @And("update random card")
    public void updateCard() {
        putCardCaller.updateCard();
    }

    @And("delete all card")
    public void deleteCard() {
        deleteCardCaller.deleteCard();
    }

    @And("verify board is exist")
    public void getBoard() {
        getBoardCaller.getBoard();
        getBoardCaller.verifyBoardIsExist();
    }
}
