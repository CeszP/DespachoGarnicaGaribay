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
public class TablaDemandaCivil {
     int idDemandaCivil, idCliente;
    String Tipo, NombreCliente, DomicilioCliente, DomicilioClienteAux;
    String Telefono, TelefonoAuxiliar, Celular, Ciudad, Poblacion, Estado, DatosConflicto;

    public int getIdDemandaCivil() {
        return idDemandaCivil;
    }

    public void setIdDemandaCivil(int idDemandaCivil) {
        this.idDemandaCivil = idDemandaCivil;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDomicilioCliente() {
        return DomicilioCliente;
    }

    public void setDomicilioCliente(String DomicilioCliente) {
        this.DomicilioCliente = DomicilioCliente;
    }

    public String getDomicilioClienteAux() {
        return DomicilioClienteAux;
    }

    public void setDomicilioClienteAux(String DomicilioClienteAux) {
        this.DomicilioClienteAux = DomicilioClienteAux;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTelefonoAuxiliar() {
        return TelefonoAuxiliar;
    }

    public void setTelefonoAuxiliar(String TelefonoAuxiliar) {
        this.TelefonoAuxiliar = TelefonoAuxiliar;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDatosConflicto() {
        return DatosConflicto;
    }

    public void setDatosConflicto(String DatosConflicto) {
        this.DatosConflicto = DatosConflicto;
    }
    
    
}
