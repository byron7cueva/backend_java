package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id // Id se agraga para indicar que es la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicando que se genera automaticamente a traves de la secuencia
    @Column(name = "id_producto")
    private Integer idProducto;

    // Como el nombre de la propiedad y el campo de la tabla es el mismo, entonces no es necesario anotarlo con @Column
    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    // Relaciond de muchos a uno
    // La tabla productos se relaciona a categorias a traves del atributo id_categoria
    // A traves de esta relacion no vamos a insertar (insertable = false) ni actualizar (updatable = false) una nueva categoria
    // para hacerlo debemos hacerlos directamente desde la entity categoria
    // Simplemente nos servira para poder obtener a que categoria le pertenece un producto
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
