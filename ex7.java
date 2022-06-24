import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class ex7 {
    
        public static void main(String[] args){
            try(Scanner entrada = new Scanner(System.in)){
                int idade;
                String Sexo;

                System.out.print("Informe a idade: ");
                idade = entrada.nextInt();

                System.out.print("Informe o sexo (M ou F): ");
                Sexo = entrada.next();

                if ((idade >= 17) && (Sexo == "M")){
                    System.out.print("TRUE");
                } else {
                    System.out.print("FALSE");
            }
        }
    }
}
