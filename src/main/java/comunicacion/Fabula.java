package comunicacion;
public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion){
		super(origen,titulo,autor,paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza(){
		return this.ensenanza;
	}

	public void setEnsenanza(String ensenanza){
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion(){
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion){
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int pal){	
		return 1*getPaginas()*pal;
	}

	public String interpretacion(){
		return this.getInterpretacion();
	}

    @Override
	public String toString(){
		return (this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getEnsenanza());
	}
}