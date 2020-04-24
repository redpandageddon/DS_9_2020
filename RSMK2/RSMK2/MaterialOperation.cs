using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public interface MaterialOperation
    {
        List<Material> GetAll();
        List<Material> DeleteAt(int index);
        List<Material> Add(Material newItem);
        double CountTotal();
    }
}
