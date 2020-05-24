
package service.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import types.ListOfMaterial;
import types.Material;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MaterialService", targetNamespace = "http://endpoint.service/")
@XmlSeeAlso({
    service.endpoint.ObjectFactory.class,
    types.ObjectFactory.class
})
public interface MaterialService {


    /**
     * 
     * @return
     *     returns types.ListOfMaterial
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMaterials", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetAllMaterials")
    @ResponseWrapper(localName = "getAllMaterialsResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetAllMaterialsResponse")
    @Action(input = "http://endpoint.service/MaterialService/getAllMaterialsRequest", output = "http://endpoint.service/MaterialService/getAllMaterialsResponse")
    public ListOfMaterial getAllMaterials();

    /**
     * 
     * @param arg0
     * @return
     *     returns types.ListOfMaterial
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setNewMaterial", targetNamespace = "http://endpoint.service/", className = "service.endpoint.SetNewMaterial")
    @ResponseWrapper(localName = "setNewMaterialResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.SetNewMaterialResponse")
    @Action(input = "http://endpoint.service/MaterialService/setNewMaterialRequest", output = "http://endpoint.service/MaterialService/setNewMaterialResponse")
    public ListOfMaterial setNewMaterial(
        @WebParam(name = "arg0", targetNamespace = "")
        Material arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns types.ListOfMaterial
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMaterial", targetNamespace = "http://endpoint.service/", className = "service.endpoint.DeleteMaterial")
    @ResponseWrapper(localName = "deleteMaterialResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.DeleteMaterialResponse")
    @Action(input = "http://endpoint.service/MaterialService/deleteMaterialRequest", output = "http://endpoint.service/MaterialService/deleteMaterialResponse")
    public ListOfMaterial deleteMaterial(
        @WebParam(name = "arg0", targetNamespace = "")
        Material arg0);

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalMaterialPrice", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetTotalMaterialPrice")
    @ResponseWrapper(localName = "getTotalMaterialPriceResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetTotalMaterialPriceResponse")
    @Action(input = "http://endpoint.service/MaterialService/getTotalMaterialPriceRequest", output = "http://endpoint.service/MaterialService/getTotalMaterialPriceResponse")
    public double getTotalMaterialPrice();

}
