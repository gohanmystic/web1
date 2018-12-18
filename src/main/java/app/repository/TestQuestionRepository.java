package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import app.model.TestQuestion;
import app.model.TestQuestionPk;

/**
 * <b>TestQuestionRepository</b>.
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
public interface TestQuestionRepository extends JpaRepository<TestQuestion, TestQuestionPk> {

    /**
     * Delete TestQuestion by TestId.
     * @param testId : String
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM TestQuestion testQuestion WHERE testQuestion.testId = ?1")
    void deleteByTestId(String testId);
}
