package vn.com.fsoft.service;

import java.util.List;

import vn.com.fsoft.model.TestType;

/**
 * <b>TestTypeService</b>.
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
public interface TestTypeService {

    /**
     * Find all TestType.
     * @return List TestType
     */
    List<TestType> findAllTestType();
}
