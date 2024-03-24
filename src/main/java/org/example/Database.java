package org.example;

import java.util.List;

public class Database {

    private List<Usuario> listaUsuarios = List.of(new Usuario(1,"Joseph", "joseph@gmail.com"), new Usuario(2,"Maria", "maria@gmail.com"), new Usuario(3,"Pedro", "pedro@gmail.com"));

    public Usuario findById(int idUsuario){

        for (Usuario usuario : listaUsuarios) {
            if(usuario.getId() == idUsuario){
                return usuario;
            }
        }
        return null;
    }


}
