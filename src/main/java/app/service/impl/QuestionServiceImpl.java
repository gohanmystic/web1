package app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Question;
import app.repository.QuestionRepository;
import app.service.QuestionService;

/**
 * <b>QuestionServiceImpl</b>.
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
@Service
public class QuestionServiceImpl implements QuestionService {

    /** QuestionRepository. */
    @Autowired
    private QuestionRepository questionRepository;

    /**
     * Find all question.
     * @return List Question
     */
    public List<Question> findAllQuestion() {
        return questionRepository.findAll();
    }

    /**
     * Save question entity.
     * @param question : Question
     * @return Question saved.
     */
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    /**
     * Delete question by id.
     * @param id : Integer
     */
    public void deleteQuestionById(String id) {
        questionRepository.delete(id);
    }
}
