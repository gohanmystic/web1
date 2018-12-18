package vn.com.fsoft.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <b>Test</b>.
 *
 * <p>Version 1.0</p>
 *
 * <p>Date: 27-10-2018</p>
 *
 * <p>Copyright</p>
 *
 * <p>Modification Logs:</p>
 * <p>DATE             AUTHOR      DESCRIPTION</p>
 * ----------------------------------------
 * <p>27-10-2018       ABC123      Create</p>
 */
@Entity(name = "Test")
@Table(name = "TEST")
public class Test {

    @Id
    @Column(name = "TEST_ID", length = 10)
    private String testId;

    @Column(name = "TEST_NAME", length = 50)
    private String testName;

    @Column(name = "TEST_TIME")
    private Integer testTime;

    @Column(name = "QUESTION_NUMBER")
    private Integer questionNumber;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "PASSWORD", length = 10)
    private String password;

    @Column(name = "ACTIVE")
    private Integer active;

    @Column(name = "TEST_TYPE_ID", length = 10)
    private String testTypeId;

    @ManyToOne
    @JoinColumn(name = "TEST_TYPE_ID", insertable = false, updatable = false)
    private TestType testType;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "test")
    private Set<TestQuestion> testQuestionList;

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getTestTime() {
        return testTime;
    }

    public void setTestTime(Integer testTime) {
        this.testTime = testTime;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getTestTypeId() {
        return testTypeId;
    }

    public void setTestTypeId(String testTypeId) {
        this.testTypeId = testTypeId;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public Set<TestQuestion> getTestQuestionList() {
        return testQuestionList;
    }

    public void setTestQuestionList(Set<TestQuestion> testQuestionList) {
        this.testQuestionList = testQuestionList;
    }
}
