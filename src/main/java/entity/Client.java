package entity;


import javax.persistence.*;


@Entity
@Table(name="CLIENTS")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String tipoDeIdentificacion;
	private int numeroDeIdentificacion;
	private String nombres;
	private String apellido;
	private String correoElectronico;
	private String fechaDeNacimiento;
	private String fechaDeCreacion;
	private String usuarioCreacion; 
	private String fechaDeModificacion; 
	private String usuarioModificacion;
	
	
	public Client() {
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoDeIdentificacion() {
		return tipoDeIdentificacion;
	}
	public void setTipoDeIdentificacion(String tipoDeIdentificacion) {
		this.tipoDeIdentificacion = tipoDeIdentificacion;
	}
	public int getNumeroDeIdentificacion() {
		return numeroDeIdentificacion;
	}
	public void setNumeroDeIdentificacion(int numeroDeIdentificacion) {
		this.numeroDeIdentificacion = numeroDeIdentificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(String fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getFechaDeModificacion() {
		return fechaDeModificacion;
	}
	public void setFechaDeModificacion(String fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	
	
	
	
	
}
