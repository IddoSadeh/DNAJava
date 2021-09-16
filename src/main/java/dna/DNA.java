// TODO: Implement the DNA datatype from scratch!
// Use the test cases to guide you.
package dna;

public class DNA{
    static String sequence;
    private final double Adenine = 135.128;
    private final double Guanine = 151.128;
    private final double Cytosine = 111.103;
    private final double Thymine = 125.107;
    private final double junk = 100.000;
    public DNA(String seq){
        this.sequence = seq;
    }
    public String sequence(){
        String output = sequence;
        return output;
    }
    public static boolean isProtein()
    {

        Boolean firstCodon = false;
        Boolean lastCodon = false;
        Boolean CandGconatin30p=false;
        int howManyCodons=0;
        if(sequence.substring(0,3)=="ATG") {
            firstCodon = true;
        }
        else
        {
            return false;
        }

        if (sequence.substring(sequence.length()-3)=="TAA" || sequence.substring(sequence.length()-3)=="TAG" || sequence.substring(sequence.length()-3)=="TGA")
        {
            lastCodon = true;

        }
        else
        {
            return false;
        }

        howManyCodons=occurencesOfCodons(sequence);
        if ((occurencesOfCytosine(sequence)+occurencesOfGuanine(sequence))/sequence.length() >=0.3)
        {
            CandGconatin30p = true;
        }
        if(firstCodon && lastCodon && howManyCodons>=5 && CandGconatin30p)
        {
            return true;
        }
        else{
            return false;
        }
    }
    private static int occurencesOfCytosine(String sequence){
        int counter = 0;
        for(int i=0;i<sequence.length();i++){
            if(sequence.charAt(i)=='C'){
                counter += 1;
            }

        }
        return counter;
    }
    private static int occurencesOfGuanine(String sequence){
        int counter = 0;
        for(int i=0;i<sequence.length();i++){
            if(sequence.charAt(i)=='C'){
                counter += 1;
            }

        }
        return counter;
    }
    private static int occurencesOfCodons(String sequence)
    {
        int counter = 0;
        for(int i=0;i<sequence.length()-3;i++)
        {
            if(sequence.substring(i,i+3)=="ATG"){
                counter += 1;
                i+=2;
                continue;
            }
            else if(sequence.substring(i,i+3)=="TAA") {
                counter += 1;
                i += 2;
                continue;
            }
            else if(sequence.substring(i,i+3)=="TAG"){
                counter += 1;
                i+=2;
                continue;
            }
            else if(sequence.subSequence(i,i+3)=="TGA"){
                counter += 1;
                i+=2;
                continue;
            }
            else{
                continue;
            }
        }
        return counter;
    }

    public double totalMass()
    {
        double mass = 0;
        for(char c: sequence.toCharArray())
        {

        }
        return mass;
    }
    private double mass(char a)
    {
        double mass;
        switch(a){
            case A:

        }


    }
    public static void main(String args[]){
        DNA dna1 = new DNA("ACTGTG");
    }
}