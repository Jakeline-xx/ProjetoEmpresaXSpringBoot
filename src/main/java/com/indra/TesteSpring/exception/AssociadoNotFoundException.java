package com.indra.TesteSpring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.NoResultException;
import java.util.Optional;

public class AssociadoNotFoundException extends RuntimeException {
    public AssociadoNotFoundException(String msg) {
        super(msg);
    }
}