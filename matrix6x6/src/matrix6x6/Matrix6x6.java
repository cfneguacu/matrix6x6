package matrix6x6;

import java.util.Scanner;

public class Matrix6x6 {

	public static void main(String[] args) {
		
	
		String recursos[] = new String [] {"cimento", "areia", "brita", "hp", "hs", "tijolo", "betoneira"};
		double matrix4x7[][] = new double [4][7];
		String atividades[]= new String[] {"Fundação","Alvenaria","Estrutura","Acabamento"};
	
		Scanner numero = new Scanner(System.in);
		 
		for(int i = 0 ;i < atividades.length; i++){
			System.out.print("\n"+atividades[i]+"\n");	
				for(int j = 0;j<recursos.length;j++){
					System.out.print(recursos[j]+"-->");	
					matrix4x7[i][j] = numero.nextDouble();
				}
		}
		
		for(int j = 0;j<recursos.length;j++){
			System.out.print("\t\t"+recursos[j]);
		}
		
		for(int i = 0 ;i < atividades.length; i++){
			System.out.print("\n"+atividades[i]);
				for(int j = 0;j<recursos.length;j++){
					System.out.print("\t"+matrix4x7[i][j]+"\t");	
				}
		//System.out.println();
		}
		
		
			
	}
}
