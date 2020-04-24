using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public interface ProviderOperation
    {
        List<Provider> GetAll();
        List<Provider> Add(Provider newItem);
        List<Provider> DeleteAt(int index);
    }
}
