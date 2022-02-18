package JavaSrtrings;

public class Strings {
   public static void main(String[] args) {
       
      String alfabeto;
      alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
      
      // comprimento da string
      System.out.println("O alfabeto possui  : " + alfabeto.length() + " letras");
      
      //metodos para transformar string em letras minusculas
      System.out.println(alfabeto.toLowerCase());

      //metodo para transformar string em letras maiusculas
      System.out.println(alfabeto.toUpperCase());

      //Encontrando um caractere em uma string
      String txt = "Primeiros passos com java";
      System.out.println(txt.indexOf("i"));


      //Concatenação de string
      String primeiroNome = "placido";
      String segundoNome = "mota";
      System.out.println(primeiroNome + " " + segundoNome);


      //usando o metodo concat()
      System.out.println(primeiroNome.concat(segundoNome));
   }
 
}
