using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public interface ActionOperation
    {
        List<Action> GetAll();
        List<Action> Add(Action newItem);
        List<Action> DeleteAt(int index);
        double CountTotal();
    }
}
