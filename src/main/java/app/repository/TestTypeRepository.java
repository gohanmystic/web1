package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.TestType;

/**
 * <b>TestTypeRepository</b>.
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
public interface TestTypeRepository extends JpaRepository<TestType, String> {
}
