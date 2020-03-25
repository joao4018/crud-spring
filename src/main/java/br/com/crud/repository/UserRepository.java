package br.com.crud.repository;

import br.com.crud.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author jaoo4018 25/03/2020.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);
}
