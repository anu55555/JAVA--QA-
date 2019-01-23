
public class condensation {
  public static boolean stringcompressor(String[] input) {
	 
      for(int i=0; i< input.length; i++)
      {
    	  char[] firstcharacterarray=input[i].toCharArray();
    	  char[] secondcharacterarray=input[i+1].toCharArray();
    			  for (int j=firstcharacterarray.length; j>=1; j--)
    			  {
    				  for (int k=0; k<secondcharacterarray.length; k++) 
    				  {
    					  char firstchar = firstcharacterarray[i];
    					  char secondchar = firstcharacterarray[j];
    					  if (firstchar==secondchar)
    						  return true;  
    				  }
    				    
    			  }
    	  
    		         
    	  
     }

	  return false;
  }
	
}
