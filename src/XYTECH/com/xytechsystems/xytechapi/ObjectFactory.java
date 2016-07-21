
package XYTECH.com.xytechsystems.xytechapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.APIResult;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ArrayOfAPISaveArgument;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ArrayOfAPISaveReturn;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.Credentials;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.PriceCriteria;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.SearchCriteria;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xytechsystems.xytechapi package. 
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

    private final static QName _PostResponsePostResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "PostResult");
    private final static QName _DeleteCredentials_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "credentials");
    private final static QName _DeleteClassName_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "className");
    private final static QName _DeleteKeyName_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "keyName");
    private final static QName _DeleteKey_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "key");
    private final static QName _SendAlertQKeyToUserIDs_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "toUserIDs");
    private final static QName _SendAlertQKeyText_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "text");
    private final static QName _SendAlertQKeyQKey_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "qKey");
    private final static QName _PingResponsePingResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "PingResult");
    private final static QName _PriceResponseDatasetcontainer_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "datasetcontainer");
    private final static QName _PriceResponsePriceResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "PriceResult");
    private final static QName _QueryCriteria_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "criteria");
    private final static QName _GenerateNextIDKeyColumnName_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "keyColumnName");
    private final static QName _GenerateNextIDTableName_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "tableName");
    private final static QName _UpdateArguments_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "arguments");
    private final static QName _UpsertResponseUpsertResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "UpsertResult");
    private final static QName _UpsertResponseResults_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "results");
    private final static QName _AllDatabaseNamesResponseNames_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "names");
    private final static QName _AllDatabaseNamesResponseAllDatabaseNamesResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "AllDatabaseNamesResult");
    private final static QName _UpdateResponseUpdateResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "UpdateResult");
    private final static QName _SendAlertResponseSendAlertResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "SendAlertResult");
    private final static QName _HandleAlertResponseHandleAlertResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "HandleAlertResult");
    private final static QName _StatusInformationResponseStatusInformationResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "StatusInformationResult");
    private final static QName _RetrieveResponseRetrieveResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "RetrieveResult");
    private final static QName _APIVersionResponseAPIVersionResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "APIVersionResult");
    private final static QName _GetBlobDataResponseGetBlobDataResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "GetBlobDataResult");
    private final static QName _CreateResponseCreateResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "CreateResult");
    private final static QName _GenerateNextIDResponseGenerateNextIDResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "GenerateNextIDResult");
    private final static QName _PricePricingData_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "pricingData");
    private final static QName _SendAlertQKeyResponseSendAlertQKeyResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "SendAlertQKeyResult");
    private final static QName _PurgeCacheResponsePurgeCacheResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "PurgeCacheResult");
    private final static QName _DemonVersionResponseDemonVersionResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "DemonVersionResult");
    private final static QName _DeleteResponseDeleteResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "DeleteResult");
    private final static QName _QueryResponseQueryResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "QueryResult");
    private final static QName _QueryAlertsResponseQueryAlertsResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "QueryAlertsResult");
    private final static QName _QueryAlertsResponseAlerts_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "alerts");
    private final static QName _PostCallArgs_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "callArgs");
    private final static QName _TestCredentialsResponseTestCredentialsResult_QNAME = new QName("urn:xytechsystems.com/XytechAPI", "TestCredentialsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xytechsystems.xytechapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link PriceResponse }
     * 
     */
    public PriceResponse createPriceResponse() {
        return new PriceResponse();
    }

    /**
     * Create an instance of {@link QueryAlertsResponse }
     * 
     */
    public QueryAlertsResponse createQueryAlertsResponse() {
        return new QueryAlertsResponse();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link GetBlobDataResponse }
     * 
     */
    public GetBlobDataResponse createGetBlobDataResponse() {
        return new GetBlobDataResponse();
    }

    /**
     * Create an instance of {@link AllDatabaseNamesResponse }
     * 
     */
    public AllDatabaseNamesResponse createAllDatabaseNamesResponse() {
        return new AllDatabaseNamesResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link StatusInformation }
     * 
     */
    public StatusInformation createStatusInformation() {
        return new StatusInformation();
    }

    /**
     * Create an instance of {@link DemonVersion }
     * 
     */
    public DemonVersion createDemonVersion() {
        return new DemonVersion();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link SendAlert }
     * 
     */
    public SendAlert createSendAlert() {
        return new SendAlert();
    }

    /**
     * Create an instance of {@link AllDatabaseNames }
     * 
     */
    public AllDatabaseNames createAllDatabaseNames() {
        return new AllDatabaseNames();
    }

    /**
     * Create an instance of {@link DemonVersionResponse }
     * 
     */
    public DemonVersionResponse createDemonVersionResponse() {
        return new DemonVersionResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link QueryAlerts }
     * 
     */
    public QueryAlerts createQueryAlerts() {
        return new QueryAlerts();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link APIVersion }
     * 
     */
    public APIVersion createAPIVersion() {
        return new APIVersion();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link TestCredentials }
     * 
     */
    public TestCredentials createTestCredentials() {
        return new TestCredentials();
    }

    /**
     * Create an instance of {@link SendAlertQKeyResponse }
     * 
     */
    public SendAlertQKeyResponse createSendAlertQKeyResponse() {
        return new SendAlertQKeyResponse();
    }

    /**
     * Create an instance of {@link RetrieveResponse.Datasetcontainer }
     * 
     */
    public RetrieveResponse.Datasetcontainer createRetrieveResponseDatasetcontainer() {
        return new RetrieveResponse.Datasetcontainer();
    }

    /**
     * Create an instance of {@link PriceResponse.Datasetcontainer }
     * 
     */
    public PriceResponse.Datasetcontainer createPriceResponseDatasetcontainer() {
        return new PriceResponse.Datasetcontainer();
    }

    /**
     * Create an instance of {@link QueryAlertsResponse.Alerts }
     * 
     */
    public QueryAlertsResponse.Alerts createQueryAlertsResponseAlerts() {
        return new QueryAlertsResponse.Alerts();
    }

    /**
     * Create an instance of {@link PostResponse }
     * 
     */
    public PostResponse createPostResponse() {
        return new PostResponse();
    }

    /**
     * Create an instance of {@link HandleAlertResponse }
     * 
     */
    public HandleAlertResponse createHandleAlertResponse() {
        return new HandleAlertResponse();
    }

    /**
     * Create an instance of {@link Upsert }
     * 
     */
    public Upsert createUpsert() {
        return new Upsert();
    }

    /**
     * Create an instance of {@link TestCredentialsResponse }
     * 
     */
    public TestCredentialsResponse createTestCredentialsResponse() {
        return new TestCredentialsResponse();
    }

    /**
     * Create an instance of {@link GenerateNextID }
     * 
     */
    public GenerateNextID createGenerateNextID() {
        return new GenerateNextID();
    }

    /**
     * Create an instance of {@link Post }
     * 
     */
    public Post createPost() {
        return new Post();
    }

    /**
     * Create an instance of {@link SendAlertQKey }
     * 
     */
    public SendAlertQKey createSendAlertQKey() {
        return new SendAlertQKey();
    }

    /**
     * Create an instance of {@link APIVersionResponse }
     * 
     */
    public APIVersionResponse createAPIVersionResponse() {
        return new APIVersionResponse();
    }

    /**
     * Create an instance of {@link StatusInformationResponse }
     * 
     */
    public StatusInformationResponse createStatusInformationResponse() {
        return new StatusInformationResponse();
    }

    /**
     * Create an instance of {@link PurgeCache }
     * 
     */
    public PurgeCache createPurgeCache() {
        return new PurgeCache();
    }

    /**
     * Create an instance of {@link GenerateNextIDResponse }
     * 
     */
    public GenerateNextIDResponse createGenerateNextIDResponse() {
        return new GenerateNextIDResponse();
    }

    /**
     * Create an instance of {@link HandleAlert }
     * 
     */
    public HandleAlert createHandleAlert() {
        return new HandleAlert();
    }

    /**
     * Create an instance of {@link PurgeCacheResponse }
     * 
     */
    public PurgeCacheResponse createPurgeCacheResponse() {
        return new PurgeCacheResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link SendAlertResponse }
     * 
     */
    public SendAlertResponse createSendAlertResponse() {
        return new SendAlertResponse();
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link QueryResponse.Datasetcontainer }
     * 
     */
    public QueryResponse.Datasetcontainer createQueryResponseDatasetcontainer() {
        return new QueryResponse.Datasetcontainer();
    }

    /**
     * Create an instance of {@link GetBlobData }
     * 
     */
    public GetBlobData createGetBlobData() {
        return new GetBlobData();
    }

    /**
     * Create an instance of {@link GetBlobDataResponse.Datasetcontainer }
     * 
     */
    public GetBlobDataResponse.Datasetcontainer createGetBlobDataResponseDatasetcontainer() {
        return new GetBlobDataResponse.Datasetcontainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "PostResult", scope = PostResponse.class)
    public JAXBElement<APIResult> createPostResponsePostResult(APIResult value) {
        return new JAXBElement<APIResult>(_PostResponsePostResult_QNAME, APIResult.class, PostResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Delete.class)
    public JAXBElement<Credentials> createDeleteCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Delete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "className", scope = Delete.class)
    public JAXBElement<String> createDeleteClassName(String value) {
        return new JAXBElement<String>(_DeleteClassName_QNAME, String.class, Delete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "keyName", scope = Delete.class)
    public JAXBElement<String> createDeleteKeyName(String value) {
        return new JAXBElement<String>(_DeleteKeyName_QNAME, String.class, Delete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "key", scope = Delete.class)
    public JAXBElement<String> createDeleteKey(String value) {
        return new JAXBElement<String>(_DeleteKey_QNAME, String.class, Delete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = SendAlertQKey.class)
    public JAXBElement<Credentials> createSendAlertQKeyCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, SendAlertQKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "toUserIDs", scope = SendAlertQKey.class)
    public JAXBElement<ArrayOfstring> createSendAlertQKeyToUserIDs(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SendAlertQKeyToUserIDs_QNAME, ArrayOfstring.class, SendAlertQKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "text", scope = SendAlertQKey.class)
    public JAXBElement<String> createSendAlertQKeyText(String value) {
        return new JAXBElement<String>(_SendAlertQKeyText_QNAME, String.class, SendAlertQKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "qKey", scope = SendAlertQKey.class)
    public JAXBElement<String> createSendAlertQKeyQKey(String value) {
        return new JAXBElement<String>(_SendAlertQKeyQKey_QNAME, String.class, SendAlertQKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "PingResult", scope = PingResponse.class)
    public JAXBElement<APIResult> createPingResponsePingResult(APIResult value) {
        return new JAXBElement<APIResult>(_PingResponsePingResult_QNAME, APIResult.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceResponse.Datasetcontainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "datasetcontainer", scope = PriceResponse.class)
    public JAXBElement<PriceResponse.Datasetcontainer> createPriceResponseDatasetcontainer(PriceResponse.Datasetcontainer value) {
        return new JAXBElement<PriceResponse.Datasetcontainer>(_PriceResponseDatasetcontainer_QNAME, PriceResponse.Datasetcontainer.class, PriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "PriceResult", scope = PriceResponse.class)
    public JAXBElement<APIResult> createPriceResponsePriceResult(APIResult value) {
        return new JAXBElement<APIResult>(_PriceResponsePriceResult_QNAME, APIResult.class, PriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "criteria", scope = Query.class)
    public JAXBElement<SearchCriteria> createQueryCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_QueryCriteria_QNAME, SearchCriteria.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Query.class)
    public JAXBElement<Credentials> createQueryCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "className", scope = Query.class)
    public JAXBElement<String> createQueryClassName(String value) {
        return new JAXBElement<String>(_DeleteClassName_QNAME, String.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "keyColumnName", scope = GenerateNextID.class)
    public JAXBElement<String> createGenerateNextIDKeyColumnName(String value) {
        return new JAXBElement<String>(_GenerateNextIDKeyColumnName_QNAME, String.class, GenerateNextID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = GenerateNextID.class)
    public JAXBElement<Credentials> createGenerateNextIDCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, GenerateNextID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "tableName", scope = GenerateNextID.class)
    public JAXBElement<String> createGenerateNextIDTableName(String value) {
        return new JAXBElement<String>(_GenerateNextIDTableName_QNAME, String.class, GenerateNextID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Update.class)
    public JAXBElement<Credentials> createUpdateCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Update.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISaveArgument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "arguments", scope = Update.class)
    public JAXBElement<ArrayOfAPISaveArgument> createUpdateArguments(ArrayOfAPISaveArgument value) {
        return new JAXBElement<ArrayOfAPISaveArgument>(_UpdateArguments_QNAME, ArrayOfAPISaveArgument.class, Update.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "UpsertResult", scope = UpsertResponse.class)
    public JAXBElement<APIResult> createUpsertResponseUpsertResult(APIResult value) {
        return new JAXBElement<APIResult>(_UpsertResponseUpsertResult_QNAME, APIResult.class, UpsertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISaveReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "results", scope = UpsertResponse.class)
    public JAXBElement<ArrayOfAPISaveReturn> createUpsertResponseResults(ArrayOfAPISaveReturn value) {
        return new JAXBElement<ArrayOfAPISaveReturn>(_UpsertResponseResults_QNAME, ArrayOfAPISaveReturn.class, UpsertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "names", scope = AllDatabaseNamesResponse.class)
    public JAXBElement<ArrayOfstring> createAllDatabaseNamesResponseNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AllDatabaseNamesResponseNames_QNAME, ArrayOfstring.class, AllDatabaseNamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "AllDatabaseNamesResult", scope = AllDatabaseNamesResponse.class)
    public JAXBElement<APIResult> createAllDatabaseNamesResponseAllDatabaseNamesResult(APIResult value) {
        return new JAXBElement<APIResult>(_AllDatabaseNamesResponseAllDatabaseNamesResult_QNAME, APIResult.class, AllDatabaseNamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "UpdateResult", scope = UpdateResponse.class)
    public JAXBElement<APIResult> createUpdateResponseUpdateResult(APIResult value) {
        return new JAXBElement<APIResult>(_UpdateResponseUpdateResult_QNAME, APIResult.class, UpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISaveReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "results", scope = UpdateResponse.class)
    public JAXBElement<ArrayOfAPISaveReturn> createUpdateResponseResults(ArrayOfAPISaveReturn value) {
        return new JAXBElement<ArrayOfAPISaveReturn>(_UpsertResponseResults_QNAME, ArrayOfAPISaveReturn.class, UpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "SendAlertResult", scope = SendAlertResponse.class)
    public JAXBElement<APIResult> createSendAlertResponseSendAlertResult(APIResult value) {
        return new JAXBElement<APIResult>(_SendAlertResponseSendAlertResult_QNAME, APIResult.class, SendAlertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "HandleAlertResult", scope = HandleAlertResponse.class)
    public JAXBElement<APIResult> createHandleAlertResponseHandleAlertResult(APIResult value) {
        return new JAXBElement<APIResult>(_HandleAlertResponseHandleAlertResult_QNAME, APIResult.class, HandleAlertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "StatusInformationResult", scope = StatusInformationResponse.class)
    public JAXBElement<APIResult> createStatusInformationResponseStatusInformationResult(APIResult value) {
        return new JAXBElement<APIResult>(_StatusInformationResponseStatusInformationResult_QNAME, APIResult.class, StatusInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = HandleAlert.class)
    public JAXBElement<Credentials> createHandleAlertCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, HandleAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Retrieve.class)
    public JAXBElement<Credentials> createRetrieveCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Retrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "className", scope = Retrieve.class)
    public JAXBElement<String> createRetrieveClassName(String value) {
        return new JAXBElement<String>(_DeleteClassName_QNAME, String.class, Retrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "keyName", scope = Retrieve.class)
    public JAXBElement<String> createRetrieveKeyName(String value) {
        return new JAXBElement<String>(_DeleteKeyName_QNAME, String.class, Retrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "key", scope = Retrieve.class)
    public JAXBElement<String> createRetrieveKey(String value) {
        return new JAXBElement<String>(_DeleteKey_QNAME, String.class, Retrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = SendAlert.class)
    public JAXBElement<Credentials> createSendAlertCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, SendAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "toUserIDs", scope = SendAlert.class)
    public JAXBElement<ArrayOfstring> createSendAlertToUserIDs(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SendAlertQKeyToUserIDs_QNAME, ArrayOfstring.class, SendAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "text", scope = SendAlert.class)
    public JAXBElement<String> createSendAlertText(String value) {
        return new JAXBElement<String>(_SendAlertQKeyText_QNAME, String.class, SendAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveResponse.Datasetcontainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "datasetcontainer", scope = RetrieveResponse.class)
    public JAXBElement<RetrieveResponse.Datasetcontainer> createRetrieveResponseDatasetcontainer(RetrieveResponse.Datasetcontainer value) {
        return new JAXBElement<RetrieveResponse.Datasetcontainer>(_PriceResponseDatasetcontainer_QNAME, RetrieveResponse.Datasetcontainer.class, RetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "RetrieveResult", scope = RetrieveResponse.class)
    public JAXBElement<APIResult> createRetrieveResponseRetrieveResult(APIResult value) {
        return new JAXBElement<APIResult>(_RetrieveResponseRetrieveResult_QNAME, APIResult.class, RetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "APIVersionResult", scope = APIVersionResponse.class)
    public JAXBElement<APIResult> createAPIVersionResponseAPIVersionResult(APIResult value) {
        return new JAXBElement<APIResult>(_APIVersionResponseAPIVersionResult_QNAME, APIResult.class, APIVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlobDataResponse.Datasetcontainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "datasetcontainer", scope = GetBlobDataResponse.class)
    public JAXBElement<GetBlobDataResponse.Datasetcontainer> createGetBlobDataResponseDatasetcontainer(GetBlobDataResponse.Datasetcontainer value) {
        return new JAXBElement<GetBlobDataResponse.Datasetcontainer>(_PriceResponseDatasetcontainer_QNAME, GetBlobDataResponse.Datasetcontainer.class, GetBlobDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "GetBlobDataResult", scope = GetBlobDataResponse.class)
    public JAXBElement<APIResult> createGetBlobDataResponseGetBlobDataResult(APIResult value) {
        return new JAXBElement<APIResult>(_GetBlobDataResponseGetBlobDataResult_QNAME, APIResult.class, GetBlobDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = PurgeCache.class)
    public JAXBElement<Credentials> createPurgeCacheCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, PurgeCache.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = QueryAlerts.class)
    public JAXBElement<Credentials> createQueryAlertsCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, QueryAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "CreateResult", scope = CreateResponse.class)
    public JAXBElement<APIResult> createCreateResponseCreateResult(APIResult value) {
        return new JAXBElement<APIResult>(_CreateResponseCreateResult_QNAME, APIResult.class, CreateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISaveReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "results", scope = CreateResponse.class)
    public JAXBElement<ArrayOfAPISaveReturn> createCreateResponseResults(ArrayOfAPISaveReturn value) {
        return new JAXBElement<ArrayOfAPISaveReturn>(_UpsertResponseResults_QNAME, ArrayOfAPISaveReturn.class, CreateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Create.class)
    public JAXBElement<Credentials> createCreateCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Create.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISaveArgument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "arguments", scope = Create.class)
    public JAXBElement<ArrayOfAPISaveArgument> createCreateArguments(ArrayOfAPISaveArgument value) {
        return new JAXBElement<ArrayOfAPISaveArgument>(_UpdateArguments_QNAME, ArrayOfAPISaveArgument.class, Create.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "GenerateNextIDResult", scope = GenerateNextIDResponse.class)
    public JAXBElement<APIResult> createGenerateNextIDResponseGenerateNextIDResult(APIResult value) {
        return new JAXBElement<APIResult>(_GenerateNextIDResponseGenerateNextIDResult_QNAME, APIResult.class, GenerateNextIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = GetBlobData.class)
    public JAXBElement<Credentials> createGetBlobDataCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, GetBlobData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "pricingData", scope = Price.class)
    public JAXBElement<PriceCriteria> createPricePricingData(PriceCriteria value) {
        return new JAXBElement<PriceCriteria>(_PricePricingData_QNAME, PriceCriteria.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Price.class)
    public JAXBElement<Credentials> createPriceCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "className", scope = Price.class)
    public JAXBElement<String> createPriceClassName(String value) {
        return new JAXBElement<String>(_DeleteClassName_QNAME, String.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "SendAlertQKeyResult", scope = SendAlertQKeyResponse.class)
    public JAXBElement<APIResult> createSendAlertQKeyResponseSendAlertQKeyResult(APIResult value) {
        return new JAXBElement<APIResult>(_SendAlertQKeyResponseSendAlertQKeyResult_QNAME, APIResult.class, SendAlertQKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Upsert.class)
    public JAXBElement<Credentials> createUpsertCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Upsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISaveArgument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "arguments", scope = Upsert.class)
    public JAXBElement<ArrayOfAPISaveArgument> createUpsertArguments(ArrayOfAPISaveArgument value) {
        return new JAXBElement<ArrayOfAPISaveArgument>(_UpdateArguments_QNAME, ArrayOfAPISaveArgument.class, Upsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "PurgeCacheResult", scope = PurgeCacheResponse.class)
    public JAXBElement<APIResult> createPurgeCacheResponsePurgeCacheResult(APIResult value) {
        return new JAXBElement<APIResult>(_PurgeCacheResponsePurgeCacheResult_QNAME, APIResult.class, PurgeCacheResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "DemonVersionResult", scope = DemonVersionResponse.class)
    public JAXBElement<APIResult> createDemonVersionResponseDemonVersionResult(APIResult value) {
        return new JAXBElement<APIResult>(_DemonVersionResponseDemonVersionResult_QNAME, APIResult.class, DemonVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "DeleteResult", scope = DeleteResponse.class)
    public JAXBElement<APIResult> createDeleteResponseDeleteResult(APIResult value) {
        return new JAXBElement<APIResult>(_DeleteResponseDeleteResult_QNAME, APIResult.class, DeleteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = TestCredentials.class)
    public JAXBElement<Credentials> createTestCredentialsCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, TestCredentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "QueryResult", scope = QueryResponse.class)
    public JAXBElement<APIResult> createQueryResponseQueryResult(APIResult value) {
        return new JAXBElement<APIResult>(_QueryResponseQueryResult_QNAME, APIResult.class, QueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponse.Datasetcontainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "datasetcontainer", scope = QueryResponse.class)
    public JAXBElement<QueryResponse.Datasetcontainer> createQueryResponseDatasetcontainer(QueryResponse.Datasetcontainer value) {
        return new JAXBElement<QueryResponse.Datasetcontainer>(_PriceResponseDatasetcontainer_QNAME, QueryResponse.Datasetcontainer.class, QueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "QueryAlertsResult", scope = QueryAlertsResponse.class)
    public JAXBElement<APIResult> createQueryAlertsResponseQueryAlertsResult(APIResult value) {
        return new JAXBElement<APIResult>(_QueryAlertsResponseQueryAlertsResult_QNAME, APIResult.class, QueryAlertsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAlertsResponse.Alerts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "alerts", scope = QueryAlertsResponse.class)
    public JAXBElement<QueryAlertsResponse.Alerts> createQueryAlertsResponseAlerts(QueryAlertsResponse.Alerts value) {
        return new JAXBElement<QueryAlertsResponse.Alerts>(_QueryAlertsResponseAlerts_QNAME, QueryAlertsResponse.Alerts.class, QueryAlertsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "callArgs", scope = Post.class)
    public JAXBElement<ArrayOfanyType> createPostCallArgs(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_PostCallArgs_QNAME, ArrayOfanyType.class, Post.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "credentials", scope = Post.class)
    public JAXBElement<Credentials> createPostCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_DeleteCredentials_QNAME, Credentials.class, Post.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "className", scope = Post.class)
    public JAXBElement<String> createPostClassName(String value) {
        return new JAXBElement<String>(_DeleteClassName_QNAME, String.class, Post.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "keyName", scope = Post.class)
    public JAXBElement<String> createPostKeyName(String value) {
        return new JAXBElement<String>(_DeleteKeyName_QNAME, String.class, Post.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "key", scope = Post.class)
    public JAXBElement<String> createPostKey(String value) {
        return new JAXBElement<String>(_DeleteKey_QNAME, String.class, Post.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xytechsystems.com/XytechAPI", name = "TestCredentialsResult", scope = TestCredentialsResponse.class)
    public JAXBElement<APIResult> createTestCredentialsResponseTestCredentialsResult(APIResult value) {
        return new JAXBElement<APIResult>(_TestCredentialsResponseTestCredentialsResult_QNAME, APIResult.class, TestCredentialsResponse.class, value);
    }

}
