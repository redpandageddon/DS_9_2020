
package service.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.endpoint package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllStaff_QNAME = new QName("http://endpoint.service/", "getAllStaff");
    private final static QName _GetAllStaffResponse_QNAME = new QName("http://endpoint.service/", "getAllStaffResponse");
    private final static QName _GetTotal_QNAME = new QName("http://endpoint.service/", "getTotal");
    private final static QName _GetTotalResponse_QNAME = new QName("http://endpoint.service/", "getTotalResponse");
    private final static QName _SetNewStaff_QNAME = new QName("http://endpoint.service/", "setNewStaff");
    private final static QName _SetNewStaffResponse_QNAME = new QName("http://endpoint.service/", "setNewStaffResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllStaff }
     * 
     */
    public GetAllStaff createGetAllStaff() {
        return new GetAllStaff();
    }

    /**
     * Create an instance of {@link GetAllStaffResponse }
     * 
     */
    public GetAllStaffResponse createGetAllStaffResponse() {
        return new GetAllStaffResponse();
    }

    /**
     * Create an instance of {@link GetTotal }
     * 
     */
    public GetTotal createGetTotal() {
        return new GetTotal();
    }

    /**
     * Create an instance of {@link GetTotalResponse }
     * 
     */
    public GetTotalResponse createGetTotalResponse() {
        return new GetTotalResponse();
    }

    /**
     * Create an instance of {@link SetNewStaff }
     * 
     */
    public SetNewStaff createSetNewStaff() {
        return new SetNewStaff();
    }

    /**
     * Create an instance of {@link SetNewStaffResponse }
     * 
     */
    public SetNewStaffResponse createSetNewStaffResponse() {
        return new SetNewStaffResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStaff }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStaff }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllStaff")
    public JAXBElement<GetAllStaff> createGetAllStaff(GetAllStaff value) {
        return new JAXBElement<GetAllStaff>(_GetAllStaff_QNAME, GetAllStaff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStaffResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStaffResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllStaffResponse")
    public JAXBElement<GetAllStaffResponse> createGetAllStaffResponse(GetAllStaffResponse value) {
        return new JAXBElement<GetAllStaffResponse>(_GetAllStaffResponse_QNAME, GetAllStaffResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTotal }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getTotal")
    public JAXBElement<GetTotal> createGetTotal(GetTotal value) {
        return new JAXBElement<GetTotal>(_GetTotal_QNAME, GetTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTotalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getTotalResponse")
    public JAXBElement<GetTotalResponse> createGetTotalResponse(GetTotalResponse value) {
        return new JAXBElement<GetTotalResponse>(_GetTotalResponse_QNAME, GetTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewStaff }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetNewStaff }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewStaff")
    public JAXBElement<SetNewStaff> createSetNewStaff(SetNewStaff value) {
        return new JAXBElement<SetNewStaff>(_SetNewStaff_QNAME, SetNewStaff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewStaffResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetNewStaffResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewStaffResponse")
    public JAXBElement<SetNewStaffResponse> createSetNewStaffResponse(SetNewStaffResponse value) {
        return new JAXBElement<SetNewStaffResponse>(_SetNewStaffResponse_QNAME, SetNewStaffResponse.class, null, value);
    }

}
