package edu.silvano.x007Collections;

import java.util.Objects;

/**
 * <h1>Serie</h1>
 * <h3>Objeto Serie</h3>
 * 
 * @author Silvano Filho
 * @version 1.0
 */
public class Serie {

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Série - Nome: " + nome + ", genero: " + genero + ", tempo de episódio: " + tempoEpisodio + ". ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;

    }

}
