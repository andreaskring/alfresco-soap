package org.oasis_open.docs.ns.cmis.ws._200908;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-13T13:40:11.669+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "RelationshipServicePort")
@XmlSeeAlso({org.oasis_open.docs.ns.cmis.messaging._200908.ObjectFactory.class, org.oasis_open.docs.ns.cmis.core._200908.ObjectFactory.class})
public interface RelationshipServicePort {

    @WebMethod
    @RequestWrapper(localName = "getObjectRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetObjectRelationships")
    @ResponseWrapper(localName = "getObjectRelationshipsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetObjectRelationshipsResponse")
    @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectListType getObjectRelationships(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String objectId,
        @WebParam(name = "includeSubRelationshipTypes", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeSubRelationshipTypes,
        @WebParam(name = "relationshipDirection", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.core._200908.EnumRelationshipDirection relationshipDirection,
        @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String typeId,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger maxItems,
        @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger skipCount,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;
}
