/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1clase3.view;

import javax.swing.JInternalFrame;

/**
 *
 * @author Alumno
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); //maximizar la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuGenio = new javax.swing.JMenu();
        menuGenioFactorial = new javax.swing.JMenuItem();
        menuGenioMcdMcm = new javax.swing.JMenuItem();
        menuGenioFibonacci = new javax.swing.JMenuItem();
        menuGenioPrimo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genio");
        setBackground(new java.awt.Color(255, 255, 255));

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuGenio.setText("Genio");

        menuGenioFactorial.setText("Factorial");
        menuGenioFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenioFactorialActionPerformed(evt);
            }
        });
        menuGenio.add(menuGenioFactorial);

        menuGenioMcdMcm.setText("MCD y MCM");
        menuGenioMcdMcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenioMcdMcmActionPerformed(evt);
            }
        });
        menuGenio.add(menuGenioMcdMcm);

        menuGenioFibonacci.setText("Fibonacci");
        menuGenioFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenioFibonacciActionPerformed(evt);
            }
        });
        menuGenio.add(menuGenioFibonacci);

        menuGenioPrimo.setText("Primo");
        menuGenioPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenioPrimoActionPerformed(evt);
            }
        });
        menuGenio.add(menuGenioPrimo);

        menuBar.add(menuGenio);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuGenioFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenioFactorialActionPerformed
        // COMO SE CARGA
        cargarFornulario(FactorialView.class);

    }//GEN-LAST:event_menuGenioFactorialActionPerformed

    private void menuGenioFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenioFibonacciActionPerformed
        // COMO SE CARGA
        cargarFornulario(FibonacciView.class);
    }//GEN-LAST:event_menuGenioFibonacciActionPerformed

    private void menuGenioPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenioPrimoActionPerformed
        // TODO add your handling code here:
        cargarFornulario(Primo.class);
    }//GEN-LAST:event_menuGenioPrimoActionPerformed

    private void menuGenioMcdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenioMcdMcmActionPerformed
        // TODO add your handling code here:
        cargarFornulario(MCM.class);        
    }//GEN-LAST:event_menuGenioMcdMcmActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGenio;
    private javax.swing.JMenuItem menuGenioFactorial;
    private javax.swing.JMenuItem menuGenioFibonacci;
    private javax.swing.JMenuItem menuGenioMcdMcm;
    private javax.swing.JMenuItem menuGenioPrimo;
    // End of variables declaration//GEN-END:variables

    private void cargarFornulario(Class<?> aClass) {
        try {
            // Variable de control
            JInternalFrame view = null;
            //Buscar la instancia en el desktopPane
            for (JInternalFrame form : desktopPane.getAllFrames()) {
                if (aClass.isInstance(form)) {
                    view = form;
                    break;
                }
            }
            // si no lo encuentra se crea la instancia
            if (view == null) {
                view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
                desktopPane.add(view);
                view.setVisible(true);

            }
            // Activar el formulario
            view.setSelected(true);
        } catch (Exception e) {
        }

    }

}
