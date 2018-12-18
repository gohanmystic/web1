package vn.com.fsoft.service;

import vn.com.fsoft.model.TestQuestion;

/**
 * <b>TestQuestionService</b>.
 *
 * <p>Version 1.0</p>
 *
 * <p>Date: 28-10-2018</p>
 *
 * <p>Copyright</p>
 *
 * <p>Modification Logs:</p>
 * <p>DATE             AUTHOR      DESCRIPTION</p>
 * ----------------------------------------
 * <p>28-10-2018       ABC123      Create</p>
 */
public interface TestQuestionService {

    /**
     * Save TestQuestion entity.
     * @param testQuestion : TestQuestion
     * @return TestQuestion saved
     */
    public TestQuestion saveTestQuestion(TestQuestion testQuestion);

    /**
     * Delete TestQuestion by TestId.
     * @param testId : String
     */
    public void deleteByTestId(String testId);
}
