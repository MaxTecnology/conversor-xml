package br.com.maxtecnology.conversorxml.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public class AbstractModel <Long extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "version")
    private String version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof AbstractModel<?> that)) return false;

        return id == that.id && Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        int result = java.lang.Long.hashCode(id);
        result = 31 * result + Objects.hashCode(version);
        return result;
    }
}
