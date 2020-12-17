package stringmanipulation;

public class StringManipulation {

    public static void main(String[] args) {
        String Word1 = "Word1";
        String Word2 = " Word2 ";
        String Fname = "Gordon";
        String Sname = "Freeman";
        
        
        toLowerCase(Word1);
        toUpperCase(Word1);
        equals(Word1);
        equalsIgnoreCase(Word1);
        trim(Word2);
        charAt(Fname , Sname);
        concat(Fname, Sname);
        
    }
    
    
    public static void toLowerCase(String W1){
        
        String W2 = W1.toLowerCase();
        System.out.println(W2);
    }
    
    public static void toUpperCase(String W1){
        
        String W2 = W1.toUpperCase();
        System.out.println(W2);
    }
    
    public static void equals(String W1){
        
        if(W1.equals("Word1")){
            System.out.println("success");
        }else{
            System.out.println("unsuccessfull");
        }
    }
    
    public static void equalsIgnoreCase(String W1){
        
        if(W1.equalsIgnoreCase("WORD1")){
            System.out.println("success2");
        }else{
        System.out.println("unsuccessfull2");
        }
    }
    
    public static void trim(String W1){
        
        System.out.println(W1);
        String W2 = W1.trim();
        
        System.out.println(W2);
    }
    
    public static void charAt(String F , String S){
        
        char initial = F.charAt(0);
        
        System.out.println("Hello, Mr " + initial + " " + S);
    }
    
    public static void concat (String F , String S){
        
        String C = F.concat(" " + S);
        System.out.println(C);
    }
}
