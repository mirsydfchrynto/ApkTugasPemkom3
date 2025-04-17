/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class AccountTask<T> extends SwingWorker<Void, Void> {

    private final app<T> appInstance;
    private final T jenisAkun;
    private final String username;
    private final String password;
    private final int action;
    private final int index;

    public AccountTask(app<T> appInstance, T jenisAkun, String username, String password, int action, int index) {
        this.appInstance = appInstance;
        this.jenisAkun = jenisAkun;
        this.username = username;
        this.password = password;
        this.action = action;
        this.index = index;
    }

    @Override
    protected Void doInBackground() {
        if (action == 1) {
            // Logika untuk menambah akun
            if (jenisAkun == null) {
                return null;
            }

            try {
                appInstance.validateInput(jenisAkun.toString(), username, password);
            } catch (IllegalArgumentException e) {
                return null;
            }

            getdata<T> n = new getdata<>(jenisAkun, username, password);
            appInstance.simpan.add(n);
            appInstance.tableModel.addRow(new Object[]{appInstance.tableModel.getRowCount() + 1, jenisAkun, username, password});
        } else if (action == 2) {
            // Logika untuk menghapus akun
            if (index >= 0) {
                appInstance.hapus(index);
            }
        }
        return null;
    }

    @Override
    protected void done() {
        try {
            get(); // Ini akan melemparkan exception jika ada kesalahan di doInBackground
            if (action == 1) {
                JOptionPane.showMessageDialog(appInstance, "Akun berhasil ditambahkan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else if (action == 2) {
                JOptionPane.showMessageDialog(appInstance, "Akun berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(appInstance, "Kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
