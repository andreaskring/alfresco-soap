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
 * 2018-06-13T13:40:11.652+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "RepositoryServicePort")
@XmlSeeAlso({org.oasis_open.docs.ns.cmis.messaging._200908.ObjectFactory.class, org.oasis_open.docs.ns.cmis.core._200908.ObjectFactory.class})
public interface RepositoryServicePort {

    @WebMethod
    @RequestWrapper(localName = "getTypeDescendants", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetTypeDescendants")
    @ResponseWrapper(localName = "getTypeDescendantsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetTypeDescendantsResponse")
    @WebResult(name = "types", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public java.util.List<org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeContainer> getTypeDescendants(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String typeId,
        @WebParam(name = "depth", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger depth,
        @WebParam(name = "includePropertyDefinitions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePropertyDefinitions,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getTypeChildren", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetTypeChildren")
    @ResponseWrapper(localName = "getTypeChildrenResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetTypeChildrenResponse")
    @WebResult(name = "types", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeDefinitionListType getTypeChildren(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String typeId,
        @WebParam(name = "includePropertyDefinitions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePropertyDefinitions,
        @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger maxItems,
        @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger skipCount,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getRepositoryInfo", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetRepositoryInfo")
    @ResponseWrapper(localName = "getRepositoryInfoResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetRepositoryInfoResponse")
    @WebResult(name = "repositoryInfo", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.core._200908.CmisRepositoryInfoType getRepositoryInfo(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getTypeDefinition", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetTypeDefinition")
    @ResponseWrapper(localName = "getTypeDefinitionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetTypeDefinitionResponse")
    @WebResult(name = "type", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.core._200908.CmisTypeDefinitionType getTypeDefinition(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String typeId,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getRepositories", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetRepositories")
    @ResponseWrapper(localName = "getRepositoriesResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetRepositoriesResponse")
    @WebResult(name = "repositories", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public java.util.List<org.oasis_open.docs.ns.cmis.messaging._200908.CmisRepositoryEntryType> getRepositories(
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;
}
