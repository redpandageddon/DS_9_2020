package operation;
import java.util.ArrayList;
import java.util.List;
import types.Tovar;
public class TovarOperation implements ITovarOperation {
    static List<Tovar> lstTovar = new ArrayList<>();
    static{
        lstTovar.add(new Tovar("Товар1",10,100));
        lstTovar.add(new Tovar("Товар2",20,200));
        lstTovar.add(new Tovar("Товар3",30,300));
        lstTovar.add(new Tovar("Товар4",40,400));
    }
    @Override
    public List<Tovar> getListOfTovar(){
        return lstTovar;
    }
    @Override
    public List<Tovar> addNewTovar(Tovar item){
        lstTovar.add(item);
        return lstTovar;
    }
    @Override
    public int getSumOfTovar(){
        int s = 0;  
        for(Tovar tmp : lstTovar){
            s += tmp.getKol() * tmp.getPrice();
        }   
        return s;
    }
}