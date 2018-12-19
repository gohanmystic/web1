package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.TestResult;

public interface TestResultRepository extends JpaRepository<TestResult, String> {
}
