package Admin;

import Access.MD5;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import static javax.swing.JOptionPane.*;
import javax.swing.*;
import Backup.BackupManagement;
import Lab02.AdminContactos;
import Registros.Data;
import Restricciones.Email;
import Pruebas.MLD;
import Formato.Mantenimiento;
import com.mycompany.archivos.Login;
import com.mycompany.archivos.Registro;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Admin extends javax.swing.JFrame {

    String[] Usuario_Nuevo = {};

    public Admin() {
        initComponents();
        setIcon();
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(Data.Instance().user.getPath_fotografia()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Image dim = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(dim));        
        
        int isAdmin = Data.Instance().user.getRol();
        if (isAdmin == 1) {
            AdminTxt.setText("Administrador: " + Data.Instance().user.getUsuario());
            backup.setEnabled(true);
            Baja.setEnabled(false);
            Nuevo_Usuario.setEnabled(true);
            Administrar.setEnabled(true);
        } else {
            AdminTxt.setText("Usuario: " + Data.Instance().user.getUsuario());
            backup.setEnabled(false);
            Baja.setEnabled(true);
            Nuevo_Usuario.setEnabled(false);
            Administrar.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LU = new javax.swing.JButton();
        contactosButton = new javax.swing.JButton();
        MLD = new javax.swing.JButton();
        correosBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        old_Pass = new javax.swing.JPasswordField();
        new_Pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        birthday = new javax.swing.JFormattedTextField();
        phone_number = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Boton_Baja = new javax.swing.JButton();
        Baja = new javax.swing.JRadioButton();
        Nuevo_Usuario = new javax.swing.JButton();
        Administrar = new javax.swing.JButton();
        User_Name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        backup = new javax.swing.JButton();
        AdminTxt = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        LU.setText("Lista usuario");
        LU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LUActionPerformed(evt);
            }
        });

        contactosButton.setText("Contactos");
        contactosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactosButtonActionPerformed(evt);
            }
        });

        MLD.setText("MLD");
        MLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLDActionPerformed(evt);
            }
        });

        correosBtn.setText("Correos");
        correosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correosBtnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        old_Pass.setToolTipText("Old Password");

        new_Pass.setToolTipText("New Password");

        jLabel2.setText("Old Password");

        jLabel3.setText("New Password");

        jLabel4.setText("Other email");

        email.setToolTipText("other email");

        jLabel5.setText("Birthday");

        try {
            birthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        birthday.setToolTipText("Birthday");
        birthday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthdayFocusLost(evt);
            }
        });
        birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayActionPerformed(evt);
            }
        });

        try {
            phone_number.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phone_number.setToolTipText("Phone ");
        phone_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone_numberFocusLost(evt);
            }
        });
        phone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_numberActionPerformed(evt);
            }
        });
        phone_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_numberKeyTyped(evt);
            }
        });

        jLabel6.setText("Phone number");

        Boton_Baja.setBackground(java.awt.Color.red);
        Boton_Baja.setEnabled(false);
        Boton_Baja.setLabel("Aceptar");
        Boton_Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BajaActionPerformed(evt);
            }
        });

        Baja.setText("Darse de baja");
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });

        Nuevo_Usuario.setText("Nuevo");
        Nuevo_Usuario.setEnabled(false);
        Nuevo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_UsuarioActionPerformed(evt);
            }
        });

        Administrar.setText("Administrar");
        Administrar.setEnabled(false);
        Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Name");

        jLabel8.setText("Last Name");

        name.setToolTipText("other email");

        last_name.setToolTipText("other email");

        backup.setText("Bakup");
        backup.setEnabled(false);
        backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(AdminTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(new_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(old_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(45, 45, 45)
                                        .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton_Baja)
                                .addGap(18, 18, 18)
                                .addComponent(Baja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(73, 73, 73)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nuevo_Usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Administrar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(backup, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(AdminTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(old_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(new_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Administrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nuevo_Usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Baja)
                    .addComponent(Boton_Baja)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ingreso de nuevos valores
     *
     * @param evt
     */
    static Boolean bitac=true;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String oldPass = String.valueOf(old_Pass.getPassword());
        int tam = birthday.getText().length();
        int isAdmin = Data.Instance().user.getRol();
        String usuario = Data.Instance().user.getUsuario();
        
        if (isAdmin==0) {
            
            FileHandling manejo2 = new FileHandling();
            String[] valores = {};
            valores = manejo2.Read_Text("C:\\MEIA\\bitacora_usuario.txt", usuario);
            if (valores[0].equals(usuario)==false) {
            valores = manejo2.Read_Text("C:\\MEIA\\usuario.txt", usuario);
            
        }
        
        Usuario_Nuevo = valores;    //Para ser utilizado en otros métodos sin necesidad de leer el archivo
            
        }

        if (!"".equals(oldPass)) {
            if (!MD5.encryptPassword(oldPass).equals(Usuario_Nuevo[3].toString())) {
                showMessageDialog(null, "La contraseña antigua no coincide con la actual.");
            } else if (birthday.getText().length() < 10) {
                showMessageDialog(null, "La fecha lleva formato dd-MM-yyyy");
            } else if (phone_number.getText().length() < 8) {
                showMessageDialog(null, "El número telefónico debe de contener 8 dígitos.");
            } else if (!(email.getText().contains("@"))) {
                showMessageDialog(null, "El correo debe contener un dominio.");
            } else {
                String[] new_values = {
                    Usuario_Nuevo[0], //Usuario
                    name.getText(), //Nombre
                    last_name.getText(), //Apellido
                    String.valueOf(new_Pass.getPassword()), //Nueva contraseña
                    Usuario_Nuevo[4], //Rol
                    birthday.getText(), //Cumpleaños
                    email.getText(), //email
                    phone_number.getText(), //Telefono
                    Usuario_Nuevo[8], //Ruta foto perfil
                    Usuario_Nuevo[9] //Status
                };
                
                if (bitac == true) {
                FileHandling manejo = new FileHandling();
                String ruta = "C:\\MEIA\\bitacora_usuario.txt";
                manejo.Write_Text(Usuario_Nuevo, new_values, ruta);
                showMessageDialog(null, "Usuario modificado");    
                }
                if(bitac == false){
                FileHandling manejo = new FileHandling();
                String ruta = "C:\\MEIA\\usuario.txt";
                manejo.Write_Text(Usuario_Nuevo, new_values, ruta);
                showMessageDialog(null, "Usuario modificado");
                }
                
                
            }
        } else {
            if (birthday.getText().length() < 10) {
                showMessageDialog(null, "La fecha lleva formato dd-MM-yyyy");
            } else if (phone_number.getText().length() < 8) {
                showMessageDialog(null, "El número telefónico debe de contener 8 dígitos.");
            } else if (!(email.getText().contains("@"))) {
                showMessageDialog(null, "El correo debe contener un dominio.");
            } else {
                String[] new_values = {
                    Usuario_Nuevo[0], //Usuario
                    name.getText(), //Nombre
                    last_name.getText(), //Apellido
                    Usuario_Nuevo[3], //Nueva contraseña
                    Usuario_Nuevo[4], //Rol
                    birthday.getText(), //Cumpleaños
                    email.getText(), //email
                    phone_number.getText(), //Telefono
                    Usuario_Nuevo[8], //Ruta foto perfil
                    Usuario_Nuevo[9] //Status
                };
                
                if (bitac == true) {
                FileHandling manejo = new FileHandling();
                String ruta = "C:\\MEIA\\bitacora_usuario.txt";
                manejo.Write_Text(Usuario_Nuevo, new_values, ruta);
                showMessageDialog(null, "Usuario modificado");    
                }
                if(bitac == false){
                FileHandling manejo = new FileHandling();
                String ruta = "C:\\MEIA\\usuario.txt";
                manejo.Write_Text(Usuario_Nuevo, new_values, ruta);
                showMessageDialog(null, "Usuario modificado");
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Ingreso telefónico
     *
     * @param evt
     */
    private void phone_numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_numberKeyTyped
        char number = evt.getKeyChar();
        if (!(Character.isDigit(number))) {
            evt.consume();
        }
    }//GEN-LAST:event_phone_numberKeyTyped

    /**
     * Ingreso de fecha de nacimiento
     *
     * @param evt
     */
    private void birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayActionPerformed
        String format = new SimpleDateFormat("dd/MM/yy").format(new Date());
        JFormattedTextField dateTextField = new JFormattedTextField(format);

    }//GEN-LAST:event_birthdayActionPerformed

    /**
     * Confirmación de fecha de nacimiento
     *
     * @param evt
     */
    private void birthdayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthdayFocusLost
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date usuario = sdf.parse(birthday.getText());
            Date date = new Date();
            if (usuario.compareTo(date) > 0) {
                birthday.setText("");
                showMessageDialog(null, "la fecha ingresada es mayor a la actual.");
            }
        } catch (ParseException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_birthdayFocusLost

    /**
     * Dar de baja al usuario
     *
     * @param evt
     */
    private void Boton_BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BajaActionPerformed
        
        
        int isAdmin = Data.Instance().user.getRol();
        String usuario = Data.Instance().user.getUsuario();
        Boolean bitacora = true;
        if (isAdmin==0) {
            
            FileHandling manejo2 = new FileHandling();
            String[] valores = {};
            valores = manejo2.Read_Text("C:\\MEIA\\bitacora_usuario.txt", usuario);
            if (valores[0].equals(usuario)==false) {
            valores = manejo2.Read_Text("C:\\MEIA\\usuario.txt", usuario);
            bitacora = false;
            
        }
        
        Usuario_Nuevo = valores;    //Para ser utilizado en otros métodos sin necesidad de leer el archivo
            
        }
        
        if (Usuario_Nuevo.length > 0) {
            showMessageDialog(null, "Se dará de baja al usuario " + Usuario_Nuevo[0]);
            FileHandling manejo = new FileHandling();
            String ruta="";
            if (bitacora==true) {
                ruta = "C:\\MEIA\\bitacora_usuario.txt";    
            }
            if (bitacora==false) {
                ruta = "C:\\MEIA\\usuario.txt";   
            }
            
            String[] new_values = {
                Usuario_Nuevo[0],
                Usuario_Nuevo[1],
                Usuario_Nuevo[3],
                Usuario_Nuevo[4],
                Usuario_Nuevo[5],
                Usuario_Nuevo[6],
                Usuario_Nuevo[7],
                Usuario_Nuevo[8],
                "0"
            };
            manejo.Write_Text(Usuario_Nuevo, new_values, ruta);
            showMessageDialog(null, "Se ha dado de baja al usuario " + Usuario_Nuevo[0]);
        } else {
            showMessageDialog(null, "Porfavor seleccione usuario que desea dar de baja.");
        }
    }//GEN-LAST:event_Boton_BajaActionPerformed

    /**
     * Permiso para dar de baja al usuario
     *
     * @param evt
     */
    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
        int isAdmin = Data.Instance().user.getRol();
        if (Baja.isSelected() && isAdmin == 1) {
            if (Usuario_Nuevo[4] == "1") {
                showMessageDialog(null, "Eres administrador, no puedes darte de baja.");
            } else {
                Boton_Baja.setEnabled(true);
            }
        } else {
            Boton_Baja.setEnabled(true);
        }
    }//GEN-LAST:event_BajaActionPerformed

    /**
     * Creación de nuevo usuario
     *
     * @param evt
     */
    private void Nuevo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_UsuarioActionPerformed
        Registro registro = new Registro();
        registro.setVisible(true);

        //Llamar jForm de creación de usuario
    }//GEN-LAST:event_Nuevo_UsuarioActionPerformed

    //Muestra en textbox los valores del usuario que se desea administrar
    private void AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarActionPerformed
        String Usuario = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario que desea administrar:");
        FileHandling manejo = new FileHandling();
        String[] valores = {};
        bitac = true;
        valores = manejo.Read_Text("C:\\MEIA\\bitacora_usuario.txt", Usuario);
        if (valores[0].equals(Usuario)==false) {
            
            valores = manejo.Read_Text("C:\\MEIA\\usuario.txt", Usuario);
            bitac = false;
        }
        
        Usuario_Nuevo = valores;    //Para ser utilizado en otros métodos sin necesidad de leer el archivo
        User_Name.setText(valores[0]);
        name.setText(valores[1]);
        last_name.setText(valores[2]);
        admin.setText(valores[4]);
        birthday.setText(valores[5]);
        email.setText(valores[6]);
        phone_number.setText(valores[7]);
        int isAdmin = Data.Instance().user.getRol();
        if (isAdmin == 1) {
            Baja.setEnabled(true);
        }
        else {
            Baja.setEnabled(false);
        }
    }//GEN-LAST:event_AdministrarActionPerformed


    private void backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupActionPerformed
        BackupManagement jframe = new BackupManagement();
        jframe.show();
    }//GEN-LAST:event_backupActionPerformed

    private void phone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_numberActionPerformed

    private void phone_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone_numberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_numberFocusLost

    private void MLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLDActionPerformed
        MLD mld = new MLD();
        mld.setVisible(true);
    }//GEN-LAST:event_MLDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contactosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactosButtonActionPerformed
        // TODO add your handling code here:
        AdminContactos contactos = new AdminContactos();
        contactos.setVisible(true);
    }//GEN-LAST:event_contactosButtonActionPerformed

    private void LUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LUActionPerformed
        // TODO add your handling code here:
        Mantenimiento lista_usuarios = new Mantenimiento();
        lista_usuarios.setVisible(true);
    }//GEN-LAST:event_LUActionPerformed

    private void correosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correosBtnActionPerformed
        // TODO add your handling code here:
        Email email = new Email();  
        email.setVisible(true);
    }//GEN-LAST:event_correosBtnActionPerformed

    private void setIcon(){
        ImageIcon img = new ImageIcon("C:\\MEIA\\Imagenes\\icon.jpg");
        this.setIconImage(img.getImage());    }
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminTxt;
    private javax.swing.JButton Administrar;
    private javax.swing.JRadioButton Baja;
    private javax.swing.JButton Boton_Baja;
    private javax.swing.JButton LU;
    private javax.swing.JButton MLD;
    private javax.swing.JButton Nuevo_Usuario;
    private javax.swing.JLabel User_Name;
    private javax.swing.JLabel admin;
    private javax.swing.JButton backup;
    private javax.swing.JFormattedTextField birthday;
    private javax.swing.JButton contactosButton;
    private javax.swing.JButton correosBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField new_Pass;
    private javax.swing.JPasswordField old_Pass;
    private javax.swing.JFormattedTextField phone_number;
    // End of variables declaration//GEN-END:variables
}
