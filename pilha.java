package exepilha;

public class pilha {
	String pilha [] = new String [28];
	int topopilha = -1;
	
	
	//insere elementos na pilha
    int push(int topo, String caracter){
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha<0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 28){
            System.out.println(null + "Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha]= caracter;
            System.out.println("Inserindo o elemento..: " + caracter);
            return(this.topopilha);
        }
    }
    
	

 // Método para imprimir a pilha como uma única frase
    void imprimir(int topo) {
        StringBuilder frase = new StringBuilder();
        for (int i = topo; i >= 0; i--) {
            frase.append(this.pilha[i]);
        }
        System.out.println(frase.toString());
    }

}
