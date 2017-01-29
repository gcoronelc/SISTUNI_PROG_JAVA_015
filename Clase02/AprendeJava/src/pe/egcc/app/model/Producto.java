package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    // Valores iniciales del objeto
    /*this.nombre = "Cocina";
    this.precio = 1800.00;
    this.stock = 800;
    this.activo = true;*/
    this("Cama Matrimonial", 4500.0, 1000);
    System.out.println("Objeto creadeo.");
  }

  /**
   * Constructo adicional.
   * 
   * @param nombre Nombre del producto.
   * @param precio Precio del producto.
   * @param stock Stock del producto.
   * @param activo Estado del producto.
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }
  
  /**
   * Constructo adicional.
   * 
   * @param nombre Nombre del producto.
   * @param precio Precio del producto.
   * @param stock Stock del producto.
   */
  public Producto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = true;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
