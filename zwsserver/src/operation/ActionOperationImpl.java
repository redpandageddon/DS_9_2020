package operation;

import types.Action;
import java.util.ArrayList;
import java.util.List;

public class ActionOperationImpl implements ActionOperation {

    public static List<Action> lst = new ArrayList<Action>();

    static {
        lst.add(new Action("a1", 150d, 2d, "a2"));
        lst.add(new Action("a3", 3000d, 1d, "a4"));
    }

    @Override
    public List<Action> GetAll()
    {
        return lst;
    }

    @Override
    public List<Action> Add(Action newItem)
    {
        lst.add(newItem);
        return lst;
    }

    @Override
    public List<Action> Delete(Action act)
    {
    	int i = 0;
        for(var item : lst) {
        	if(item.getDescription().compareTo(act.getDescription()) == 0) {
        		if(item.getPrice() == act.getPrice()) {
        			if(item.getTime() == act.getTime()) {
        				if(item.getVenik().compareTo(act.getVenik()) == 0) {
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
        double total = 0d;
        for(var tmp : lst)
        {
            total += tmp.getPrice() * tmp.getTime();
        }
        return total;
    }
}
