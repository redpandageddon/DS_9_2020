package operation;

import types.Branch;
import java.util.ArrayList;
import java.util.List;

public class BranchOperationImpl implements BranchOperation {

    public static List<Branch> lst = new ArrayList<Branch>();

    static {
        lst.add(new Branch("Береза", "описание"));
        lst.add(new Branch("Липа", "описание"));
    }

    @Override
    public List<Branch> GetAll() {
        return lst;
    }

    @Override
    public List<Branch> Add(Branch newItem) {
        lst.add(newItem);
        return lst;
    }

    @Override
    public List<Branch> DeleteAt(int index) {
        lst.remove(index);
        return lst;
    }
}
