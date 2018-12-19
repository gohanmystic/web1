package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.TestType;

public interface TestTypeRepository extends JpaRepository<TestType, String> {
}
