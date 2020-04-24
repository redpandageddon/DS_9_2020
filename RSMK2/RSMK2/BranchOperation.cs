using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public interface BranchOperation
    {
        List<Branch> GetAll();
        List<Branch> Add(Branch newItem);
        List<Branch> DeleteAt(int index);
    }
}
