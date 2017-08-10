/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapeoTablas;

import java.sql.Date;

/**
 *
 * @author Omar Sebastián
 */
public class TablaDemCivilFechasClave {
    
    int idBoletaElaboracionEntrega, idDemandaCivil;
    Date FechaElaboracion, FechaRemision, FechaEntrega;
    String Notas;

    public int getIdBoletaElaboracionEntrega() {
        return idBoletaElaboracionEntrega;
    }

    public void setIdBoletaElaboracionEntrega(int idBoletaElaboracionEntrega) {
        this.idBoletaElaboracionEntrega = idBoletaElaboracionEntrega;
    }

    public int getIdDemandaCivil() {
        return idDemandaCivil;
    }

    public void setIdDemandaCivil(int idDemandaCivil) {
        this.idDemandaCivil = idDemandaCivil;
    }

    public Date getFechaElaboracion() {
        return FechaElaboracion;
    }

    public void setFechaElaboracion(Date FechaElaboracion) {
        this.FechaElaboracion = FechaElaboracion;
    }

    public Date getFechaRemision() {
        return FechaRemision;
    }

    public void setFechaRemision(Date FechaRemision) {
        this.FechaRemision = FechaRemision;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }
    
    
}
