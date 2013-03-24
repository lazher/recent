
class Appartement {
private String adresse;
private double prix;	
public Appartement(){
	adresse="";
	prix=0;	
}
public Appartement(String adresse, double prix){
	this.adresse=adresse;
	this.prix=prix;	
}	
public String toString(){
	return ("L'adresse est "+adresse+" et Le prix est "+prix);	
}	
	public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
}
