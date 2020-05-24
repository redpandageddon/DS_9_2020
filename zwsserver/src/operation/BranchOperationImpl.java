package operation;

import types.Branch;
import java.util.ArrayList;
import java.util.List;

public class BranchOperationImpl implements BranchOperation {

    public static List<Branch> lst = new ArrayList<Branch>();

    static {
        lst.add(new Branch("b1", "b2"));
        lst.add(new Branch("b3", "b4"));
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
    public List<Branch> Delete(Branch item) {
    	int i = 0;
        for(var it : lst) {
        	if(item.getDescription().compareTo(item.getDescription()) == 0) {
        		if(it.getTree().compareTo(item.getTree()) == 0) {
        			lst.remove(i);
        		}
        	}
        	i++;
        }
        return lst;
    }
}
