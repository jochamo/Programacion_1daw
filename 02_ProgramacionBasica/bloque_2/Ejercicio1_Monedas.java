package bloque_2;

public class Ejercicio1_Monedas {

	public static void main(String[] args) {
		
		//Ingresar una cantidad en euros y desglosar el número de billetes de 200, 
		//100, 50, 20, 10 y 5, así como también las monedas de 2e, 1e, 50ctm, 20ctm, 
		//10ctm, 5ctm, 2ctm y 1ctm para desglosar una cantidad de euros, 
		//de forma que necesite la menor cantidad de billetes y monedas de cada tipo.
		
		//1.- Calcular billetes		
	    
	    /*
	    int bi200 = 0;
	    int bi100 = 0;
	    int bi050 = 0;
	    int bi020 = 0;
	    int bi010 = 0;
	    int bi005 = 0;
	    
	    resto = parte_entera;
	    
	    bi200 = resto / 200;
	    resto = resto - bi200*200;
	    	    
	    bi100 = resto / 100;
	    resto = resto - bi100*100;
	    	    
	    bi050 = resto / 50;
	    resto = resto - bi050*50;	   
	     
	    bi020 = resto / 20;
	    resto = resto - bi020*20;	
	        
	    bi010 = resto / 10;
	    resto = resto - bi010*10;
	    
	    bi005 = resto / 5;
	    resto = resto - bi005*5;
	    
	    System.out.println("Billetes de 200e = " + bi200);
	    System.out.println("Billetes de 100e = " + bi100);
	    System.out.println("Billetes de  50e = " + bi050);
	    System.out.println("Billetes de  20e = " + bi020);
	    System.out.println("Billetes de  10e = " + bi010);
	    System.out.println("Billetes de   5e = " + bi005);
	    
	    //2.- Calcular monedas
	    */
	    
	    int[] valor_billetes = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
	    int[] cant_billetes  = new int[valor_billetes.length];
	    	    
	    //double importeDec    = 388.88;	    
	    double importeDec    = 1257.26;
		
	    //Pasar el total del importe a centimos
		int importe = (int) (importeDec * 100);
	    
		double cant_bill;
		double imp_bill;
		
	    //
	    for (int i=0; i<valor_billetes.length; i++){
	    
	    	if ((importe / valor_billetes[i]) > 0){
	    		
	    		cant_billetes[i] = importe / valor_billetes[i];
		    	
	    		importe = importe - cant_billetes[i]*valor_billetes[i];
			    	    
	    		cant_bill = (double) valor_billetes[i]/100;
	    		imp_bill  = (double) cant_billetes[i]*valor_billetes[i]/100;
	    		
			    System.out.printf("%3d x %7.2fe = %7.2f%n", cant_billetes[i], cant_bill, imp_bill);	    		
	    	}	    	
	    }		
	}
}