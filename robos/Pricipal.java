package robos;

public class Pricipal {

	public static void main(String[] args) {

		Molde Robo1 = new Molde("Lorena",5,6,"Tiktok" );
		Molde Robo2 = new Molde("Yago",6, 8,"Axé");
		Molde Robo3 = new Molde("Junin", 6,8,"Axé");
		Passo1 exibir = new Passo1();


		System.out.println("Robos:");
		System.out.println("- "+Robo1.getRobo());
		System.out.println("- "+Robo2.getRobo());
		System.out.println("- "+Robo3.getRobo());

		System.out.print("Complexidade: ");
		System.out.println(Robo2.getComplexidade());
		System.out.print("Velocidade da dança: ");
		System.out.println(Robo2.getVelocidade());
		System.out.print("Estilo : ");
		System.out.println(Robo2.getEstilo());

		System.out.println("Primeiras isntruções: " +"\n");

		System.out.println(exibir.getPasso1());
		System.out.println(exibir.getPasso2());
		System.out.println(exibir.getPasso3());
		System.out.println(exibir.getPasso4());
		System.out.println(exibir.getPasso5());
		System.out.println(exibir.getPasso6());
		System.out.println(exibir.getPasso7());
		

		System.out.println("Segunda musica " +"\n");
		System.out.println("Robos:");
		System.out.println("- "+Robo1.getRobo());
		System.out.println("- "+Robo2.getRobo());
		System.out.print("Complexidade: ");
		System.out.println(Robo1.getComplexidade());
		System.out.print("Velocidade da dança: ");
		System.out.println(Robo2.getVelocidade());
		System.out.print("Estilo : ");
		System.out.println(Robo1.getEstilo());
		
		





	}

}
