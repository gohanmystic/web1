package app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import app.model.Question;
import app.model.Test;

/**
 * <b>TestService</b>.
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
public interface TestService {

    /**
     * Find all Test.
     * @return List Test
     */
    List<Test> findAllTest();

    /**
     * Save Test entity.
     * @param test : Test
     * @return Test saved
     */
    Test saveTest(Test test);

    /**
     * Find Test by TestId.
     * @param testId : String
     * @return Test
     */
    Test findTestById(String testId);

    /**
     * Get Question list by TestId.
     * @param testId : String
     * @return List Question
     */
    List<Question> getQuestionList(String testId);

    /**
     * Save Question list by TestId.
     * @param testId : String
     * @param questionIdListStr : String
     */
    void saveListQuestion(String testId, String questionIdListStr);

    /**
     * Import data from excel file.
     * @param file : MultipartFile
     * @param testId : String
     */
    void importExcel(MultipartFile file, String testId);
}
