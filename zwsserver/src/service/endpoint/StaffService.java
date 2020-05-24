package service.endpoint;

import operation.StaffOperationImpl;
import types.ListOfStaff;
import types.Staff;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class StaffService {

    static StaffOperationImpl obj = new StaffOperationImpl();

    @WebMethod
    public ListOfStaff getAllStaff(){
        ListOfStaff lstret = null;
        List<Staff> lst = obj.GetAll();
        if(lst!=null){
            lstret = new ListOfStaff();
            lstret.setItem(lst);
        }
        return lstret;
    }

    @WebMethod
    public ListOfStaff setNewStaff(Staff item){
        ListOfStaff lstRet = null;

        List<Staff> lst = obj.Add(item);
        if(lst != null){
            lstRet = new ListOfStaff();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod
    public ListOfStaff deleteStaff(Staff item) {
    	
        ListOfStaff lstRet = null;
        obj.Delete(item);
        List<Staff> lst = obj.GetAll();
        if(lst != null){
            lstRet = new ListOfStaff();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
    
    @WebMethod
    public double getTotalStaffSalary(){
        return obj.CountTotal();
    }

}
