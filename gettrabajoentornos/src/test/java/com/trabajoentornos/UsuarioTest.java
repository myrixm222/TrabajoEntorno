package com.trabajoentornos;
import org.junit.Assert;
import org.junit.Test;


public class UsuarioTest {


    private static final String NOMBRE = "Juan Perez";
    private static final String EMAIL="juan.perez@gmail.com";


    @Test
    public void test_creacionUsuario_cestavacia() {
    Usuario usuario = new Usuario (NOMBRE, EMAIL);
    Assert.assertTrue(usuario.getCesta().getLibros().isEmpty());
    }


}
