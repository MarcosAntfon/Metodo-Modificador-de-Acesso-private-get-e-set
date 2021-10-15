package TestPrivateSeteGet;

import DominioPrivateSeteGet.FuncionarioDaEmpresa;

public class FuncionarioDaEmpresaTest {

		public static void main(String[] args) {
			
			FuncionarioDaEmpresa funcionario01 = new FuncionarioDaEmpresa();
			FuncionarioDaEmpresa funcionario02 = new FuncionarioDaEmpresa();
			FuncionarioDaEmpresa funcionario03 = new FuncionarioDaEmpresa();
			
			funcionario01.setNome ("Rhaldney");
			funcionario01.setIdade (28);
			funcionario01.setSalarios (new double[] {3000, 3255, 3110});
			
			funcionario02.setNome ("Marcos");
			funcionario02.setIdade (35);
			funcionario02.setSalarios (new double[] {3200, 3555, 3120});
			
			funcionario03.setNome ("Antonio");
			funcionario03.setIdade (56);
			funcionario03.setSalarios (new double[] {3200, 3400, 3660});
			
			funcionario01.imprime();
			System.out.println("\n" + "Media  " +  funcionario01.getMedia());
			System.out.println("\n");
			
			funcionario02.imprime();
			System.out.println("\n" + "Media  " + funcionario02.getMedia());
			System.out.println("\n");
			
			funcionario03.imprime();
			System.out.println("\n" + "Media  " + funcionario02.getMedia());
		}
}
