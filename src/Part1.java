
public class Part1 {

	public String findSimpleGene(String dna){
		int startIndex = dna.indexOf("ATG");
		int stopIndex = dna.indexOf("TAA", startIndex + 3);
		while(stopIndex != -1){
			if((stopIndex - startIndex) % 3 == 0){
				return dna.substring(startIndex, stopIndex + 3);
			}
			else{
				stopIndex = dna.indexOf("TAA", stopIndex + 1);
			}
		}
		return "";
	}
	void testSimpleGene(){
		String dna = "ATGGGTTAAGTC";
		char ch = dna.charAt(0);
		String startCodon = "", stopCodon = "";
		if(Character.isUpperCase(ch)){
			startCodon = "ATG";
			stopCodon = "TAA";
		}
		else{
			startCodon = "atg";
			stopCodon = "taa";
		}

		System.out.println("DNA strand is " + dna);
		String gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);

		dna = "gatgctataat";
		ch = dna.charAt(0);
		if(Character.isUpperCase(ch)){
			startCodon = "ATG";
			stopCodon = "TAA";
		}
		else{
			startCodon = "atg";
			stopCodon = "taa";
		}
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);
		/*dna = "CGATGGTTGATAAGCCTAAGCTAAA";
	        System.out.println("DNA strand is " + dna);
	        gene = findSimpleGene(dna, startCodon, stopCodon);
	        System.out.println("Gene is " + gene);*/
	}
}



