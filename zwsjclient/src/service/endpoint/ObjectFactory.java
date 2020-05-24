
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

    private final static QName _DeleteStaff_QNAME = new QName("http://endpoint.service/", "deleteStaff");
    private final static QName _DeleteStaffResponse_QNAME = new QName("http://endpoint.service/", "deleteStaffResponse");
    private final static QName _GetAllStaff_QNAME = new QName("http://endpoint.service/", "getAllStaff");
    private final static QName _GetAllStaffResponse_QNAME = new QName("http://endpoint.service/", "getAllStaffResponse");
    private final static QName _GetTotalStaffSalary_QNAME = new QName("http://endpoint.service/", "getTotalStaffSalary");
    private final static QName _GetTotalStaffSalaryResponse_QNAME = new QName("http://endpoint.service/", "getTotalStaffSalaryResponse");
    private final static QName _SetNewStaff_QNAME = new QName("http://endpoint.service/", "setNewStaff");
    private final static QName _SetNewStaffResponse_QNAME = new QName("http://endpoint.service/", "setNewStaffResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteStaff }
     * 
     */
    public DeleteStaff createDeleteStaff() {
        return new DeleteStaff();
    }

    /**
     * Create an instance of {@link DeleteStaffResponse }
     * 
     */
    public DeleteStaffResponse createDeleteStaffResponse() {
        return new DeleteStaffResponse();
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
     * Create an instance of {@link GetTotalStaffSalary }
     * 
     */
    public GetTotalStaffSalary createGetTotalStaffSalary() {
        return new GetTotalStaffSalary();
    }

    /**
     * Create an instance of {@link GetTotalStaffSalaryResponse }
     * 
     */
    public GetTotalStaffSalaryResponse createGetTotalStaffSalaryResponse() {
        return new GetTotalStaffSalaryResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStaff }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStaff }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "deleteStaff")
    public JAXBElement<DeleteStaff> createDeleteStaff(DeleteStaff value) {
        return new JAXBElement<DeleteStaff>(_DeleteStaff_QNAME, DeleteStaff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStaffResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStaffResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "deleteStaffResponse")
    public JAXBElement<DeleteStaffResponse> createDeleteStaffResponse(DeleteStaffResponse value) {
        return new JAXBElement<DeleteStaffResponse>(_DeleteStaffResponse_QNAME, DeleteStaffResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalStaffSalary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTotalStaffSalary }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getTotalStaffSalary")
    public JAXBElement<GetTotalStaffSalary> createGetTotalStaffSalary(GetTotalStaffSalary value) {
        return new JAXBElement<GetTotalStaffSalary>(_GetTotalStaffSalary_QNAME, GetTotalStaffSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalStaffSalaryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTotalStaffSalaryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getTotalStaffSalaryResponse")
    public JAXBElement<GetTotalStaffSalaryResponse> createGetTotalStaffSalaryResponse(GetTotalStaffSalaryResponse value) {
        return new JAXBElement<GetTotalStaffSalaryResponse>(_GetTotalStaffSalaryResponse_QNAME, GetTotalStaffSalaryResponse.class, null, value);
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
