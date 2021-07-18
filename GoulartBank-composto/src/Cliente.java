
public class Cliente {
	
		private String nome;
		private String cpf;
		
	public Cliente(String name,String CPF){
		nome =name;
		cpf=CPF;
	}
		public String getNome() {
			return this.nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return this.cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
}
