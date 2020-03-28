package br.com.crud.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * @author Joao4018 25/03/2020.
 */
@Entity
@Getter
@Setter
public class User extends AbstractEntity {
    @NotEmpty(message = "O campo username do usuario é obrigatório")
    @Column(unique = true)
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private String name;
    @NotNull
    private boolean admin;
}
