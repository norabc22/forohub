package com.noracanete.forohub.domain.usuario;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    UserDetails findByLogin(@NotNull String login);
}
