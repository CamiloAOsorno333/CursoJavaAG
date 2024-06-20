package TipoString;

public class StringInmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "a"; 
		String b= "b"; 
		String c= a; 
		
		StringBuilder sb = new StringBuilder(a); // es mutable
		
		long inicio= System.currentTimeMillis();
		
		for(int i=0; i < 100000; i++) {
			//c= c.concat(a).concat(b).concat("\n"); 	 //500 => 2ms, 
			//c+= a + b + "\n";			 // es igual a  = c + a + b + "\n"; //500 =>16 ms
			sb.append(a).append(b).append("\n");		 //500 => 1ms, //1000 => 0ms. // 10000 => 2ms
		}
		
		
		long fin= System.currentTimeMillis();
		
		System.out.println(fin - inicio);
		System.out.println("c = " + c);
		System.out.println("sb = " + sb.toString());
		
	}

}
