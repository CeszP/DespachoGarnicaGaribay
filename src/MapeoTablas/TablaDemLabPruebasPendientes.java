/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapeoTablas;

/**
 *
 * @author Omar Sebastián
 */
public class TablaDemLabPruebasPendientes {
    int idPruebasPendientes, idDemandaLaboral;
    String Descripcion;
    int Status;

    public int getIdPruebasPendientes() {
        return idPruebasPendientes;
    }

    public void setIdPruebasPendientes(int idPruebasPendientes) {
        this.idPruebasPendientes = idPruebasPendientes;
    }

    public int getIdDemandaLaboral() {
        return idDemandaLaboral;
    }

    public void setIdDemandaLaboral(int idDemandaLaboral) {
        this.idDemandaLaboral = idDemandaLaboral;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
    
}
