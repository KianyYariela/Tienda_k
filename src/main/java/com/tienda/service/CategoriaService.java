package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se define la firma del método para pobtener los registros de la tabla categoria
    public List<Categoria> getCategorias(boolean activo);
    
    //Se recupera un objeto tipo categoria que corresponde al registro de la categoria que tiene el mimos idCategoria
    
    public Categoria getCategoria(Categoria categoria);
    
    //Se elimina el registro que tiene el idCategoria pasado por parametro
    
    public void delete(Categoria categoria);
    
    //Si hay un registro en la tabla categorias que tiene el idCategoria
    //Ese registro se actualiza sin no existe o el idCategoria es nulo
    //Se crea un registro en la tabla categoria
    public void save(Categoria categoria);
    
    
    
    
}
