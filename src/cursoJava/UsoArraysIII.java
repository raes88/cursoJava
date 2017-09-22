package cursoJava;

public class UsoArraysIII {

	public static void main(String[] args) {
		int[] numeros=new int[150];
		for(int i=0;i<numeros.length;i++){
			numeros[i]=(int)Math.round(Math.random()*100);
		}
		for(int num:numeros){
			System.out.print(num+",");
		}

	}

}
