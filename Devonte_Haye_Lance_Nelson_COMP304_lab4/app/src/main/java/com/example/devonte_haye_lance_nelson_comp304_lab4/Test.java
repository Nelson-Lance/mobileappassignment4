package com.example.devonte_haye_lance_nelson_comp304_lab4;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test {

    @PrimaryKey
    private int testId;

    @ColumnInfo(name="applicant_id")
    private int applicantId;

    @ColumnInfo(name="examiner_id")
    private int examinerId;

    @ColumnInfo(name="test_result")
    private String testResult;

    @ColumnInfo(name="test_date")
    private int testDate;

    @ColumnInfo(name="test_route")
    private int testRoute;

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(int examinerId) {
        this.examinerId = examinerId;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public int getTestDate() {
        return testDate;
    }

    public void setTestDate(int testDate) {
        this.testDate = testDate;
    }

    public int getTestRoute() {
        return testRoute;
    }

    public void setTestRoute(int testRoute) {
        this.testRoute = testRoute;
    }
}
