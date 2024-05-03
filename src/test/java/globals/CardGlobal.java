package globals;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CardGlobal {
    private static final CardGlobal INSTANCE = new CardGlobal();

    private List<String> cardIdList;

    public static CardGlobal getInstance() {
        return INSTANCE;
    }

    public void reset() {
        this.cardIdList = null;
    }

}