import java.util.ArrayList;
import java.util.List;

public class Exe5  {
	static ArrayList<Integer> nummerlista1 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista2 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista3 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista4 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista5 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista6 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista7 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista8 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista9 = new ArrayList<Integer>();
	static ArrayList<Integer> nummerlista10 = new ArrayList<Integer>();
	
	static int summa1 = 0;
	static int summa2 = 0;
	static int summa3 = 0;
	static int summa4 = 0;
	static int summa5 = 0;
	static int summa6 = 0;
	static int summa7 = 0;
	static int summa8 = 0;
	static int summa9 = 0;
	static int summa10 = 0;
	static int totalSum = 0;
    private static int räknafemmor(ArrayList<Integer>nummerLista){
    int	sum = 0;
			for(int i = 0; i<nummerLista.size();i++){
				if(nummerLista.get(i)==5){
					sum = sum + 1;
					}
	
			}			return sum;
				}
    
	
	

	
    public static void main(String[] args) {
//        
    	for (int i=0; i<10; i++){nummerlista1.add(kalleAnka()); 
                                 nummerlista2.add(kalleAnka());
    		                     nummerlista3.add(kalleAnka());
    		                     nummerlista4.add(kalleAnka());
    		                     nummerlista5.add(kalleAnka());
    		                     nummerlista6.add(kalleAnka());
    		                     nummerlista7.add(kalleAnka());
    		                     nummerlista8.add(kalleAnka());
    		                     nummerlista9.add(kalleAnka());
    		                     nummerlista10.add(kalleAnka());
    	}
    	System.out.println(nummerlista1);
    	summa1 = räknafemmor(nummerlista1);
    	System.out.println(" array1: " + summa1);
        System.out.println(nummerlista2);
        summa2 = räknafemmor(nummerlista2);
    	System.out.println(" array2: " + summa2);
        System.out.println(nummerlista3);
        summa3 = räknafemmor(nummerlista3);
    	System.out.println(" array3: " + summa3);
        System.out.println(nummerlista4);
        summa4 = räknafemmor(nummerlista4);
    	System.out.println(" array4: " + summa4);
        System.out.println(nummerlista5);
        summa5 = räknafemmor(nummerlista5);
    	System.out.println(" array5: " + summa5);
        System.out.println(nummerlista6);
        summa6 = räknafemmor(nummerlista6);
    	System.out.println(" array6: " + summa6);
        System.out.println(nummerlista7);
        summa7 = räknafemmor(nummerlista7);
    	System.out.println(" array7: " + summa7);
        System.out.println(nummerlista8);
        summa8 = räknafemmor(nummerlista8);
    	System.out.println(" array8: " + summa8);
        System.out.println(nummerlista9);
        summa9 = räknafemmor(nummerlista9);
    	System.out.println(" array9: " + summa9);
        System.out.println(nummerlista10);
        summa10 = räknafemmor(nummerlista10);
    	System.out.println(" array10: " + summa10);
    	
    
    	
    	totalSum = summa1 + summa2 + summa3 + summa4 + summa5 + summa6 + summa7 + summa8 + summa9 + summa10;
    	System.out.println("totalt antal 5:or " + totalSum);
    	
    	
//        List<Integer> nummerlista1;
//		  nummerlista1.add(1);      
//        nummerlista1.add(2);     
//        nummerlista1.add(3);     
//        nummerlista1.add(4);
//        nummerlista1.add(5);
//        System.out.println(nummerlista1.toString());
//        
//        List<Integer> nummerlista2;
//		  nummerlista2.add(6);      
//        nummerlista2.add(7);      
//        nummerlista2.add(8);     
//        nummerlista2.add(9);
//        nummerlista2.add(10);
//        System.out.println(nummerlista2.toString());
//        
//	     List<Integer> nummerlista3;
//		 nummerlista3.add(6);      
//       nummerlista3.add(7);      
//       nummerlista3.add(8);     
//       nummerlista3.add(9);
//       nummerlista3.add(10);
//       System.out.println(nummerlista3.toString());
	   
//	   List<Integer> nummerlista4;
//		 nummerlista4.add(6);      
//       nummerlista4.add(7);      
//       nummerlista4.add(8);     
//       nummerlista4.add(9);
//       nummerlista4.add(10);
//       System.out.println(nummerlista4.toString());
	   
//	   List<Integer> nummerlista5;
//		 nummerlista5.add(6);      
//       nummerlista5.add(7);      
//       nummerlista5.add(8);     
//       nummerlista5.add(9);
//       nummerlista5.add(10);
//       System.out.println(nummerlista5.toString());
	   
//	   List<Integer> nummerlista6;
//		 nummerlista6.add(6);      
//       nummerlista6.add(7);      
//       nummerlista6.add(8);     
//       nummerlista6.add(9);
//       nummerlista6.add(10);
//       System.out.println(nummerlista6.toString());
	   
//	   List<Integer> nummerlista7;
//		 nummerlista7.add(6);      
//       nummerlista7.add(7);      
//       nummerlista7.add(8);     
//       nummerlista7.add(9);
//       nummerlista7.add(10);
//       System.out.println(nummerlista7.toString());
	   
//	   List<Integer> nummerlista8;
//		 nummerlista8.add(6);      
//       nummerlista8.add(7);      
//       nummerlista8.add(8);     
//       nummerlista8.add(9);
//       nummerlista8.add(10);
//       System.out.println(nummerlista8.toString());
	   
//	   List<Integer> nummerlista9;
//		 nummerlista9.add(6);      
//       nummerlista9.add(7);      
//       nummerlista9.add(8);     
//       nummerlista9.add(9);
//       nummerlista9.add(10);
//       System.out.println(nummerlista9.toString());
	   
//	   List<Integer> nummerlista10;
//		 nummerlista10.add(6);      
//       nummerlista10.add(7);      
//       nummerlista10.add(8);     
//       nummerlista10.add(9);
//       nummerlista10.add(10);
//       System.out.println(nummerlista10.toString());
	   
	
	
//        int ranTal = (int)(Math.random()*10)+1;
//        
//        for (int i= 0; i<nummerlista1.size(); i++) { 
//            System.out.print(nummerlista1.get(i) + " ");
//          }
//          System.out.println();
//          
    		
        
       }
    private static int kalleAnka(){
    	int pluto = (int) (Math.random()*10)+1;
    	return pluto;
    	}
    	
    
}    