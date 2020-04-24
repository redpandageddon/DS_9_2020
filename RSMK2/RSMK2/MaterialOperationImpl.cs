using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    public class MaterialOperationImpl : MarshalByRefObject, MaterialOperation
    {
        public static List<Material> lst = new List<Material>();
        public List<Material> GetAll() => lst;
        public List<Material> DeleteAt(int index)
        {
            lst.RemoveAt(index);
            return lst;
        }
        public List<Material> Add(Material newItem)
        {
            lst.Add(newItem);
            return lst;
        }
        public double CountTotal()
        {
            double result = 0d;
            foreach (var item in lst)
            {
                result += item.GetPrice() * item.GetAmount();
            }
            return result;
        }
    }
}
