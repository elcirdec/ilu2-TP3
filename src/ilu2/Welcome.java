package ilu2;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder resultat = new StringBuilder();		
		if(input == null || input.isEmpty() || input.isBlank()) {
			resultat.append("Hello, my friend");

		}else if(input.equals(input.toUpperCase())) {
			resultat.append("HELLO, "+input);

		}else {
			input=input.replaceAll(" ","");
			String[] names=input.split(",");
			boolean isNameMaj=false;
			int nbMotEnMin=0;
			int nbMotEnMaj=0;
			for (String i : names) {				
				if(i.equals(i.toUpperCase())) {
					isNameMaj=true;
					nbMotEnMaj++;					
				}else {
					nbMotEnMin++;
				}
			}
			if(names.length>=2 && isNameMaj) {
				resultat.append("Hello");
				int occMin=0;
				int occMaj=0;

				for (String name : names) {
					if(!name.equals(name.toUpperCase())) {
						occMin++;
						if(occMin==nbMotEnMin) {
							resultat.append(" and ");
						}else {
							resultat.append(", ");
						}						
						resultat.append(name.substring(0, 1).toUpperCase() + name.substring(1));
					}
				}
				
				resultat.append(". AND HELLO");
				for (String name : names) {
					if(name.equals(name.toUpperCase())) {
						occMaj++;
						if(occMaj==nbMotEnMaj) {
							resultat.append(" AND ");
						}else {
							resultat.append(", ");
						}		
						resultat.append(name.substring(0, 1).toUpperCase() + name.substring(1));
					}
				}
				resultat.append(" !");
				System.out.println(resultat.toString());
			}else if(names.length==2) {
				resultat.append("Hello, "+names[0].substring(0, 1).toUpperCase() + names[0].substring(1)+" and "+names[1].substring(0, 1).toUpperCase() + names[1].substring(1));
			}else if(names.length>2) {
				resultat.append("Hello");
				int occMin=0;				
				for (String name : names) {
					occMin++;
					if(occMin==nbMotEnMin) {
						resultat.append(" and ");
					}else {
						resultat.append(", ");
					}						
					resultat.append(name.substring(0, 1).toUpperCase() + name.substring(1));
				}
				
			}else{		
				resultat.append("Hello, "+input.substring(0, 1).toUpperCase() + input.substring(1));
			}
		}
		System.out.println(resultat.toString());
		return resultat.toString();
	}
}

