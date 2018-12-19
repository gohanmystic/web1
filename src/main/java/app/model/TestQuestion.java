package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "TestQuestion")
@Table(name = "TEST_QUESTION")
@IdClass(TestQuestionPk.class)
public class TestQuestion {

    @Id
    @Column(name = "QUESTION_ID", length = 10)
    private String questionId;

    @Id
    @Column(name = "TEST_ID", length = 10)
    private String testId;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID", referencedColumnName = "QUESTION_ID", insertable = false, updatable = false)
    private Question question;

    @ManyToOne
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID", insertable = false, updatable = false)
    private Test test;

    public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
