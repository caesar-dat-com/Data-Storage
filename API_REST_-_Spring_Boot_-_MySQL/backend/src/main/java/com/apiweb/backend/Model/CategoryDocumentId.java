package com.apiweb.backend.Model;

import java.io.Serializable;
import java.util.Objects;

public class CategoryDocumentId implements Serializable {
    private int categoria;
    private int documento;

    public CategoryDocumentId() {}

    public CategoryDocumentId(int categoria, int documento) {
        this.categoria = categoria;
        this.documento = documento;
    }

    // Getters, Setters, equals, and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDocumentId that = (CategoryDocumentId) o;
        return categoria == that.categoria && documento == that.documento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria, documento);
    }
}
