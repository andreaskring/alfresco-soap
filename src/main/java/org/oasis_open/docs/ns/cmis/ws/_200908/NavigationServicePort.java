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
 * 2018-06-13T13:40:11.675+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "NavigationServicePort")
@XmlSeeAlso({org.oasis_open.docs.ns.cmis.messaging._200908.ObjectFactory.class, org.oasis_open.docs.ns.cmis.core._200908.ObjectFactory.class})
public interface NavigationServicePort {

    @WebMethod
    @RequestWrapper(localName = "getObjectParents", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetObjectParents")
    @ResponseWrapper(localName = "getObjectParentsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetObjectParentsResponse")
    @WebResult(name = "parents", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public java.util.List<org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectParentsType> getObjectParents(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String objectId,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships includeRelationships,
        @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String renditionFilter,
        @WebParam(name = "includeRelativePathSegment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeRelativePathSegment,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getCheckedOutDocs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetCheckedOutDocs")
    @ResponseWrapper(localName = "getCheckedOutDocsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetCheckedOutDocsResponse")
    @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectListType getCheckedOutDocs(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String folderId,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "orderBy", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String orderBy,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships includeRelationships,
        @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String renditionFilter,
        @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger maxItems,
        @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger skipCount,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getFolderParent", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetFolderParent")
    @ResponseWrapper(localName = "getFolderParentResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetFolderParentResponse")
    @WebResult(name = "object", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType getFolderParent(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String folderId,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getFolderTree", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetFolderTree")
    @ResponseWrapper(localName = "getFolderTreeResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetFolderTreeResponse")
    @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public java.util.List<org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderContainerType> getFolderTree(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String folderId,
        @WebParam(name = "depth", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger depth,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships includeRelationships,
        @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String renditionFilter,
        @WebParam(name = "includePathSegment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePathSegment,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getDescendants", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetDescendants")
    @ResponseWrapper(localName = "getDescendantsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetDescendantsResponse")
    @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public java.util.List<org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderContainerType> getDescendants(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String folderId,
        @WebParam(name = "depth", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger depth,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships includeRelationships,
        @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String renditionFilter,
        @WebParam(name = "includePathSegment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePathSegment,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod
    @RequestWrapper(localName = "getChildren", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetChildren")
    @ResponseWrapper(localName = "getChildrenResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetChildrenResponse")
    @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderListType getChildren(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String folderId,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "orderBy", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String orderBy,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships includeRelationships,
        @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String renditionFilter,
        @WebParam(name = "includePathSegment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePathSegment,
        @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger maxItems,
        @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger skipCount,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension
    ) throws CmisException;
}
