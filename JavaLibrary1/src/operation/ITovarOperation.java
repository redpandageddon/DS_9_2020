package operation;

import java.util.List;
import types.Tovar;

public interface ITovarOperation {
    
    List<Tovar> getListOfTovar();
    List<Tovar> addNewTovar(Tovar item);
    int getSumOfTovar();
    
}
