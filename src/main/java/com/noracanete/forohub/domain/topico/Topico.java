package com.noracanete.forohub.domain.topico;

import com.noracanete.forohub.domain.usuario.Usuario;
import com.noracanete.forohub.domain.usuario.UsuarioRepository;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Table(name = "topicos")
@Entity(name = "Topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;
    private String fecha_creacion;

    @Enumerated(EnumType.STRING)
    private Status status;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "usuario_login")
    private String autor;

    private String curso;
    private Boolean borrado;

    //private UsuarioRepository usuarioRepository;

    public Topico(DatosRegistroTopico datos) {

        this.id = null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.fecha_creacion = datos.fecha_creacion();
        this.status = datos.status();
        //this.usuario = usuarioRepository.findByLogin(datos.login());
        this.autor = datos.login();
        this.curso = datos.curso();;
        this.borrado = false;
    }

    public void actualizarTopico(@Valid DatosActualizacionTopico datos){

        if (datos.titulo() != null){
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null){
            this.mensaje = datos.mensaje();
        }
        if (datos.fecha_creacion() != null){
            this.fecha_creacion = datos.fecha_creacion();
        }
        if (datos.status() != null){
            this.status = datos.status();
        }
        if (datos.autor() != null){
            this.autor = datos.autor();
        }
        if (datos.curso() != null){
            this.curso = datos.curso();
        }
    }
}
