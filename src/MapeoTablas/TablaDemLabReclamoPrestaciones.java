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
public class TablaDemLabReclamoPrestaciones {
    
    int idReclamoPrestaciones, idDemandaLaboral;
    String PrestacionesReclamadas;

    public int getIdReclamoPrestaciones() {
        return idReclamoPrestaciones;
    }

    public void setIdReclamoPrestaciones(int idReclamoPrestaciones) {
        this.idReclamoPrestaciones = idReclamoPrestaciones;
    }

    public int getIdDemandaLaboral() {
        return idDemandaLaboral;
    }

    public void setIdDemandaLaboral(int idDemandaLaboral) {
        this.idDemandaLaboral = idDemandaLaboral;
    }

    public String getPrestacionesReclamadas() {
        return PrestacionesReclamadas;
    }

    public void setPrestacionesReclamadas(String PrestacionesReclamadas) {
        this.PrestacionesReclamadas = PrestacionesReclamadas;
    }
    
    
}
