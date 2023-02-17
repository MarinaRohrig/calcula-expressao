import java.util.ArrayList;

public class CalculaRecursivo {
    public Double calculaRecursivo(ArrayList<String> operadores, ArrayList<String> valores) {
        Double result = 0.0;
        int j = 0;
        for (int i = 0; i < operadores.size(); i++) {
            if (operadores.get(i).equals("/") || operadores.get(i).equals("*")) {
                j = i;
                if (operadores.get(i).equals("/")) {
                    result = Double.parseDouble(valores.get(i)) / Double.parseDouble(valores.get(i + 1));
                    i= operadores.size();
                } else if (operadores.get(i).equals("*")) {
                    result = Double.parseDouble(valores.get(i)) * Double.parseDouble(valores.get(i + 1));
                    i = operadores.size();
                }
            }
        }
        if (operadores.get(j).equals("+")) {
            result = Double.parseDouble(valores.get(j)) + Double.parseDouble(valores.get(j + 1));
        } else if (operadores.get(j).equals("-")) {
            result = Double.parseDouble(valores.get(j)) - Double.parseDouble(valores.get(j + 1));
        }
        operadores.remove(j);
        valores.add(j, String.valueOf(result));
        valores.remove(j+1);
        valores.remove(j+1);

        if (operadores.size() == 0){
            return Double.parseDouble(valores.get(0));
        }
        return calculaRecursivo(operadores, valores);
    }

}
