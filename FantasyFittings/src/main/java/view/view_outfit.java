/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;
import java.awt.Color;
import javax.swing.JFrame;
import autentikasi.Login;
import com.mycompany.FantasyFittings.koneksiDB;
import com.mysql.cj.MysqlType;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Rizka Alfadillla
 */
public class view_outfit extends javax.swing.JPanel {

    /**
     * Creates new form view_outfit
     */
    public view_outfit() {
        initComponents();
        baca_data();
    }
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        view_data = new javax.swing.JTable();
        img1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsi_isi = new javax.swing.JTextArea();
        deskripsi_title = new javax.swing.JLabel();
        harga_title = new javax.swing.JLabel();
        jumlah_title = new javax.swing.JLabel();
        ukuran_title = new javax.swing.JLabel();
        nama_title = new javax.swing.JLabel();
        nama_isi = new javax.swing.JTextField();
        jumlah_isi = new javax.swing.JTextField();
        harga_isi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        id_isi = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setText("Menu Outfit");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kostum.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(741, 741, 741))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(7, 9, 1090, 70);

        view_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Daftar Kostum"
            }
        ));
        view_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(view_data);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(6, 97, 233, 515);

        img1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(img1);
        img1.setBounds(257, 97, 374, 449);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deskripsi_isi.setColumns(20);
        deskripsi_isi.setRows(5);
        jScrollPane2.setViewportView(deskripsi_isi);

        deskripsi_title.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        deskripsi_title.setText("Deskripsi");

        harga_title.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        harga_title.setText("Harga Sewa/Hari    ");

        jumlah_title.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jumlah_title.setText("Jumlah                    ");

        ukuran_title.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        ukuran_title.setText("Ukuran                   ");

        nama_title.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nama_title.setText("Nama Outfit            ");

        nama_isi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_isiActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        id_isi.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        id_isi.setText("jLabel14");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));
        jComboBox1.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_isi)
                    .addComponent(deskripsi_title)
                    .addComponent(nama_title)
                    .addComponent(ukuran_title)
                    .addComponent(jumlah_title)
                    .addComponent(harga_title)
                    .addComponent(jumlah_isi)
                    .addComponent(harga_isi)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(82, 82, 82)
                        .addComponent(jButton3)
                        .addGap(73, 73, 73)
                        .addComponent(jButton2))
                    .addComponent(nama_isi)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id_isi)
                .addGap(9, 9, 9)
                .addComponent(nama_title)
                .addGap(4, 4, 4)
                .addComponent(nama_isi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ukuran_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jumlah_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlah_isi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(harga_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga_isi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(deskripsi_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(649, 97, 442, 515);

        jButton4.setText("Upload Gambar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(257, 564, 374, 48);

        javax.swing.GroupLayout pn_bodyLayout = new javax.swing.GroupLayout(pn_body);
        pn_body.setLayout(pn_bodyLayout);
        pn_bodyLayout.setHorizontalGroup(
            pn_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
        );
        pn_bodyLayout.setVerticalGroup(
            pn_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public ImageIcon ResizeImage (String imgpath){
        ImageIcon myImage = new ImageIcon(imgpath);
        Image imge = myImage.getImage();
        Image newImage = imge.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
        
    }    
    
    private void layar_bersih(){
    nama_isi.setText("");
    jComboBox1.setSelectedIndex(-1); // Set to -1 for no selection
    jumlah_isi.setText("");
    harga_isi.setText("");
    deskripsi_isi.setText("");
    img1.setIcon(null);
    }
    
    
    private void baca_data(){
        //1. Buat Object Pada Model
        
        DefaultTableModel data_outfit = new DefaultTableModel();
        
        data_outfit.addColumn("Nomor");
        data_outfit.addColumn("id");
        data_outfit.addColumn("Daftar Kostum");
        data_outfit.addColumn("Ukuran");
        data_outfit.addColumn("Jumlah");
        data_outfit.addColumn("Harga Sewa/hari");
        data_outfit.addColumn("Deskripsi");
        
        try {
            //2. Query untuk menampilkan data
            //SELECT * FROM nama_tabel
            String query_data = "SELECT * FROM outfit order by nama asc";
            
            //3. Koneksi MYSQL
            Connection penghubung = (Connection)koneksiDB.konfigurasi_koneksiDB();
            
            //4. Statement Query
            Statement statement_sql = penghubung.createStatement();
            
            //5. Eksekusi Query
            ResultSet hasil_SQL = statement_sql.executeQuery(query_data);
            
            int i = 1;
            while (hasil_SQL.next()){
                data_outfit.addRow(new Object[]{
                //isi datanya
                    i++,
                    hasil_SQL.getString("id"),
                    hasil_SQL.getString("nama"),
                    hasil_SQL.getString("ukuran"),
                    hasil_SQL.getString("jumlah"),
                    hasil_SQL.getString("hargaRentalPerHari"),
                    hasil_SQL.getString("deskripsi")
                });
                
            }
                
            view_data.setModel(data_outfit);
            
            view_data.getColumnModel().getColumn(0).setMinWidth(0);
            view_data.getColumnModel().getColumn(0).setMaxWidth(0);
            view_data.getColumnModel().getColumn(0).setWidth(0);
            view_data.getColumnModel().getColumn(0).setPreferredWidth(0);
            
            view_data.getColumnModel().getColumn(1).setMinWidth(0);
            view_data.getColumnModel().getColumn(1).setMaxWidth(0);
            view_data.getColumnModel().getColumn(1).setWidth(0);
            view_data.getColumnModel().getColumn(1).setPreferredWidth(0);
            
            view_data.getColumnModel().getColumn(3).setMinWidth(0);
            view_data.getColumnModel().getColumn(3).setMaxWidth(0);
            view_data.getColumnModel().getColumn(3).setWidth(0);
            view_data.getColumnModel().getColumn(3).setPreferredWidth(0);

            view_data.getColumnModel().getColumn(4).setMinWidth(0);
            view_data.getColumnModel().getColumn(4).setMaxWidth(0);
            view_data.getColumnModel().getColumn(4).setWidth(0);
            view_data.getColumnModel().getColumn(4).setPreferredWidth(0);
            
            view_data.getColumnModel().getColumn(5).setMinWidth(0);
            view_data.getColumnModel().getColumn(5).setMaxWidth(0);
            view_data.getColumnModel().getColumn(5).setWidth(0);
            view_data.getColumnModel().getColumn(5).setPreferredWidth(0);
            
            view_data.getColumnModel().getColumn(6).setMinWidth(0);
            view_data.getColumnModel().getColumn(6).setMaxWidth(0);
            view_data.getColumnModel().getColumn(6).setWidth(0);
            view_data.getColumnModel().getColumn(6).setPreferredWidth(0);
        } catch (Exception e) {
            //7. Tampilkan kesalahan / bug
        }
        
        
        
    }
    
    public class func {
    public ResultSet find(String id_outfit) {
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            Connection penghubung = (Connection)koneksiDB.konfigurasi_koneksiDB();
            st = penghubung.prepareStatement("SELECT urlgambar FROM outfit WHERE id = ?");
            st.setString(1, id_outfit);
            rs = st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
        return rs;
    }
    }
    
    String s;
    private void view_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseClicked
        int baris = view_data.rowAtPoint(evt.getPoint());

        String id_outfit = view_data.getValueAt(baris, 1).toString();
        id_isi.setText(id_outfit);

        String nama_outfit = view_data.getValueAt(baris, 2).toString();
        nama_isi.setText(nama_outfit);

        String ukuran_outfit = view_data.getValueAt(baris, 3).toString();
        jComboBox1.setSelectedItem(ukuran_outfit); // Set the selected item in the JComboBox

        String jumlah_outfit = view_data.getValueAt(baris, 4).toString();
        jumlah_isi.setText(jumlah_outfit);

        String harga_outfit = view_data.getValueAt(baris, 5).toString();
        harga_isi.setText(harga_outfit);

        String deskripsi_outfit = view_data.getValueAt(baris, 6).toString();
        deskripsi_isi.setText(deskripsi_outfit);

        try {
            view_outfit.func f = new view_outfit.func();
            ResultSet rs = f.find(id_outfit);

            if (rs != null && rs.next()) {
                byte[] img = rs.getBytes("urlgambar"); // Assuming the column name is "urlgambar"
                if (img != null) {
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myimg = im.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myimg);
                    img1.setIcon(newImage);
                }
            } else {
                img1.setIcon(null);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_view_dataMouseClicked

    private void nama_isiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_isiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_isiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //1. Menangkap variabel inputan dari GUI
        String nama_outfit = nama_isi.getText();
        String ukuran_outfit = (String) jComboBox1.getSelectedItem();
        String jumlah_outfit = jumlah_isi.getText();
        String harga_outfit = harga_isi.getText();
        String deskripsi_outfit = deskripsi_isi.getText();

        // Validate inputs
        if (nama_outfit.isEmpty() || ukuran_outfit.isEmpty() || jumlah_outfit.isEmpty() || harga_outfit.isEmpty() || deskripsi_outfit.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi");
            return;
        }

        Connection penghubung = null;
        PreparedStatement perintah_tambah = null;
        ByteArrayInputStream is = null;

        try {
            // Get image from JLabel
            Icon icon = img1.getIcon(); // Replace 'imageLabel' with your JLabel variable name
            if (icon == null) {
                JOptionPane.showMessageDialog(null, "Tidak ada gambar untuk disimpan");
                return;
            }

            BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            icon.paintIcon(null, bufferedImage.getGraphics(), 0, 0);

            // Convert BufferedImage to ByteArrayInputStream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            is = new ByteArrayInputStream(baos.toByteArray());

            //3. Menghubungkan Java & SQL
            penghubung = (Connection)koneksiDB.konfigurasi_koneksiDB();

            //4. Statement SQL
            String sql = "INSERT INTO outfit (nama, deskripsi, ukuran, jumlah, hargaRentalPerHari, urlgambar) VALUES (?, ?, ?, ?, ?, ?)";
            perintah_tambah = penghubung.prepareStatement(sql);
            perintah_tambah.setString(1, nama_outfit);
            perintah_tambah.setString(2, deskripsi_outfit);
            perintah_tambah.setString(3, ukuran_outfit);
            perintah_tambah.setString(4, jumlah_outfit);
            perintah_tambah.setString(5, harga_outfit);
            perintah_tambah.setBlob(6, is);

            //5. eksekusi SQL
            perintah_tambah.executeUpdate();

            //6. Validasi SQL
            JOptionPane.showMessageDialog(null, "Outfit baru telah ditambahkan");
            layar_bersih();
            baca_data();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (is != null) {
                    is.close();
                }
                if (perintah_tambah != null) {
                    perintah_tambah.close();
                }
                if (penghubung != null) {
                    penghubung.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menutup koneksi: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 1. Menangkap Variabel dari GUI
        String id_outfit = id_isi.getText();
        String nama_outfit = nama_isi.getText();
        String ukuran_outfit = (String) jComboBox1.getSelectedItem();
        String jumlah_outfit = jumlah_isi.getText();
        String harga_outfit = harga_isi.getText();
        String deskripsi_outfit = deskripsi_isi.getText();

        Connection penghubung = null;
        PreparedStatement perintah_ubah = null;
        PreparedStatement st = null;
        ByteArrayOutputStream baos = null;
        InputStream is = null;

        try {
            // 2. Buat Query SQL untuk mengupdate teks
            String perintah_SQL = "UPDATE outfit SET nama = ?, deskripsi = ?, ukuran = ?, jumlah = ?, hargaRentalPerHari = ? WHERE id = ?";

            // 3. Hubungkan dengan database
            penghubung = (Connection)koneksiDB.konfigurasi_koneksiDB();

            // 4. Statement SQL untuk teks
            perintah_ubah = penghubung.prepareStatement(perintah_SQL);
            perintah_ubah.setString(1, nama_outfit);
            perintah_ubah.setString(2, deskripsi_outfit);
            perintah_ubah.setString(3, ukuran_outfit);
            perintah_ubah.setString(4, jumlah_outfit);
            perintah_ubah.setString(5, harga_outfit);
            perintah_ubah.setString(6, id_outfit);

            // 5. Eksekusi SQL untuk teks
            perintah_ubah.executeUpdate();

            // 6. Statement SQL untuk gambar
            st = penghubung.prepareStatement("UPDATE outfit SET urlgambar = ? WHERE id = ?");

            // Extract image from img1 label
            Icon icon = img1.getIcon();
            if (icon != null) {
                BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics g = bufferedImage.createGraphics();
                icon.paintIcon(null, g, 0, 0);
                g.dispose();

                // Convert BufferedImage to byte array
                baos = new ByteArrayOutputStream();
                ImageIO.write(bufferedImage, "png", baos);
                byte[] imageBytes = baos.toByteArray();

                // Set the byte array as Blob in the SQL statement
                is = new ByteArrayInputStream(imageBytes);
                st.setBlob(1, is);
                st.setString(2, id_outfit);

                // Menjalankan pernyataan update untuk gambar
                st.executeUpdate();
            }

            // 7. Validasi SQL
            JOptionPane.showMessageDialog(null, "Data telah berhasil diubah");
            baca_data();
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (is != null) {
                    is.close();
                }
                if (baos != null) {
                    baos.close();
                }
                if (perintah_ubah != null) {
                    perintah_ubah.close();
                }
                if (st != null) {
                    st.close();
                }
                if (penghubung != null) {
                    penghubung.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace(); // Print stack trace for debugging
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menutup koneksi: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //1. Mengambil nilai variabel dari GUI
        String id_outfit = id_isi.getText();

        try {
            //2. Query SQL
            String perintah_sql = "DELETE from outfit where id ='"+id_outfit+"'";

            //3. Hubungkan dengan SQL
            Connection penghubung = (Connection)koneksiDB.konfigurasi_koneksiDB();

            //4. Statement SQL
            PreparedStatement perintah_hapus = penghubung.prepareStatement(perintah_sql);

            //5. Eksekusi SQL
            int respon = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus?", "Hapus Data Outfit", JOptionPane.YES_NO_OPTION);
            if (respon == JOptionPane.YES_OPTION) {
                perintah_hapus.execute();
                JOptionPane.showMessageDialog(null, "Data outfit berhasil dihapus");
                baca_data();
                layar_bersih();
            }
            else
            {

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*. IMAGE", "jpg", "png", "gif");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = filechooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            img1.setIcon(ResizeImage(path));
            s = path;
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deskripsi_isi;
    private javax.swing.JLabel deskripsi_title;
    private javax.swing.JTextField harga_isi;
    private javax.swing.JLabel harga_title;
    private javax.swing.JLabel id_isi;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlah_isi;
    private javax.swing.JLabel jumlah_title;
    private javax.swing.JTextField nama_isi;
    private javax.swing.JLabel nama_title;
    private javax.swing.JPanel pn_body;
    private javax.swing.JLabel ukuran_title;
    private javax.swing.JTable view_data;
    // End of variables declaration//GEN-END:variables
}
