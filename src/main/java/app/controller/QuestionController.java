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
import org.springframework.web.servlet.ModelAndView;

import app.model.Question;
import app.service.QuestionService;

/**
 * <b>QuestionController</b>.
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
@Controller
@RequestMapping("question")
public class QuestionController {

    /** List question view name. */
    public static final String LIST_VIEW_NAME = "list-question";
    /** Create question view name. */
    public static final String CREATE_VIEW_NAME = "create-question";
    /** Default model name. */
    public static final String DEFAULT_MODEL_NAME = "command";
    /** Update model name. */
    public static final String UPDATE_MODEL_NAME = "question";
    /** Base API. */
    public static final String BASE_API = "question";

    /** QuestionService. */
    @Autowired
    private QuestionService questionService;

    /**
     * Show list question page.
     * @param model : Model
     * @return ModelAndView
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ModelAndView showQuestionListPage(Model model) {
        List<Question> questionList = questionService.findAllQuestion();
        model.addAttribute("questionList", questionList);

        return new ModelAndView(LIST_VIEW_NAME);
    }

    /**
     * Show create question page.
     * @return ModelAndView
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public ModelAndView showCreateQuestionPage() {
        return new ModelAndView(CREATE_VIEW_NAME, DEFAULT_MODEL_NAME, new Question());
    }

    /**
     * Handle create question form submit.
     * @param question : Question
     * @param result : BindingResult
     * @return ModelAndView
     */
    @RequestMapping(value = "createAction", method = RequestMethod.POST)
    public ModelAndView createQuestionAction(@Validated @ModelAttribute(DEFAULT_MODEL_NAME) Question question,
            BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView(CREATE_VIEW_NAME, DEFAULT_MODEL_NAME, question);
        } else {
            questionService.saveQuestion(question);
            return new ModelAndView("redirect:/" + BASE_API + "/list");
        }
    }

    /**
     * Handle delete question.
     * @param id : String
     * @return ModelAndView
     */
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ModelAndView deleteQuestion(@PathVariable("id") Integer id) {
        questionService.deleteQuestionById(id);

        return new ModelAndView("redirect:/" + BASE_API + "/list");
    }
}
