package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import app.common.Constants;
import app.model.Question;
import app.model.Test;
import app.model.TestType;
import app.service.TestService;
import app.service.TestTypeService;

/**
 * <b>TestController</b>.
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
@Controller
@RequestMapping("test")
public class TestController {

    /** List test view name. */
    public static final String LIST_VIEW_NAME = "list-test";
    /** Create test view name. */
    public static final String CREATE_VIEW_NAME = "create-test";
    /** Input question view name. */
    public static final String INPUT_QUESTION_VIEW_NAME = "input-question";
    /** Default model name. */
    public static final String DEFAULT_MODEL_NAME = "command";
    /** Update model name. */
    public static final String UPDATE_MODEL_NAME = "test";
    /** Base API. */
    public static final String BASE_API = "test";

    /** TestService. */
    @Autowired
    private TestService testService;

    /** TestTypeService. */
    @Autowired
    private TestTypeService testTypeService;

    /**
     * Show test list page.
     * @param model : Model
     * @return ModelAndView
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ModelAndView showTestListPage(Model model) {
        List<Test> testList = testService.findAllTest();
        model.addAttribute("testList", testList);

        return new ModelAndView(LIST_VIEW_NAME);
    }

    /**
     * Show create test page.
     * @param model : Model
     * @return ModelAndView
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public ModelAndView showCreateTestPage(Model model) {
        List<TestType> testTypeList = testTypeService.findAllTestType();
        model.addAttribute("testTypeList", testTypeList);

        return new ModelAndView(CREATE_VIEW_NAME, DEFAULT_MODEL_NAME, new Test());
    }

    /**
     * Handle create test form submit.
     * @param test : Test
     * @param result : BindingResult
     * @return ModelAndView
     */
    @RequestMapping(value = "createAction", method = RequestMethod.POST)
    public ModelAndView createTestAction(@Validated @ModelAttribute(DEFAULT_MODEL_NAME) Test test,
            BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView(CREATE_VIEW_NAME, DEFAULT_MODEL_NAME, test);
        } else {
            testService.saveTest(test);
            return new ModelAndView("redirect:/" + BASE_API + "/list");
        }
    }

    /**
     * Show input question page.
     * @param testId : String
     * @param model : Model
     * @return ModelAndView
     */
    @RequestMapping(value = "inputQuestion/{testId}", method = RequestMethod.GET)
    public ModelAndView showInputQuesionPage(@PathVariable String testId, Model model) {
        try {
            List<Question> questionList = testService.getQuestionList(testId);
            model.addAttribute("questionList", questionList);
            model.addAttribute("test", testService.findTestById(testId));
        } catch (NullPointerException e) {
            return new ModelAndView("redirect:/" + Constants.ERROR_PAGE);
        }

        return new ModelAndView(INPUT_QUESTION_VIEW_NAME);
    }

    /**
     * Handle input question form submit.
     * @param testId : String
     * @param questionIdList : String
     * @return ModelAndView
     */
    @RequestMapping(value = "inputQuestionAction", method = RequestMethod.POST)
    public ModelAndView inputQuestionAction(
            @RequestParam("testId") String testId,
            @RequestParam("questionIdList") String questionIdList) {
        testService.saveListQuestion(testId, questionIdList);

        return new ModelAndView("redirect:/" + Constants.TEST_INPUT_QUESTION_PAGE + "/" + testId);
    }

    /**
     * Handle import excel.
     * @param testId : String
     * @param file : MultipartFile
     * @return ModelAndView
     */
    @RequestMapping(value = "importExcel/{testId}", method = RequestMethod.POST)
    public ModelAndView importExcel(
            @PathVariable("testId") String testId,
            @RequestParam("file") MultipartFile file) {
        try {
            testService.importExcel(file, testId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ModelAndView("redirect:/" + Constants.TEST_INPUT_QUESTION_PAGE + "/" + testId);
    }
}
