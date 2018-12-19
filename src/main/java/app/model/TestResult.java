package app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import app.common.Constants;

@Entity(name = "TestResult")
@Table(name = "TEST_RESULT")
public class TestResult {

	@Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(
            name = "idGenerator",
            parameters = @Parameter(name = Constants.PREFIX_PARAM, value = Constants.PREFIX_TEST_RESULT),
            strategy = "app.common.support.GeneratorPrimaryKeySupport")
    @Column(name = "TEST_RESULT_ID", length = 10)
	private String testResultId;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "COUNT")
	private Integer count;
	
	@Column(name = "SCORE")
	private Double score;
	
	@Column(name = "TOTAL_TIME")
	private Integer totalTime;

	@Column(name = "USER_ID", length = 10)
    private String userId;
	
	@Column(name = "TEST_ID", length = 10)
    private String testId;
	
	@ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID", insertable = false, updatable = false)
    private Test test;
	
	public String getTestResultId() {
		return testResultId;
	}

	public void setTestResultId(String testResultId) {
		this.testResultId = testResultId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(Integer totalTime) {
		this.totalTime = totalTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}
}
