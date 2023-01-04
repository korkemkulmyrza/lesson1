import java.util.Scanner;
class String937{
	public static void main(String args[]){
		/*Scanner in = new Scanner(System.in);
		System.out.println("vvedite slovo chtoby pomenyat mestami ego poloviny");//9.37
		String soz = in.next();
		int k = soz.length();
		String o = soz.substring(k/2,k);
		String l = soz.substring(0,k/2);
		System.out.print(o+l);
		*/



		/*Scanner in = new Scanner(System.in);//9.40
		System.out.println("vvedite slovo");//перенести буквы в конец коркем -ркемко
		String word = in.next();
		System.out.println("vvedite chislo k");
		int k = in.nextInt();
		int length = word.length();

		String newOrd= word.substring(0,k);
		String newwOrd= word.substring(k,length);
		System.out.println(newOrd+newwOrd);


		Scanner in = new Scanner(System.in);
		System.out.println("vvedite slovo chtoby pomenyat mestami ego poloviny");//9.40 цикл
		String soz = in.next();
		System.out.println("vvedite chislo k");
		int p  = in.nextInt();
		int length = soz.length();
		String soz1 = "";
		String soz2 = "";

		for(int i = 0; i<p ; i++){
			String soz0= soz.substring(0,i+1);
			soz2 = soz0;
			String soz3 = soz.substring(p,length);
			soz2= soz3;
		}
		System.out.println(soz2);

		



        Scanner in = new Scanner(System.in);
        System.out.println("vvedite slovo");
		String word = in.next();//9.55
		char c1= '!';
		char c2= '.';
		for(int i = 0; i<word.length(); i++){
			char c = word.charAt(i);
			if(c==c1||c==c2){
				System.out.println(i+": "+c);
			}
		}*/




		/*Scanner in = new Scanner(System.in);//9.49s
		System.out.println("napiwite slovo chtoby dobavit zvezdochki");
		String word = in.next();
		int length = word.length();
		
		String star = "*";

		for(int i = 1; i<=length-1 ; i++){
			star+="*";

		}
		System.out.println(star+word+star);*/















		


		Scanner in = new Scanner(System.in);
		System.out.println("vvedite slovo s 6 bukvami");//9.42
		String word= in.next();

		char songy = word.charAt(5);
		System.out.println("zhana soz "+songy+""+word);


		



       /*System.out.println("vvedite slovo chto by poschitat % bukvy a v nem" );//9.62 
		String word= in.next();
	
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
		   if(word.charAt(i) == 'a')
		    count++;
		}
		double p = 100 / word.length() * count;
		System.out.print("percentage is: "+p);
		System.out.print("%");*/




		





		
	}
}		