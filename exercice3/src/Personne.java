
class Personne {
private String nom;
private Appartement possede;

public Personne(String nom){	
this.nom=nom;
possede=null;	
}

public String toString(){

	if(possede==null)
	{
		return ("Le nom est "+nom+" il n'a pas d'appartement");
	}
	else
	{
		return ("Le nom est "+nom+", "+possede.toString());
	}
	}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Appartement getPossede() {
	return possede;
}
public void setPossede(Appartement possede) {
	this.possede = possede;
}
public void vendre_appartement(Personne P){	
	if(this.possede==null)
	{
		System.out.println("Cet Personn n'a pas d'un appartement");
	}
	else
	{
		P.possede=possede;
		this.possede=null;
    }
    }	

public void augmente_prix(int taux){
	
	if(possede!=null)
	{
	double pri=possede.getPrix();
	pri=pri+(pri*taux/100);
	possede.setPrix(pri);
    }
}
}