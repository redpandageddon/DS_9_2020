package operation;

import types.Branch;
import java.util.List;

public interface BranchOperation {

    List<Branch> GetAll();
    List<Branch> Add(Branch newItem);
    List<Branch> DeleteAt(int index);

}
