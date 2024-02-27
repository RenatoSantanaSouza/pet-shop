public class PetShop {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Pandora";
		cachorro.raca = "Boxer";
		cachorro.idade = 6;
		cachorro.sexo = 'F';
		
		System.out.println("Cachorro");
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Sexo: " + cachorro.sexo);
		
	}

}
