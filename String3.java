import java.util.Scanner;
class String3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("vvedite slovo" );//9.112
		String word= in.next();
		System.out.println("vvedite chislo" );
		int n1= in.nextInt();
		System.out.println("vvedite chislo" );
		int n2= in.nextInt();

		String soz  = word.replace(word.charAt(n1),' '); 
		String sooz = soz.replace(word.charAt(n2),' ');
		System.out.println(sooz);/*


		


		Scanner in = new Scanner(System.in);//9.69
		System.out.println("vvedite tekst chtoby opredelit skolko v nem predlozhenii");
		String word = in.next();

		
        int count = 0;

		for(int i = 0; i < word.length(); i++) {
		    if(word.endsWith(".")){
		    count++;
		    
		    }
		}
		System.out.println( "tekstte "+count+"soz bar");


		Scanner in = new Scanner(System.in);//9.70
		System.out.println("vvedite slovo");
		String word = in.next();
		int count = 0;
			for(int i = 0; i < word.length(); i++) {
			    if(word.charAt(i)=='e'||word.charAt(i)=='y'||word.charAt(i)=='a'||word.charAt(i)=='i'||word.charAt(i)=='u'||word.charAt(i)=='o') {
			    count++;
			    }
			}
		System.out.println("glasnye bukvy v vawem slove "+count);


		Scanner in = new Scanner(System.in);//9.76 pervyi 
		System.out.println("vvedite slovo");
		String word = in.next();
			for(int i = 0; i < word.length(); i++) {
			    if(word.contains("e")) {
			    System.out.println("indeks pervoi bukvy e "+word.indexOf("e"));
			    break;
			    }else {
			    System.out.println("v vawem slove net bukvy e");
			    break;
			}
		}
		System.out.println("vvedite slovo");
		String soz = in.next();
		int posIndex = soz.lastIndexOf("e");
		System.out.println("indeks poslednei bukvy e "+posIndex); 

		Scanner in = new Scanner(System.in);//9.90
		System.out.println("vvedite slovo gde vse bukvy e budut zameneny na i");
		String soz= in.next();
		String newWord = soz.replace('e', 'i');
		System.out.println("novoe slovo "+newWord); 



		
        String word = "injuka";//109
		String letter3 = word.replace('j', ' ');
		System.out.println(letter3);

		
		Scanner in = new Scanner(System.in);
		System.out.println("vvedite slovo");
		String word = in.next();
		System.out.println("vvedite nomer bukvy kotoryi vy hotite udalit");
		int k = in.nextInt();
		String delete  = word.replace(word.charAt(k), ' ');
		System.out.println(delete);*/


    }		
			
}	

			   


			 
			  	
			    
		   




		
				