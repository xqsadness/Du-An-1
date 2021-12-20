/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import Controller.AbsController;
import Controller.ChiTietSanPhamController;
import Controller.SanPhamController;
import MODEL.SanPham;
import VIEW.ViewImp;
import VIEW.ViewInterface;
import com.raven.swing.MImage;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.oval.ConstraintViolation;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Admin
 */
public class ChiTietSanPhamDialog extends javax.swing.JDialog implements ViewInterface {

    /**
     * Creates new form ChiTietSanPhamDialog
     */
    public ChiTietSanPhamDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(MImage.getAppIcon());
        this.setTitle("Detail");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                int soLuong = 0;
                for (int i = 0; i < tblChiTietSanPham.getRowCount(); i++) {
                    soLuong = soLuong + (Integer.parseInt(tblChiTietSanPham.getValueAt(i, 5).toString()));
                }
                chiTietSanPhamController.editSoLuongSanPham(soLuong, idSanPham);

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        searchText3 = new com.raven.swing.SearchText();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietSanPham = new com.raven.swing.TableColumn();
        scrollBar1 = new com.raven.swing.ScrollBar();
        txtDungLuong = new javax.swing.JTextField();
        txtMau = new javax.swing.JTextField();
        txtHsx = new javax.swing.JTextField();
        btnThem2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorLB = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSua = new javax.swing.JLabel();
        btnThem3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/arrow-55-16.png"))); // NOI18N
        jLabel3.setText("     Xuất file");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchText3, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tblChiTietSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tblChiTietSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChiTietSanPham);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jPanel1.add(scrollBar1, java.awt.BorderLayout.LINE_END);

        btnThem2.setBackground(new java.awt.Color(0, 153, 153));
        btnThem2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem2.setForeground(new java.awt.Color(255, 255, 255));
        btnThem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/plus-16.png"))); // NOI18N
        btnThem2.setText("  Thêm mới");
        btnThem2.setOpaque(true);
        btnThem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThem2MouseClicked(evt);
            }
        });

        jLabel1.setText("Dung lượng");

        jLabel2.setText("Màu sắc");

        jLabel4.setText("Hãng sản xuất");

        errorLB.setFont(new java.awt.Font("UTM Avo", 2, 12)); // NOI18N
        errorLB.setForeground(new java.awt.Color(255, 0, 0));
        errorLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorLB.setText("jLabel5");

        lbStatus.setFont(new java.awt.Font("UTM Avo", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(0, 0, 204));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("*Thêm thành công");

        jLabel5.setText("Số Lượng");

        btnSua.setBackground(new java.awt.Color(0, 153, 153));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSua.setText("Cập nhập");
        btnSua.setOpaque(true);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnThem3.setBackground(new java.awt.Color(0, 153, 153));
        btnThem3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem3.setForeground(new java.awt.Color(255, 255, 255));
        btnThem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThem3.setText("   Xóa");
        btnThem3.setOpaque(true);
        btnThem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThem3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(errorLB, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHsx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMau)
                                        .addComponent(txtDungLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDungLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLB)
                .addGap(40, 40, 40)
                .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public Integer idSanPham;

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idsanpham) {
        this.idSanPham = idsanpham;

        ChiTietSanPhamController chiTietSanPhamController = new ChiTietSanPhamController(this);

    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        exportExcel(tblChiTietSanPham);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnThem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem2MouseClicked
        // TODO add your handling code here:
        errorLB.setText("");
        String dungLuong = txtDungLuong.getText();
        String mau = txtMau.getText();
        String hsx = txtHsx.getText();

        
        if (mau.trim().equals("")) {
            errorLB.setText("Vui lòng nhập màu sắc ! ");
            return;
        }
        if (hsx.trim().equals("")) {
            errorLB.setText("Vui lòng nhập hãng sản xuất ! ");
            return;
        }

        chiTietSanPhamController.them(dungLuong, Integer.parseInt(SanPhamPanel.id), mau, hsx, Integer.parseInt(txtSoLuong.getValue().toString()));
        lbStatus.setText("*Thêm thành công");
        int soLuong = 0;
        for (int i = 0; i < tblChiTietSanPham.getRowCount(); i++) {
            soLuong = soLuong + (Integer.parseInt(tblChiTietSanPham.getValueAt(i, 5).toString()));
        }
        System.out.println(soLuong);
        chiTietSanPhamController.editSoLuongSanPham(soLuong, idSanPham);


    }//GEN-LAST:event_btnThem2MouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        errorLB.setText("");
        String dungLuong = txtDungLuong.getText();
        String mau = txtMau.getText();
        String hsx = txtHsx.getText();

        
        if (mau.trim().equals("")) {
            errorLB.setText("Vui lòng nhập màu sắc ! ");
            return;
        }
        if (hsx.trim().equals("")) {
            errorLB.setText("Vui lòng nhập hãng sản xuất ! ");
            return;
        }

        Integer editId = (Integer) tblChiTietSanPham.getValueAt(tblChiTietSanPham.getSelectedRow(), 0);

        Object[] values = new Object[8];
        values[0] = editId;
        values[1] = dungLuong;
        values[2] = Integer.parseInt(SanPhamPanel.id);
        values[3] = mau;
        values[4] = hsx;
        values[5] = Integer.parseInt(txtSoLuong.getValue().toString());

        chiTietSanPhamController.edit(values);
        lbStatus.setText("*Cập nhập thành công");
    }//GEN-LAST:event_btnSuaMouseClicked

    private void tblChiTietSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietSanPhamMouseClicked
        // TODO add your handling code here:
        System.out.println("da click");
        int dong = tblChiTietSanPham.getSelectedRow();
        txtDungLuong.setText(tblChiTietSanPham.getValueAt(dong, 2).toString());
        txtMau.setText(tblChiTietSanPham.getValueAt(dong, 3).toString());
        txtHsx.setText(tblChiTietSanPham.getValueAt(dong, 4).toString());
        txtSoLuong.setValue(tblChiTietSanPham.getValueAt(dong, 5));

    }//GEN-LAST:event_tblChiTietSanPhamMouseClicked

    private void btnThem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem3MouseClicked
        // TODO add your handling code here:

        if (tblChiTietSanPham.getSelectedRow() == -1) {
            System.out.println("Lỗi chưa chọn dòng");
            JOptionPane.showMessageDialog(new Frame(), "Vui lòng chọn dòng cần xóa ! ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            Integer deleteId = (Integer) tblChiTietSanPham.getValueAt(tblChiTietSanPham.getSelectedRow(), 0);
            System.out.println(deleteId);
            // viết khối lệnh confirm và xóa
            int option = JOptionPane.showConfirmDialog(new Frame(), "Bạn có chắc chắn muốn xóa ?", "Xác nhận thông báo ! ", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {

                chiTietSanPhamController.delete(deleteId);

            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnThem3MouseClicked
    public void exportExcel(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        String Link = "";
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            Link = String.valueOf(file);
        } else {
            return;
        }
        try {
            //khai báo tên file muốn tạo
            String filename = Link + ".xls";
            //tạo một đối tượng của lớp HSSFWorkbook
            HSSFWorkbook workbook = new HSSFWorkbook();
            //gọi phương thức creatSheet() và truyền tên file muốn tạo
            HSSFSheet sheet = workbook.createSheet("January");
            //tạo hàng thứ 0 sử dụng phương thức createRow()
            HSSFRow rowhead = sheet.createRow((short) 0);

            // ten Cot
            for (int j = 0; j < table.getColumnCount(); j++) {
                rowhead.createCell(j).setCellValue(model.getColumnName(j));
            }

            for (int j = 1; j < table.getRowCount(); j++) {
                String a = String.valueOf(j);
                HSSFRow row = sheet.createRow((short) j);
                for (int k = 0; k < table.getColumnCount(); k++) {
                    row.createCell(k).setCellValue(model.getValueAt(j, k).toString());
                }
            }

            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            //đóng stream
            fileOut.close();
            //đóng workbook
            workbook.close();
            //in thông báo tạo thành công
            JOptionPane.showMessageDialog(null, "Lưu file thành công !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lưu file thất bại !");

        }
    }

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
            java.util.logging.Logger.getLogger(ChiTietSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChiTietSanPhamDialog dialog = new ChiTietSanPhamDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSua;
    private javax.swing.JLabel btnThem2;
    private javax.swing.JLabel btnThem3;
    protected transient javax.swing.JLabel errorLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbStatus;
    private com.raven.swing.ScrollBar scrollBar1;
    private com.raven.swing.SearchText searchText3;
    private com.raven.swing.TableColumn tblChiTietSanPham;
    private javax.swing.JTextField txtDungLuong;
    private javax.swing.JTextField txtHsx;
    private javax.swing.JTextField txtMau;
    private javax.swing.JSpinner txtSoLuong;
    // End of variables declaration//GEN-END:variables

    @Override
    public void viewList(List<Object[]> rows) {
        ViewImp.viewList(rows, tblChiTietSanPham);
    }

    @Override
    public void setColumnNames(String[] columnNames) {
        ViewImp.setColumnNames(columnNames, tblChiTietSanPham);
    }
    private ChiTietSanPhamController chiTietSanPhamController;

    @Override
    public void setController(AbsController controller) {
        chiTietSanPhamController = (ChiTietSanPhamController) controller;
    }

    @Override
    public void showErrors(List<ConstraintViolation> errorList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}