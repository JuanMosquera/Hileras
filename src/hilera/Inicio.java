package hilera;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Inicio extends javax.swing.JFrame 
{
    Hilera original = new Hilera();
    Hilera nueva;
    String s;
    
    public Inicio() 
    {
        super("Manejo de Hilera V 1.0");
        initComponents();
        listaOpciones.removeAllItems();
        listaOpciones.addItem("-Seleccionar Opción-");        
        listaOpciones.addItem("1. Agregar hilera");
        listaOpciones.addItem("2. Eliminar parte de la hilera");
        listaOpciones.addItem("3. Eliminar hilera completa");                
        listaOpciones.addItem("4. Invertir hilera");                
        listaOpciones.addItem("5. Ordenar hilera alfábeticamente");
        listaOpciones.addItem("6. Determinar si son substring");
        listaOpciones.addItem("7. Determinar si hilera es palindromo");
        listaOpciones.addItem("8. Determinar si son anagramas");
        listaOpciones.addItem("9. Modificar hilera");
    }
    
    public void imprimeHilera(Hilera s, JLabel l)
    {
        NodoDoble p = s.primerNodo();
        while(!s.finDeRecorrido(p))
        {
            l.setText(l.getText()+""+p.retornaDato());
            p = p.retornaLd();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloFrame = new javax.swing.JLabel();
        panelIngresoDatos = new javax.swing.JPanel();
        campoTextoIngreso = new javax.swing.JTextField();
        labelTituloIngreso = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        botonIngresarHilera = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        labelTituloOpciones = new javax.swing.JLabel();
        listaOpciones = new javax.swing.JComboBox<>();
        botonAceptarOpcion = new javax.swing.JButton();
        panelHilerasIngresadas = new javax.swing.JPanel();
        labelTituloHilerasIngresadas = new javax.swing.JLabel();
        labelTituloHileraNueva = new javax.swing.JLabel();
        labelHileraNueva = new javax.swing.JLabel();
        labelTituloHileraOriginal = new javax.swing.JLabel();
        labelHileraOriginal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        labelTituloFrame.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        labelTituloFrame.setForeground(new java.awt.Color(255, 0, 0));
        labelTituloFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloFrame.setText("Manejo de Hileras");

        panelIngresoDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTituloIngreso.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelTituloIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloIngreso.setText("Campo de ingreso de Datos");

        botonBorrar.setText("Borrar Todo");

        botonIngresarHilera.setText("Ingresar Hilera");
        botonIngresarHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarHileraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addComponent(botonIngresarHilera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBorrar))
                    .addComponent(campoTextoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar)
                    .addComponent(botonIngresarHilera))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTituloOpciones.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelTituloOpciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloOpciones.setText("Opciones");

        listaOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonAceptarOpcion.setText("Aceptar");
        botonAceptarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarOpcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTituloOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOpcionesLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(listaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelOpcionesLayout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(botonAceptarOpcion)))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAceptarOpcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHilerasIngresadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTituloHilerasIngresadas.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        labelTituloHilerasIngresadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloHilerasIngresadas.setText("Hileras ingresadas");

        labelTituloHileraNueva.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelTituloHileraNueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloHileraNueva.setText("Nueva Hilera");

        labelHileraNueva.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelHileraNueva.setForeground(new java.awt.Color(0, 153, 0));
        labelHileraNueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelTituloHileraOriginal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelTituloHileraOriginal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloHileraOriginal.setText("Hilera Original");

        labelHileraOriginal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelHileraOriginal.setForeground(new java.awt.Color(0, 153, 0));
        labelHileraOriginal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelHilerasIngresadasLayout = new javax.swing.GroupLayout(panelHilerasIngresadas);
        panelHilerasIngresadas.setLayout(panelHilerasIngresadasLayout);
        panelHilerasIngresadasLayout.setHorizontalGroup(
            panelHilerasIngresadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHilerasIngresadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHilerasIngresadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTituloHileraNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTituloHilerasIngresadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTituloHileraOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelHileraNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelHileraOriginal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelHilerasIngresadasLayout.setVerticalGroup(
            panelHilerasIngresadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHilerasIngresadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloHilerasIngresadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTituloHileraOriginal)
                .addGap(18, 18, 18)
                .addComponent(labelHileraOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTituloHileraNueva)
                .addGap(18, 18, 18)
                .addComponent(labelHileraNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHilerasIngresadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIngresoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTituloFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloFrame)
                .addGap(17, 17, 17)
                .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelHilerasIngresadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarHileraActionPerformed
        s = campoTextoIngreso.getText();
        original.construirHilera(s);
        labelHileraOriginal.setText("");
        imprimeHilera(original,labelHileraOriginal);
    }//GEN-LAST:event_botonIngresarHileraActionPerformed

    private void botonAceptarOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarOpcionActionPerformed
        int opcion = listaOpciones.getSelectedIndex();
        if(opcion==1)
        {
            s = campoTextoIngreso.getText();
            nueva = new Hilera();
            nueva.construirHilera(s);
            original = original.concat(nueva);
            labelHileraOriginal.setText("");
            labelHileraNueva.setText("");
            imprimeHilera(original, labelHileraOriginal);
            imprimeHilera(nueva, labelHileraNueva);
        }
        else if(opcion==2)
        {
            
        }
        else if(opcion==3)
        {
            original.borrarHilera(1, original.longitud());
            labelHileraOriginal.setText("");
        }
        else if(opcion==4)
        {
            nueva = new Hilera();
            nueva = original.invertirHilera();                
            labelHileraNueva.setText("");
            imprimeHilera(nueva, labelHileraNueva);
        }
        else if(opcion==5)
        {
            nueva = new Hilera();
            nueva = original.ordernarAlfabeticamente();                
            labelHileraNueva.setText("");
            imprimeHilera(nueva, labelHileraNueva);
        }
        else if(opcion==6)
        {
            s = campoTextoIngreso.getText();
            nueva = new Hilera();
            nueva.construirHilera(s);
            labelHileraNueva.setText("");
            imprimeHilera(nueva, labelHileraNueva);
            if(original.esSubstring(nueva))
            {
                JOptionPane.showMessageDialog(null, "La hilera ingresada es substring de la hilera original");
            }
            else if(nueva.esSubstring(original))
            {
                JOptionPane.showMessageDialog(null, "La hilera original es substring de la hilera ingresada");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Ninguna de ambas es substring de la otra");
            }            
        }
        else if(opcion==7)
        {
            if(original.esPalindromo())
            {
                JOptionPane.showMessageDialog(null, "La hilera es un palindromo");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No es un palindromo");
            }
        }
        else if(opcion==8)
        {
            s = campoTextoIngreso.getText();
            nueva = new Hilera();
            nueva.construirHilera(s);
            labelHileraNueva.setText("");
            imprimeHilera(nueva, labelHileraNueva);
            if(original.anagrama(nueva))
            {
                JOptionPane.showMessageDialog(null, "Las hileras son anagramas");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No son anagramas");
            }
        }
        else if(opcion==9)
        {
            s = campoTextoIngreso.getText();
            original.replace(s);
            labelHileraOriginal.setText("");
            imprimeHilera(original, labelHileraOriginal);
        }
    }//GEN-LAST:event_botonAceptarOpcionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarOpcion;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonIngresarHilera;
    private javax.swing.JTextField campoTextoIngreso;
    private javax.swing.JLabel labelHileraNueva;
    private javax.swing.JLabel labelHileraOriginal;
    private javax.swing.JLabel labelTituloFrame;
    private javax.swing.JLabel labelTituloHileraNueva;
    private javax.swing.JLabel labelTituloHileraOriginal;
    private javax.swing.JLabel labelTituloHilerasIngresadas;
    private javax.swing.JLabel labelTituloIngreso;
    private javax.swing.JLabel labelTituloOpciones;
    private javax.swing.JComboBox<String> listaOpciones;
    private javax.swing.JPanel panelHilerasIngresadas;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
