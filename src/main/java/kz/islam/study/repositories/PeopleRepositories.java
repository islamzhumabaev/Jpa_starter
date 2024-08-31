package kz.islam.study.repositories;

import kz.islam.study.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepositories extends JpaRepository<Person, Integer> {
}
