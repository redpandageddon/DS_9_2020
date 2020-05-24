package service.endpoint;

import operation.BranchOperationImpl;
import types.Branch;
import types.ListOfBranch;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class BranchService {
    static BranchOperationImpl obj = new BranchOperationImpl();

    @WebMethod
    public ListOfBranch getAllBranch(){
        ListOfBranch lstret = null;
        List<Branch> lst = obj.GetAll();
        if(lst!=null){
            lstret = new ListOfBranch();
            lstret.setItem(lst);
        }
        return lstret;
    }
    
    @WebMethod
    public ListOfBranch deleteBranch(Branch item) {
    	
        ListOfBranch lstRet = null;
        obj.Delete(item);
        List<Branch> lst = obj.GetAll();
        if(lst != null){
            lstRet = new ListOfBranch();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod
    public ListOfBranch setNewBranch(Branch item){
        ListOfBranch lstRet = null;

        List<Branch> lst = obj.Add(item);
        if(lst != null){
            lstRet = new ListOfBranch();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
}
