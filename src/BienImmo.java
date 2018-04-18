public class BienImmo {

	//ATTRIBUTS
	private String identifiantDuBien;
	private String adresse;
	private String ville;
	private String codePostal;
	private String superficie;
	private String prixDeVente;
	private String commission;
	private String dateDeMiseEnVente;
	private String nomProprietaire;
	private String adresseEmailProprietaire;
	private String numeroTelephoneProprietaire;
	private String montantTaxeHabitation;
	private String montantDesCharges;
	public BienImmo(String identifiantDuBien, String adresse, String ville, String codePostal, String superficie,
			String prixDeVente, String commission, String dateDeMiseEnVente, String nomProprietaire,
			String adresseEmailProprietaire, String numeroTelephoneProprietaire, String montantTaxeHabitation,
			String montantDesCharges) {
		super();
		this.identifiantDuBien = identifiantDuBien;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.superficie = superficie;
		this.prixDeVente = prixDeVente;
		this.commission = commission;
		this.dateDeMiseEnVente = dateDeMiseEnVente;
		this.nomProprietaire = nomProprietaire;
		this.adresseEmailProprietaire = adresseEmailProprietaire;
		this.numeroTelephoneProprietaire = numeroTelephoneProprietaire;
		this.montantTaxeHabitation = montantTaxeHabitation;
		this.montantDesCharges = montantDesCharges;
	}
	public String getIdentifiantDuBien() {
		return identifiantDuBien;
	}
	public void setIdentifiantDuBien(String identifiantDuBien) {
		this.identifiantDuBien = identifiantDuBien;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public String getPrixDeVente() {
		return prixDeVente;
	}
	public void setPrixDeVente(String prixDeVente) {
		this.prixDeVente = prixDeVente;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public String getDateDeMiseEnVente() {
		return dateDeMiseEnVente;
	}
	public void setDateDeMiseEnVente(String dateDeMiseEnVente) {
		this.dateDeMiseEnVente = dateDeMiseEnVente;
	}
	public String getNomProprietaire() {
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	public String getAdresseEmailProprietaire() {
		return adresseEmailProprietaire;
	}
	public void setAdresseEmailProprietaire(String adresseEmailProprietaire) {
		this.adresseEmailProprietaire = adresseEmailProprietaire;
	}
	public String getNumeroTelephoneProprietaire() {
		return numeroTelephoneProprietaire;
	}
	public void setNumeroTelephoneProprietaire(String numeroTelephoneProprietaire) {
		this.numeroTelephoneProprietaire = numeroTelephoneProprietaire;
	}
	public String getMontantTaxeHabitation() {
		return montantTaxeHabitation;
	}
	public void setMontantTaxeHabitation(String montantTaxeHabitation) {
		this.montantTaxeHabitation = montantTaxeHabitation;
	}
	public String getMontantDesCharges() {
		return montantDesCharges;
	}
	public void setMontantDesCharges(String montantDesCharges) {
		this.montantDesCharges = montantDesCharges;
	}
	@Override
	public String toString() {
		return "BienImmo [identifiantDuBien=" + identifiantDuBien + ", adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", superficie=" + superficie + ", prixDeVente=" + prixDeVente
				+ ", commission=" + commission + ", dateDeMiseEnVente=" + dateDeMiseEnVente + ", nomProprietaire="
				+ nomProprietaire + ", adresseEmailProprietaire=" + adresseEmailProprietaire
				+ ", numeroTelephoneProprietaire=" + numeroTelephoneProprietaire + ", montantTaxeHabitation="
				+ montantTaxeHabitation + ", montantDesCharges=" + montantDesCharges + "]";
	}
	
}