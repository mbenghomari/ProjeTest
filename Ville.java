public class Ville {
	private String nom;
	private int nbhab;
	private int superficie;
	
	// JTE LACHE UN COM LACHES EN MOI 2
	
	public Ville(){
	}
	
	public Ville(String unNom, int unNbhab, int uneSuperficie){
		this.nom= unNom;
		this.nbhab= unNbhab;
		this.superficie= uneSuperficie;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhab() {
		return this.nbhab;
	}

	public void setNbhab(int nbhab) {
		this.nbhab = nbhab;
	}

	public int getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbhab=" + nbhab + ", superficie="
				+ superficie + "]";
	}
	 System.out.println("testo");
	 
	 
	 for(int i=0;i<Ville;i++){
		 System.out.println(i);
	 }
	 
	 //KEKEKEKEKKEEKEKEKEKEKEKE
	

	
}
