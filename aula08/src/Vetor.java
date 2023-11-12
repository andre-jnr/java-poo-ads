import java.util.Scanner;

public class Vetor {

	Veiculo[] vet;
	int cont = 0;
	Scanner input = new Scanner(System.in);

	void criarlista() {
		vet = new Veiculo[5];
	}

	void inserir() {
		if (cont == 5) {
			System.out.println("##Lista cheia!!");
		} else {
			vet[cont] = new Veiculo();
			System.out.println("Digite o modelo: ");
			vet[cont].setModelo(input.next());
			System.out.println("Digite a marca: ");
			vet[cont].setMarca(input.next());
			System.out.println("Digite o ano: ");
			vet[cont].setAno(input.nextInt());
			System.out.println("Digite o valor: ");
			vet[cont].setValor(input.nextDouble());

			cont++;
			System.out.println("Dados salvo com sucesso!!");
		}
	}

	void listar() {
		System.out.println("##Listando os veiculos##");
		for (int a = 0; a < cont; a++) {

			System.out.println("modelo: " + vet[a].getModelo());
			System.out.println("valor: " + vet[a].getMarca());
			System.out.println("ano: " + vet[a].getAno());
			System.out.println("valor: " + vet[a].getValor());
			System.out.println("----------");
		}
	}

	void listar2010() {
		System.out.println("Listando os veiculos acima de 2010");
		for (int a = 0; a < cont; a++) {
			if (vet[a].getAno() > 2010) {
				System.out.println("modelo: " + vet[a].getModelo());
				System.out.println("valor: " + vet[a].getMarca());
				System.out.println("ano: " + vet[a].getAno());
				System.out.println("valor: R$ " + vet[a].getValor());
				System.out.println("----------");
			}
		}
	}

	void listar100() {
		System.out.println("Listando os veiculos com preço acima de acima de 100 mil reais");
		for (int a = 0; a < cont; a++) {
			if (vet[a].getValor() > 100000.0) {
				System.out.println("##modelo: " + vet[a].getModelo());
				System.out.println("valor: " + vet[a].getMarca());
				System.out.println("ano: " + vet[a].getAno());
				System.out.println("valor: R$ " + vet[a].getValor());
				System.out.println("----------");
			}
		}
	}
}