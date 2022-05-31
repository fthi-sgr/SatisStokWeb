/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Musteri;
import util.DBConnection;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isill
 */
public class MusteriDAO extends DBConnection {

    private Connection db;

    public void createMusteri(Musteri c) {

        try {

            Statement st = this.getDb().createStatement();

            String query = "insert into musteri(AdiSoyadi,Telefon,Adres,SehirId)values ('" + c.getAdiSoyadi() + "','"+ c.getTelefon() + "','" + c.getAdres() + "','"+ c.getSehirId() + "')";
            int r = st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public void delete(Musteri c) {

        try {

            Statement st = this.getDb().createStatement();

            String query = "delete from musteri where id=" +c.getId();
            int r = st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<Musteri> getMusteriList() {

        List<Musteri> musteriList = new ArrayList<>();

        try {

            Statement st = this.getDb().createStatement();

            String query = "select * from musteri";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                musteriList.add(new Musteri(rs.getInt("id"), rs.getString("AdiSoyadi"), rs.getString("Telefon"), rs.getString("Adres"), rs.getInt("SehirId")));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return musteriList;
    }

    public Connection getDb() {
        if (this.db == null) {
            this.db = this.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

}
