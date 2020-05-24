package service.endpoint;

import operation.ProviderOperationImpl;
import types.ListOfProvider;
import types.Provider;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ProviderService {

    static ProviderOperationImpl obj = new ProviderOperationImpl();

    @WebMethod
    public ListOfProvider getAllProvider(){
        ListOfProvider lstret = null;
        List<Provider> lst = obj.GetAll();
        if(lst!=null){
            lstret = new ListOfProvider();
            lstret.setItem(lst);
        }
        return lstret;
    }
    
    @WebMethod
    public ListOfProvider deleteProvider(Provider item) {
    	
        ListOfProvider lstRet = null;
        obj.Delete(item);
        List<Provider> lst = obj.GetAll();
        if(lst != null){
            lstRet = new ListOfProvider();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod
    public ListOfProvider setNewProvider(Provider item){
        ListOfProvider lstRet = null;

        List<Provider> lst = obj.Add(item);
        if(lst != null){
            lstRet = new ListOfProvider();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
}
