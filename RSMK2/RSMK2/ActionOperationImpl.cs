using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public class ActionOperationImpl : MarshalByRefObject, ActionOperation
    {
        public static List<Action> lst = new List<Action>();

        public List<Action> GetAll() => lst;
        public List<Action> Add(Action newItem) { lst.Add(newItem); return lst; }
        public List<Action> DeleteAt(int index) { lst.RemoveAt(index); return lst; }
        public double CountTotal()
        {
            double total = 0d;
            foreach (var tmp in lst)
            {
                total += tmp.GetPrice() * tmp.GetTime();
            }
            return total;
        }
    }
}
