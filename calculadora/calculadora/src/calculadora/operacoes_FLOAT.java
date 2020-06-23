package calculadora;

public class operacoes_FLOAT extends operacoes_INT{
    // método que iguala os expoentes das mantissas
    private void igualarDigitosMantissas(String [][] binarios){
        // são pegas as informações necessárias sobre os binários
        String bitSinalExp1 = binarios [0][1], bitSinalExp2 = binarios [1][1],
               exp1 = binarios [0][2], exp2 = binarios [1][2],
               mant1 = "1" + binarios [0][3], mant2 = "1" + binarios [1][3],
               /******************************************* 
                é composto um arranjo de binários, 
                contendo os expoentes e seus bits de sinal,  
                para ser realizada a subtração deles
               ********************************************/
               arrAuxExp [][] = {{bitSinalExp1,exp1},{bitSinalExp2,exp2}};
        
        // é utilizada a operação de INT pra subtrair os expoentes
        super.operacaoSubtracao(arrAuxExp);
        // são pegos o bit de sinal e o próprio resultado sem sinal
        String diferenca = arrAuxExp [0][1].charAt(0)+"",
               strAux = arrAuxExp [0][1].substring(1, arrAuxExp [0][1].length());
            
            /********************************* 
             checa se o resultado da diferenca
             sem sinal não é zero
            **********************************/
            if(strAux.contains("1")){
                /*************************************** 
                 o binario de 31 bits é cortado 
                 para ficar do mesmo tamanho do expoente
                ****************************************/
                char [] arrAuxMant;
                String strSoma1 = this.strSoma1.substring(25,this.strSoma1.length());
                    
                    /*********************************************
                     caso o bit de sinal do resultado da subtração
                     seja 1, a primeira mantissa será deslocada
                    **********************************************/
                    if(diferenca.equals("1")){
                        arrAuxMant = mant1.toCharArray();
                        bitSinalExp1 = bitSinalExp2;
                        exp1 = exp2;
                    }
                    /*********************************************
                     caso o bit de sinal do resultado da subtração
                     seja 0, a segunda mantissa será deslocada
                    **********************************************/
                    else{
                        arrAuxMant = mant2.toCharArray();    
                        bitSinalExp2 = bitSinalExp1;
                        exp2 = exp1;
                    }
                    
                    /*************************************************
                     do while que desloca a mantissa e 
                     subtrai 1 do resultado da subtração dos expoentes
                     até que o ele seja 0  
                    **************************************************/
                    do {
                        arrAuxExp [0][0] = arrAuxExp [1][0] = "0";
                        arrAuxExp [0][1] = strAux;
                        arrAuxExp [1][1] = strSoma1;
                        
                        super.operacaoSubtracao(arrAuxExp);
                        strAux = arrAuxExp [0][1].substring(1, arrAuxExp [0][1].length());
                        
                        rightShitArray(arrAuxMant, '0');
                    } while(strAux.contains("1"));
                    
                    // a devida mantissa é atualizada
                    if(diferenca.equals("1")) mant1 = new String (arrAuxMant);    
                    else mant2 = new String (arrAuxMant);    
            }
            
        // preenche os campos para fazer o retorno    
        binarios [0][1] = bitSinalExp1; 
        binarios [1][1] = bitSinalExp2;
        binarios [0][2] = exp1; 
        binarios [1][2] = exp2;
        binarios [0][3] = mant1;
        binarios [1][3] = mant2; 
    }
    
    // método que faz a soma de dois binários float
    @Override
    public void operacaoSoma(String [][] binarios){
        baseSoma(binarios);
    }
    
    /**************************************************** 
     metodo que faz a subtração de dois binários float
     (inverte o sinal do segundo binário)
    *****************************************************/
    @Override
    public void operacaoSubtracao(String [][] binarios){
            if(binarios [1][0].equals("0")) binarios [1][0] = "1";
            else binarios [1][0] = "0";
        
        baseSoma(binarios);
    }
    
    @Override
    public void operacaoMultiplicacao(String [][] binarios){
        // são pegas as informações necessárias sobre os binários
        String bitSinalFP1 = binarios [0][0], bitSinalFP2 = binarios [1][0],
               bitSinalExp1 = binarios [0][1], bitSinalExp2 = binarios [1][1],
               exp1 = binarios [0][2], exp2 = binarios [1][2],
               mant1 = "1"+binarios [0][3], mant2 = "1"+binarios [1][3],
               arrAuxExp [][] = {{bitSinalExp1,exp1},{bitSinalExp2,exp2}},        
               arrAuxMant [][] = {{"0",mant1}, {"0",mant2}};
        
        /**********************************************
         são feitas as operações de soma de expoentes e
         a operação de multiplicação de mantissas
        ***********************************************/
        super.operacaoSoma(arrAuxExp);
        super.operacaoMultiplicacao(arrAuxMant);
        
        /************************************************************
         são pegos o bit de sinal do resultado da soma dos expoentes,
         o próprio resultado sem sinal e 
         o resultado da multiplicação de mantissas sem sinal   
        *************************************************************/
        String complementoDe2 = "",
               bitSinalExpResultado = arrAuxExp [0][1].charAt(0)+"",
               expResultado = arrAuxExp [0][1].substring(1, arrAuxExp [0][1].length()),
               mantResultado = arrAuxMant [0][1].substring(1, arrAuxMant [0][1].length());

            // checa se o resultado da soma de expoentes deu overflow
            if(expResultado.length() > exp1.length()){
                if(bitSinalFP1.equals(bitSinalFP2)) complementoDe2 = overflowPos;
                else complementoDe2 = overflowNeg;
            }
            else{
                /*************************************** 
                 o binario de 31 bits é cortado 
                 para ficar do mesmo tamanho do expoente
                ****************************************/
                int intAux = mantResultado.length(),
                    i = 0;
                String strSoma1 = this.strSoma1.substring(25, this.strSoma1.length());
                
                    /* 
                     while que soma um ao expoente resultante enquanto
                     a mantissa não estiver com 23 bits
                    */
                    while(intAux > mant1.length()){
                        // bits de sinal
                        arrAuxExp [0][0] = bitSinalExpResultado;
                        arrAuxExp [1][0] = "0";
                        // binarios
                        arrAuxExp [0][1] = expResultado; 
                        arrAuxExp [1][1] = strSoma1;
                        
                        super.operacaoSoma(arrAuxExp);
                        bitSinalExpResultado = arrAuxExp [0][1].charAt(0)+"";
                        expResultado = arrAuxExp [0][1].substring(1, arrAuxExp [0][1].length());
                            
                            // para de somar se o expoente passar de 8 bits
                            if(expResultado.length() > exp1.length())
                                break;
                            
                        intAux--;
                        i++;
                    }
                    // corta a mantissa pegando os bits representaveis
                    if(intAux == mant1.length())
                        mantResultado = mantResultado.substring(0, mantResultado.length()- i);
                    /* 
                     no foi possível incrementar a mantissa,
                     então houve overflow
                    */
                    else{
                        if(bitSinalFP1.equals(bitSinalFP2)) complementoDe2 = overflowPos;
                        else complementoDe2 = overflowNeg;
                    }
            }
            
        binarios[0][1] = binarios[1][1] = "";
            
            // checa se deu overflow
            if(complementoDe2.equals(overflowPos) || complementoDe2.equals(overflowNeg)){
                expResultado = bitSinalExpResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";
            }
            // checa se deu underflow
            else if(!mantResultado.contains("1")){
                expResultado = bitSinalExpResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";

                    if(bitSinalFP1.equals(bitSinalFP2)) complementoDe2 = underflowPos;
                    else complementoDe2 = underflowNeg;
            }
            // retorna o float normalizado resultante
            else{
                    if(bitSinalFP1.equals(bitSinalFP2))
                        complementoDe2 = complementoDeDois((binarios[0][0] = "0")+mantResultado);
                    else complementoDe2 = complementoDeDois((binarios[0][0] = "1")+mantResultado);
                binarios [1][0] = complementoDe2.charAt(0)+"";
                    
                mantResultado = mantResultado.substring(1, mantResultado.length());                
                complementoDe2 = complementoDe2.substring(1, complementoDe2.length());
            }
        
        // preenche os campos para fazer o retorno    
        binarios[0][2] = binarios [1][2] = bitSinalExpResultado+expResultado;    
        binarios[0][3] = mantResultado;
        binarios[1][3] = complementoDe2;
    }
    
    @Override
    public void operacaoDivisao(String [][] binarios){
        // são pegas as informações iniciais dos binários
        String complementoDe2 = "",
               mant1 = binarios [0][3], mant2 = binarios [1][3]; 
            
            // checa se o segunda binário não é zero
            if(!mant2.contains("1")){
                binarios [0][0] = binarios [0][1] = binarios [0][2] = binarios [0][3] =
                binarios [1][0] = binarios [1][1] = binarios [1][2] = "";
                binarios [1][3] = divisaoPorZero;
                return;
            }
            else{
                mant1 = "1"+mant1;
                mant2 = "1"+mant2;
            }
        // são pegas as informações restantes
        String bitSinalFP1 = binarios [0][0], bitSinalFP2 = binarios [1][0],
               bitSinalExp1 = binarios [0][1], bitSinalExp2 = binarios [1][1],
               exp1 = binarios [0][2], exp2 = binarios [1][2],
               arrAuxExp [][] = {{bitSinalExp1,exp1}, {bitSinalExp2,exp2}},    
               arrAuxMant [][] = {{"0",mant1}, {"0",mant2}};
        
        /***************************************************
         são feitas as operações de subtração de expoentes e
         a operação de divisão de mantissas
        ****************************************************/
        super.operacaoSubtracao(arrAuxExp);
        super.operacaoDivisao(arrAuxMant);
        
        /*****************************************************************
         são pegos o bit de sinal do resultado da subtração dos expoentes,
         o próprio resultado sem sinal e 
         o resultado da divisão de mantissas sem sinal   
        ******************************************************************/
        String bitSinalExpResultado = arrAuxExp [0][1].charAt(0)+"",
               expResultado = arrAuxExp [0][1].substring(1, arrAuxExp [0][1].length()),
               mantResultado = arrAuxMant [0][1].substring(1, arrAuxMant [0][1].length());

            // checa se o resultado da subtração de expoentes deu overflow
            if(expResultado.length() > exp1.length()){
                if(bitSinalFP1.equals(bitSinalFP2)) complementoDe2 = overflowPos;
                else complementoDe2 = overflowNeg;
            }
            else {
                // é calculado o resto da divisão
                /*************************************** 
                 o binario de 31 bits é cortado 
                 para ficar do mesmo tamanho do expoente
                ****************************************/
                int i = 0;
                String strSoma1 = this.strSoma1.substring(25, this.strSoma1.length());
                // bits  de sinal
                arrAuxMant [0][0] = arrAuxMant [1][0] = "0";
                //binarios
                arrAuxMant [0][1] = mant2;
                arrAuxMant [1][1] = mantResultado;
                
                // é calculado o dividor vezes o quociente
                super.operacaoMultiplicacao(arrAuxMant);
                
                String mantResto,strAux = arrAuxMant [0][1].substring(1, arrAuxMant [0][1].length());
                // bits  de sinal
                arrAuxMant [0][0] = arrAuxMant [1][0] = "0";
                //binarios
                arrAuxMant [0][1] = mant1;
                arrAuxMant [1][1] = strAux;
                
                /***************************** 
                 o dividor vezes o quociente é 
                 subtraido do diveidendo
                ******************************/
                super.operacaoSubtracao(arrAuxMant);
                
                /************************************************* 
                 o resto é pego, tem os 0's em excesso retirados e
                 é adicionado ao final da mantissa resultantante
                **************************************************/
                mantResto = arrAuxMant [0][1];
                    do{ i++; } while(i < mantResto.length() && mantResto.charAt(i) == '0');
                    if(i < mantResto.length()) mantResultado += mantResto.substring(i, mantResto.length());
                    
                    /************************************************
                     for que subtrai 1 do expoente resultante
                     até o primeiro bit da mantissa resultante seja 1
                    *************************************************/
                    for(i = 0;i < mantResultado.length() && mantResultado.charAt(i) == '0';i++){
                        // bits de sinal
                        arrAuxExp [0][0] = bitSinalExpResultado;
                        arrAuxExp [1][0] = "0";
                        // binarios
                        arrAuxExp [0][1] = expResultado; 
                        arrAuxExp [1][1] = strSoma1;

                        super.operacaoSubtracao(arrAuxExp);
                        bitSinalExpResultado = arrAuxExp [0][1].charAt(0)+"";
                        expResultado = arrAuxExp [0][1].substring(1, arrAuxExp [0][1].length());
                            
                            // checa de seu overflow
                            if(expResultado.length() > exp1.length()){
                                i = -1;
                                break;
                            }
                    }
                    
                    // checa se deu overflow
                    if(i == -1){ 
                        if(bitSinalFP1.equals(bitSinalFP2)) complementoDe2 = overflowPos;
                        else complementoDe2 = overflowNeg;
                    }
                    else{
                        mantResultado = mantResultado.substring(i, mantResultado.length());
                            while(mantResultado.length() < mant1.length()) mantResultado += "0";
                    }
            } 

        binarios[0][1] = binarios[1][1] = "";
            
            // checa de deu overflow
            if(complementoDe2.equals(overflowPos) || complementoDe2.equals(overflowNeg)){
                expResultado = bitSinalExpResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";
            }
            // checa se deu underflow
            else if(!mantResultado.contains("1")){
                expResultado = bitSinalExpResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";
                
                    if(bitSinalFP1.equals(bitSinalFP2)) complementoDe2 = underflowPos;
                    else complementoDe2 = underflowNeg;
            }
            // retorna o float normalizado resultante
            else {
                     if(bitSinalFP1.equals(bitSinalFP2))
                        complementoDe2 = complementoDeDois((binarios[0][0] = "0")+mantResultado);
                    else complementoDe2 = complementoDeDois((binarios[0][0] = "1")+mantResultado);
                binarios [1][0] = complementoDe2.charAt(0)+"";
                    
                mantResultado = mantResultado.substring(1, mantResultado.length());                
                complementoDe2 = complementoDe2.substring(1, complementoDe2.length());
            }
            
        // preenche os campos para fazer o retorno    
        binarios[0][2] = binarios [1][2] = bitSinalExpResultado+expResultado;    
        binarios[0][3] = mantResultado;
        binarios[1][3] = complementoDe2;
    }
    
    private void baseSoma(String [][] binarios){
        // iguala os expoentes dos floats
        igualarDigitosMantissas(binarios);
        
        // são pegas as informações necessárias sobre os binários
        String bitSinalExpResultado = binarios [0][1],expResultado = binarios [0][2],
               bitSinal1 = binarios [0][0], bitSinal2 = binarios [1][0],
               mant1 = binarios [0][3], mant2 = binarios [1][3],
               arrAux [][] = {{bitSinal1,mant1}, {bitSinal2,mant2}};
        
        // as duas mantissas são somadas
        super.operacaoSoma(arrAux);
        
        /*************************************************************
         são pegos o bit de sinal do resultado da soma das mantissas e 
         o próprio resultado sem sinal
        **************************************************************/
        String complementoDe2,
               bitSinalResultadoMant = arrAux [0][1].charAt(0)+"",
               mantResultado = arrAux [0][1].substring(1, arrAux [0][1].length()); 
            
            // checa se o resultado ultrapassou 23 bits
            if(mantResultado.length() > mant1.length()) {
                /*************************************** 
                 o binario de 31 bits é cortado 
                 para ficar do mesmo tamanho do expoente
                ****************************************/
                int expLengthAnt = expResultado.length();
                String strSoma1 = this.strSoma1.substring(25, this.strSoma1.length());
                
                //bits de sinal
                arrAux [0][0] = bitSinalExpResultado;
                arrAux [1][0] = "0";
                //binarios
                arrAux [0][1] = expResultado;
                arrAux [1][1] = strSoma1;
                
                /************************* 
                 é somado 1 ao expoente 
                para normalizar o mantissa
                **************************/
                super.operacaoSoma(arrAux);
                
                /*****************************************************************
                 são pegos o bit de sinal do resultado da soma dos expoentes,
                 o próprio resultado sem sinal e 
                ******************************************************************/
                bitSinalExpResultado = arrAux [0][1].charAt(0)+"";
                expResultado = arrAux [0][1].substring(1, arrAux [0][1].length());
                    
                    // checa de se overflow
                    if(expResultado.length() > expLengthAnt){
                        if(bitSinalExpResultado.equals("0")) complementoDe2 = overflowPos;
                        else complementoDe2 = overflowNeg;
                    }
                    else{ 
                        mantResultado = mantResultado.substring(0, mantResultado.length()-1);
                        complementoDe2 = complementoDeDois(bitSinalResultadoMant+mantResultado);
                    }
            }
            else complementoDe2 = complementoDeDois(bitSinalResultadoMant+mantResultado);
           
        binarios [0][1] = binarios [1][1] = "";         
            
            // checa de seu overflow
            if(complementoDe2.equals(overflowPos) || complementoDe2.equals(overflowNeg)){
                expResultado = bitSinalExpResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";
                
                expResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";
            }
            // checa de seu underflow
            else if(!mantResultado.contains("1")){
                expResultado = bitSinalExpResultado = mantResultado = binarios[0][0] = binarios[1][0] = "";
                
                    if(bitSinalResultadoMant.equals("0"))complementoDe2 = underflowPos;
                    else complementoDe2 = underflowNeg;
            }
            // retorna o float normalizado resultante
            else{
                binarios[0][0] = bitSinalResultadoMant;                
                binarios [1][0] = complementoDe2.charAt(0) + "";
                
                mantResultado = mantResultado.substring(1, mantResultado.length());
                complementoDe2 = complementoDe2.substring(1,complementoDe2.length());
            }
            
        // preenche os campos para fazer o retorno    
        binarios[0][2] = binarios [1][2] = bitSinalExpResultado + expResultado;    
        binarios[0][3] = mantResultado;
        binarios[1][3] = complementoDe2;
    }
}