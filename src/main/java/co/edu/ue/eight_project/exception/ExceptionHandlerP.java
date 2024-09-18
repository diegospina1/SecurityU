package co.edu.ue.eight_project.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerP {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity clientError404(){
        return ResponseEntity.notFound().build();
    }
}
