package dna;

public class DNA {

    // I asked, what does DNA always have?
    //Chris answered: sequence, A, C, G , T Junk
    //right after chris answered i create instance variables
    private String sequence; //Mutable, Imutable.
    private final double Adenine = 135.128;
    private final double Cytosine = 111.103;
    private final double Guanine = 151.128;
    private final double Thymine = 125.107;
    private final double junk = 100.000;
    public DNA(String sequence){
        this.sequence = sequence;
    }
    public static void main(String[] args){
        DNA dna1 = new DNA();

    }
}