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
public class TablaDemCivilPruebasPendientes {
    int idPruebasPendientes, idDemandaCivil;
    String Descripcion;
    int Status;

    public int getIdPruebasPendientes() {
        return idPruebasPendientes;
    }

    public void setIdPruebasPendientes(int idPruebasPendientes) {
        this.idPruebasPendientes = idPruebasPendientes;
    }

    public int getIdDemandaCivil() {
        return idDemandaCivil;
    }

    public void setIdDemandaCivil(int idDemandaCivil) {
        this.idDemandaCivil = idDemandaCivil;
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
