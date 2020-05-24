package operation;

import types.Action;
import java.util.List;

public interface ActionOperation {
    List<Action> GetAll();
    List<Action> Add(Action newItem);
    List<Action> DeleteAt(int index);
    double CountTotal();
}
