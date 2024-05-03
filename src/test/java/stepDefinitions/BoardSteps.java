package stepDefinitions;

import caller.CreateBoardCaller;
import caller.DeleteBoardCaller;
import caller.GetBoardCaller;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BoardSteps {

    GetBoardCaller getBoardCaller = new GetBoardCaller();
    CreateBoardCaller createBoardCaller = new CreateBoardCaller();
    DeleteBoardCaller deleteBoardCaller = new DeleteBoardCaller();

    @And("create board")
    public void createBoard() {
        createBoardCaller.createBoard();
    }

    @And("delete board")
    public void deleteBoard() {
        deleteBoardCaller.deleteBoard();
    }

    @Then("verify board is deleted")
    public void verifyBoardIsDeleted() {
        getBoardCaller.verifyBoardIsNotExist();
    }
}
