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
    public List<Material> Delete(Material item)
    {
    	int i = 0;
        for(var it : lst) {
        	if(item.getDescription().compareTo(item.getDescription()) == 0) {
        		if(it.getAmount() == item.getAmount()) {
        			if(it.getName().compareTo(item.getName()) == 0) {
        				if(it.getPrice()==item.getPrice()) {
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
