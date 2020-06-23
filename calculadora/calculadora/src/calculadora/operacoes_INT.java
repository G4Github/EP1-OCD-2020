package calculadora;

public class operacoes_INT extends operacoes{
    
    // método que faz a soma de dois binários inteiros
    public void operacaoSoma(String [][] binarios){
        baseSoma(binarios);
    }

    /**************************************************** 
     metodo que faz a subtração de dois binários inteiros
     (inverte o sinal do segundo binário)
    *****************************************************/
    public void operacaoSubtracao(String [][] binarios){
            if(binarios [1][0].equals("0")) binarios [1][0] = "1";
            else  binarios [1][0] = "0";
        
        baseSoma(binarios);
    }
        
    // método que faz a multiplicação de dois binários inteiros
    public void operacaoMultiplicacao(String [][] binarios){
        // são pegas as informações necessárias sobre os binários
        String binarioResultado,complementoDe2,binarioAux,
               bitSinal1 = binarios [0][0],
               bitSinal2 = binarios [1][0],
               binario1 = "0" + binarios [0][1],
               binario2 = "0" + binarios [1][1],
               complementoMulti = complementoDeDois(binario1);
        int i,lenngthTotal,
            lengthBinarios = binario1.length();
            
            /* 
             caso o primeiro binário seja 0, 
             eles são trocados de posição
            */
            if(!binario1.contains("1")){
                String strAux = binario1;
                binario1 = binario2;
                binario2 = strAux;
            }
        
        // a grade de booth é montada
        char [][] gradeBooth = new char [3][lengthBinarios*2 + 2];
            for (int intAux = i = 0; i < lengthBinarios; i++,intAux++){
                gradeBooth [0][i] = binario1.charAt(intAux);
                gradeBooth [1][i] = complementoMulti.charAt(intAux);
                gradeBooth [2][i] = '0';
            }
            for (int intAux = 0; i < lengthBinarios*2; i++,intAux++){
                gradeBooth [0][i] = gradeBooth [1][i] = '0';
                gradeBooth [2][i] = binario2.charAt(intAux);
            }
        lenngthTotal = i + 1;    
        binarioAux = new String (gradeBooth [0]);    
        complementoMulti = new String (gradeBooth [1]);
        gradeBooth [0][i] = gradeBooth [1][i] = gradeBooth [2][i] = '0';
        gradeBooth [0][0] = gradeBooth [1][0] = gradeBooth [2][0] = '0';
        
            /************************************
             for que faz as operações para 
             chegar no resultado da multiplicação
            *************************************/
            for (int intAux = i = 0; i < lengthBinarios; i++) {
                intAux = gradeBooth [2][lenngthTotal-1];
                    
                    /* 
                     caso os dois ultimos bits sejam diferente,
                     prepara para somar algo a P
                    */
                    if(gradeBooth [2][lenngthTotal-2] != intAux){
                        String strAux,strProduto = new String (gradeBooth [2]);    
                            
                            // o primeiro bit for 1, prepara pra somar A
                            if(intAux == '1') strAux = binarioAux;
                            // o primeiro bit for 0, prepara pra somar S
                            else strAux = complementoMulti;
                            
                        /* 
                         faz a devida soma e retira o 1 em excesso,
                         caso necessário
                        */
                        strAux = soma(strProduto, strAux);
                            if(strAux.length() > strProduto.length())
                                strAux = strAux.substring(1,strAux.length());
                        
                        // atualiza P
                        gradeBooth [2] = strAux.toCharArray();
                    }
                
                // faz right shift em P
                rightShitArray(gradeBooth [2]);
            }
        
        // a linha P do grade e booth é pega
        String gradeBoothP = new String (gradeBooth [2]); 
        binarios [0][0] = binarios [1][0] = "";
            
            /******************************************** 
             caso tenha algum 1 além dos bits de produto,
             é retornado overflow
            *********************************************/
            if(gradeBoothP.substring(0, lengthBinarios+1).contains("1")){
                i = 0;
                    while(gradeBoothP.charAt(i) == '0') i++;
                binarioResultado = "0" + gradeBoothP.substring(i, lenngthTotal-1);
                
                    if(bitSinal1.equals(binario2)) complementoDe2 = overflowPos;
                    else complementoDe2 = overflowNeg;
            }
            /***************************************************
             caso não aconteça overflow, 
             a parte correspondente ao produto final é retornada
            ****************************************************/
            else{
                binarioResultado = "0" + gradeBoothP.substring(lengthBinarios+1,lenngthTotal-1); 
                complementoDe2 = complementoDeDois(binarioResultado);
            }
            
            /****************************************************** 
             caso o sinal dos binários de entrada sejam diferentes,
             o bit de sinal do binário resultante é trocado para 1
            *******************************************************/
            if(!bitSinal1.equals(bitSinal2))
                binarioResultado = "1" + binarioResultado.substring(1, binarioResultado.length());
        
        // preenche os campos para fazer o retorno
        binarios [0][1] = binarioResultado;
        binarios [1][1] = complementoDe2;
    }
    
    // método que faz a divisão de dois binários inteiros
    public void operacaoDivisao(String [][] binarios) {
        // são pegas as informações iniciais dos binários
        String binario1 = binarios [0][1],
               binario2 = binarios [1][1];
            
            /************************************ 
             caso segundo binário seja 0,
             é retornado erro de divisão por zero 
            *************************************/
            if(!binario2.contains("1")){
                binarios [0][0] = binarios [1][0] = 
                binarios [1][0] = "";
                binarios [1][1] = divisaoPorZero;
                return;
            }
        
        // são pegas as informações restantes
        int i = 0,
            numeroBits = binario1.length()+1;
        String binarioResultado,complementoDe2,
               bitSinal1 = binarios [0][0],
               bitSinal2 = binarios [1][0],
               /************************************** 
                são pegas as informações para fazer 
                a divisão segunda o algoritmo de booth
               ***************************************/
               restAQ,A,Q,
               divisor = "0" + binario2,
               dividendo = new String(binario1),
               complementoDivisor = complementoDeDois(divisor),
               strAQ = null;
        
        // o arranjo AQ é formado
        char [] AQ = new char [numeroBits + dividendo.length()];
            for (i = 0; i < numeroBits; i++) AQ [i] = '0';
            for (int intAux = 0; i < AQ.length; i++,intAux++) 
                AQ [i] = dividendo.charAt(intAux);
            
            /***************************** 
             for que faz as operações para 
             chegar no resultado final 
            ******************************/
            for(i = 1; i < numeroBits; i++){
                // faz left sit em AQ
                leftShitArray(AQ);
                    
                // guarda A para conseguir restaurar depois
                restAQ = (strAQ = new String (AQ)).substring(0,numeroBits);
                
                /******************************************
                 subtrai o divisor de A e pega o quociente,
                 retirando o excesso da A caso tenha
                *******************************************/
                A = soma(restAQ,complementoDivisor);    
                Q = strAQ.substring(numeroBits,strAQ.length()-1);
                    if(A.length() > numeroBits)
                        A = A.substring(1, A.length());
                    
                    /********************************************* 
                     se o primeito bit de A for 1,
                     restaura o A e coloca 0 no final do quociente
                    **********************************************/
                    if(A.charAt(0) == '1'){
                        Q += "0";
                        A = restAQ;
                    }
                    /************************************** 
                     se o primeito bit de A for 0,
                     somente coloca 0 no final do quociente
                    ***************************************/
                    else Q += "1";

                // atualiza AQ
                AQ = (A+ Q).toCharArray(); 
            }
        
        // o quociente é pego 
        i = strAQ.length() - dividendo.length();
        String resultado = strAQ.substring(i,strAQ.length());
        binarios [0][0] = binarios [1][0] = "";
            
            // while que tira os 0 em excesso
            while(resultado.length() < numeroBits) resultado = "0" + resultado;
        
        // o resultado é atribuido as devidas variáveis
        binarioResultado = resultado;    
        complementoDe2 = complementoDeDois(resultado);
            
            /****************************************************** 
             caso o sinal dos binários de entrada sejam diferentes,
             o bit de sinal do binário resultante é trocado para 1
            *******************************************************/
            if(!bitSinal1.equals(bitSinal2))
                binarioResultado = "1" + binarioResultado.substring(1, binarioResultado.length());

        // preenche os campos para fazer o retorno            
        binarios [0][1] = binarioResultado;
        binarios [1][1] = complementoDe2;
    }
    
    // método que é a base para somar dois binários inteiros
    private void baseSoma(String [][] binarios){
        // variável para saber qual o tipo de retorno
        int caseReturn;
        // são pegas as informações necessárias sobre os binários
        String binarioResultado,
               bitSinal1 = binarios [0][0],
               bitSinal2 = binarios [1][0],
               binario1 = binarios [0][1],
               binario2 = binarios [1][1];
            
            // seta a variável caseReturn para o retorno certo
            if(bitSinal1.equals("0") && bitSinal2.equals("0")) caseReturn = 0;
            else if(bitSinal1.equals("1") && bitSinal2.equals("1"))caseReturn = 1;
            else{
                caseReturn = 2;
                    /***************************************** 
                     faz o complemento de 2 do número negotivo 
                     (aquele com bit de sinal igual a 1)
                    ******************************************/
                    if(bitSinal1.equals("1")) binario1 = complementoDeDois(binario1);
                    else binario2 = complementoDeDois(binario2);
            }
        
        // faz a soma do binário sem considerar o sinal
        String complementoDe2,resultado = soma(binario1, binario2);
        binarios [0][0] = binarios [1][0] = "";
            
            /***************************** 
             switch para fazer 
             o tratamento do retorno certo
            ******************************/
            switch(caseReturn){
                case 2: // foi realizada uma subtração
                        // tratamento de para um resultado positivo
                        if(resultado.length() > binario1.length()){
                            binarioResultado = "0" + resultado.substring(1,resultado.length());
                            complementoDe2 = complementoDeDois(binarioResultado);
                        }                        
                        //tratamaento para um resultado negativo
                        else{
                            binarioResultado = complementoDeDois(resultado);
                            complementoDe2 = complementoDeDois("0"+binarioResultado);
                            binarioResultado = "1" + binarioResultado;
                        }
                    break;
                default: // foi realizada uma soma de binários
                    // os binários são positivos
                    if(caseReturn == 0) binarioResultado = "0" + resultado;
                    // os binários são negativos
                    else binarioResultado = "1" + resultado;
                    
                    // checagem de overflow
                    if(resultado.length() > binario1.length()){
                        if(caseReturn == 0) complementoDe2 = overflowPos;
                        else complementoDe2 = overflowNeg;
                    }
                    else complementoDe2 = complementoDeDois(binarioResultado);
            }

        // preenche os campos para fazer o retorno            
        binarios [0][1] = binarioResultado;
        binarios [1][1] = complementoDe2;
    }
}