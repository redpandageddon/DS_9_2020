using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
     public interface StaffOperation
    {
        List<Staff> GetAll();
        List<Staff> Add(Staff newItem);
        List<Staff> DeleteAt(int index);
        double CountTotal();
    }
}
