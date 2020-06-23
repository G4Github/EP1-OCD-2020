package calculadora;

abstract class operacoes {
    // máximo e mínimo de dígitos do inteiro
    public final int minDigitos = 2;
    public final int maxDigitos = 32;
    // número de dígitos do expoente do float
    public final int numDigitosExpoente = 8;
    // número de dígitos da mantissa do float 
    public final int numDigitosMantissa = 23;
    
    // inteiro binário que representa o 1 com 31 bits
    protected final String strSoma1 = "00000000000000000000000000000001";
 
    // mensagens de erro que podem ser geradas
    protected final String overflowPos = "ERRO TODOS + (1)";
    protected final String overflowNeg = "ERRO TODOS - (1)";
    protected final String underflowPos = "ERRO TODOS + (2)";
    protected final String underflowNeg = "ERRO TODOS - (2)";
    protected final String divisaoPorZero = "ERRO DIVISAO ZERO";
    
    // método que retorna a soma de dois inteiros sem considerar o sinal
    String soma(String binario1,String binario2){
        // char para carregar o carry e array que conterá o binário resultante
        char carry = '0',
             binarioResultante [] = new char[binario1.length()];
        
            // for que faz a soma comparando os 0's e 1's dos binárois 
            for (int i = binarioResultante.length - 1; i >= 0; i--) {
                if(binario1.charAt(i) == '0' && binario2.charAt(i) == '0'){
                    if(carry == '0') binarioResultante [i] = '0';
                    else{
                    binarioResultante [i] = '1';
                    carry = '0';
                    } 
                }
                else if(binario1.charAt(i) == '1' && binario2.charAt(i) == '1'){
                    if(carry == '0'){ 
                        binarioResultante [i] = '0';
                        carry = '1';
                    }
                    else binarioResultante [i] = '1';
                }
                else{
                    if(carry == '0') binarioResultante [i] = '1';
                    else binarioResultante [i] = '0';
                }
            }
            
            /**************************************************************** 
             adiciona 1 ao final do binário caso o carry seja 1 no final e
             , caso contrário, não adiciona e só retorna o binário resultante
            *****************************************************************/
            if(carry == '1') return "1" + new String (binarioResultante);
            else return new String (binarioResultante);
    }    
    
    // método que retorno o complemento de dois de um binário
    protected String complementoDeDois(String binario){
        // o binário é transformado de String para array e tem seus bits invertidos
        int i;
        char [] binarioAtual = binario.toCharArray();
            for (i = 0; i < binarioAtual.length; i++) {
                if(binarioAtual [i] == '0') binarioAtual [i] = '1';
                else binarioAtual [i] = '0';
            }
        
        /* 
         o binario de 31 bits é cortado para ficar do mesmo tamanho e
         somado ao binário que foi passa como parâmetro
        */
        i = strSoma1.length() - binario.length();
        String binario2etapa = strSoma1.substring(i, strSoma1.length()),
               binarioRetorno = soma(new String(binarioAtual),binario2etapa);
        
            /********************************************************************************
             caso a soma tenha gerado um carry, ele é cortado do binário que será retornado e
             e o 1 usado anteriormente é somado novamente
            *********************************************************************************/
            if(binarioRetorno.length() > binario.length()){
                binarioRetorno = binarioRetorno.substring(1,binarioRetorno.length());
                binarioRetorno = soma(binarioRetorno, binario2etapa);
            }
        return binarioRetorno;
    }
    
    /****************************************
     método que faz o right shift em um array
     usando o primeiro bit como inicial
    ******************************************/
    void rightShitArray(char [] arr){
        int i = 0;
        char intAux,troca = arr [i++];
            for (;i < arr.length; i++) {
                intAux = arr [i];
                arr [i] = troca;
                troca = intAux;
            }
    }
    
    /*******************************************************
     método que faz o right shift em um array
     usando o bit que foi passada com parâmetro como inicial
    ********************************************************/
    void rightShitArray(char [] arr,char ini){
        char intAux,troca = ini;
            for (int i = 0; i < arr.length; i++) {
                intAux = arr [i];
                arr [i] = troca;
                troca = intAux;
            }
    }
    
    /****************************************
     método que faz o left shift em um array
     usando o ultimo bit como inicial
    ******************************************/    
    void leftShitArray(char [] arr){
        int i = arr.length - 1;
        char intAux,troca = arr [i--];
            for (;i >= 0; i--) {
                intAux = arr [i];
                arr [i] = troca;
                troca = intAux;
            }
    }
    
    /*******************************************************
     método que faz o left shift em um array
     usando o bit que foi passada com parâmetro como inicial
    ********************************************************/    
    void leftShitArray(char [] arr,char ini){
        char intAux,troca = ini;
            for (int i = arr.length - 1; i >= 0; i--) {
                intAux = arr [i];
                arr [i] = troca;
                troca = intAux;
            }
    }
}