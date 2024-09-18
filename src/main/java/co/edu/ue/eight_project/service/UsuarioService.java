package co.edu.ue.eight_project.service;

import co.edu.ue.eight_project.dao.IUsuarioDao;
import co.edu.ue.eight_project.model.Usuario;
import co.edu.ue.eight_project.model.dto.CrearUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioDao dao;

    @Override
    public Usuario registerUsuario(CrearUsuario usuario) {
        if (!usuario.equals(null)) {
            Usuario usuarioNuevo = new Usuario(usuario);
            return dao.registerUsuario(usuarioNuevo);
        } else {
            return null;
        }
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        if (usuario != null) {
            return dao.updateUsuario(usuario);
        } else {
            return null;
        }
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return dao.listarUsuarios();
    }

    @Override
    public Usuario searchByUsuarioId(Long id) {
        return dao.searchByUsuarioId(id);
    }

    @Override
    public Usuario searchByUsuarioEmail(String email) {
        return dao.searchByUsuarioEmail(email);
    }

    @Override
    public Usuario searchByUsuarioDocumento(String documento) {
        return dao.searchByUsuarioDocumento(documento);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {

    }
}
