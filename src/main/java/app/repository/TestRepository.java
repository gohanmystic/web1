package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Test;

public interface TestRepository extends JpaRepository<Test, String> {
}
