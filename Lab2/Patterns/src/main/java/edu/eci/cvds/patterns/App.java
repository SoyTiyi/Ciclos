package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println(args.length+"Perfil");
	    if(args.length>0){
		String resp="";
	    	for(int i=0;i<args.length;i++){
			if(i==args.length-1){
				resp+=args[i];
			}
			else{
				resp+=args[i]+" ";
			}
		}
		System.out.println("Hello "+resp+"!");
	    } else {
			System.out.println("Hello World!");
	    }
    }
}
