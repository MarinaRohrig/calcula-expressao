import java.util.ArrayList;

public class Main {
            public static void main(String[] args) {
              String expressao = "4.2*2+4.2/2";
              char[] expressaoEmChar = expressao.toCharArray();
                ArrayList<String> operadores = new ArrayList<>();
                ArrayList<String> valores = new ArrayList<>();
                for(int i = 0; i < expressaoEmChar.length; i++){
                    if (expressaoEmChar[i] == '+' || expressaoEmChar[i] == '-'
                            || expressaoEmChar[i] == '/' || expressaoEmChar[i] == '*'){
                        operadores.add(String.valueOf(expressaoEmChar[i]));
                    }else if ((i < expressaoEmChar.length-1) && (expressaoEmChar[i+1] == '.')){
                            valores.add(String.valueOf(expressaoEmChar[i])+String.valueOf(expressaoEmChar[i+1])+String.valueOf(expressaoEmChar[i+2]));
                            i+=2;
                        } else{
                        valores.add(String.valueOf(expressaoEmChar[i]));
                    }
                    }
                System.out.println("Operadores: "+operadores);
                System.out.println("Valores: "+valores);
                CalculaRecursivo calculaRecursivo = new CalculaRecursivo();
                System.out.println("Expressão: "+expressao + "\nResultado: "+calculaRecursivo.calculaRecursivo(operadores,valores));

            }
        }
