package biblioteca.biblioteca;


public class Emprestimo extends javax.swing.JFrame{

	private String dataEmp;
	private String dataDev;
	private int codEmprestimo;
	private String nomePessoa;
	private int codLivroEmp;

	

    public String getDataEmp() {
    	return dataEmp; 
    }
    public void setDataEmp(String data) {
    	this.dataEmp = data; 
    }
    
    
    public String getDataDev() {
    	return dataDev; 
    }
    public void setDataDev(String object) {
    	this.dataDev = object; 
    }
    

	public int getCodEmprestimo() {
    	return codEmprestimo; 
    }
    public void setCodEmprestimo(int codEmprestimo) {
    	this.codEmprestimo = codEmprestimo++; 
    }
    
    
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	
	public int getCodLivroEmp() {
		return codLivroEmp;
	}
	public void setCodLivroEmp(int codLivroEmp) {
		this.codLivroEmp = codLivroEmp;
	}
	  
}
