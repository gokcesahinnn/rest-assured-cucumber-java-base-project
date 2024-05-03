package stepDefinitions;

import caller.CreateListCaller;
import caller.GetListCaller;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ListSteps {
    CreateListCaller createListCaller = new CreateListCaller();
    GetListCaller getListCaller = new GetListCaller();
    @And("create list with board")
    public void createListWithBoard() {
        createListCaller.createListWithBoard();
    }

    @And("create list without board")
    public void createListWithoutBoard() {
        createListCaller.createListWithoutBoard();
    }

    @Then("verify list is exist")
    public void verifyListIsExist() {
        getListCaller.getList();
        getListCaller.verifyListIsExist();
    }
}
