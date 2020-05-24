package operation;

import types.Material;
import java.util.List;

public interface MaterialOperation {

    List<Material> GetAll();
    List<Material> Delete(Material item);
    List<Material> Add(Material newItem);
    double CountTotal();

}
