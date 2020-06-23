package calculadora;

import java.awt.Canvas;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Calculadora extends javax.swing.JFrame{
    // classe com os métodos das operações com INT
    private final operacoes_INT ops_int = new operacoes_INT();
    // classe com os métodos das  com FLOAT
    private final operacoes_FLOAT ops_float = new operacoes_FLOAT();
    
    // lista para gerenciar os campos da interface 
    private final LinkedList <JButton> botoes_operacoes = new LinkedList <JButton>();
    private final LinkedList <Canvas> canvas_resultado = new LinkedList <Canvas>();
    private final LinkedList <JComboBox> combobox_int_bitsDeSinal = new LinkedList <JComboBox>();
    private final LinkedList <JTextField> textfield_int_campos = new LinkedList <JTextField>();
    private final LinkedList <JComboBox> combobox_float_bitsDeSinal = new LinkedList <JComboBox>();
    private final LinkedList <JTextField> textfield_float_campos = new LinkedList <JTextField>();
    
    // método para iniciar a calculadora
    public Calculadora() {
        // método do NetBeans para inicializar componentes da interface
        initComponents();
        
        // preenchimento das listas
        botoes_operacoes.add(botao_soma);
        botoes_operacoes.add(botao_subtracao);
        botoes_operacoes.add(botao_multiplicacao);
        botoes_operacoes.add(botao_divisao);
        
        canvas_resultado.add(canvas_overflow);
        canvas_resultado.add(canvas_underflow);
        
        combobox_int_bitsDeSinal.add(combobox_int_bit_sinal_primeiro);
        combobox_int_bitsDeSinal.add(combobox_int_bit_sinal_segundo);
        textfield_int_campos.add(textfield_int_binario_primeiro);
        textfield_int_campos.add(textfield_int_binario_segundo);
        
        combobox_float_bitsDeSinal.add(combobox_float_bit_sinal_FP1);
        combobox_float_bitsDeSinal.add(combobox_float_bit_sinal_FP2);
        combobox_float_bitsDeSinal.add(combobox_float_bit_sinal_exp1);
        combobox_float_bitsDeSinal.add(combobox_float_bit_sinal_exp2);
        textfield_float_campos.add(textfield_float_expoente1);
        textfield_float_campos.add(textfield_float_expoente2);
        textfield_float_campos.add(textfield_float_mantissa1);
        textfield_float_campos.add(textfield_float_mantissa2);
        
        // preenchimento inicial dos campos
        canvas_resultado.forEach((canvas) -> {
            canvas.setBackground(Color.YELLOW);
            });
        textfield_int_campos.forEach((campo) -> {
            campo.setText("");
            });
        textfield_float_campos.forEach((campo) -> {
            campo.setText("");
            });
        
        // método para preparar a interface para a proxima operacao
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_soma = new javax.swing.JButton();
        botao_subtracao = new javax.swing.JButton();
        botao_multiplicacao = new javax.swing.JButton();
        botao_divisao = new javax.swing.JButton();
        label_numero_bits = new javax.swing.JLabel();
        separador_inputsLegenda = new javax.swing.JSeparator();
        label_legenda = new javax.swing.JLabel();
        botao_submeter = new javax.swing.JButton();
        spinner_numero_bits = new javax.swing.JSpinner();
        botao_min_bits = new javax.swing.JButton();
        botao_max_bits = new javax.swing.JButton();
        tabs_operacoes = new javax.swing.JTabbedPane();
        painel_operacao_int = new javax.swing.JPanel();
        label_int_binario_primeiro = new javax.swing.JLabel();
        textfield_int_binario_primeiro = new javax.swing.JTextField();
        label_int_binario_segundo = new javax.swing.JLabel();
        textfield_int_binario_segundo = new javax.swing.JTextField();
        combobox_int_bit_sinal_segundo = new javax.swing.JComboBox<>();
        label_int_bit_sinal_segundo = new javax.swing.JLabel();
        combobox_int_bit_sinal_primeiro = new javax.swing.JComboBox<>();
        label_int_bit_sinal_primeiro = new javax.swing.JLabel();
        botao_int_adicionar0_primeiro = new javax.swing.JButton();
        botao_int_adicionar1_primeiro = new javax.swing.JButton();
        botao_int_limpar_primeiro = new javax.swing.JButton();
        botao_int_adicionar0_segundo = new javax.swing.JButton();
        botao_int_adicionar1_segundo = new javax.swing.JButton();
        botao_int_limpar_segundo = new javax.swing.JButton();
        label_resultado_int = new javax.swing.JLabel();
        textfield_int_resultado_normalizado = new javax.swing.JTextField();
        textfield_int_resultado_compDe2 = new javax.swing.JTextField();
        label_resultado_int_normalizado = new javax.swing.JLabel();
        label_resultado_int_complemento = new javax.swing.JLabel();
        separador_int_esquerda = new javax.swing.JSeparator();
        separador_int_direita = new javax.swing.JSeparator();
        painel_operacao_float = new javax.swing.JPanel();
        combobox_float_bit_sinal_FP1 = new javax.swing.JComboBox<>();
        label_float_bit_sinal_primeira = new javax.swing.JLabel();
        textfield_float_mantissa1 = new javax.swing.JTextField();
        label_campo_mantissa1 = new javax.swing.JLabel();
        botao_float_adicionar0_mantissa1 = new javax.swing.JButton();
        botao_float_adicionar1_mantissa1 = new javax.swing.JButton();
        botao_float_limpar_mantissa1 = new javax.swing.JButton();
        textfield_float_expoente1 = new javax.swing.JTextField();
        botao_float_adicionar0_expoente1 = new javax.swing.JButton();
        botao_float_adicionar1_expoente1 = new javax.swing.JButton();
        botao_float_limpar_expoente1 = new javax.swing.JButton();
        label_botoes_expoente1 = new javax.swing.JLabel();
        label_botoes_mantissa_primeira = new javax.swing.JLabel();
        label_campo_expoente1 = new javax.swing.JLabel();
        label_resultado_float_normalizado = new javax.swing.JLabel();
        textfield_float_expoente_resultado_norm = new javax.swing.JTextField();
        textfield_float_bit_sinal_resultado_norm = new javax.swing.JTextField();
        textfield_float_mantissa_resultado_norm = new javax.swing.JTextField();
        label_1_binario_mantissa1 = new javax.swing.JLabel();
        label_1_resultado_norm = new javax.swing.JLabel();
        label_resultado_float_compDe2 = new javax.swing.JLabel();
        textfield_float_bit_sinal_resultado_comp = new javax.swing.JTextField();
        textfield_float_expoente_resultado_comp = new javax.swing.JTextField();
        label_1_resultado_comp = new javax.swing.JLabel();
        textfield_float_mantissa_resultado_comp = new javax.swing.JTextField();
        label_bit_sinal_FP1 = new javax.swing.JLabel();
        combobox_float_bit_sinal_exp1 = new javax.swing.JComboBox<>();
        label_bit_sinal_exp1 = new javax.swing.JLabel();
        labe_float_bit_sinal_segunda = new javax.swing.JLabel();
        label_bit_sinal_FP2 = new javax.swing.JLabel();
        label_bit_sinal_exp2 = new javax.swing.JLabel();
        combobox_float_bit_sinal_exp2 = new javax.swing.JComboBox<>();
        combobox_float_bit_sinal_FP2 = new javax.swing.JComboBox<>();
        botao_float_adicionar0_expoente2 = new javax.swing.JButton();
        label_botoes_expoente2 = new javax.swing.JLabel();
        textfield_float_expoente2 = new javax.swing.JTextField();
        botao_float_adicionar1_expoente2 = new javax.swing.JButton();
        botao_float_limpar_expoente2 = new javax.swing.JButton();
        label_campo_expoente2 = new javax.swing.JLabel();
        label_campo_mantissa2 = new javax.swing.JLabel();
        label_1_binario_mantissa2 = new javax.swing.JLabel();
        textfield_float_mantissa2 = new javax.swing.JTextField();
        label_botoes_mantissa2 = new javax.swing.JLabel();
        botao_float_adicionar0_mantissa2 = new javax.swing.JButton();
        botao_float_adicionar1_mantissa2 = new javax.swing.JButton();
        botao_float_limpar_mantissa2 = new javax.swing.JButton();
        label_resultado_float_norm = new javax.swing.JLabel();
        separador_float_direita = new javax.swing.JSeparator();
        separador_float_esquerda = new javax.swing.JSeparator();
        label_indicador_overflow = new javax.swing.JLabel();
        canvas_underflow = new java.awt.Canvas();
        label_indicador_underflow = new javax.swing.JLabel();
        canvas_overflow = new java.awt.Canvas();
        checkbox_apagarAoSubmeter = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA BINÁRIO");
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName(""); // NOI18N
        setResizable(false);

        botao_soma.setText("soma");
        botao_soma.setFocusable(false);
        botao_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_somaActionPerformed(evt);
            }
        });

        botao_subtracao.setText("subtração");
        botao_subtracao.setFocusable(false);
        botao_subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_subtracaoActionPerformed(evt);
            }
        });

        botao_multiplicacao.setText("multiplicação");
        botao_multiplicacao.setFocusable(false);
        botao_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_multiplicacaoActionPerformed(evt);
            }
        });

        botao_divisao.setText("divisão");
        botao_divisao.setFocusable(false);
        botao_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_divisaoActionPerformed(evt);
            }
        });

        label_numero_bits.setText("NÚMERO DE BITS");

        label_legenda.setText("1 - OVERFLOW | 2- UNDERFLOW");

        botao_submeter.setText("SUBMETER");
        botao_submeter.setFocusable(false);
        botao_submeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_submeterActionPerformed(evt);
            }
        });

        spinner_numero_bits.setModel(new SpinnerNumberModel(2,2,32,1));
        spinner_numero_bits.setToolTipText("");
        spinner_numero_bits.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinner_numero_bits.setEditor(new javax.swing.JSpinner.NumberEditor(spinner_numero_bits, ""));
        spinner_numero_bits.setFocusable(false);
        spinner_numero_bits.setRequestFocusEnabled(false);
        spinner_numero_bits.setVerifyInputWhenFocusTarget(false);
        spinner_numero_bits.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_numero_bitsStateChanged(evt);
            }
        });

        botao_min_bits.setText("MIN");
        botao_min_bits.setFocusable(false);
        botao_min_bits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_min_bitsActionPerformed(evt);
            }
        });

        botao_max_bits.setText("MAX");
        botao_max_bits.setFocusable(false);
        botao_max_bits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_max_bitsActionPerformed(evt);
            }
        });

        tabs_operacoes.setFocusable(false);
        tabs_operacoes.setName("tabsOperacoes"); // NOI18N
        tabs_operacoes.setRequestFocusEnabled(false);
        tabs_operacoes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabs_operacoesStateChanged(evt);
            }
        });

        painel_operacao_int.setToolTipText("");

        label_int_binario_primeiro.setText("PRIMEIRO BINÁRIO");

        textfield_int_binario_primeiro.setEditable(false);
        textfield_int_binario_primeiro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textfield_int_binario_primeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textfield_int_binario_primeiro.setVerifyInputWhenFocusTarget(false);

        label_int_binario_segundo.setText("SEGUNDO BINÁRIO");

        textfield_int_binario_segundo.setEditable(false);
        textfield_int_binario_segundo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textfield_int_binario_segundo.setVerifyInputWhenFocusTarget(false);

        combobox_int_bit_sinal_segundo.setMaximumRowCount(2);
        combobox_int_bit_sinal_segundo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        combobox_int_bit_sinal_segundo.setFocusable(false);
        combobox_int_bit_sinal_segundo.setRequestFocusEnabled(false);

        label_int_bit_sinal_segundo.setText("BIT DE SINAL");

        combobox_int_bit_sinal_primeiro.setMaximumRowCount(2);
        combobox_int_bit_sinal_primeiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        combobox_int_bit_sinal_primeiro.setFocusable(false);
        combobox_int_bit_sinal_primeiro.setRequestFocusEnabled(false);

        label_int_bit_sinal_primeiro.setText("BIT DE SINAL");

        botao_int_adicionar0_primeiro.setText("0");
        botao_int_adicionar0_primeiro.setFocusable(false);
        botao_int_adicionar0_primeiro.setRequestFocusEnabled(false);
        botao_int_adicionar0_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_int_adicionar0_primeiroActionPerformed(evt);
            }
        });

        botao_int_adicionar1_primeiro.setText("1");
        botao_int_adicionar1_primeiro.setFocusable(false);
        botao_int_adicionar1_primeiro.setRequestFocusEnabled(false);
        botao_int_adicionar1_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_int_adicionar1_primeiroActionPerformed(evt);
            }
        });

        botao_int_limpar_primeiro.setText("limpar");
        botao_int_limpar_primeiro.setFocusable(false);
        botao_int_limpar_primeiro.setRequestFocusEnabled(false);
        botao_int_limpar_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_int_limpar_primeiroActionPerformed(evt);
            }
        });

        botao_int_adicionar0_segundo.setText("0");
        botao_int_adicionar0_segundo.setFocusable(false);
        botao_int_adicionar0_segundo.setRequestFocusEnabled(false);
        botao_int_adicionar0_segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_int_adicionar0_segundoActionPerformed(evt);
            }
        });

        botao_int_adicionar1_segundo.setText("1");
        botao_int_adicionar1_segundo.setFocusable(false);
        botao_int_adicionar1_segundo.setRequestFocusEnabled(false);
        botao_int_adicionar1_segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_int_adicionar1_segundoActionPerformed(evt);
            }
        });

        botao_int_limpar_segundo.setText("limpar");
        botao_int_limpar_segundo.setFocusable(false);
        botao_int_limpar_segundo.setRequestFocusEnabled(false);
        botao_int_limpar_segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_int_limpar_segundoActionPerformed(evt);
            }
        });

        label_resultado_int.setText("RESULTADO");

        textfield_int_resultado_normalizado.setEditable(false);
        textfield_int_resultado_normalizado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        textfield_int_resultado_compDe2.setEditable(false);
        textfield_int_resultado_compDe2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        label_resultado_int_normalizado.setText("NORMALIZADO:");

        label_resultado_int_complemento.setText("COMPLEMENTO DE 2:");

        javax.swing.GroupLayout painel_operacao_intLayout = new javax.swing.GroupLayout(painel_operacao_int);
        painel_operacao_int.setLayout(painel_operacao_intLayout);
        painel_operacao_intLayout.setHorizontalGroup(
            painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_operacao_intLayout.createSequentialGroup()
                .addComponent(separador_int_esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_resultado_int)
                .addGap(0, 0, 0)
                .addComponent(separador_int_direita))
            .addGroup(painel_operacao_intLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_operacao_intLayout.createSequentialGroup()
                        .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(label_resultado_int_normalizado)
                            .addComponent(label_resultado_int_complemento))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_int_resultado_normalizado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_int_resultado_compDe2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_operacao_intLayout.createSequentialGroup()
                        .addComponent(label_int_bit_sinal_primeiro)
                        .addGap(50, 50, 50)
                        .addComponent(label_int_binario_primeiro))
                    .addGroup(painel_operacao_intLayout.createSequentialGroup()
                        .addComponent(label_int_bit_sinal_segundo)
                        .addGap(50, 50, 50)
                        .addComponent(label_int_binario_segundo))
                    .addGroup(painel_operacao_intLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painel_operacao_intLayout.createSequentialGroup()
                                .addComponent(combobox_int_bit_sinal_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textfield_int_binario_segundo)
                                .addGap(0, 0, 0)
                                .addComponent(botao_int_adicionar0_segundo)
                                .addGap(0, 0, 0)
                                .addComponent(botao_int_adicionar1_segundo)
                                .addGap(0, 0, 0)
                                .addComponent(botao_int_limpar_segundo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_operacao_intLayout.createSequentialGroup()
                                .addComponent(combobox_int_bit_sinal_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textfield_int_binario_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(botao_int_adicionar0_primeiro)
                                .addGap(0, 0, 0)
                                .addComponent(botao_int_adicionar1_primeiro)
                                .addGap(0, 0, 0)
                                .addComponent(botao_int_limpar_primeiro))))))
        );

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_int_adicionar0_primeiro, botao_int_adicionar0_segundo, botao_int_adicionar1_primeiro, botao_int_adicionar1_segundo});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_int_limpar_primeiro, botao_int_limpar_segundo});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label_int_binario_primeiro, label_int_binario_segundo});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textfield_int_binario_primeiro, textfield_int_binario_segundo, textfield_int_resultado_compDe2, textfield_int_resultado_normalizado});

        painel_operacao_intLayout.setVerticalGroup(
            painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_operacao_intLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_int_bit_sinal_primeiro)
                    .addComponent(label_int_binario_primeiro))
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_int_binario_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_int_bit_sinal_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_int_adicionar0_primeiro)
                    .addComponent(botao_int_adicionar1_primeiro)
                    .addComponent(botao_int_limpar_primeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_int_binario_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_int_bit_sinal_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox_int_bit_sinal_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_int_binario_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_int_adicionar0_segundo)
                    .addComponent(botao_int_adicionar1_segundo)
                    .addComponent(botao_int_limpar_segundo))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_resultado_int)
                    .addComponent(separador_int_esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador_int_direita, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_operacao_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_operacao_intLayout.createSequentialGroup()
                        .addComponent(label_resultado_int_normalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_resultado_int_complemento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_operacao_intLayout.createSequentialGroup()
                        .addComponent(textfield_int_resultado_normalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textfield_int_resultado_compDe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combobox_int_bit_sinal_primeiro, textfield_int_binario_primeiro});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combobox_int_bit_sinal_segundo, textfield_int_binario_segundo});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_int_adicionar0_primeiro, botao_int_adicionar0_segundo, botao_int_adicionar1_primeiro, botao_int_adicionar1_segundo});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_int_limpar_primeiro, botao_int_limpar_segundo});

        painel_operacao_intLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label_resultado_int_complemento, label_resultado_int_normalizado});

        tabs_operacoes.addTab("int", painel_operacao_int);
        painel_operacao_int.getAccessibleContext().setAccessibleName("int");

        combobox_float_bit_sinal_FP1.setMaximumRowCount(2);
        combobox_float_bit_sinal_FP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        combobox_float_bit_sinal_FP1.setFocusable(false);
        combobox_float_bit_sinal_FP1.setRequestFocusEnabled(false);

        label_float_bit_sinal_primeira.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_float_bit_sinal_primeira.setText("BIT DE SINAL");

        textfield_float_mantissa1.setEditable(false);
        textfield_float_mantissa1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textfield_float_mantissa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textfield_float_mantissa1.setVerifyInputWhenFocusTarget(false);

        label_campo_mantissa1.setText("PRIMEIRA MANTISSA");

        botao_float_adicionar0_mantissa1.setText("0");
        botao_float_adicionar0_mantissa1.setFocusable(false);
        botao_float_adicionar0_mantissa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar0_mantissa1ActionPerformed(evt);
            }
        });

        botao_float_adicionar1_mantissa1.setText("1");
        botao_float_adicionar1_mantissa1.setFocusable(false);
        botao_float_adicionar1_mantissa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar1_mantissa1ActionPerformed(evt);
            }
        });

        botao_float_limpar_mantissa1.setText("limpar");
        botao_float_limpar_mantissa1.setFocusable(false);
        botao_float_limpar_mantissa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_limpar_mantissa1ActionPerformed(evt);
            }
        });

        textfield_float_expoente1.setEditable(false);
        textfield_float_expoente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botao_float_adicionar0_expoente1.setText("0");
        botao_float_adicionar0_expoente1.setFocusable(false);
        botao_float_adicionar0_expoente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar0_expoente1ActionPerformed(evt);
            }
        });

        botao_float_adicionar1_expoente1.setText("1");
        botao_float_adicionar1_expoente1.setFocusable(false);
        botao_float_adicionar1_expoente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar1_expoente1ActionPerformed(evt);
            }
        });

        botao_float_limpar_expoente1.setText("limpar");
        botao_float_limpar_expoente1.setFocusable(false);
        botao_float_limpar_expoente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_limpar_expoente1ActionPerformed(evt);
            }
        });

        label_botoes_expoente1.setText("EXPOENTE");

        label_botoes_mantissa_primeira.setText("MANTISSA");

        label_campo_expoente1.setText("EXPOENTE");

        label_resultado_float_normalizado.setText("RESULTADO");

        textfield_float_expoente_resultado_norm.setEditable(false);
        textfield_float_expoente_resultado_norm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        textfield_float_bit_sinal_resultado_norm.setEditable(false);
        textfield_float_bit_sinal_resultado_norm.setRequestFocusEnabled(false);

        textfield_float_mantissa_resultado_norm.setEditable(false);
        textfield_float_mantissa_resultado_norm.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        label_1_binario_mantissa1.setText("1,");

        label_1_resultado_norm.setText("1,");

        label_resultado_float_compDe2.setText("COMPLEMENTO DE 2");

        textfield_float_bit_sinal_resultado_comp.setEditable(false);
        textfield_float_bit_sinal_resultado_comp.setRequestFocusEnabled(false);

        textfield_float_expoente_resultado_comp.setEditable(false);
        textfield_float_expoente_resultado_comp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_1_resultado_comp.setText("  ");

        textfield_float_mantissa_resultado_comp.setEditable(false);
        textfield_float_mantissa_resultado_comp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        label_bit_sinal_FP1.setText("FP");

        combobox_float_bit_sinal_exp1.setMaximumRowCount(2);
        combobox_float_bit_sinal_exp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        combobox_float_bit_sinal_exp1.setFocusable(false);
        combobox_float_bit_sinal_exp1.setRequestFocusEnabled(false);

        label_bit_sinal_exp1.setText("EXP");

        labe_float_bit_sinal_segunda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labe_float_bit_sinal_segunda.setText("BIT DE SINAL");

        label_bit_sinal_FP2.setText("FP");

        label_bit_sinal_exp2.setText("EXP");

        combobox_float_bit_sinal_exp2.setMaximumRowCount(2);
        combobox_float_bit_sinal_exp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        combobox_float_bit_sinal_exp2.setFocusable(false);
        combobox_float_bit_sinal_exp2.setRequestFocusEnabled(false);

        combobox_float_bit_sinal_FP2.setMaximumRowCount(2);
        combobox_float_bit_sinal_FP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        combobox_float_bit_sinal_FP2.setFocusable(false);
        combobox_float_bit_sinal_FP2.setRequestFocusEnabled(false);

        botao_float_adicionar0_expoente2.setText("0");
        botao_float_adicionar0_expoente2.setFocusable(false);
        botao_float_adicionar0_expoente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar0_expoente2ActionPerformed(evt);
            }
        });

        label_botoes_expoente2.setText("EXPOENTE");

        textfield_float_expoente2.setEditable(false);
        textfield_float_expoente2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botao_float_adicionar1_expoente2.setText("1");
        botao_float_adicionar1_expoente2.setFocusable(false);
        botao_float_adicionar1_expoente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar1_expoente2ActionPerformed(evt);
            }
        });

        botao_float_limpar_expoente2.setText("limpar");
        botao_float_limpar_expoente2.setFocusable(false);
        botao_float_limpar_expoente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_limpar_expoente2ActionPerformed(evt);
            }
        });

        label_campo_expoente2.setText("EXPOENTE");

        label_campo_mantissa2.setText("SEGUNDA MANTISSA");

        label_1_binario_mantissa2.setText("1,");

        textfield_float_mantissa2.setEditable(false);
        textfield_float_mantissa2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textfield_float_mantissa2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textfield_float_mantissa2.setVerifyInputWhenFocusTarget(false);

        label_botoes_mantissa2.setText("MANTISSA");

        botao_float_adicionar0_mantissa2.setText("0");
        botao_float_adicionar0_mantissa2.setFocusable(false);
        botao_float_adicionar0_mantissa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar0_mantissa2ActionPerformed(evt);
            }
        });

        botao_float_adicionar1_mantissa2.setText("1");
        botao_float_adicionar1_mantissa2.setFocusable(false);
        botao_float_adicionar1_mantissa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_adicionar1_mantissa2ActionPerformed(evt);
            }
        });

        botao_float_limpar_mantissa2.setText("limpar");
        botao_float_limpar_mantissa2.setFocusable(false);
        botao_float_limpar_mantissa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_float_limpar_mantissa2ActionPerformed(evt);
            }
        });

        label_resultado_float_norm.setText("NORMALIZADO");

        javax.swing.GroupLayout painel_operacao_floatLayout = new javax.swing.GroupLayout(painel_operacao_float);
        painel_operacao_float.setLayout(painel_operacao_floatLayout);
        painel_operacao_floatLayout.setHorizontalGroup(
            painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(combobox_float_bit_sinal_FP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_bit_sinal_FP1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(label_bit_sinal_exp1)
                                .addComponent(combobox_float_bit_sinal_exp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(textfield_float_expoente1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_campo_expoente1)))
                        .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                            .addComponent(label_botoes_expoente1)
                            .addGap(0, 0, 0)
                            .addComponent(botao_float_adicionar0_expoente1)
                            .addGap(0, 0, 0)
                            .addComponent(botao_float_adicionar1_expoente1)
                            .addGap(0, 0, 0)
                            .addComponent(botao_float_limpar_expoente1)))
                    .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                            .addComponent(label_botoes_expoente2)
                            .addGap(0, 0, 0)
                            .addComponent(botao_float_adicionar0_expoente2)
                            .addGap(0, 0, 0)
                            .addComponent(botao_float_adicionar1_expoente2)
                            .addGap(0, 0, 0)
                            .addComponent(botao_float_limpar_expoente2))
                        .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(combobox_float_bit_sinal_FP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_bit_sinal_FP2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(label_bit_sinal_exp2)
                                .addComponent(combobox_float_bit_sinal_exp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(textfield_float_expoente2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_campo_expoente2))))
                    .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_resultado_float_compDe2)
                            .addComponent(labe_float_bit_sinal_segunda)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_operacao_floatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                                .addComponent(textfield_float_bit_sinal_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_float_expoente_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                                .addComponent(textfield_float_bit_sinal_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_float_expoente_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(label_1_binario_mantissa1)
                    .addComponent(label_1_binario_mantissa2)
                    .addComponent(label_1_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_1_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textfield_float_mantissa1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                        .addComponent(label_botoes_mantissa_primeira)
                        .addGap(0, 0, 0)
                        .addComponent(botao_float_adicionar0_mantissa1)
                        .addGap(0, 0, 0)
                        .addComponent(botao_float_adicionar1_mantissa1)
                        .addGap(0, 0, 0)
                        .addComponent(botao_float_limpar_mantissa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                .addComponent(separador_float_esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_resultado_float_normalizado)
                .addGap(0, 0, 0)
                .addComponent(separador_float_direita))
            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_resultado_float_norm)
                            .addComponent(label_float_bit_sinal_primeira))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(textfield_float_mantissa2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                                    .addComponent(label_botoes_mantissa2)
                                    .addGap(0, 0, 0)
                                    .addComponent(botao_float_adicionar0_mantissa2)
                                    .addGap(0, 0, 0)
                                    .addComponent(botao_float_adicionar1_mantissa2)
                                    .addGap(0, 0, 0)
                                    .addComponent(botao_float_limpar_mantissa2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(textfield_float_mantissa_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textfield_float_mantissa_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_campo_mantissa2, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(label_campo_mantissa1, javax.swing.GroupLayout.Alignment.CENTER)))))
        );

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textfield_float_expoente1, textfield_float_expoente2, textfield_float_expoente_resultado_comp, textfield_float_expoente_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combobox_float_bit_sinal_FP1, combobox_float_bit_sinal_FP2, combobox_float_bit_sinal_exp1, combobox_float_bit_sinal_exp2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_float_adicionar0_expoente1, botao_float_adicionar0_expoente2, botao_float_adicionar0_mantissa1, botao_float_adicionar0_mantissa2, botao_float_adicionar1_expoente1, botao_float_adicionar1_expoente2, botao_float_adicionar1_mantissa1, botao_float_adicionar1_mantissa2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_float_limpar_expoente1, botao_float_limpar_expoente2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label_1_binario_mantissa1, label_1_binario_mantissa2, label_1_resultado_comp, label_1_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textfield_float_mantissa1, textfield_float_mantissa2, textfield_float_mantissa_resultado_comp, textfield_float_mantissa_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textfield_float_bit_sinal_resultado_comp, textfield_float_bit_sinal_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labe_float_bit_sinal_segunda, label_float_bit_sinal_primeira});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label_bit_sinal_FP1, label_bit_sinal_FP2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label_bit_sinal_exp1, label_bit_sinal_exp2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_float_limpar_mantissa1, botao_float_limpar_mantissa2});

        painel_operacao_floatLayout.setVerticalGroup(
            painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_float_bit_sinal_primeira)
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_campo_expoente1)
                                .addComponent(label_bit_sinal_FP1)
                                .addComponent(label_bit_sinal_exp1))
                            .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combobox_float_bit_sinal_FP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_float_expoente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox_float_bit_sinal_exp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_float_adicionar0_expoente1)
                            .addComponent(botao_float_adicionar1_expoente1)
                            .addComponent(botao_float_limpar_expoente1)
                            .addComponent(label_botoes_expoente1)))
                    .addGroup(painel_operacao_floatLayout.createSequentialGroup()
                        .addComponent(label_campo_mantissa1)
                        .addGap(0, 0, 0)
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_float_mantissa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_1_binario_mantissa1))
                        .addGap(0, 0, 0)
                        .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_botoes_mantissa_primeira)
                            .addComponent(botao_float_adicionar0_mantissa1)
                            .addComponent(botao_float_adicionar1_mantissa1)
                            .addComponent(botao_float_limpar_mantissa1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labe_float_bit_sinal_segunda)
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_campo_expoente2)
                        .addComponent(label_campo_mantissa2)
                        .addComponent(label_bit_sinal_FP2))
                    .addComponent(label_bit_sinal_exp2))
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox_float_bit_sinal_FP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_float_mantissa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_float_expoente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_1_binario_mantissa2)
                    .addComponent(combobox_float_bit_sinal_exp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_float_adicionar0_expoente2)
                    .addComponent(botao_float_adicionar1_expoente2)
                    .addComponent(botao_float_limpar_expoente2)
                    .addComponent(label_botoes_expoente2)
                    .addComponent(label_botoes_mantissa2)
                    .addComponent(botao_float_adicionar0_mantissa2)
                    .addComponent(botao_float_adicionar1_mantissa2)
                    .addComponent(botao_float_limpar_mantissa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_resultado_float_normalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador_float_direita, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador_float_esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(label_resultado_float_norm)
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_float_mantissa_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_float_expoente_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_float_bit_sinal_resultado_norm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_1_resultado_norm))
                .addGap(0, 0, 0)
                .addComponent(label_resultado_float_compDe2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(painel_operacao_floatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_float_expoente_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_float_bit_sinal_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_float_mantissa_resultado_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_1_resultado_comp))
                .addGap(0, 0, 0))
        );

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label_1_binario_mantissa1, label_1_binario_mantissa2, label_1_resultado_comp, label_1_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textfield_float_mantissa1, textfield_float_mantissa2, textfield_float_mantissa_resultado_comp, textfield_float_mantissa_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textfield_float_expoente1, textfield_float_expoente2, textfield_float_expoente_resultado_comp, textfield_float_expoente_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combobox_float_bit_sinal_FP1, combobox_float_bit_sinal_FP2, combobox_float_bit_sinal_exp1, combobox_float_bit_sinal_exp2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_float_adicionar0_expoente1, botao_float_adicionar0_expoente2, botao_float_adicionar0_mantissa1, botao_float_adicionar0_mantissa2, botao_float_adicionar1_expoente1, botao_float_adicionar1_expoente2, botao_float_adicionar1_mantissa1, botao_float_adicionar1_mantissa2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_float_limpar_expoente1, botao_float_limpar_expoente2, botao_float_limpar_mantissa1, botao_float_limpar_mantissa2});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textfield_float_bit_sinal_resultado_comp, textfield_float_bit_sinal_resultado_norm});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labe_float_bit_sinal_segunda, label_float_bit_sinal_primeira});

        painel_operacao_floatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label_bit_sinal_FP1, label_bit_sinal_FP2});

        tabs_operacoes.addTab("float", painel_operacao_float);
        painel_operacao_float.getAccessibleContext().setAccessibleName("float");

        label_indicador_overflow.setText("1");

        label_indicador_underflow.setText("2");

        checkbox_apagarAoSubmeter.setText("APAGAR CAMPOS AO SUBMETER");
        checkbox_apagarAoSubmeter.setFocusable(false);
        checkbox_apagarAoSubmeter.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador_inputsLegenda)
            .addComponent(label_legenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs_operacoes)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(spinner_numero_bits, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(botao_min_bits)
                                .addGap(0, 0, 0)
                                .addComponent(botao_max_bits))
                            .addComponent(label_numero_bits))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(checkbox_apagarAoSubmeter)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_soma)
                                        .addGap(0, 0, 0)
                                        .addComponent(botao_subtracao))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_multiplicacao)
                                        .addGap(0, 0, 0)
                                        .addComponent(botao_divisao))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao_submeter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(label_indicador_overflow)
                                    .addComponent(canvas_overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(canvas_underflow, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_indicador_underflow))))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_divisao, botao_multiplicacao, botao_soma, botao_submeter, botao_subtracao});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_soma)
                            .addComponent(botao_subtracao))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_divisao)
                            .addComponent(botao_multiplicacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_numero_bits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_min_bits)
                            .addComponent(botao_max_bits)
                            .addComponent(spinner_numero_bits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(checkbox_apagarAoSubmeter)
                .addGap(0, 0, 0)
                .addComponent(tabs_operacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_indicador_underflow)
                            .addComponent(label_indicador_overflow))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(canvas_underflow, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(canvas_overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_submeter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador_inputsLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_legenda)
                .addGap(7, 7, 7))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_divisao, botao_multiplicacao, botao_soma, botao_submeter, botao_subtracao});

        ((DefaultEditor)spinner_numero_bits.getEditor()).getTextField().setEditable(false);
        tabs_operacoes.getAccessibleContext().setAccessibleName("tabsOperacoes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_divisaoActionPerformed
        botaoOperacaoClicado((JButton) evt.getSource());
    }//GEN-LAST:event_botao_divisaoActionPerformed

    private void botao_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_multiplicacaoActionPerformed
        botaoOperacaoClicado((JButton) evt.getSource());
    }//GEN-LAST:event_botao_multiplicacaoActionPerformed

    private void botao_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_somaActionPerformed
        botaoOperacaoClicado((JButton) evt.getSource());
    }//GEN-LAST:event_botao_somaActionPerformed

    private void botao_subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_subtracaoActionPerformed
        botaoOperacaoClicado((JButton) evt.getSource());
    }//GEN-LAST:event_botao_subtracaoActionPerformed

    private void botao_int_limpar_segundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_int_limpar_segundoActionPerformed
        textfield_int_binario_segundo.setText("");
    }//GEN-LAST:event_botao_int_limpar_segundoActionPerformed

    private void botao_int_limpar_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_int_limpar_primeiroActionPerformed
        textfield_int_binario_primeiro.setText("");
    }//GEN-LAST:event_botao_int_limpar_primeiroActionPerformed

    private void botao_int_adicionar0_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_int_adicionar0_primeiroActionPerformed
        adicionarDigitoBinario(textfield_int_binario_primeiro,"0");
    }//GEN-LAST:event_botao_int_adicionar0_primeiroActionPerformed

    private void botao_int_adicionar1_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_int_adicionar1_primeiroActionPerformed
        adicionarDigitoBinario(textfield_int_binario_primeiro,"1");
    }//GEN-LAST:event_botao_int_adicionar1_primeiroActionPerformed

    private void botao_int_adicionar0_segundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_int_adicionar0_segundoActionPerformed
        adicionarDigitoBinario(textfield_int_binario_segundo,"0");
    }//GEN-LAST:event_botao_int_adicionar0_segundoActionPerformed

    private void botao_int_adicionar1_segundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_int_adicionar1_segundoActionPerformed
        adicionarDigitoBinario(textfield_int_binario_segundo,"1");
    }//GEN-LAST:event_botao_int_adicionar1_segundoActionPerformed

    private void botao_min_bitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_min_bitsActionPerformed
        if(spinner_numero_bits.isEnabled())
            spinner_numero_bits.setValue(Integer.valueOf(ops_int.minDigitos));
    }//GEN-LAST:event_botao_min_bitsActionPerformed

    private void botao_max_bitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_max_bitsActionPerformed
        if(spinner_numero_bits.isEnabled())
            spinner_numero_bits.setValue(Integer.valueOf(ops_int.maxDigitos));
    }//GEN-LAST:event_botao_max_bitsActionPerformed

    private void botao_submeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_submeterActionPerformed
        fazerOperacaoBinario();
        
        setup();
    }//GEN-LAST:event_botao_submeterActionPerformed

    private void spinner_numero_bitsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_numero_bitsStateChanged
        int digitos = Integer.parseInt(spinner_numero_bits.getValue().toString()) - 1;
        textfield_int_campos.forEach((campo) -> {
                String strAux = campo.getText();
                    if(strAux.length() > 0){
                        int i = 0, intAux = strAux.length();
                            while(i < strAux.length() && intAux > digitos){ 
                                intAux--;
                                i++;
                            }
                        strAux = strAux.substring(i, strAux.length());
                        campo.setText(strAux);
                    }
            });        
    }//GEN-LAST:event_spinner_numero_bitsStateChanged

    private void tabs_operacoesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabs_operacoesStateChanged
        switch(tabs_operacoes.getSelectedIndex()){
            case 0:
                spinner_numero_bits.setEnabled(true);
                break;
            case 1:
                spinner_numero_bits.setEnabled(false);
                break;
            default:
        }
    }//GEN-LAST:event_tabs_operacoesStateChanged

    private void botao_float_limpar_expoente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_limpar_expoente1ActionPerformed
        textfield_float_expoente1.setText("");
    }//GEN-LAST:event_botao_float_limpar_expoente1ActionPerformed

    private void botao_float_adicionar1_expoente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar1_expoente1ActionPerformed
        adicionarDigitoExpoente(textfield_float_expoente1,"1");
    }//GEN-LAST:event_botao_float_adicionar1_expoente1ActionPerformed

    private void botao_float_adicionar0_expoente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar0_expoente1ActionPerformed
        adicionarDigitoExpoente(textfield_float_expoente1,"0");
    }//GEN-LAST:event_botao_float_adicionar0_expoente1ActionPerformed

    private void botao_float_limpar_mantissa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_limpar_mantissa1ActionPerformed
        textfield_float_mantissa1.setText("");
    }//GEN-LAST:event_botao_float_limpar_mantissa1ActionPerformed

    private void botao_float_adicionar1_mantissa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar1_mantissa1ActionPerformed
        adicionarDigitoMantissa(textfield_float_mantissa1, "1");
    }//GEN-LAST:event_botao_float_adicionar1_mantissa1ActionPerformed

    private void botao_float_adicionar0_mantissa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar0_mantissa1ActionPerformed
        adicionarDigitoMantissa(textfield_float_mantissa1, "0");
    }//GEN-LAST:event_botao_float_adicionar0_mantissa1ActionPerformed

    private void botao_float_adicionar0_expoente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar0_expoente2ActionPerformed
        adicionarDigitoExpoente(textfield_float_expoente2, "0");
    }//GEN-LAST:event_botao_float_adicionar0_expoente2ActionPerformed

    private void botao_float_adicionar1_expoente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar1_expoente2ActionPerformed
        adicionarDigitoExpoente(textfield_float_expoente2, "1");
    }//GEN-LAST:event_botao_float_adicionar1_expoente2ActionPerformed

    private void botao_float_limpar_expoente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_limpar_expoente2ActionPerformed
        textfield_float_expoente2.setText("");
    }//GEN-LAST:event_botao_float_limpar_expoente2ActionPerformed

    private void botao_float_adicionar0_mantissa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar0_mantissa2ActionPerformed
        adicionarDigitoMantissa(textfield_float_mantissa2, "0");
    }//GEN-LAST:event_botao_float_adicionar0_mantissa2ActionPerformed

    private void botao_float_adicionar1_mantissa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_adicionar1_mantissa2ActionPerformed
        adicionarDigitoMantissa(textfield_float_mantissa2, "1");
    }//GEN-LAST:event_botao_float_adicionar1_mantissa2ActionPerformed

    private void botao_float_limpar_mantissa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_float_limpar_mantissa2ActionPerformed
        textfield_float_mantissa2.setText("");
    }//GEN-LAST:event_botao_float_limpar_mantissa2ActionPerformed
    
    // método para adicionar dígitos aos campos INT
    private void adicionarDigitoBinario(JTextField campo,String digito) {
        int spinnerDigitos = Integer.parseInt(spinner_numero_bits.getValue().toString()) - 1;
        String binario = campo.getText();
            if(binario.length() < spinnerDigitos)
               campo.setText(digito+binario);
    }
    
    // método para adicionar dígitos aos campos FLOAT (expoente)
    private void adicionarDigitoExpoente(JTextField campo,String digito) {
        String expoente = campo.getText();
            if(expoente.length() < ops_float.numDigitosExpoente - 1)
               campo.setText(digito+expoente);
    }
    
    // método para adicionar dígitos aos campos FLOAT (mantissa)
    private void adicionarDigitoMantissa(JTextField campo,String digito) {
        String mantissa = campo.getText();
            if(mantissa.length() < ops_float.numDigitosMantissa)
               campo.setText(mantissa+digito);
    }
    
    // método para habilitar botao de operacao quando clicado
    private void botaoOperacaoClicado(JButton botaoClicado){
        botoes_operacoes.forEach((botao) -> {
            botao.setBackground(Color.RED);
        });
        
        botaoClicado.setBackground(Color.GREEN);
    }
    
    // método para igualar os binários de entrada
    private void igualarDigitosBinarios(String [][] binarios) {
        // iguala os dígitos dos binários para operação de INT
        if(binarios [0].length == 2){
            int numeroBits = Integer.parseInt(spinner_numero_bits.getValue().toString()) - 1;
                for (String [] binario : binarios) {
                    while (binario [1].length() < numeroBits) {       
                        binario [1] = "0" + binario [1];
                    }
                }
        }
        // iguala os dígitos dos binários para operação de FLOAT
        else{
            for (String [] binario : binarios) {
                while(binario [2].length() < ops_float.numDigitosExpoente - 1) 
                    binario [2] = "0" + binario [2];
                while(binario [3].length() < ops_float.numDigitosMantissa) 
                    binario [3] += "0";
            }
        }
    }
    
    /*************************************************** 
     método que faz a operação escolhida com os binários
     e preenche os devidos campos 
    ****************************************************/
    private void fazerOperacaoBinario() {
        /********************************************************** 
         são pegas a operação (SOMA (0), SUBTRAÇÃO (1), MULTIPLICAÇÃO (2), DIVISÃO (3)) selecionada e 
         em qual modo (INT (0) OU FLOAT (1)) a calculadora está 
        ***********************************************************/
        int operacao_atual = -1,
            painel_atual = tabs_operacoes.getSelectedIndex(); 
        String strErro,msgErro = null;
            
            for (int i = 0; i < botoes_operacoes.size(); i++) {
                if(botoes_operacoes.get(i).getBackground() == Color.GREEN){
                    operacao_atual = i;
                    break;
                }
            }
        
        /************************************************************************************************************************************
         o arranjo de Strings com os binários é declarado e preenchido comforme o modo atual da calculadora
         (INT (32 bits representanto um inteiro com bit de sinal) ou FLOAT (8 bits para o expoente e 24 para a mantissa com um bit de sinal))
        *************************************************************************************************************************************/
        String [][] binarios;    
            if(painel_atual == 0) { // tab int selecionada
                String bitSinal1 = combobox_int_bit_sinal_primeiro.getSelectedItem().toString(),
                       bitSinal2 = combobox_int_bit_sinal_segundo.getSelectedItem().toString(),
                       binario1 = textfield_int_binario_primeiro.getText(),
                       binario2 = textfield_int_binario_segundo.getText();

                binarios = new String [][] {{bitSinal1,binario1},{bitSinal2,binario2}};
            }
            else { // tab float selecionada
                String bitSinalFP1 = combobox_float_bit_sinal_FP1.getSelectedItem().toString(),
                       bitSinalFP2 = combobox_float_bit_sinal_FP2.getSelectedItem().toString(),
                       bitSinalExp1 = combobox_float_bit_sinal_exp1.getSelectedItem().toString(),
                       bitSinalExp2 =  combobox_float_bit_sinal_exp2.getSelectedItem().toString(),
                       expoente1 = textfield_float_expoente1.getText(),
                       expoente2 = textfield_float_expoente2.getText(),
                       mantissa1 = textfield_float_mantissa1.getText(),
                       mantissa2 = textfield_float_mantissa2.getText();
                
                binarios = new String [][] {{bitSinalFP1,bitSinalExp1,expoente1,mantissa1},
                                            {bitSinalFP2,bitSinalExp2,expoente2,mantissa2}};
            }
        
        // os binários são igualados comforme o modo de operação da calculadora
        igualarDigitosBinarios(binarios);
        
        /******************************************************************
         passa os binários para a devida classe de modo de operações
         gerando uma janela de erro caso não tenha uma operação selecionada
        *******************************************************************/
            switch(operacao_atual){
                case 0: // operacao soma
                        if(painel_atual == 0) ops_int.operacaoSoma(binarios);
                        else ops_float.operacaoSoma(binarios);              
                    break;
                case 1: // operacao subtracao
                        if(painel_atual == 0) ops_int.operacaoSubtracao(binarios);
                        else ops_float.operacaoSubtracao(binarios);                            
                    break;
                case 2: // operacao multiplicacao
                        if(painel_atual == 0) ops_int.operacaoMultiplicacao(binarios);
                        else ops_float.operacaoMultiplicacao(binarios);                            
                    break;
                case 3: // operacao divisao
                        if(painel_atual == 0) ops_int.operacaoDivisao(binarios);
                        else ops_float.operacaoDivisao(binarios);                            
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "OPERAÇÃO NÃO SELECIONADA", "ERRO DE OPERAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        
        // limpa os campos de overflow e underflow (pinta de vermelho)    
        canvas_resultado.forEach((canvas) -> {
            canvas.setBackground(Color.RED);
            });        
        
        /******************************************************************************************
         pega o resultado contido no arranjo de binários e preenche os devidos campos de resultado,
         mas em caso de erro de calculo preenche eles com infinito ou gera um janela de erro
        *******************************************************************************************/    
            if(binarios [0].length == 2){ // prencher campos resultado INT
                strErro = binarios [1][1];
                
                String campoNorm, campoComp;
                    if(strErro.contains("ERRO")){
                        if(strErro.contains("TODOS")){
                            if(strErro.contains("+")){
                                campoNorm = "+ infinito";
                                campoComp = "- infinito";
                            }
                            else{
                                campoNorm = "- infinito";
                                campoComp = "+ infinito";
                            } 
                        }
                        else{
                            campoNorm = campoComp = "";
                            msgErro = "DIVISÃO POR ZERO";
                        }
                        
                        if(strErro.contains("1"))
                            canvas_overflow.setBackground(Color.GREEN);
                    }
                    else{
                        campoNorm = binarios [0][1];
                        campoComp = binarios [1][1];
                    }
                
                textfield_int_resultado_normalizado.setText(campoNorm);
                textfield_int_resultado_compDe2.setText(campoComp);
            }
            else{ // prencher campos resultado FLOAT
                strErro = binarios [1][3];
                
                String bitSinalNorm,bitSinalComp,
                       expoenteNorm,expoenteComp,
                       labelNorm,labelComp,
                       mantNorm,mantComp;
                    if(strErro.contains("ERRO")){
                        if(strErro.contains("TODOS")){
                                if(strErro.contains("+")){
                                    bitSinalNorm = "0";
                                    bitSinalComp = "1";
                                }
                                else{
                                    bitSinalNorm = "0";
                                    bitSinalComp = "1";
                                }
                            labelNorm = labelComp = "  ";
                            expoenteNorm = expoenteComp = "+ infinito";
                            mantNorm = mantComp = "infinito";
                            
                                if(strErro.contains("1"))
                                    canvas_overflow.setBackground(Color.GREEN);
                                else if(strErro.contains("2"))
                                    canvas_underflow.setBackground(Color.GREEN);
                        }
                        else{
                            bitSinalNorm = bitSinalComp = expoenteNorm = expoenteComp =  mantNorm = mantComp = "";
                            labelNorm = labelComp = "  ";
                            
                            msgErro = "DIVISÃO POR ZERO";
                        }
                      
                    }
                    else{
                        bitSinalNorm = binarios [0][0];
                        bitSinalComp = binarios [1][0];
                        labelNorm = "1,";
                        labelComp = binarios [1][3].charAt(0)+",";
                        expoenteNorm = binarios [0][2];
                        expoenteComp = binarios [1][2];
                        mantNorm = binarios [0][3];
                        mantComp = binarios [1][3].substring(1,binarios [1][3].length());
                    }

                textfield_float_bit_sinal_resultado_norm.setText(bitSinalNorm);
                textfield_float_expoente_resultado_norm.setText(expoenteNorm);
                label_1_resultado_norm.setText(labelNorm);
                textfield_float_mantissa_resultado_norm.setText(mantNorm);

                textfield_float_bit_sinal_resultado_comp.setText(bitSinalComp);
                textfield_float_expoente_resultado_comp.setText(expoenteComp);
                label_1_resultado_comp.setText(labelComp);
                textfield_float_mantissa_resultado_comp.setText(mantComp);
            }
            
            //mostra uma janela de erro com a devida mensagem caso necessário
            if(msgErro != null)
                JOptionPane.showMessageDialog(this, msgErro, "ERRO DE OPERAÇÃO", JOptionPane.ERROR_MESSAGE);
    }
    
    // método que prepara a calculadora para uma próxima operação
    private void setup(){
        // limpa os botões de seleção de operação (pinta de vermelho)
        botoes_operacoes.forEach((botao) -> {
            botao.setBackground(Color.RED);
            });
        
            /*********************************************************************
             se o checkbox estiver selecionado, 
             limpa todos os outros campos do modo de operação atual da calculadora
            **********************************************************************/
            if(checkbox_apagarAoSubmeter.isSelected()){
                switch(tabs_operacoes.getSelectedIndex()){
                    case 0:
                        combobox_int_bitsDeSinal.forEach((combobox) -> {
                            combobox.setSelectedItem("0");
                            });
                        textfield_int_campos.forEach((campo) -> {
                            campo.setText("");
                            });
                        break;
                    case 1:
                        combobox_float_bitsDeSinal.forEach((combobox) -> {
                            combobox.setSelectedItem("0");
                            });                        
                        textfield_float_campos.forEach((campo) -> {
                            campo.setText("");
                            });
                        break;
                    default:
                }
            }
    }
    
    // método main para iniciar a calculadora
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    // componentes da interface da calculadora
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_divisao;
    private javax.swing.JButton botao_float_adicionar0_expoente1;
    private javax.swing.JButton botao_float_adicionar0_expoente2;
    private javax.swing.JButton botao_float_adicionar0_mantissa1;
    private javax.swing.JButton botao_float_adicionar0_mantissa2;
    private javax.swing.JButton botao_float_adicionar1_expoente1;
    private javax.swing.JButton botao_float_adicionar1_expoente2;
    private javax.swing.JButton botao_float_adicionar1_mantissa1;
    private javax.swing.JButton botao_float_adicionar1_mantissa2;
    private javax.swing.JButton botao_float_limpar_expoente1;
    private javax.swing.JButton botao_float_limpar_expoente2;
    private javax.swing.JButton botao_float_limpar_mantissa1;
    private javax.swing.JButton botao_float_limpar_mantissa2;
    private javax.swing.JButton botao_int_adicionar0_primeiro;
    private javax.swing.JButton botao_int_adicionar0_segundo;
    private javax.swing.JButton botao_int_adicionar1_primeiro;
    private javax.swing.JButton botao_int_adicionar1_segundo;
    private javax.swing.JButton botao_int_limpar_primeiro;
    private javax.swing.JButton botao_int_limpar_segundo;
    private javax.swing.JButton botao_max_bits;
    private javax.swing.JButton botao_min_bits;
    private javax.swing.JButton botao_multiplicacao;
    private javax.swing.JButton botao_soma;
    private static javax.swing.JButton botao_submeter;
    private javax.swing.JButton botao_subtracao;
    private java.awt.Canvas canvas_overflow;
    private java.awt.Canvas canvas_underflow;
    private javax.swing.JCheckBox checkbox_apagarAoSubmeter;
    private javax.swing.JComboBox<String> combobox_float_bit_sinal_FP1;
    private javax.swing.JComboBox<String> combobox_float_bit_sinal_FP2;
    private javax.swing.JComboBox<String> combobox_float_bit_sinal_exp1;
    private javax.swing.JComboBox<String> combobox_float_bit_sinal_exp2;
    private javax.swing.JComboBox<String> combobox_int_bit_sinal_primeiro;
    private javax.swing.JComboBox<String> combobox_int_bit_sinal_segundo;
    private javax.swing.JLabel labe_float_bit_sinal_segunda;
    private javax.swing.JLabel label_1_binario_mantissa1;
    private javax.swing.JLabel label_1_binario_mantissa2;
    private javax.swing.JLabel label_1_resultado_comp;
    private javax.swing.JLabel label_1_resultado_norm;
    private javax.swing.JLabel label_bit_sinal_FP1;
    private javax.swing.JLabel label_bit_sinal_FP2;
    private javax.swing.JLabel label_bit_sinal_exp1;
    private javax.swing.JLabel label_bit_sinal_exp2;
    private javax.swing.JLabel label_botoes_expoente1;
    private javax.swing.JLabel label_botoes_expoente2;
    private javax.swing.JLabel label_botoes_mantissa2;
    private javax.swing.JLabel label_botoes_mantissa_primeira;
    private javax.swing.JLabel label_campo_expoente1;
    private javax.swing.JLabel label_campo_expoente2;
    private javax.swing.JLabel label_campo_mantissa1;
    private javax.swing.JLabel label_campo_mantissa2;
    private javax.swing.JLabel label_float_bit_sinal_primeira;
    private javax.swing.JLabel label_indicador_overflow;
    private javax.swing.JLabel label_indicador_underflow;
    private javax.swing.JLabel label_int_binario_primeiro;
    private javax.swing.JLabel label_int_binario_segundo;
    private javax.swing.JLabel label_int_bit_sinal_primeiro;
    private javax.swing.JLabel label_int_bit_sinal_segundo;
    private javax.swing.JLabel label_legenda;
    private javax.swing.JLabel label_numero_bits;
    private javax.swing.JLabel label_resultado_float_compDe2;
    private javax.swing.JLabel label_resultado_float_norm;
    private javax.swing.JLabel label_resultado_float_normalizado;
    private javax.swing.JLabel label_resultado_int;
    private javax.swing.JLabel label_resultado_int_complemento;
    private javax.swing.JLabel label_resultado_int_normalizado;
    private javax.swing.JPanel painel_operacao_float;
    private javax.swing.JPanel painel_operacao_int;
    private javax.swing.JSeparator separador_float_direita;
    private javax.swing.JSeparator separador_float_esquerda;
    private javax.swing.JSeparator separador_inputsLegenda;
    private javax.swing.JSeparator separador_int_direita;
    private javax.swing.JSeparator separador_int_esquerda;
    private javax.swing.JSpinner spinner_numero_bits;
    private javax.swing.JTabbedPane tabs_operacoes;
    private javax.swing.JTextField textfield_float_bit_sinal_resultado_comp;
    private javax.swing.JTextField textfield_float_bit_sinal_resultado_norm;
    private javax.swing.JTextField textfield_float_expoente1;
    private javax.swing.JTextField textfield_float_expoente2;
    private javax.swing.JTextField textfield_float_expoente_resultado_comp;
    private javax.swing.JTextField textfield_float_expoente_resultado_norm;
    private javax.swing.JTextField textfield_float_mantissa1;
    private javax.swing.JTextField textfield_float_mantissa2;
    private javax.swing.JTextField textfield_float_mantissa_resultado_comp;
    private javax.swing.JTextField textfield_float_mantissa_resultado_norm;
    private javax.swing.JTextField textfield_int_binario_primeiro;
    private javax.swing.JTextField textfield_int_binario_segundo;
    private javax.swing.JTextField textfield_int_resultado_compDe2;
    private javax.swing.JTextField textfield_int_resultado_normalizado;
    // End of variables declaration//GEN-END:variables
}