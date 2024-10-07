public class Celular {
    String modelo;
    Integer ano;
    Double memoria;
    String color;

    /*  +++++++++++Creación del metodo para CONCATENAR palabras.++++++++
        - No recibe parámetros pero retorna una cadena de caracteres.
     */

    public String detallecelular(){
        //StringBuilder es una clase propia de Java.
        StringBuilder sb = new StringBuilder();

        sb.append("Año del celular = " + this.ano + "      ");
        sb.append("Modelo del celular = " + this.modelo + "    ");
        sb.append("Color del celular = " + this.color + "      ");
        sb.append("Memoria del celular= " + this.memoria + "     ");
        return sb.toString(); //Transformo a texto antes de retornar por si existe otro tipo de datos.

        /*
        This:
        1. Llama a los atributos de la clase.
        2. Existe una jerarquía, las clases, las características, los atributos.
        3. Si no se coloca por default se hace referencia a los atributos de la clase,
        a menos que exista una variable dentro del metodo.
        */


    }
}
