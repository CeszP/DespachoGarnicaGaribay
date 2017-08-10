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
public class TablaDemLabFechasClave {
    
    int idFechasClave, idDemandaLaboral;
    Date FechaElaboracion, FechaRemision, FechaEntrega, FechaPresentacion;
    String Expediente;

    public int getIdFechasClave() {
        return idFechasClave;
    }

    public void setIdFechasClave(int idFechasClave) {
        this.idFechasClave = idFechasClave;
    }

    public int getIdDemandaLaboral() {
        return idDemandaLaboral;
    }

    public void setIdDemandaLaboral(int idDemandaLaboral) {
        this.idDemandaLaboral = idDemandaLaboral;
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

    public Date getFechaPresentacion() {
        return FechaPresentacion;
    }

    public void setFechaPresentacion(Date FechaPresentacion) {
        this.FechaPresentacion = FechaPresentacion;
    }
    
        public String getExpediente() {
        return Expediente;
    }

    public void setExpediente(String Expediente) {
        this.Expediente = Expediente;
    }
    
    
}
