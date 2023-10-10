package comunicacion;
public class Fabula extends Escrito{
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo,String autor,int paginas,String enseñanza,String interpretacion){
		super(origen,titulo,autor,paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnseñanza(){
		return this.enseñanza;
	}

	public void setEnsenanza(String enseñanza){
		this.enseñanza = enseñanza;
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
		return (this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getEnseñanza());
	}
}