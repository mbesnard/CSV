import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal {

				public static void main(String[] args) {
					//ATTRIBUTS
					String identifiantDuBien="";
					String adresse="";
					String ville="";
					String codePostal="";
					String superficie="";
					String prixDeVente="";
					String commission="";
					String dateDeMiseEnVente="";
					String nomProprietaire="";
					String adresseEmailProprietaire="";
					String numeroTelephoneProprietaire="";
					String montantTaxeHabitation="";
					String montantDesCharges="";
					
					String tab[];
			        tab = new String[14];					
					ArrayList<BienImmo> lesBienImmo = new ArrayList<BienImmo>();
					
					try {
						String csvFile = "C:/xampp/htdocs/java1.csv"; 
						String delimiter = ";";
						String line = null;
						StringTokenizer strToken = null;
						BufferedReader bufferReader;
						
						int lineID = 0;
						int fieldID = 0;
						
						//OUVRIR LE FICHIER CSV
						bufferReader = new BufferedReader(new FileReader(csvFile));
						
						//PARCOURIR LES LIGNES DU FICHIER CSV
						while ((line = bufferReader.readLine()) != null) {
							lineID++;
							
							//PARCOURIR LES CHAMPS S�PAR�S PAR DELIMITER
							strToken = new StringTokenizer(line, delimiter);
							
							while (strToken.hasMoreTokens()) {
								fieldID++;
								
								System.out.println("Ligne " + lineID + " / champs " + fieldID + " : " + strToken.nextToken());
								
								//lesBienImmo.add(new BienImmo(tab[0], tab[1], tab[2], tab[3], tab[4], tab[5], tab[6], tab[7], tab[8], tab[9], tab[10], tab[11], tab[12]));
				            }
//				            for (lesBiensImmo unBien : lesBiens2) {
//				                System.out.println(lesBiens2);
//				            }
				            for (int i=0; i<lesBienImmo.size(); i++) {
				                System.out.println(lesBienImmo.get(i));
				            }
				            
						}
					}
					catch (IOException ex) {
						Logger.getLogger(CSVParser.class.getName()).log(Level.SEVERE, null, ex);
					}
				
						
					}
				}
