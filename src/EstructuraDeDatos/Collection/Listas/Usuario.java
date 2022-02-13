package EstructuraDeDatos.Collection.Listas;

import java.util.Objects;

public class Usuario {
    String nombre;
    Integer id;
    String mail;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return telefono == usuario.telefono && nombre.equals(usuario.nombre) && id.equals(usuario.id) && mail.equals(usuario.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, mail, telefono);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", mail='" + mail + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
