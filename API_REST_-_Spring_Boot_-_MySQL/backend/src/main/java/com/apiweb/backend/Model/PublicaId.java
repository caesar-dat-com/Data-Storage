package com.apiweb.backend.Model;

import java.io.Serializable;
import java.util.Objects;

public class PublicaId implements Serializable {
    private int autor;
    private int documento;

    public PublicaId() {}

    public PublicaId(int autor, int documento) {
        this.autor = autor;
        this.documento = documento;
    }

    // Getters, Setters, equals, and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicaId that = (PublicaId) o;
        return autor == that.autor && documento == that.documento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, documento);
    }
}
