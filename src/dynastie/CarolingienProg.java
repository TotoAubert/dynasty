package dynastie;

import dynastie.models.Dynastie;
import dynastie.models.Femme;
import dynastie.models.Homme;

public class CarolingienProg {

	public static void main(String[] args) {
		
		Dynastie carolingien = new Dynastie("Carolingiens");
		
		Homme pepin = new Homme("Pépin","LeBref ");
		pepin.naitre(715);
		pepin.mourir(768);
		Femme bertrade = new Femme("Bertrade","");
		bertrade.naitre(726);
		bertrade.mourir(783);
		pepin.epouser(bertrade);
		
		Homme carloman = new Homme("Carloman","");
		carloman.naitre(751);
		carloman.mourir(771);
		bertrade.enfanter(carloman, 751);
		
		Homme charlemagne = new Homme("Charlemagne","");
		charlemagne.naitre(742);
		charlemagne.mourir(814);
		bertrade.enfanter(charlemagne, 742);
		Femme hildegarde = new Femme("Hildegarde","");
		hildegarde.naitre(757);
		hildegarde.mourir(783);
		charlemagne.epouser(hildegarde);
		
		Homme louis1er = new Homme("Louis1er","LePieux");
		louis1er.naitre(778);
		louis1er.mourir(840);
		hildegarde.enfanter(louis1er, 778);
		Femme ermengarde = new Femme("Ermengarde","");
		ermengarde.naitre(780);
		ermengarde.mourir(818);
		louis1er.epouser(ermengarde);
		Femme judith = new Femme("Judith","DeBavière");
		judith.naitre(800);
		judith.mourir(843);
		louis1er.epouser(judith);
		
		Homme lothaire = new Homme("Lothaire","1er");
		lothaire.naitre(795);
		lothaire.mourir(855);
		ermengarde.enfanter(lothaire, 795);
		
		Femme ermengardeux = new Femme("Ermengarde","ux");
		ermengardeux.naitre(800);
		ermengardeux.mourir(851);
		lothaire.epouser(ermengardeux);
		
		
		
		
		
		
		
		
		
	

	}

}
