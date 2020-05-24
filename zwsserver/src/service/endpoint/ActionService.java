package service.endpoint;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import operation.ActionOperationImpl;
import types.Action;
import types.ListOfAction;


@WebService
public class ActionService {

    static ActionOperationImpl obj = new ActionOperationImpl();

    @WebMethod
    public ListOfAction getAllAction(){
        ListOfAction lstret = null;
        List<Action> lst = obj.GetAll();
        if(lst!=null){
            lstret = new ListOfAction();
            lstret.setItem(lst);
        }
        return lstret;
    }

    @WebMethod
    public ListOfAction setNewAction(Action act){
        ListOfAction lstRet = null;

        List<Action> lst = obj.Add(act);
        if(lst != null){
            lstRet = new ListOfAction();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
    
    @WebMethod
    public ListOfAction deleteAction(Action act) {
    	
        ListOfAction lstRet = null;
        obj.Delete(act);
        List<Action> lst = obj.GetAll();
        if(lst != null){
            lstRet = new ListOfAction();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod()
    public double getTotalActionPrice(){
        return obj.CountTotal();
    }
}
