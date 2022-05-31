/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author isill
 */
public class Musteri {
    private int Id;
    private String AdiSoyadi;
    private String Telefon;
    private String Adres;
    private int SehirId;

    public Musteri() {
    }

    public Musteri(int Id, String AdiSoyadi, String Telefon, String Adres, int SehirId) {
        this.Id = Id;
        this.AdiSoyadi = AdiSoyadi;
        this.Telefon = Telefon;
        this.Adres = Adres;
        this.SehirId = SehirId;
    }
    
    
    public Musteri( String AdiSoyadi, String Adres) {
        
        this.AdiSoyadi = AdiSoyadi;
        this.Adres = Adres;
       
    }
    
    
    
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getAdiSoyadi() {
        return AdiSoyadi;
    }

    public void setAdiSoyadi(String AdiSoyadi) {
        this.AdiSoyadi = AdiSoyadi;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String Telefon) {
        this.Telefon = Telefon;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public int getSehirId() {
        return SehirId;
    }

    public void setSehirId(int SehirId) {
        this.SehirId = SehirId;
    }

    @Override
    public String toString() {
        return "Musteri{" + "Id=" + Id + ", AdiSoyadi=" + AdiSoyadi + ", Telefon=" + Telefon + ", Adres=" + Adres + ", SehirId=" + SehirId + '}';
    }
    
    
    
    
    
    
}
