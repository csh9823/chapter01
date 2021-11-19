package ex06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String[] argss = new String[3];
		argss[0] = "황일영";
		argss[1] = "정우성";
		argss[2] = "이정재";
		*/
		/*
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		 */
		if(args[0].equals("-version")){
			System.out.println("ver0.78");
		}else {
			System.out.println("옵션을 입력해주세요");
		}
			
	}

}
