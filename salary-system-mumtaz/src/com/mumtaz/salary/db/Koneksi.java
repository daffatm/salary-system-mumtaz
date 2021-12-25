/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mumtaz.salary.db;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author daffa
 */
public class Koneksi {
    private static Connection conn;
    private static Properties prop = new Properties();
    
    public static Connection getKoneksi() throws SQLException{
        if (conn == null){
            try {
                prop.load(new FileInputStream("src\\com\\mumtaz\\salary\\db\\dbConfig.properties"));
            } catch (FileNotFoundException ex) {
                System.err.println("Error mengambil File Config"+ ex);
            } catch (IOException ex) {
                System.err.println("Error membaca File Config"+ ex);
            }
            
            conn = DriverManager.getConnection(prop.getProperty("jdbc.url"));
        }
        
        return conn;
    }
    
    public static void main(String[] args) throws SQLException{
        if (getKoneksi().equals(conn)){
            System.out.println("Koneksi Berhasil!");
        }
    }
}
