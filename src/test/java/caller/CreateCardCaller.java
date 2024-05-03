package caller;

import globals.CardGlobal;
import globals.ListGlobal;
import io.restassured.response.ValidatableResponse;
import requests.CreateCardRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateCardCaller {

    CreateCardRequest createCardRequest = new CreateCardRequest();
    ListGlobal listGlobal = ListGlobal.getInstance();

    public void createCard() {
        ValidatableResponse firstCard = createCardRequest.createCard(listGlobal.getId());
        ValidatableResponse secondCard = createCardRequest.createCard(listGlobal.getId());
        String firstCardId = firstCard.extract().response().jsonPath().get("id");
        String secondCardId = secondCard.extract().response().jsonPath().get("id");
        List<String> cardIdList = new ArrayList<>();
        cardIdList.add(firstCardId);
        cardIdList.add(secondCardId);
        CardGlobal.getInstance().setCardIdList(cardIdList);
        getRandomCard();
    }

    public String getRandomCard() {
        Random rand = new Random();
        List<String> cardIdList = CardGlobal.getInstance().getCardIdList();
        int randomIndex = rand.nextInt(cardIdList.size());
        return cardIdList.get(randomIndex);
    }
}
