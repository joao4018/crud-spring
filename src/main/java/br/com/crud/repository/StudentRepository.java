package br.com.crud.repository;

import br.com.crud.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author Joao4018 22/03/2020.
 */
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContaining(String name);
}
