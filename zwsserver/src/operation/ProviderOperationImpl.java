package operation;

import types.Provider;
import java.util.ArrayList;
import java.util.List;

public class ProviderOperationImpl implements ProviderOperation {

    public static List<Provider> lst = new ArrayList<Provider>();

    static {
        lst.add(new Provider(12, "quas", "soap"));
        lst.add(new Provider(132, "exort", "rocks"));
    }

    @Override
    public List<Provider> GetAll() {
        return lst;
    }

    @Override
    public List<Provider> Delete(Provider item)
    {
    	int i = 0;
        for(var it : lst) {
        	if(item.getName().compareTo(item.getName()) == 0) {
        		if(it.getProduct().compareTo(item.getProduct()) == 0) {
        			if(it.getCooperation() == item.getCooperation()) {
        				lst.remove(i);
        			}
        		}
        	}
        	i++;
        }
        return lst;
    }

    @Override
    public List<Provider> Add(Provider newItem)
    {
        lst.add(newItem);
        return lst;
    }
}