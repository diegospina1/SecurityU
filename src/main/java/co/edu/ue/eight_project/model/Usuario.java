package co.edu.ue.eight_project.model;

import co.edu.ue.eight_project.model.dto.CrearUsuario;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "datos")
public class Usuario implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dat_id", nullable = false)
    private Long datId;

    @Column(name = "dat_names", length = 150)
    private String datNames;

    @Column(name = "dat_lastNames", length = 150)
    private String datLastNames;

    @Column(name = "dat_document", length = 15)
    private String datDocument;

    @Column(name = "dat_email", length = 250)
    private String datEmail;

    @Column(name = "dat_password", length = 25)
    private String datPassword;

    public Usuario(CrearUsuario usuario) {
        this.datNames = usuario.datNames();
        this.datLastNames = usuario.datLastNames();
        this.datDocument = usuario.datDocument();
        this.datEmail = usuario.datEmail();
        this.datPassword = usuario.datPassword();
    }

    public Usuario(){

    }

    //Getters y setters

    public Long getDatId() {
        return datId;
    }

    public void setDatId(Long datId) {
        this.datId = datId;
    }

    public String getDatNames() {
        return datNames;
    }

    public void setDatNames(String datNames) {
        this.datNames = datNames;
    }

    public String getDatLastNames() {
        return datLastNames;
    }

    public void setDatLastNames(String datLastNames) {
        this.datLastNames = datLastNames;
    }

    public String getDatDocument() {
        return datDocument;
    }

    public void setDatDocument(String datDocument) {
        this.datDocument = datDocument;
    }

    public String getDatEmail() {
        return datEmail;
    }

    public void setDatEmail(String datEmail) {
        this.datEmail = datEmail;
    }

    public String getDatPassword() {
        return datPassword;
    }

    public void setDatPassword(String datPassword) {
        this.datPassword = datPassword;
    }
}