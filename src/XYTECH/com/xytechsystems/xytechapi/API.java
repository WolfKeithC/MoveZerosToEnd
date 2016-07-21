
package XYTECH.com.xytechsystems.xytechapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.APIResult;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ArrayOfAPISaveArgument;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ArrayOfAPISaveReturn;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.Credentials;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.PriceCriteria;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.SearchCriteria;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "API", targetNamespace = "urn:xytechsystems.com/XytechAPI")
@XmlSeeAlso({
    XYTECH.com.xytechsystems.xytechapi.ObjectFactory.class,
    XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ObjectFactory.class,
    XYTECH.com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    XYTECH.org.datacontract.schemas._2004._07.xytech_xe.ObjectFactory.class
})
public interface API {


    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "Ping", action = "Ping")
    @WebResult(name = "PingResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "Ping", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.PingResponse")
    public APIResult ping();

    /**
     * 
     * @param credentials
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "TestCredentials", action = "TestCredentials")
    @WebResult(name = "TestCredentialsResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "TestCredentials", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.TestCredentials")
    @ResponseWrapper(localName = "TestCredentialsResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.TestCredentialsResponse")
    public APIResult testCredentials(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "StatusInformation", action = "StatusInformation")
    @WebResult(name = "StatusInformationResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "StatusInformation", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.StatusInformation")
    @ResponseWrapper(localName = "StatusInformationResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.StatusInformationResponse")
    public APIResult statusInformation();

    /**
     * 
     * @param names
     * @param allDatabaseNamesResult
     */
    @WebMethod(operationName = "AllDatabaseNames", action = "AllDatabaseNames")
    @RequestWrapper(localName = "AllDatabaseNames", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.AllDatabaseNames")
    @ResponseWrapper(localName = "AllDatabaseNamesResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.AllDatabaseNamesResponse")
    public void allDatabaseNames(
        @WebParam(name = "AllDatabaseNamesResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> allDatabaseNamesResult,
        @WebParam(name = "names", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<ArrayOfstring> names);

    /**
     * 
     * @param keyColumnName
     * @param credentials
     * @param howManyNeeded
     * @param generateNextIDResult
     * @param firstNewKey
     * @param tableName
     */
    @WebMethod(operationName = "GenerateNextID", action = "GenerateNextID")
    @RequestWrapper(localName = "GenerateNextID", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.GenerateNextID")
    @ResponseWrapper(localName = "GenerateNextIDResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.GenerateNextIDResponse")
    public void generateNextID(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "tableName", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String tableName,
        @WebParam(name = "keyColumnName", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String keyColumnName,
        @WebParam(name = "howManyNeeded", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Integer howManyNeeded,
        @WebParam(name = "GenerateNextIDResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> generateNextIDResult,
        @WebParam(name = "firstNewKey", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<Integer> firstNewKey);

    /**
     * 
     * @param rescheduleMinutes
     * @param alertNo
     * @param credentials
     * @param dismiss
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "HandleAlert", action = "HandleAlert")
    @WebResult(name = "HandleAlertResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "HandleAlert", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.HandleAlert")
    @ResponseWrapper(localName = "HandleAlertResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.HandleAlertResponse")
    public APIResult handleAlert(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "alertNo", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Integer alertNo,
        @WebParam(name = "rescheduleMinutes", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Integer rescheduleMinutes,
        @WebParam(name = "dismiss", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Boolean dismiss);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "DemonVersion", action = "DemonVersion")
    @WebResult(name = "DemonVersionResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "DemonVersion", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.DemonVersion")
    @ResponseWrapper(localName = "DemonVersionResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.DemonVersionResponse")
    public APIResult demonVersion();

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "APIVersion", action = "APIVersion")
    @WebResult(name = "APIVersionResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "APIVersion", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.APIVersion")
    @ResponseWrapper(localName = "APIVersionResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.APIVersionResponse")
    public APIResult apiVersion();

    /**
     * 
     * @param credentials
     * @param docId
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "PurgeCache", action = "PurgeCache")
    @WebResult(name = "PurgeCacheResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "PurgeCache", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.PurgeCache")
    @ResponseWrapper(localName = "PurgeCacheResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.PurgeCacheResponse")
    public APIResult purgeCache(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "docId", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Short docId);

    /**
     * 
     * @param alerts
     * @param credentials
     * @param queryAlertsResult
     */
    @WebMethod(operationName = "QueryAlerts", action = "QueryAlerts")
    @RequestWrapper(localName = "QueryAlerts", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.QueryAlerts")
    @ResponseWrapper(localName = "QueryAlertsResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.QueryAlertsResponse")
    public void queryAlerts(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "QueryAlertsResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> queryAlertsResult,
        @WebParam(name = "alerts", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<XYTECH.com.xytechsystems.xytechapi.QueryAlertsResponse.Alerts> alerts);

    /**
     * 
     * @param credentials
     * @param toUserIDs
     * @param sendIfLoggedOff
     * @param text
     * @param sendDateUTC
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "SendAlert", action = "SendAlert")
    @WebResult(name = "SendAlertResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "SendAlert", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.SendAlert")
    @ResponseWrapper(localName = "SendAlertResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.SendAlertResponse")
    public APIResult sendAlert(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "toUserIDs", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        ArrayOfstring toUserIDs,
        @WebParam(name = "sendIfLoggedOff", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Boolean sendIfLoggedOff,
        @WebParam(name = "text", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String text,
        @WebParam(name = "sendDateUTC", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        XMLGregorianCalendar sendDateUTC);

    /**
     * 
     * @param credentials
     * @param toUserIDs
     * @param qKey
     * @param sendIfLoggedOff
     * @param text
     * @param sendDateUTC
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "SendAlertQKey", action = "SendAlertQKey")
    @WebResult(name = "SendAlertQKeyResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "SendAlertQKey", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.SendAlertQKey")
    @ResponseWrapper(localName = "SendAlertQKeyResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.SendAlertQKeyResponse")
    public APIResult sendAlertQKey(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "toUserIDs", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        ArrayOfstring toUserIDs,
        @WebParam(name = "sendIfLoggedOff", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Boolean sendIfLoggedOff,
        @WebParam(name = "text", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String text,
        @WebParam(name = "sendDateUTC", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        XMLGregorianCalendar sendDateUTC,
        @WebParam(name = "qKey", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String qKey);

    /**
     * 
     * @param credentials
     * @param criteria
     * @param className
     * @param datasetcontainer
     * @param queryResult
     */
    @WebMethod(operationName = "Query", action = "Query")
    @RequestWrapper(localName = "Query", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Query")
    @ResponseWrapper(localName = "QueryResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.QueryResponse")
    public void query(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "className", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String className,
        @WebParam(name = "criteria", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        SearchCriteria criteria,
        @WebParam(name = "QueryResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> queryResult,
        @WebParam(name = "datasetcontainer", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<XYTECH.com.xytechsystems.xytechapi.QueryResponse.Datasetcontainer> datasetcontainer);

    /**
     * 
     * @param retrieveResult
     * @param credentials
     * @param keyName
     * @param className
     * @param datasetcontainer
     * @param key
     */
    @WebMethod(operationName = "Retrieve", action = "Retrieve")
    @RequestWrapper(localName = "Retrieve", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Retrieve")
    @ResponseWrapper(localName = "RetrieveResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.RetrieveResponse")
    public void retrieve(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "className", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String className,
        @WebParam(name = "keyName", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String keyName,
        @WebParam(name = "key", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String key,
        @WebParam(name = "RetrieveResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> retrieveResult,
        @WebParam(name = "datasetcontainer", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<XYTECH.com.xytechsystems.xytechapi.RetrieveResponse.Datasetcontainer> datasetcontainer);

    /**
     * 
     * @param credentials
     * @param arguments
     * @param upsertResult
     * @param results
     */
    @WebMethod(operationName = "Upsert", action = "Upsert")
    @RequestWrapper(localName = "Upsert", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Upsert")
    @ResponseWrapper(localName = "UpsertResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.UpsertResponse")
    public void upsert(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "arguments", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        ArrayOfAPISaveArgument arguments,
        @WebParam(name = "UpsertResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> upsertResult,
        @WebParam(name = "results", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<ArrayOfAPISaveReturn> results);

    /**
     * 
     * @param credentials
     * @param arguments
     * @param createResult
     * @param results
     */
    @WebMethod(operationName = "Create", action = "Create")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Create")
    @ResponseWrapper(localName = "CreateResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.CreateResponse")
    public void create(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "arguments", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        ArrayOfAPISaveArgument arguments,
        @WebParam(name = "CreateResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> createResult,
        @WebParam(name = "results", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<ArrayOfAPISaveReturn> results);

    /**
     * 
     * @param credentials
     * @param arguments
     * @param updateResult
     * @param results
     */
    @WebMethod(operationName = "Update", action = "Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.UpdateResponse")
    public void update(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "arguments", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        ArrayOfAPISaveArgument arguments,
        @WebParam(name = "UpdateResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> updateResult,
        @WebParam(name = "results", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<ArrayOfAPISaveReturn> results);

    /**
     * 
     * @param credentials
     * @param keyName
     * @param className
     * @param key
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "Delete", action = "Delete")
    @WebResult(name = "DeleteResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "Delete", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.DeleteResponse")
    public APIResult delete(
        @WebParam(name = "className", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String className,
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "keyName", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String keyName,
        @WebParam(name = "key", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String key);

    /**
     * 
     * @param credentials
     * @param callArgs
     * @param keyName
     * @param className
     * @param key
     * @return
     *     returns org.datacontract.schemas._2004._07.xytech_mp.APIResult
     */
    @WebMethod(operationName = "Post", action = "Post")
    @WebResult(name = "PostResult", targetNamespace = "urn:xytechsystems.com/XytechAPI")
    @RequestWrapper(localName = "Post", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Post")
    @ResponseWrapper(localName = "PostResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.PostResponse")
    public APIResult post(
        @WebParam(name = "className", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String className,
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "keyName", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String keyName,
        @WebParam(name = "key", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String key,
        @WebParam(name = "callArgs", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        ArrayOfanyType callArgs);

    /**
     * 
     * @param credentials
     * @param blobId
     * @param getBlobDataResult
     * @param datasetcontainer
     */
    @WebMethod(operationName = "GetBlobData", action = "GetBlobData")
    @RequestWrapper(localName = "GetBlobData", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.GetBlobData")
    @ResponseWrapper(localName = "GetBlobDataResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.GetBlobDataResponse")
    public void getBlobData(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "blobId", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Integer blobId,
        @WebParam(name = "GetBlobDataResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> getBlobDataResult,
        @WebParam(name = "datasetcontainer", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<XYTECH.com.xytechsystems.xytechapi.GetBlobDataResponse.Datasetcontainer> datasetcontainer);

    /**
     * 
     * @param credentials
     * @param priceResult
     * @param pricingData
     * @param className
     * @param datasetcontainer
     */
    @WebMethod(operationName = "Price", action = "Price")
    @RequestWrapper(localName = "Price", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.Price")
    @ResponseWrapper(localName = "PriceResponse", targetNamespace = "urn:xytechsystems.com/XytechAPI", className = "com.xytechsystems.xytechapi.PriceResponse")
    public void price(
        @WebParam(name = "credentials", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        Credentials credentials,
        @WebParam(name = "className", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        String className,
        @WebParam(name = "pricingData", targetNamespace = "urn:xytechsystems.com/XytechAPI")
        PriceCriteria pricingData,
        @WebParam(name = "PriceResult", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<APIResult> priceResult,
        @WebParam(name = "datasetcontainer", targetNamespace = "urn:xytechsystems.com/XytechAPI", mode = WebParam.Mode.OUT)
        Holder<XYTECH.com.xytechsystems.xytechapi.PriceResponse.Datasetcontainer> datasetcontainer);

}
