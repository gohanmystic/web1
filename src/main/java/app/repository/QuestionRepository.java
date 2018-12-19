package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Question;

public interface QuestionRepository extends JpaRepository<Question, String> {

}
