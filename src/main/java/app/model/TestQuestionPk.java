package app.model;

import java.io.Serializable;

/**
 * <b>TestQuestionPk</b>.
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
public class TestQuestionPk implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer questionId;

    private String testId;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
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
