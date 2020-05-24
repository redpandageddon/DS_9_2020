package service.endpoint;


import operation.MaterialOperationImpl;
import types.ListOfMaterial;
import types.Material;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class MaterialService {

    static MaterialOperationImpl obj = new MaterialOperationImpl();

    @WebMethod
    public ListOfMaterial getAllMaterials(){
        ListOfMaterial lstret = null;
        List<Material> lst = obj.GetAll();
        if(lst!=null){
            lstret = new ListOfMaterial();
            lstret.setItem(lst);
        }
        return lstret;
    }

    @WebMethod
    public ListOfMaterial setNewMaterial(Material item){
        ListOfMaterial lstRet = null;

        List<Material> lst = obj.Add(item);
        if(lst != null){
            lstRet = new ListOfMaterial();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod
    public double getTotal(){
        return obj.CountTotal();
    }
}
