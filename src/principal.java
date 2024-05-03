public class principal {
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula();
        miPelicula.nombre = "encanto";
        miPelicula.fechaLanzamiento = 2021;
        miPelicula.duracionMin = 120;
        
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.sumaDeEvaluaciones);
        System.out.println(miPelicula.totalDeEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        pelicula otraPelicula = new pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 2020;
        otraPelicula.duracionMin = 180;
    }
}
