public class Main  {

    public static void main(String[] args) {
       
        //contoh String
        String strInt = "2025";
        String strDouble = "3.79";
        String strFloat = "18";
        String strBoolean = "true";
        
        int angkaInt = Integer .parseInt(strInt);
        System.out.println("angkaInt= " + angkaInt);
        
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("doubleValue= " + doubleValue);
        
        float floatValue = Float.parseFloat(strFloat);
        System.out.println("floatValue= " + floatValue);
        
        boolean booleanValue = Boolean.parseBoolean(strBoolean);
        System.out.println("BooleanValue= " + booleanValue);
        
        
       
     
    }
}
 
