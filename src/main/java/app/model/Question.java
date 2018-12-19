package app.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import app.common.Constants;

@Entity(name = "Question")
@Table(name = "QUESTION")
public class Question {

	@Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(
            name = "idGenerator",
            parameters = @Parameter(name = Constants.PREFIX_PARAM, value = Constants.PREFIX_QUESTION),
            strategy = "app.common.support.GeneratorPrimaryKeySupport")
    @Column(name = "QUESTION_ID", length = 10)
    private String questionId;

    @Column(name = "CONTENT", length = 1000)
    private String content;

    @Column(name = "CORRECT_ANSWER", length = 100)
    private String correctAnswer;

    @Column(name = "ANSWER_1", length = 100)
    private String answer1;

    @Column(name = "ANSWER_2", length = 100)
    private String answer2;

    @Column(name = "ANSWER_3", length = 100)
    private String answer3;

    @Transient
    private Boolean checked;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
    private Set<TestQuestion> testQuestionList;

    public Question() {
        super();
    }

    public Question(String content, String correctAnswer, String answer1, String answer2,
            String answer3) {
        super();
        this.content = content;
        this.correctAnswer = correctAnswer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Set<TestQuestion> getTestQuestionList() {
        return testQuestionList;
    }

    public void setTestQuestionList(Set<TestQuestion> testQuestionList) {
        this.testQuestionList = testQuestionList;
    }
}
