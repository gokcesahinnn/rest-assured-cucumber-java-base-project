package globals;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardGlobal {
    private static final BoardGlobal INSTANCE = new BoardGlobal();

    private String id;
    private String name;

    public static BoardGlobal getInstance() {
        return INSTANCE;
    }

    public void reset() {
        this.id = null;
        this.name = null;
    }
}