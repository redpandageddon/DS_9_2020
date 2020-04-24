using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public class StaffOperationImpl : MarshalByRefObject, StaffOperation
    {
        public static List<Staff> lst = new List<Staff>();

        public List<Staff> GetAll() => lst;

        public List<Staff> Add(Staff newItem)
        {
            lst.Add(newItem);
            return lst;
        }

        public List<Staff> DeleteAt(int index)
        {
            lst.RemoveAt(index);
            return lst;
        }

        public double CountTotal()
        {
            double result = 0d;
            foreach (var item in lst)
            {
                result += item.GetSalary();
            }
            return result;
        }
    }
}
