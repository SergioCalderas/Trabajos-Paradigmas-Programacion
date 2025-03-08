/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de enero del 2024
    
    La funcionalidad de la clase JFrame Camisa es mostrar los detalles del producto
    Playera, ademas de poder crear un obejto de la clase ropa con los atributos. 
    seleccionados
    Los Metodos de Carrito son
     - suma: Este Metodo va asociada con el botonMasPlayera, cuando se hace clic 
       aumenta la cantidad de las playera que se van a comprar.
     - resta: Este Metodo va asociada con el botonMenosPlayera, cuando se hace clic 
       disminuye la cantidad de las playeras que se van a comprar, no genera valores
       negativos.
     - Cantidad: Este Metodo se relaciona con el JLabel textoNumeroID y va a 
       transformar el int ID_playera a un String para que sea visible el codigo unico
       de la playera
*/

/* Nombre del paquete con las clases de la aplicacion*/
package carrito;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.*;

public class Camisa extends javax.swing.JFrame {
    public static int ID_playera = 1;  // Codigo unico de la playera
    private char talla;     // Talla que puede ir cambiando en base al boton que se selecciona
    private String color;   // Color que puede ir cambiando en base al boton que se selecciona
    
    /* Constructor de Camisa */
    public Camisa() {
        initComponents();
        this.setTitle("Playera"); // Nombre de la ventana
        // Establecer en texto el codigo unico de la playera que se tiene al momento
        textoNumeroID.setText(Cantidad(ID_playera)); 
    }

    /* Esta seccion es la encargada de generar todos los elementos visibles de la aplicacion
       se va generando automaticamente al ingresar elementos al JFrame */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundCamisa = new javax.swing.JPanel();
        BarrasNegra = new javax.swing.JPanel();
        textoComprasOnline = new javax.swing.JLabel();
        imagenCarrito = new javax.swing.JLabel();
        volverPlayera = new javax.swing.JButton();
        fondoColorCambiante = new javax.swing.JPanel();
        playeraColorCambiante = new javax.swing.JLabel();
        descripcionPlayera1 = new javax.swing.JLabel();
        descripcionPlayera2 = new javax.swing.JLabel();
        textoPrecioPlayera = new javax.swing.JLabel();
        textoIDPlayera = new javax.swing.JLabel();
        textoCantidadPlayera = new javax.swing.JLabel();
        textoTallaPlayera = new javax.swing.JLabel();
        textoColorPlayera = new javax.swing.JLabel();
        botonRojo = new javax.swing.JPanel();
        textoRojo = new javax.swing.JLabel();
        botonAzul = new javax.swing.JPanel();
        textoAzul = new javax.swing.JLabel();
        botonGris = new javax.swing.JPanel();
        textoGris = new javax.swing.JLabel();
        botonTallaSmall = new javax.swing.JPanel();
        textoS = new javax.swing.JLabel();
        botonTallaMedium = new javax.swing.JPanel();
        textoM = new javax.swing.JLabel();
        botonTallaLarge = new javax.swing.JPanel();
        textoL = new javax.swing.JLabel();
        botonMasPlayera = new javax.swing.JButton();
        botonMenosPlayera = new javax.swing.JButton();
        llenadoCantidadPlayera = new javax.swing.JTextField();
        botonAgregarPlayera = new javax.swing.JPanel();
        textoAgregarCarrito = new javax.swing.JLabel();
        textoNumeroID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackgroundCamisa.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCamisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarrasNegra.setBackground(new java.awt.Color(19, 25, 33));

        textoComprasOnline.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoComprasOnline.setForeground(new java.awt.Color(255, 255, 255));
        textoComprasOnline.setText("Compras Online");

        imagenCarrito.setText("jLabel2");
        imagenCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BarrasNegraLayout = new javax.swing.GroupLayout(BarrasNegra);
        BarrasNegra.setLayout(BarrasNegraLayout);
        BarrasNegraLayout.setHorizontalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textoComprasOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(imagenCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        BarrasNegraLayout.setVerticalGroup(
            BarrasNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarrasNegraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(textoComprasOnline)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarrasNegraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenCarrito)
                .addContainerGap())
        );

        BackgroundCamisa.add(BarrasNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 90));

        volverPlayera.setBackground(new java.awt.Color(230, 122, 0));
        volverPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        volverPlayera.setForeground(new java.awt.Color(255, 255, 255));
        volverPlayera.setText("Volver");
        volverPlayera.setFocusable(false);
        volverPlayera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverPlayeraActionPerformed(evt);
            }
        });
        BackgroundCamisa.add(volverPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        fondoColorCambiante.setBackground(new java.awt.Color(88, 88, 88));
        fondoColorCambiante.setPreferredSize(new java.awt.Dimension(180, 180));

        playeraColorCambiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito/imagenes/playeraSinFondo.png"))); // NOI18N

        javax.swing.GroupLayout fondoColorCambianteLayout = new javax.swing.GroupLayout(fondoColorCambiante);
        fondoColorCambiante.setLayout(fondoColorCambianteLayout);
        fondoColorCambianteLayout.setHorizontalGroup(
            fondoColorCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoColorCambianteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(playeraColorCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoColorCambianteLayout.setVerticalGroup(
            fondoColorCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoColorCambianteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(playeraColorCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BackgroundCamisa.add(fondoColorCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 176, 180));

        descripcionPlayera1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionPlayera1.setText("Playera de ajuste clásico de algodón");
        BackgroundCamisa.add(descripcionPlayera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 370, -1));

        descripcionPlayera2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        descripcionPlayera2.setText("suave y liso.");
        BackgroundCamisa.add(descripcionPlayera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 130, 40));

        textoPrecioPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoPrecioPlayera.setText("Precio: $300.00");
        BackgroundCamisa.add(textoPrecioPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, 40));

        textoIDPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoIDPlayera.setText("ID:");
        BackgroundCamisa.add(textoIDPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 40, 40));

        textoCantidadPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoCantidadPlayera.setText("Cantidad");
        BackgroundCamisa.add(textoCantidadPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 80, 40));

        textoTallaPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoTallaPlayera.setText("Talla:");
        BackgroundCamisa.add(textoTallaPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 60, 40));

        textoColorPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoColorPlayera.setText("Color:");
        BackgroundCamisa.add(textoColorPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 60, 40));

        botonRojo.setBackground(new java.awt.Color(200, 28, 47));
        botonRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRojoMouseClicked(evt);
            }
        });

        textoRojo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoRojo.setForeground(new java.awt.Color(255, 255, 255));
        textoRojo.setText("Rojo");

        javax.swing.GroupLayout botonRojoLayout = new javax.swing.GroupLayout(botonRojo);
        botonRojo.setLayout(botonRojoLayout);
        botonRojoLayout.setHorizontalGroup(
            botonRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonRojoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        botonRojoLayout.setVerticalGroup(
            botonRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonRojoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoRojo)
                .addContainerGap())
        );

        BackgroundCamisa.add(botonRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 90, 30));

        botonAzul.setBackground(new java.awt.Color(30, 56, 211));
        botonAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAzulMouseClicked(evt);
            }
        });

        textoAzul.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAzul.setForeground(new java.awt.Color(255, 255, 255));
        textoAzul.setText("Azul");

        javax.swing.GroupLayout botonAzulLayout = new javax.swing.GroupLayout(botonAzul);
        botonAzul.setLayout(botonAzulLayout);
        botonAzulLayout.setHorizontalGroup(
            botonAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAzulLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        botonAzulLayout.setVerticalGroup(
            botonAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAzul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundCamisa.add(botonAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        botonGris.setBackground(new java.awt.Color(88, 88, 88));
        botonGris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGrisMouseClicked(evt);
            }
        });

        textoGris.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoGris.setForeground(new java.awt.Color(255, 255, 255));
        textoGris.setText("Gris");

        javax.swing.GroupLayout botonGrisLayout = new javax.swing.GroupLayout(botonGris);
        botonGris.setLayout(botonGrisLayout);
        botonGrisLayout.setHorizontalGroup(
            botonGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGrisLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textoGris, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        botonGrisLayout.setVerticalGroup(
            botonGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGrisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoGris)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundCamisa.add(botonGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        botonTallaSmall.setBackground(new java.awt.Color(231, 231, 231));
        botonTallaSmall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTallaSmall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTallaSmallMouseClicked(evt);
            }
        });

        textoS.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoS.setText("S");

        javax.swing.GroupLayout botonTallaSmallLayout = new javax.swing.GroupLayout(botonTallaSmall);
        botonTallaSmall.setLayout(botonTallaSmallLayout);
        botonTallaSmallLayout.setHorizontalGroup(
            botonTallaSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaSmallLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(textoS)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        botonTallaSmallLayout.setVerticalGroup(
            botonTallaSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaSmallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundCamisa.add(botonTallaSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, 30));

        botonTallaMedium.setBackground(new java.awt.Color(231, 231, 231));
        botonTallaMedium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTallaMedium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTallaMediumMouseClicked(evt);
            }
        });

        textoM.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoM.setText("M");

        javax.swing.GroupLayout botonTallaMediumLayout = new javax.swing.GroupLayout(botonTallaMedium);
        botonTallaMedium.setLayout(botonTallaMediumLayout);
        botonTallaMediumLayout.setHorizontalGroup(
            botonTallaMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaMediumLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(textoM)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        botonTallaMediumLayout.setVerticalGroup(
            botonTallaMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaMediumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundCamisa.add(botonTallaMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, 30));

        botonTallaLarge.setBackground(new java.awt.Color(231, 231, 231));
        botonTallaLarge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTallaLarge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTallaLargeMouseClicked(evt);
            }
        });

        textoL.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoL.setText("L");

        javax.swing.GroupLayout botonTallaLargeLayout = new javax.swing.GroupLayout(botonTallaLarge);
        botonTallaLarge.setLayout(botonTallaLargeLayout);
        botonTallaLargeLayout.setHorizontalGroup(
            botonTallaLargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaLargeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(textoL)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        botonTallaLargeLayout.setVerticalGroup(
            botonTallaLargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonTallaLargeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundCamisa.add(botonTallaLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, 30));

        botonMasPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMasPlayera.setText("+");
        botonMasPlayera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMasPlayera.setFocusable(false);
        botonMasPlayera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasPlayeraActionPerformed(evt);
            }
        });
        BackgroundCamisa.add(botonMasPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 61, 33));

        botonMenosPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        botonMenosPlayera.setText("-");
        botonMenosPlayera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenosPlayera.setFocusable(false);
        botonMenosPlayera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosPlayeraActionPerformed(evt);
            }
        });
        BackgroundCamisa.add(botonMenosPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 61, 33));

        llenadoCantidadPlayera.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        llenadoCantidadPlayera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        llenadoCantidadPlayera.setText("0");
        llenadoCantidadPlayera.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        llenadoCantidadPlayera.setFocusable(false);
        llenadoCantidadPlayera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenadoCantidadPlayeraActionPerformed(evt);
            }
        });
        BackgroundCamisa.add(llenadoCantidadPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 61, 33));

        botonAgregarPlayera.setBackground(new java.awt.Color(255, 216, 20));
        botonAgregarPlayera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarPlayera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarPlayeraMouseClicked(evt);
            }
        });

        textoAgregarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        textoAgregarCarrito.setText("Agregar al Carrito");

        javax.swing.GroupLayout botonAgregarPlayeraLayout = new javax.swing.GroupLayout(botonAgregarPlayera);
        botonAgregarPlayera.setLayout(botonAgregarPlayeraLayout);
        botonAgregarPlayeraLayout.setHorizontalGroup(
            botonAgregarPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAgregarPlayeraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAgregarCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAgregarPlayeraLayout.setVerticalGroup(
            botonAgregarPlayeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregarPlayeraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoAgregarCarrito)
                .addContainerGap())
        );

        BackgroundCamisa.add(botonAgregarPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 140, 30));

        textoNumeroID.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textoNumeroID.setText("id");
        BackgroundCamisa.add(textoNumeroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCamisa, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton que regresa a la ventana Carrito, princial de la aplicacion
    private void volverPlayeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverPlayeraActionPerformed
        Carrito newframe = new Carrito();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverPlayeraActionPerformed

    // Si se selecciona el boton rojo para el color de la playera
    private void botonRojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRojoMouseClicked
        fondoColorCambiante.setBackground(new Color (200,28,47)); // Cambiar el color del fondo de la playera
        botonRojo.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton seleccionado
        botonAzul.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonGris.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        color = "Rojo"; // Establecer el valor de la variable a Rojo para el constructor
    }//GEN-LAST:event_botonRojoMouseClicked

    // Si se selecciona el boton azul para el color de la playera
    private void botonAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzulMouseClicked
        fondoColorCambiante.setBackground(new Color (30,56,211)); // Cambiar el color del fondo de la playera
        botonRojo.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonAzul.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton seleccionado
        botonGris.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        color = "Azul"; // Establecer el valor de la variable a Azul para el constructor
    }//GEN-LAST:event_botonAzulMouseClicked

    // Si se selecciona el boton gris para el color de la playera
    private void botonGrisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrisMouseClicked
        fondoColorCambiante.setBackground(new Color (88,88,88));
        botonRojo.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonAzul.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonGris.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton seleccionado
        color = "Gris"; // Establecer el valor de la variable a Gris para el constructor
    }//GEN-LAST:event_botonGrisMouseClicked

    // Si se selecciona el boton S para la talla de la playera
    private void botonTallaSmallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTallaSmallMouseClicked
        botonTallaSmall.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        botonTallaMedium.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaLarge.setBorder(BorderFactory.createLineBorder(Color.white));  // Cambiar el color del borde a blanco del no seleccionado
        talla = 'S'; // Establecer el valor de la variable a S para el constructor
    }//GEN-LAST:event_botonTallaSmallMouseClicked

    // Si se selecciona el boton M para la talla de la playera
    private void botonTallaMediumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTallaMediumMouseClicked
        botonTallaSmall.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaMedium.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        botonTallaLarge.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        talla = 'M'; // Establecer el valor de la variable a S para el constructor
    }//GEN-LAST:event_botonTallaMediumMouseClicked

    // Si se selecciona el boton L para la talla de la playera
    private void botonTallaLargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTallaLargeMouseClicked
        botonTallaSmall.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaMedium.setBorder(BorderFactory.createLineBorder(Color.white)); // Cambiar el color del borde a blanco del no seleccionado
        botonTallaLarge.setBorder(BorderFactory.createLineBorder(new Color(231,117,2), 2)); // Cambiar el color del borde a naranja del boton pulsado
        talla = 'L'; // Establecer el valor de la variable a S para el constructor
    }//GEN-LAST:event_botonTallaLargeMouseClicked

    // Si hace clic en el boton + de la playera
    private void botonMasPlayeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasPlayeraActionPerformed
        Integer cantidad = Integer.parseInt(llenadoCantidadPlayera.getText()); // Obtener el valor en llenadoCantidadPlayera
        String resultado = String.valueOf(suma(cantidad)); // Sumar 1 en el valor de cantidad
        llenadoCantidadPlayera.setText(resultado); // Establecer el resultado de la suma
    }//GEN-LAST:event_botonMasPlayeraActionPerformed

    // Si hace clic en el boton - de la playera
    private void botonMenosPlayeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosPlayeraActionPerformed
        Integer cantidad =Integer.parseInt(llenadoCantidadPlayera.getText()); // Obtener el valor en llenadoCantidadPlayera
        String resultado = String.valueOf(resta(cantidad)); // Restar 1 en el valor de cantidad
        llenadoCantidadPlayera.setText(resultado); // Establecer el resultado de la resta
    }//GEN-LAST:event_botonMenosPlayeraActionPerformed

    // Aqui se mostraran los resultados del uso de los botones
    private void llenadoCantidadPlayeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenadoCantidadPlayeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llenadoCantidadPlayeraActionPerformed

    // Si se añade al carrito se llama al contructor de Ropa con las caracteristicas que se eligieron
    private void botonAgregarPlayeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPlayeraMouseClicked
        // Llamada al constructor
        Ropa ropa = new Ropa("Playera", talla, color, 300 * Integer.parseInt(llenadoCantidadPlayera.getText()),
                             "Ropa", ID_playera, Integer.parseInt(llenadoCantidadPlayera.getText()));
        ID_playera ++; // Aumentar el ID de la playera
        MiCarrito.listaProductos.add(ropa); // Llamada al ArrayList listaProductos para añador la ropa creada
        JOptionPane.showMessageDialog(null, "Playera agregada al carrito"); // Mostrar mensaje que se añadadio al carrito
    }//GEN-LAST:event_botonAgregarPlayeraMouseClicked

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
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Camisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Camisa().setVisible(true);
            }
        });
    }

    // Sumar 1 a la cantidad de la playera
    private int suma(int cantidad){
        cantidad = cantidad + 1;
        return cantidad;
    }
    
    // Restar 1 a la cantidad de la playera
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad - 1;
        }
        return cantidad;
    }
    
    // Metodo para mostrar el ID_playera como un String
    public String Cantidad(int ID){
        return "# " + ID_playera;
    }
    
    // Declaracion de la variablees de los elementos que se muestran en el JFrame Camisa
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCamisa;
    private javax.swing.JPanel BarrasNegra;
    private javax.swing.JPanel botonAgregarPlayera;
    private javax.swing.JPanel botonAzul;
    private javax.swing.JPanel botonGris;
    private javax.swing.JButton botonMasPlayera;
    private javax.swing.JButton botonMenosPlayera;
    private javax.swing.JPanel botonRojo;
    private javax.swing.JPanel botonTallaLarge;
    private javax.swing.JPanel botonTallaMedium;
    private javax.swing.JPanel botonTallaSmall;
    private javax.swing.JLabel descripcionPlayera1;
    private javax.swing.JLabel descripcionPlayera2;
    private javax.swing.JPanel fondoColorCambiante;
    private javax.swing.JLabel imagenCarrito;
    private javax.swing.JTextField llenadoCantidadPlayera;
    private javax.swing.JLabel playeraColorCambiante;
    private javax.swing.JLabel textoAgregarCarrito;
    private javax.swing.JLabel textoAzul;
    private javax.swing.JLabel textoCantidadPlayera;
    private javax.swing.JLabel textoColorPlayera;
    private javax.swing.JLabel textoComprasOnline;
    private javax.swing.JLabel textoGris;
    private javax.swing.JLabel textoIDPlayera;
    private javax.swing.JLabel textoL;
    private javax.swing.JLabel textoM;
    private javax.swing.JLabel textoNumeroID;
    private javax.swing.JLabel textoPrecioPlayera;
    private javax.swing.JLabel textoRojo;
    private javax.swing.JLabel textoS;
    private javax.swing.JLabel textoTallaPlayera;
    private javax.swing.JButton volverPlayera;
    // End of variables declaration//GEN-END:variables
}
