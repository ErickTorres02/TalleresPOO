
 public class Libro2 {
    // Propiedades
    String titulo;
    String autor;
    int numeroPaginas;
    
    
    public Libro2() {
        titulo = "Desconocido";
        autor = "Anónimo";
        numeroPaginas = 0;
    }
    
    
    public Libro2(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String toString() {
        return "Libro:\n  Título: " + titulo + "\n  Autor: " + autor + "\n  Número de páginas: " + numeroPaginas;
    }
}


class CuentaBancaria {
    
    String numeroCuenta;
    double saldo;
    String tipoCuenta;
    
    
    public CuentaBancaria() {
        numeroCuenta = "000000";
        saldo = 0.0;
        tipoCuenta = "Desconocida";
    }
    
    
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        saldo = 0.0;
    }
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    @Override
    public String toString() {
        return "CuentaBancaria:\n  Número de cuenta: " + numeroCuenta + "\n  Saldo: " + saldo + "\n  Tipo de cuenta: " + tipoCuenta;
    }


    public void mostrarDetalles() {
        
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDetalles'");
    }
}

class Estudiante {
    
    String nombre;
    int edad;
    String curso;
    
   
    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        curso = "Sin asignar";
    }
    
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        curso = "Sin asignar";
    }
    
    
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);  
        this.curso = curso;
    }
    
   @Override
    public String toString() {
        return "Estudiante:\n  Nombre: " + nombre + "\n  Edad: " + edad + "\n  Curso: " + curso;
}

public void mostrarDetalles() {
    
    throw new UnsupportedOperationException("Unimplemented method 'mostrarDetalles'");
}
}

