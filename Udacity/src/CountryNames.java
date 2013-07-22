//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe


//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

//For the draft: handle the case where the French name starts with a vowel .
//(If the name starts with a vowel, add l'). Leave all other names unchanged.

public class CountryNames {

	public String getCompleteName(String name) {
		
		String letter = name.substring(0, 1);
        if (name.equals("Etats-Unis") || name.equals("Pays-Bas")) return "les " + name;
        if (name.equals("Barbade")) return "la " + name;
		if ("aeiouAEIOU".contains(letter)) return "l'" + name;
		return "le " + name;  
	}
	
	public static void main(String[] args) {
		
		CountryNames name1 = new CountryNames();
		System.out.println(name1.getCompleteName("Pays-Bas"));
	}

}
