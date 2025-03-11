public class Perro extends Animal {
    // Error de compilacion: Diferente firma del metodo
   // @Override
    // public void hacerSonido(int volumen) { 
       // System.out.println("El perro ladra a volumen" + volumen);
    }
    
//}

// El metodo hacerSonido en Perro tiene una firma distinta a la de Animal, por lo que no es una sobrescritura valida y geenera un error de compilacion.