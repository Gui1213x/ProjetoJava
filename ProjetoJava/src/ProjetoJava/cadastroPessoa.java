package ProjetoJava;

public class cadastroPessoa {
	
		//declaração dos atributos da classe
		private String nomePessoa;
		private String sobrenomePessoa;
		private int dataNasc;
		private String sexo;
		
		//declaração dos metódos construtor
		public cadastroPessoa(String nomePessoa, String sobrenomePessoa, int dataNasc, String sexo) {
			
			this.nomePessoa = nomePessoa;
			this.sobrenomePessoa = sobrenomePessoa;
			this.dataNasc = dataNasc;
			this.sexo = sexo;
		//declaração dos demais metodos get e set		
		}

		public cadastroPessoa() {
			
		}

		public String getNomePessoa() {
			return nomePessoa;
		}

		public void setNomePessoa(String nomePessoa) {
			this.nomePessoa = nomePessoa;
		}

		public String getSobrenomePessoa() {
			return sobrenomePessoa;
		}

		public void setSobrenomePessoa(String sobrenomePessoa) {
			this.sobrenomePessoa = sobrenomePessoa;
		}

		public int getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(int dataNasc) {
			this.dataNasc = dataNasc;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public void imprimirInfo() {	
			System.out.println("\nNome: "+nomePessoa+"\nSobrenome: "+sobrenomePessoa+"\nIdade: "+dataNasc+"\nSexo: "+sexo);
			
			
		//public void imprimirInfo() {	
			//System.out.println("\nNome: "+getNomePessoa()+" Sobrenome: "+getSobrenomePessoa()+" Data de nas: "+getDataNasc()+" Sexo: "+getSexo());
			
		}

		
		}