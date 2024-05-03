public class pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionMin;
    boolean incluidoEnPlan;

    double sumaDeEvaluaciones;
    double totalDeEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("el nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaLanzamiento);
    }
    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeEvaluaciones++;
    }
    double calculaMedia(){
        return sumaDeEvaluaciones / totalDeEvaluaciones;
    }
}
