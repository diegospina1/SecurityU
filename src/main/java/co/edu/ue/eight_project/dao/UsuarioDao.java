package co.edu.ue.eight_project.dao;

import co.edu.ue.eight_project.model.Usuario;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioDao implements IUsuarioDao{

    @Autowired
    IUsuarioJpaDAO jpaService;

    @Override
    public Usuario registerUsuario(Usuario usuario) {
        return jpaService.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return jpaService.findAll();
    }

    @Override
    public Usuario searchByUsuarioId(Long id) {
        return jpaService.findByDatId(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Usuario searchByUsuarioEmail(String email) {
        return jpaService.findByDatEmail(email);
    }

    @Override
    public Usuario searchByUsuarioDocumento(String documento) {
        return jpaService.findByDatDocument(documento);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {

    }
}
