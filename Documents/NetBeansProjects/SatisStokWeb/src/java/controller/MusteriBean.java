/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.MusteriDAO;
import entity.Musteri;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author isill
 */
@Named(value = "musteriBean")
@SessionScoped
public class MusteriBean implements Serializable {
    
    private Musteri entity;
    private MusteriDAO dao;
    private List<Musteri> list;

    /**
     * Creates a new instance of MusteriBean
     */
    public MusteriBean() {
        
        
    }
    
    public void delete(Musteri c){
        this.getDao().delete(c);
        
    }
    
    public void create(){
        this.getDao().createMusteri(entity);
        this.entity=new Musteri();
    }
    
    

    public Musteri getEntity() {
        if(this.entity ==null){
            this.entity=new Musteri();
        }
        return entity;
    }

    public void setEntity(Musteri entity) {
        this.entity = entity;
    }

    public MusteriDAO getDao() {
        if(this.dao==null){
            this.dao=new MusteriDAO();
        }
        return dao;
    }

    public void setDao(MusteriDAO dao) {
        this.dao = dao;
    }

    public List<Musteri> getList() {
        this.list =this.getDao().getMusteriList();
        
        
        return list;
    }

    public void setList(List<Musteri> list) {
        this.list = list;
    }
    
}
