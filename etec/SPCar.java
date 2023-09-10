package etec;
import java.util.Scanner;
public class SPCar {

	public static void main(String[] args) {
		String Carro;
		String diaria;
		int diasemana;
		int km;
		int calculo;
		double centavos;
		String calculototal;
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Bem Vindo a SPCar, insira os dados para locação de véiculos");
		System.out.println("Digite o modelo do carro alugado");
		Carro = leitor.next();
		System.out.println("Digite o valor da diária da locaçao");
		diaria = leitor.next();
		System.out.println("Digite os dias de locação");
		diasemana = leitor.nextInt();
		System.out.println("Digite a quantidade de KM que você percorrerá");
		centavos = 0.20;
		km = leitor.nextInt();
		calculo = (int)(km + centavos);
		calculototal = diaria + calculo;
		System.out.println("Parabens! Seu modelo de véiculo é " + Carro);
		System.out.println("Subtotal a pagar pelo KM do carro escolhido R$" + calculo);
		System.out.println("Valor total a pagar pelo carro e seu KM R$" + calculototal);
		System.out.println("Lembre-se! cobramos 0,20 centavos por KM percorrido");
		
		
		
		
		
		

	}

}
