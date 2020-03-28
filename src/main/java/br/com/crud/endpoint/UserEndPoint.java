package br.com.crud.endpoint;

import br.com.crud.model.User;
import br.com.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @author joao4018 22/03/20.
 */
@RestController
@RequestMapping("v1")
public class UserEndPoint {

    private final UserRepository userDAO;

    @Autowired
    public UserEndPoint(UserRepository userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping(path = "signup")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> save(@Valid @RequestBody User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password =  passwordEncoder.encode(user.getPassword());
        User userSignup = new User(user.getUsername(),password,user.getName(),user.isAdmin());
        return new ResponseEntity<>(userDAO.save(userSignup), HttpStatus.CREATED);
    }

}
