package operation;

import types.Staff;
import java.util.ArrayList;
import java.util.List;

public class StaffOperationImpl implements StaffOperation {

    public static List<Staff> lst = new ArrayList<Staff>();

    static {
        lst.add(new Staff("Mark Twen", 255, "admin", 1500));
        lst.add(new Staff("Doctor Who", 32767, "CEO", 7500d));
    }

    @Override
    public List<Staff> GetAll()
    {
        return lst;
    }

    @Override
    public List<Staff> Add(Staff newItem)
    {
        lst.add(newItem);
        return lst;
    }

    @Override
    public List<Staff> DeleteAt(int index)
    {
        lst.remove(index);
        return lst;
    }

    @Override
    public double CountTotal()
    {
        double result = 0;
        for (var item : lst)
        {
            result += item.getSalary();
        }
        return result;
    }
}
