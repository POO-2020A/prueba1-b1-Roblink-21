import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/
class Palindrome {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
   	//write your code below
   	String[] piezas = s.split(" ");
    String frase = "";

        for (int i = 0; i < piezas.length; i++) {
            frase = frase + piezas[i];
        }

        String[] letras = frase.split("");

        for (int i = 0; i < letras.length; i++) {
            if ((letras[i].equals("á"))) {
                letras[i].replace("á", "a");
            }
            if ((letras[i].equals("ñ"))) {
                letras[i].replace("ñ", "n");
            }
        }

        String alrreves = "";

        for (int i = letras.length - 1; i >= 0; i--) {
            alrreves = alrreves + letras[i];
        }

        boolean palindromo = false;

        if (frase.equals(alrreves)) {
            palindromo = true;
            System.out.println(palindromo);
        } else {
            System.out.println(palindromo);
        }
   	
  }
}
