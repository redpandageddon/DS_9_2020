package operation;

import types.Action;
import java.util.ArrayList;
import java.util.List;

public class ActionOperationImpl implements ActionOperation {

    public static List<Action> lst = new ArrayList<Action>();

    static {
        lst.add(new Action("спа",150d, 2d, "нет"));
        lst.add(new Action("парная",3000d, 1d, "Липа"));
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
    public List<Action> DeleteAt(int index)
    {
        lst.remove(index); return lst;
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
