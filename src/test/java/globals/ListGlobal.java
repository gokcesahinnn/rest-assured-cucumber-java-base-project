package globals;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ListGlobal {
    private static final ListGlobal INSTANCE = new ListGlobal();

    private String id;
    private String name;

    public static ListGlobal getInstance() {
        return INSTANCE;
    }

    public void reset() {
        this.id = null;
    }
}
