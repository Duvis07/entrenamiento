package co.com.sofkau.entrenamiento.curso.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.values.*;

public class AgregarDirectriz extends Command {
    private final Directiz directiz;
    private final MentoriaId mentoriaId;
    private final CursoId cursoId;

    public AgregarDirectriz(Directiz directiz, MentoriaId mentoriaId, CursoId cursoId) {
        this.directiz = directiz;
        this.mentoriaId = mentoriaId;
        this.cursoId = cursoId;
        
    }

    public Directiz getDirectiz() {
        return directiz;
    }

    public MentoriaId getMentoriaId() {
        return mentoriaId;
    }

    public CursoId getCursoId() {
        return cursoId;
    }
}