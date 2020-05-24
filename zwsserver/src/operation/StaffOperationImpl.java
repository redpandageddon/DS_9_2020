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
    public List<Staff> Delete(Staff item)
    {
    	int i = 0;
        for(var it : lst) {
        	if(it.getAge() == item.getAge()) {
        		if(it.getSalary() == item.getSalary()) {
        			if(it.getFIO().compareTo(item.getFIO()) == 0) {
        				if(it.getPosition().compareTo(item.getPosition()) == 0) {
        					lst.remove(i);
        				}
        			}
        		}
        	}
        	i++;
        }
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
