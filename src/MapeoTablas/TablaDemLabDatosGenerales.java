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
public class TablaDemLabDatosGenerales {
    
    int idDemandaLaboral, NumConsecutivo;
    String NombreTrabajador, DomicilioTrabajador, DomicilioTrabajadorAux, Telefono, TelefonoAuxiliar;
    String Celular, Ciudad, Poblacion, Estado, DatosPatron, ActividadPatron, DomicilioPatron, CiudadPatron;
    Date FechaInicio;
    String ComentarioFechaInicio, PersonaContratadora, ActividadTrabajador, Horarios;
    int ChequeoAsistencia;
    String ComentarioChequeoAsistencia;
    double UltimoSalario;
    int SalarioBase;
    String ComentarioSalarioBase;
    int Comision;
    String ComentarioComision, DiaPagoSalario;
    int Nomina, Recibo;
    String ComentarioNominaRecibo, DiasLaborados, DiaDescanso, HoraDespido;
    Date FechaDespido;
    String PersonaDespedidora, LugarDespido, PalabrasDespido;
    int Aguinaldo;
    String ComentarioAguinaldo;
    int Vacaciones, PrimaVacacional; 
    String ComentarioVacacionesPrima;
    int TrabajoDiasDescanso;
    String ComentarioDiasDescanso;
    int InscripcionIMSS;
    Date FechaIMSS;
    int ReporteSalarioIMSS;
    double Cantidad, AdeudoSalario;
    int DiasAdeudo;

    public int getIdDemandaLaboral() {
        return idDemandaLaboral;
    }

    public void setIdDemandaLaboral(int idDemandaLaboral) {
        this.idDemandaLaboral = idDemandaLaboral;
    }

    public int getNumConsecutivo() {
        return NumConsecutivo;
    }

    public void setNumConsecutivo(int NumConsecutivo) {
        this.NumConsecutivo = NumConsecutivo;
    }

    public String getNombreTrabajador() {
        return NombreTrabajador;
    }

    public void setNombreTrabajador(String NombreTrabajador) {
        this.NombreTrabajador = NombreTrabajador;
    }

    public String getDomicilioTrabajador() {
        return DomicilioTrabajador;
    }

    public void setDomicilioTrabajador(String DomicilioTrabajador) {
        this.DomicilioTrabajador = DomicilioTrabajador;
    }

    public String getDomicilioTrabajadorAux() {
        return DomicilioTrabajadorAux;
    }

    public void setDomicilioTrabajadorAux(String DomicilioTrabajadorAux) {
        this.DomicilioTrabajadorAux = DomicilioTrabajadorAux;
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

    public String getDatosPatron() {
        return DatosPatron;
    }

    public void setDatosPatron(String DatosPatron) {
        this.DatosPatron = DatosPatron;
    }

    public String getActividadPatron() {
        return ActividadPatron;
    }

    public void setActividadPatron(String ActividadPatron) {
        this.ActividadPatron = ActividadPatron;
    }

    public String getDomicilioPatron() {
        return DomicilioPatron;
    }

    public void setDomicilioPatron(String DomicilioPatron) {
        this.DomicilioPatron = DomicilioPatron;
    }

    public String getCiudadPatron() {
        return CiudadPatron;
    }

    public void setCiudadPatron(String CiudadPatron) {
        this.CiudadPatron = CiudadPatron;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getComentarioFechaInicio() {
        return ComentarioFechaInicio;
    }

    public void setComentarioFechaInicio(String ComentarioFechaInicio) {
        this.ComentarioFechaInicio = ComentarioFechaInicio;
    }

    public String getPersonaContratadora() {
        return PersonaContratadora;
    }

    public void setPersonaContratadora(String PersonaContratadora) {
        this.PersonaContratadora = PersonaContratadora;
    }

    public String getActividadTrabajador() {
        return ActividadTrabajador;
    }

    public void setActividadTrabajador(String ActividadTrabajador) {
        this.ActividadTrabajador = ActividadTrabajador;
    }

    public String getHorarios() {
        return Horarios;
    }

    public void setHorarios(String Horarios) {
        this.Horarios = Horarios;
    }

    public int getChequeoAsistencia() {
        return ChequeoAsistencia;
    }

    public void setChequeoAsistencia(int ChequeoAsistencia) {
        this.ChequeoAsistencia = ChequeoAsistencia;
    }

    public String getComentarioChequeoAsistencia() {
        return ComentarioChequeoAsistencia;
    }

    public void setComentarioChequeoAsistencia(String ComentarioChequeoAsistencia) {
        this.ComentarioChequeoAsistencia = ComentarioChequeoAsistencia;
    }

    public double getUltimoSalario() {
        return UltimoSalario;
    }

    public void setUltimoSalario(double UltimoSalario) {
        this.UltimoSalario = UltimoSalario;
    }

    public int getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(int SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public String getComentarioSalarioBase() {
        return ComentarioSalarioBase;
    }

    public void setComentarioSalarioBase(String ComentarioSalarioBase) {
        this.ComentarioSalarioBase = ComentarioSalarioBase;
    }

    public int getComision() {
        return Comision;
    }

    public void setComision(int Comision) {
        this.Comision = Comision;
    }

    public String getComentarioComision() {
        return ComentarioComision;
    }

    public void setComentarioComision(String ComentarioComision) {
        this.ComentarioComision = ComentarioComision;
    }

    public String getDiaPagoSalario() {
        return DiaPagoSalario;
    }

    public void setDiaPagoSalario(String DiaPagoSalario) {
        this.DiaPagoSalario = DiaPagoSalario;
    }

    public int getNomina() {
        return Nomina;
    }

    public void setNomina(int Nomina) {
        this.Nomina = Nomina;
    }

    public int getRecibo() {
        return Recibo;
    }

    public void setRecibo(int Recibo) {
        this.Recibo = Recibo;
    }

    public String getComentarioNominaRecibo() {
        return ComentarioNominaRecibo;
    }

    public void setComentarioNominaRecibo(String ComentarioNominaRecibo) {
        this.ComentarioNominaRecibo = ComentarioNominaRecibo;
    }

    public String getDiasLaborados() {
        return DiasLaborados;
    }

    public void setDiasLaborados(String DiasLaborados) {
        this.DiasLaborados = DiasLaborados;
    }

    public String getDiaDescanso() {
        return DiaDescanso;
    }

    public void setDiaDescanso(String DiaDescanso) {
        this.DiaDescanso = DiaDescanso;
    }

    public String getHoraDespido() {
        return HoraDespido;
    }

    public void setHoraDespido(String HoraDespido) {
        this.HoraDespido = HoraDespido;
    }

    public Date getFechaDespido() {
        return FechaDespido;
    }

    public void setFechaDespido(Date FechaDespido) {
        this.FechaDespido = FechaDespido;
    }

    public String getPersonaDespedidora() {
        return PersonaDespedidora;
    }

    public void setPersonaDespedidora(String PersonaDespedidora) {
        this.PersonaDespedidora = PersonaDespedidora;
    }

    public String getLugarDespido() {
        return LugarDespido;
    }

    public void setLugarDespido(String LugarDespido) {
        this.LugarDespido = LugarDespido;
    }

    public String getPalabrasDespido() {
        return PalabrasDespido;
    }

    public void setPalabrasDespido(String PalabrasDespido) {
        this.PalabrasDespido = PalabrasDespido;
    }

    public int getAguinaldo() {
        return Aguinaldo;
    }

    public void setAguinaldo(int Aguinaldo) {
        this.Aguinaldo = Aguinaldo;
    }

    public String getComentarioAguinaldo() {
        return ComentarioAguinaldo;
    }

    public void setComentarioAguinaldo(String ComentarioAguinaldo) {
        this.ComentarioAguinaldo = ComentarioAguinaldo;
    }

    public int getVacaciones() {
        return Vacaciones;
    }

    public void setVacaciones(int Vacaciones) {
        this.Vacaciones = Vacaciones;
    }

    public int getPrimaVacacional() {
        return PrimaVacacional;
    }

    public void setPrimaVacacional(int PrimaVacacional) {
        this.PrimaVacacional = PrimaVacacional;
    }

    public String getComentarioVacacionesPrima() {
        return ComentarioVacacionesPrima;
    }

    public void setComentarioVacacionesPrima(String ComentarioVacacionesPrima) {
        this.ComentarioVacacionesPrima = ComentarioVacacionesPrima;
    }

    public int getTrabajoDiasDescanso() {
        return TrabajoDiasDescanso;
    }

    public void setTrabajoDiasDescanso(int TrabajoDiasDescanso) {
        this.TrabajoDiasDescanso = TrabajoDiasDescanso;
    }

    public String getComentarioDiasDescanso() {
        return ComentarioDiasDescanso;
    }

    public void setComentarioDiasDescanso(String ComentarioDiasDescanso) {
        this.ComentarioDiasDescanso = ComentarioDiasDescanso;
    }

    public int getInscripcionIMSS() {
        return InscripcionIMSS;
    }

    public void setInscripcionIMSS(int InscripcionIMSS) {
        this.InscripcionIMSS = InscripcionIMSS;
    }

    public Date getFechaIMSS() {
        return FechaIMSS;
    }

    public void setFechaIMSS(Date FechaIMSS) {
        this.FechaIMSS = FechaIMSS;
    }

    public int getReporteSalarioIMSS() {
        return ReporteSalarioIMSS;
    }

    public void setReporteSalarioIMSS(int ReporteSalarioIMSS) {
        this.ReporteSalarioIMSS = ReporteSalarioIMSS;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getAdeudoSalario() {
        return AdeudoSalario;
    }

    public void setAdeudoSalario(double AdeudoSalario) {
        this.AdeudoSalario = AdeudoSalario;
    }

    public int getDiasAdeudo() {
        return DiasAdeudo;
    }

    public void setDiasAdeudo(int DiasAdeudo) {
        this.DiasAdeudo = DiasAdeudo;
    }
    
}
