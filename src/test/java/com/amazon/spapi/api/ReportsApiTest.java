/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2021-06-30
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.reports.CreateReportResponse;
import com.amazon.spapi.model.reports.CreateReportScheduleResponse;
import com.amazon.spapi.model.reports.CreateReportScheduleSpecification;
import com.amazon.spapi.model.reports.CreateReportSpecification;
import com.amazon.spapi.model.reports.GetReportsResponse;
import org.threeten.bp.OffsetDateTime;
import com.amazon.spapi.model.reports.Report;
import com.amazon.spapi.model.reports.ReportDocument;
import com.amazon.spapi.model.reports.ReportSchedule;
import com.amazon.spapi.model.reports.ReportScheduleList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    
    /**
     * 
     *
     * Cancels the report that you specify. Only reports with processingStatus&#x3D;IN_QUEUE can be cancelled. Cancelled reports are returned in subsequent calls to the getReport and getReports operations.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelReportTest() throws ApiException {
        String reportId = null;
        api.cancelReport(reportId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Cancels the report schedule that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelReportScheduleTest() throws ApiException {
        String reportScheduleId = null;
        api.cancelReportSchedule(reportScheduleId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a report.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportTest() throws ApiException {
        CreateReportSpecification body = null;
        CreateReportResponse response = api.createReport(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a report schedule. If a report schedule with the same report type and marketplace IDs already exists, it will be cancelled and replaced with this one.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportScheduleTest() throws ApiException {
        CreateReportScheduleSpecification body = null;
        CreateReportScheduleResponse response = api.createReportSchedule(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report details (including the reportDocumentId, if available) for the report that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2.0 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportTest() throws ApiException {
        String reportId = null;
        Report response = api.getReport(reportId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the information required for retrieving a report document&#39;s contents.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportDocumentTest() throws ApiException {
        String reportDocumentId = null;
        ReportDocument response = api.getReportDocument(reportDocumentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report schedule details for the report schedule that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportScheduleTest() throws ApiException {
        String reportScheduleId = null;
        ReportSchedule response = api.getReportSchedule(reportScheduleId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report schedule details that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportSchedulesTest() throws ApiException {
        List<String> reportTypes = null;
        ReportScheduleList response = api.getReportSchedules(reportTypes);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report details for the reports that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportsTest() throws ApiException {
        List<String> reportTypes = null;
        List<String> processingStatuses = null;
        List<String> marketplaceIds = null;
        Integer pageSize = null;
        OffsetDateTime createdSince = null;
        OffsetDateTime createdUntil = null;
        String nextToken = null;
        GetReportsResponse response = api.getReports(reportTypes, processingStatuses, marketplaceIds, pageSize, createdSince, createdUntil, nextToken);

        // TODO: test validations
    }
    
}
