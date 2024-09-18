package co.edu.ue.eight_project.dao;

import co.edu.ue.eight_project.model.Usuario;

import java.util.List;

public interface IUsuarioDao {

    Usuario registerUsuario(Usuario usuario);
    Usuario updateUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario searchByUsuarioId(Long id);
    Usuario searchByUsuarioEmail(String email);

    //Busqueda por documento
    Usuario searchByUsuarioDocumento(String documento);
    void deleteUsuario(Usuario usuario);
}
