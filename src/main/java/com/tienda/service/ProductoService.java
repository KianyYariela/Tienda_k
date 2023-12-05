package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //Se define la firma del método para pobtener los registros de la tabla producto
    public List<Producto> getProductos(boolean activo);
    
    //Se recupera un objeto tipo producto que corresponde al registro de la producto que tiene el mimos idProducto
    
    public Producto getProducto(Producto producto);
    
    //Se elimina el registro que tiene el idProducto pasado por parametro
    
    public void delete(Producto producto);
    
    //Si hay un registro en la tabla productos que tiene el idProducto
    //Ese registro se actualiza sin no existe o el idProducto es nulo
    //Se crea un registro en la tabla producto
    public void save(Producto producto);
    
    //Una consulta tipo Query
    public List<Producto> consultaQuery(double precioInf,double precioSup);
    
    
    
}
