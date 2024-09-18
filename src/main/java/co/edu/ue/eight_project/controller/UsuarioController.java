package co.edu.ue.eight_project.controller;

import co.edu.ue.eight_project.model.Usuario;
import co.edu.ue.eight_project.model.dto.CrearUsuario;
import co.edu.ue.eight_project.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final IUsuarioService service;

    @Autowired
    public UsuarioController(IUsuarioService service) {
        this.service = service;
    }

    @GetMapping("/listar-todos")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(service.listarUsuarios());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.searchByUsuarioId(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> getUsuario(@RequestBody CrearUsuario usuario){
        return ResponseEntity.ok(service.registerUsuario(usuario));
    }



}
