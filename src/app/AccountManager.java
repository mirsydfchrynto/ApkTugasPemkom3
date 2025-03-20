/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app;

/**
 *
 * @author HP
 */
public interface AccountManager<T> {
    void addAccount(T jenisAkun, String username, String password);
    void removeAccount(int index);
}