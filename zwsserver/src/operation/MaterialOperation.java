package operation;

import types.Material;
import java.util.List;

public interface MaterialOperation {

    List<Material> GetAll();
    List<Material> DeleteAt(int index);
    List<Material> Add(Material newItem);
    double CountTotal();

}
