//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Celular cell = new Celular();
        cell.modelo = "Iphone";
        cell.ano = 2023;
        cell.color = "Negro";
        cell.memoria = 32.0;
        //Imprimir la cadena de caracteres que se obtuvo del metodo STRINGBUILDER.
        System.out.println(cell.detallecelular());
    }
}