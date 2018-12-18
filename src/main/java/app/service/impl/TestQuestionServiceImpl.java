package app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.TestQuestion;
import app.repository.TestQuestionRepository;
import app.service.TestQuestionService;

/**
 * <b>TestQuestionServiceImpl</b>.
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
@Service
public class TestQuestionServiceImpl implements TestQuestionService {

    /** TestQuestionRepository. */
    @Autowired
    private TestQuestionRepository testQuestionRepository;

    /**
     * Save TestQuestion entity.
     * @param testQuestion : TestQuestion
     * @return TestQuestion
     */
    public TestQuestion saveTestQuestion(TestQuestion testQuestion) {
        return testQuestionRepository.save(testQuestion);
    }

    /**
     * Delete TestQuestion by TestId.
     * @param testId : String
     */
    public void deleteByTestId(String testId) {
        testQuestionRepository.deleteByTestId(testId);
    }
}
