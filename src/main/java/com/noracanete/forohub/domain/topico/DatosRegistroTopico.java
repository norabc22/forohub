package com.noracanete.forohub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String fecha_creacion,
        @NotNull Status status,

        @NotBlank String login,

        @NotNull String curso) {

}
