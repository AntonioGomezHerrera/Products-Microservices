package com.nokster.springboot.app.item.models;

public class Item {

	private Producto producto;
	private Integer cantidad;

	public Item(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	public Item() {
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getTotal() {
		return producto.getPrecio() * cantidad.doubleValue();
	}

}
