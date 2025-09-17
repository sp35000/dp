package com.example.dp.labtest;

import com.example.dp.lab.Lab;

public class PalindromeTest {
	public static void main(String[] args) {
		Lab lab = new Lab();
		System.out.println("celso:" + lab.checkIfPalindrome("celso"));
		System.out.println("\"LUZA ROCELINA, A NAMORADA DO MANUEL, LEU NA MODA DA ROMANA: ANIL É COR AZUL\":" + lab.checkIfPalindrome("LUZA ROCELINA, A NAMORADA DO MANUEL, LEU NA MODA DA ROMANA: ANIL É COR AZUL"));
		System.out.println("Hannah:" + lab.checkIfPalindrome("hannah"));
	}
}
