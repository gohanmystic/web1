package app.service;

import java.util.List;

import app.model.Question;

/**
 * <b>QuestionService</b>.
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
public interface QuestionService {

    /**
     * Find all question.
     * @return List Question
     */
    List<Question> findAllQuestion();

    /**
     * Save question entity.
     * @param question : Question
     * @return Question
     */
    Question saveQuestion(Question question);

    /**
     * Delete question.
     * @param id : Integer
     */
    void deleteQuestionById(String id);
}
