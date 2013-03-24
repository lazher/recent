import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Personne p1 =new Personne("salah"); 
		Personne p2 =new Personne("ali");
		Appartement a1 =new Appartement("tunis",500);
		p1.setPossede(a1);	
		p1.augmente_prix(5);
        p1.vendre_appartement(p2);
       System.out.println("L'affichage de p1 est :\n "+p1.toString()+"\n");
       System.out.println("L'affichage de p2 est :\n "+p2.toString());
       Personne [] tabpers=new Personne[5];
       Scanner s=new Scanner(System.in);
       for(int i=0;i<5;i++){
       	System.out.println("Saisie le nom du "+i+"eme personne");
       String name =s.nextLine();
       
       }
	}
}