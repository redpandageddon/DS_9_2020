package operation;

import types.Staff;
import java.util.List;

public interface StaffOperation {
    List<Staff> GetAll();
    List<Staff> Add(Staff newItem);
    List<Staff> DeleteAt(int index);
    double CountTotal();
}
