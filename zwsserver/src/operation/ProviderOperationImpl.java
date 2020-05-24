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
    public List<Provider> DeleteAt(int index)
    {
        lst.remove(index);
        return lst;
    }

    @Override
    public List<Provider> Add(Provider newItem)
    {
        lst.add(newItem);
        return lst;
    }
}