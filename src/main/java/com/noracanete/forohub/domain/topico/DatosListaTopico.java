package com.noracanete.forohub.domain.topico;

public record DatosListaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha_creacion,
        Status status,
        String autor,
        String curso) {

    public DatosListaTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha_creacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }

}

