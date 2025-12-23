package es.es601;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
    private String nome = "";
    private String cognome = "";
    private LocalDate dataDiNascita;
    private Character genere;
    private Boolean sposato;

    // constructors
    public Persona() {
    }

    public Persona(String nome, String cognome) {
        if (nome != null)
            this.nome = nome;
        if (nome != null)
            this.cognome = cognome;
    }

    public Persona(String nome, String cognome, LocalDate dataDiNascita, Character genere, Boolean sposato) {
        if (nome != null)
            this.nome = nome;
        if (nome != null)
            this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.genere = genere;
        this.sposato = sposato;
    }

    // methods
    public String getIniziali() {
        if (nome == null || cognome == null) {
            return null;
        }
        if (nome.isEmpty() || cognome.isEmpty()) {
            return "";
        }
        return ("" + nome.charAt(0) + cognome.charAt(0)).toUpperCase();
    }

    public Boolean isMaggiorenne(LocalDate dataRiferimento) {
        if (dataDiNascita == null || dataRiferimento == null) {
            return null;
        }

        int anni = Period.between(dataDiNascita, dataRiferimento).getYears();
        if (anni >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isMaggiorenne() {
        return isMaggiorenne(LocalDate.now());
    }

    // getters and setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Character getGenere() {
        return this.genere;
    }

    public void setGenere(Character genere) {
        this.genere = genere;
    }

    public Boolean getSposato() {
        return this.sposato;
    }

    public void setSposato(Boolean sposato) {
        this.sposato = sposato;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", cognome='" + getCognome() + "'" +
                ", dataDiNascita='" + getDataDiNascita() + "'" +
                ", genere='" + getGenere() + "'" +
                ", sposato='" + getSposato() + "'" +
                "}";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona p = (Persona) o;
        return Objects.equals(nome, p.nome) &&
                Objects.equals(cognome, p.cognome) &&
                Objects.equals(dataDiNascita, p.dataDiNascita) &&
                Objects.equals(genere, p.genere) &&
                Objects.equals(sposato, p.sposato);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, dataDiNascita, genere, sposato);
    }
}
