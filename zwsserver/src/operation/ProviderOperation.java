package operation;

import java.util.List;
import types.Provider;

public interface ProviderOperation {
    List<Provider> GetAll();
    List<Provider> Add(Provider newItem);
    List<Provider> DeleteAt(int index);
}
