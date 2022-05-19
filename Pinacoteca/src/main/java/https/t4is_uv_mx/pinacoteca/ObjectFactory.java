//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.16 a las 10:58:24 AM CDT 
//


package https.t4is_uv_mx.pinacoteca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.pinacoteca package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _ListarRequest_QNAME = new QName("https://t4is.uv.mx/pinacoteca", "ListarRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.pinacoteca
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link AgregarVisitantesRequest }
     * 
     */
    public AgregarVisitantesRequest createAgregarVisitantesRequest() {
        return new AgregarVisitantesRequest();
    }

    /**
     * Create an instance of {@link AgregarVisitantesResponse }
     * 
     */
    public AgregarVisitantesResponse createAgregarVisitantesResponse() {
        return new AgregarVisitantesResponse();
    }

    /**
     * Create an instance of {@link AgregarEventosRequest }
     * 
     */
    public AgregarEventosRequest createAgregarEventosRequest() {
        return new AgregarEventosRequest();
    }

    /**
     * Create an instance of {@link AgregarEventosResponse }
     * 
     */
    public AgregarEventosResponse createAgregarEventosResponse() {
        return new AgregarEventosResponse();
    }

    /**
     * Create an instance of {@link EliminarRequest }
     * 
     */
    public EliminarRequest createEliminarRequest() {
        return new EliminarRequest();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link ListarResponse.Actividad }
     * 
     */
    public ListarResponse.Actividad createListarResponseActividad() {
        return new ListarResponse.Actividad();
    }

    /**
     * Create an instance of {@link EditarRequest }
     * 
     */
    public EditarRequest createEditarRequest() {
        return new EditarRequest();
    }

    /**
     * Create an instance of {@link EditarResponse }
     * 
     */
    public EditarResponse createEditarResponse() {
        return new EditarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/pinacoteca", name = "ListarRequest")
    public JAXBElement<Object> createListarRequest(Object value) {
        return new JAXBElement<Object>(_ListarRequest_QNAME, Object.class, null, value);
    }

}