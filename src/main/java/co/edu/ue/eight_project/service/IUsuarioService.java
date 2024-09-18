package co.edu.ue.eight_project.service;

import co.edu.ue.eight_project.model.Usuario;
import co.edu.ue.eight_project.model.dto.CrearUsuario;

import java.util.List;

public interface IUsuarioService {

    Usuario registerUsuario(CrearUsuario usuario);
    Usuario updateUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario searchByUsuarioId(Long id);
    Usuario searchByUsuarioEmail(String email);

    //Busqueda por documento
    Usuario searchByUsuarioDocumento(String documento);
    void deleteUsuario(Usuario usuario);
}
