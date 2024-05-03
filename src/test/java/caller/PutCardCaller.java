package caller;

import requests.PutCardRequest;

public class PutCardCaller {
    CreateCardCaller createCardCaller = new CreateCardCaller();
    PutCardRequest putCardRequest = new PutCardRequest();

    public void updateCard() {
        putCardRequest.putCard(createCardCaller.getRandomCard());
    }

}
