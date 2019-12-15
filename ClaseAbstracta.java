
//  Estudiando Clases Abstractas

// Clase Figura geometrica 

// definimos la clase abstracta con el modificador de acesso, abstract 
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica (String tipoFigura){
           
        this.tipoFigura = tipoFigura;
    
    }
    // La clase padre no define el comportamiento sino no las clases hijas.
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
   
}



// Clase circulo


public class Circulo extends FiguraGeometrica {
    
    public Circulo ( String tipoFigura){
    
    super(tipoFigura);
    
    }
    @Override
    public void dibujar (){
    
        System.out.println("Aqui deberia dibujar: "  + this.getClass().getSimpleName() );
    }
}


//  Clase Triangulo 



public class Triangulo extends FiguraGeometrica {
    
     public Triangulo ( String tipoFigura){
    
    super(tipoFigura);
    
    }
    @Override
    public void dibujar (){
    
        System.out.println("Aqui deberia dibujar: "  + this.getClass().getSimpleName() );
    }
    
    
}

// Clase Rectangulo


public class Rectangulo extends FiguraGeometrica {
    
     public Rectangulo ( String tipoFigura){
    
    super(tipoFigura);
    
    }
    @Override
    public void dibujar (){
    
        System.out.println("Aqui deberia dibujar: "  + this.getClass().getSimpleName() );
    }
    
}


// Clases Pruebla clases abstractas





public class EjemplosClasesAbstractas {

    public static void main(String[] args) {

        // no podemos Crear objetos de esa clase
        //  FiguraGeometrica figuraGeometrica = new FiguraGeometrica ();
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");

        System.out.println(rectangulo);

        rectangulo.dibujar();

        FiguraGeometrica triangulo = new Rectangulo("Triangulo");

        System.out.println(triangulo);

        rectangulo.dibujar();

        FiguraGeometrica circulo = new Rectangulo("Circulo");

        System.out.println(circulo);

        rectangulo.dibujar();

    }

}



/**********************************  SALIDA *************************************


                FiguraGeometrica{tipoFigura=Rectangulo}
                Aqui deberia dibujar: Rectangulo
                FiguraGeometrica{tipoFigura=Triangulo}
                Aqui deberia dibujar: Rectangulo
                FiguraGeometrica{tipoFigura=Circulo}
                Aqui deberia dibujar: Rectangulo
 

**********************************   FIN  ***************************************/






