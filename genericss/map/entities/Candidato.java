package entities;

import java.util.Objects;

public class Candidato {
    private final String candidato;

    public Candidato(String candidato) {
        this.candidato = candidato;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato1 = (Candidato) o;
        return Objects.equals(candidato, candidato1.candidato);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(candidato);
    }

    @Override
    public String toString() {
        return candidato;
    }
}
