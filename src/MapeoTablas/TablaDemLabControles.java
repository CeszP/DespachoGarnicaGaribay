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
public class TablaDemLabControles {
    
    int idControles, idDemandaLaboral;
    String DespachoRemitidor, Honorarios, Gastos, AsignacionInterna, Proveniencia, AsignadoA;
    String DistribucionHonorarios, NotasControl;
    Date FechaIngreso, FechaControlAdministrativo, FechaControlDocumental, FechaRecepcionGestion;
    int NumConsecutivo;

    public int getIdControles() {
        return idControles;
    }

    public void setIdControles(int idControles) {
        this.idControles = idControles;
    }

    public int getIdDemandaLaboral() {
        return idDemandaLaboral;
    }

    public void setIdDemandaLaboral(int idDemandaLaboral) {
        this.idDemandaLaboral = idDemandaLaboral;
    }

    public String getDespachoRemitidor() {
        return DespachoRemitidor;
    }

    public void setDespachoRemitidor(String DespachoRemitidor) {
        this.DespachoRemitidor = DespachoRemitidor;
    }

    public String getHonorarios() {
        return Honorarios;
    }

    public void setHonorarios(String Honorarios) {
        this.Honorarios = Honorarios;
    }

    public String getGastos() {
        return Gastos;
    }

    public void setGastos(String Gastos) {
        this.Gastos = Gastos;
    }

    public String getAsignacionInterna() {
        return AsignacionInterna;
    }

    public void setAsignacionInterna(String AsignacionInterna) {
        this.AsignacionInterna = AsignacionInterna;
    }

    public String getProveniencia() {
        return Proveniencia;
    }

    public void setProveniencia(String Proveniencia) {
        this.Proveniencia = Proveniencia;
    }

    public String getAsignadoA() {
        return AsignadoA;
    }

    public void setAsignadoA(String AsignadoA) {
        this.AsignadoA = AsignadoA;
    }

    public String getDistribucionHonorarios() {
        return DistribucionHonorarios;
    }

    public void setDistribucionHonorarios(String DistribucionHonorarios) {
        this.DistribucionHonorarios = DistribucionHonorarios;
    }

    public String getNotasControl() {
        return NotasControl;
    }

    public void setNotasControl(String NotasControl) {
        this.NotasControl = NotasControl;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Date getFechaControlAdministrativo() {
        return FechaControlAdministrativo;
    }

    public void setFechaControlAdministrativo(Date FechaControlAdministrativo) {
        this.FechaControlAdministrativo = FechaControlAdministrativo;
    }

    public Date getFechaControlDocumental() {
        return FechaControlDocumental;
    }

    public void setFechaControlDocumental(Date FechaControlDocumental) {
        this.FechaControlDocumental = FechaControlDocumental;
    }

    public Date getFechaRecepcionGestion() {
        return FechaRecepcionGestion;
    }

    public void setFechaRecepcionGestion(Date FechaRecepcionGestion) {
        this.FechaRecepcionGestion = FechaRecepcionGestion;
    }

    public int getNumConsecutivo() {
        return NumConsecutivo;
    }

    public void setNumConsecutivo(int NumConsecutivo) {
        this.NumConsecutivo = NumConsecutivo;
    }
    
    
    
}
