package operation;

import types.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialOperationImpl implements MaterialOperation {

    public static List<Material> lst = new ArrayList<Material>();

    static {
        lst.add(new Material("rocks", "no", 150, 2000));
        lst.add(new Material("soap", "smells amazing", 23, 25));
    }

    @Override
    public List<Material> GetAll()
    {
        return lst;
    }

    @Override
    public List<Material> DeleteAt(int index)
    {
        lst.remove(index);
        return lst;
    }

    @Override
    public List<Material> Add(Material newItem)
    {
        lst.add(newItem);
        return lst;
    }

    @Override
    public double CountTotal()
    {
        double result = 0d;
        for (var item : lst)
        {
            result += item.getPrice() * item.getAmount();
        }
        return result;
    }

}
