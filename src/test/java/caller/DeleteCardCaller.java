package caller;

import globals.CardGlobal;
import requests.DeleteCardRequest;

public class DeleteCardCaller {
    DeleteCardRequest deleteCardRequest = new DeleteCardRequest();

    public void deleteCard() {
        for (String cardId : CardGlobal.getInstance().getCardIdList()) {
            deleteCardRequest.deleteCard(cardId);
        }
    }

}
