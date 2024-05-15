class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String material;
    private String uso;
    private String herramienta;

    public Producto(String nombre, String descripcion, double precio, int stock, String material, String uso, String herramienta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.material = material;
        this.uso = uso;
        this.herramienta = herramienta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMaterial() {
        return material;
    }

    public String getUso() {
        return uso;
    }

    public String getHerramienta() {
        return herramienta;
    }
}