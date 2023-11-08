package aulaas;
import java.util.Stack;

public class inversao {
	    public static String inverte(String input) {
	        Stack<Character> pilha = new Stack<>();
	        StringBuilder palavrasinvertidas = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c != ' ') {
	                pilha.push(c);
	            } else {
	                while (!pilha.isEmpty()) {
	                    palavrasinvertidas.append(pilha.pop());
	                }
	                palavrasinvertidas.append(' ');
	            }
	        }
	        
	        while (!pilha.isEmpty()) {
	            palavrasinvertidas.append(pilha.pop());
	        }
	        return palavrasinvertidas.toString();
	    }

	    public static void main(String[] args) {
	        String frase = "ESTE EXERCICIO E MUITO FACIL";
	        String fraseinvertida = inverte(frase);
	        System.out.println(fraseinvertida);
	    }
	}

