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
public class TablaDemLabRelacionPruebas {
    
    int idRelacionPruebas, idDemandaLaboral;
    String Descripcion;
    int AgregadaExpediente;

    public int getIdRelacionPruebas() {
        return idRelacionPruebas;
    }

    public void setIdRelacionPruebas(int idRelacionPruebas) {
        this.idRelacionPruebas = idRelacionPruebas;
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

    public int getAgregadaExpediente() {
        return AgregadaExpediente;
    }

    public void setAgregadaExpediente(int AgregadaExpediente) {
        this.AgregadaExpediente = AgregadaExpediente;
    }
    
}
