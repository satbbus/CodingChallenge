package Friends;

import java.util.HashMap;
import java.util.Map;

public class ProteinSynthesis {
    private static String start_codon = "AUG";
    private static String stop_codon = "STOP";
    private static Map<String, String> codon_to_amino_acid = new HashMap<String, String>() {{
        put("AUG", "Met");
        put("CAA", "Gln");
        put("CAG", "Gln");
        put("GGU", "Gly");
        put("GCG", "Ala");
        put("UUU", "Phe");
        put("UUC", "Phe");
        put("UGG", "Trp");
        put("UAA", stop_codon);
        put("UAG", stop_codon);
        put("UGA", stop_codon);
   }};

    //1. convert dna to mrna= A -> A, T->U, C->C, G->.G
    // dna =CAA ATG CAA ATG GCG UAA GCG
    //output = Gln Met Ala
    public static void main(String[] args) {

        String input = "CAAATGCAAATGGCGUAAGCG";
        String input2 = "mtgCAAgcgATGijkCAAiujATGkkkGCGuuuUAA";
        System.out.println(process_step1(input));
        System.out.println(process_step2(input2));
    }

    public static String process_step1(String input) {
        boolean flag= false;
        StringBuffer inputBuffer = new StringBuffer(input);
        StringBuffer outputBuffer = new StringBuffer();

        for(int i=0; i<input.length(); i=i+3) {
            String temp = inputBuffer.substring(i, i + 3);
                if(Character.isLowerCase(temp.charAt(0))) continue;
            if(temp.equalsIgnoreCase("ATG") && !flag){
                flag = true;
            }else if(stop_codon.equalsIgnoreCase(codon_to_amino_acid.get(temp))){
                return outputBuffer.toString();
            }else if(flag) {
                if(temp.equalsIgnoreCase("ATG"))
                   temp = temp.replace('T','U');
                outputBuffer.append(codon_to_amino_acid.get(temp)).append(" ");
            }
        }
        return "INVALID";
    }
/*
    1. Ignore the lowercase alphabets
    2. Find the codon of multipe of 3 and return the codon. otherwise "INVALID".
        dna =mtgCAAgcgATGijkCAAiujATGkkkGCGuuuUAA
 */
    public static String process_step2(String dna) {

        String result1 = process_step1(dna).replace(" ","");
        if(result1.length()%9==0) return result1;
       else return "INVALID";
    }

}
