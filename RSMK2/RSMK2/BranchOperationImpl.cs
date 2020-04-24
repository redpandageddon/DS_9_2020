using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public class BranchOperationImpl : MarshalByRefObject, BranchOperation
    {
        public static List<Branch> lst = new List<Branch>();

        public List<Branch> GetAll()
        {
            return lst;
        }

        public List<Branch> Add(Branch newItem)
        {
            lst.Add(newItem);
            return lst;
        }

        public List<Branch> DeleteAt(int index)
        {
            lst.RemoveAt(index);
            return lst;
        }
    }
}