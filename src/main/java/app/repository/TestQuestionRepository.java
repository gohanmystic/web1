package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import app.model.TestQuestion;
import app.model.TestQuestionPk;

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
