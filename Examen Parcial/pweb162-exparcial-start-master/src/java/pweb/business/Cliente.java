/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.business;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Cliente implements Serializable {
    private String nombre;
    private String numTarj;
    private String fechExo;
    private String CodSeg;
    
    public Cliente() {
        nombre = "";
        numTarj = "";
        fechExo = "";
        CodSeg="";
    }

    public Cliente(String nombre, String numTarj, String fechExo,String CodSeg) {
        this.nombre = nombre;
        this.numTarj = numTarj;
        this.fechExo = fechExo;
        this.CodSeg = CodSeg;
        
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnumTarj() {
        return numTarj;
    }

    public void setnumTarj(String numTarj) {
        this.numTarj = numTarj;
    }

    public String getfechExo() {
        return fechExo;
    }

    public void setfechExo(String fechExo) {
        this.fechExo = fechExo;
    }
    public String getCodSeg() {
        return CodSeg;
    }

    public void setCodSeg(String CodSeg) {
        this.CodSeg = CodSeg;
    }
    
}
