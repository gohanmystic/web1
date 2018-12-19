package app.model;

import java.io.Serializable;

public class TestQuestionPk implements Serializable {

    private static final long serialVersionUID = 1L;

    private String questionId;

    private String testId;

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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
