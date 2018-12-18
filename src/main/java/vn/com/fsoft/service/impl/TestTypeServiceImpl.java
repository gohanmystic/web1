package vn.com.fsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.fsoft.model.TestType;
import vn.com.fsoft.repository.TestTypeRepository;
import vn.com.fsoft.service.TestTypeService;

/**
 * <b>TestTypeServiceImpl</b>.
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
public class TestTypeServiceImpl implements TestTypeService {

    /** TestTypeRepository. */
    @Autowired
    private TestTypeRepository testTypeRepository;

    /**
     * Find all TestType.
     * @return List TestType
     */
    public List<TestType> findAllTestType() {
        return testTypeRepository.findAll();
    }
}
