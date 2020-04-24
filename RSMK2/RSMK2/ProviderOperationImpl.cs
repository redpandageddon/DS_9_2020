using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public class ProviderOperationImpl : MarshalByRefObject, ProviderOperation
    {
        public static List<Provider> lst = new List<Provider>();

        public List<Provider> GetAll() => lst;
        public List<Provider> DeleteAt(int index)
        {
            lst.RemoveAt(index);
            return lst;
        }
        public List<Provider> Add(Provider newItem)
        {
            lst.Add(newItem);
            return lst;
        }
    }
}
