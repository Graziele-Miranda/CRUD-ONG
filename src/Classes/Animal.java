package Classes;

//Graziele Lima Miranda - RA: 2417600 - ADS 2022/01

public abstract class Animal {
	
        private  int id;
    
	private String nome;
        
	private int idade;
	private String cor;
	private String castrado;
	private String sexo;
        private String vermifugado;
        private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public int getId() {
            return id;
        }
        public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCor() {
		return cor;
	}
	public String getCastrado() {
		return castrado;
	}
	public String getSexo () {
		return sexo;
	}
        public String getVermifugado(){
            return vermifugado;
        }

       
        
	public void setNome(String nome) {
		this.nome = nome;
	}
        public void setId(int id) {
		this.id = id;
	}
	public void setIdade(int idade){
	
	this.idade = idade;	
        }
		
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
        public void setVermifugado(String vermifugado) {
		this.vermifugado = vermifugado;
	}

    @Override
    public String toString() {
        return this.getNome();
    }


}