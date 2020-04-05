import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SacADos sac = new SacADos(20);
		
		ArrayList<Integer> poids = new ArrayList<Integer>();
		ArrayList<Boolean> pris = new ArrayList<Boolean>();
		
		Objet règle = new Objet(2,1);
		poids.add(règle.poids);
		pris.add(false);
		
		Objet trousse = new Objet(5,5);
		poids.add(trousse.poids);
		pris.add(false);
		
		Objet calculette = new Objet(4,3);
		poids.add(calculette.poids);
		pris.add(false);
		
		System.out.println(poids.get(0));
		
	}

}
