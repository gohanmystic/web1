package app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import app.model.Question;
import app.model.Test;
import app.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    /* (non-Javadoc)
     * @see app.service.TestService#findAllTest()
     */
    public List<Test> findAllTest() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see app.service.TestService#saveTest(app.model.Test)
     */
    public Test saveTest(Test test) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see app.service.TestService#findTestById(java.lang.String)
     */
    public Test findTestById(String testId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see app.service.TestService#getQuestionList(java.lang.String)
     */
    public List<Question> getQuestionList(String testId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see app.service.TestService#saveListQuestion(java.lang.String, java.lang.String)
     */
    public void saveListQuestion(String testId, String questionIdListStr) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see app.service.TestService#importExcel(org.springframework.web.multipart.MultipartFile, java.lang.String)
     */
    public void importExcel(MultipartFile file, String testId) {
        // TODO Auto-generated method stub
        
    }
}
