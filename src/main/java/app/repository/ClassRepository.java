package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Classes;

public interface ClassRepository extends JpaRepository<Classes, String> {
}
