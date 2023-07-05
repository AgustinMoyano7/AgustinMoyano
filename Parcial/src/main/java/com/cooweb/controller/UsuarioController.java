package com.cooweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.models.Usuario;

@RestController
public class UsuarioController {
	
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	
	
	
	
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		
		return "hola mundo";
	}
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		
		return List.of("Diego", "Juan", "Jose");
	}
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {
		
		
		Usuario usuario=new Usuario();
		 usuario.setNombre("Diego");
		 usuario.setApellido("Vargas");
		 usuario.setEmail("vargas123@gmail.com");
		 usuario.setTelefono("1234567");
		
		return usuario;
	}
	@RequestMapping(value="usuarios/{id}")
public Usuario getUsuario(@PathVariable Long id) {
		
		
		Usuario usuario=new Usuario();
		 usuario.setId(id);
		 usuario.setNombre("Diego");
		 usuario.setApellido("Vargas");
		 usuario.setEmail("vargas123@gmail.com");
		 usuario.setTelefono("1234567");
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/lista_user")
  public List<Usuario> listar_variosUsuarios() {
		
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1 = new Usuario();
		 usuario1.setId(3L);
		 usuario1.setNombre("Diego");
		 usuario1.setApellido("Vargas");
		 usuario1.setEmail("vargas123@gmail.com");
		 usuario1.setTelefono("1234567");
		 
		 Usuario usuario2 = new Usuario();
		 usuario2.setId(4L);
		 usuario2.setNombre("Jose");
		 usuario2.setApellido("Puentes");
		 usuario2.setEmail("jpuentes@gmail.com");
		 usuario2.setTelefono("141234567");
		 
		 usuarios.add(usuario1);
		 usuarios.add(usuario2);
		 
		
		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
	
		
		 List<Usuario> user=usuarioDao.obtenerUsuarios();
		 
		 return user ;
	}
	
	
}
