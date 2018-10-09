package mastermind;

public class Mastermind {
	 private int[] code = new int[4];
	 private int cptes = 0;
	 private int ESSAIS_MAX = 8;
	 private int solution = new int[code]
	 private int essaisMax = 0;
	 private int generateCode = 0
	 generateCode = (int) Math.random()* (9-1);
	 
	 public Mastermind() {
		 this.generateCode();
		 System.out.println("veuillez entrer un code svp");
		 System.out.println("le code est: " + code[0] + " " + code[1] + " " + code[2] + " ");
	        System.out.println("Attention, vous avez droit a " + ESSAIS_MAX + " essais");
	        int[] chiffres = new int[nb];
	        boolean victoire = false;
	        do {
	            System.out.println("\nEssai n° " + (cptes+1) + "/" + ESSAIS_MAX + " :");
	            int nombreSaisi = sc.nextInt();
	    
	            for(int i=0 ; i<nb; i++)
	                chiffres[i] = (int) (nombreSaisi / (Math.pow(10, (nb-i-1)) ))%10;
	            
	            // On écrit la proposition du joueur
	            for(int i=0 ; i< int code[] ; i++)
	                System.out.print(chiffres[i] + " ");
	            System.out.println()
	 
	
    
      
       
}
	 // Get validation
	 
	 private void validation(int[] UserCode) {
		 
	 }
		 
	// Get the got form user
	
		 private int[] getUserCode() {
		 
	 }
			 
	// Generate code
	
	      private void generateCode() {
	    	
	    	
	    	
	    	
	    	  
	    			  
	      }
	 }	 
	 
