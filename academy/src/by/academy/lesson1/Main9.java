package by.academy.lesson1;

import java.util.Scanner;

public class Main9 {
		public static void main(String... strings) {
			Scanner scan = new Scanner(System.in);
			System.out.println("������� ���������� ����� ��� ��������:");
			int n = scan.nextInt();

			int numberOfNegative = 0;
			int numberOfPositive = 0;
			int numberOfZiro = 0;

			for (int i = 0; i < n; i++) {
				System.out.println("������� ����� ��� ��������: ");
				int number = scan.nextInt();

				if (number < 0) {
					numberOfNegative++;
				} else if (number > 0) {
					numberOfPositive++;
				} else {
					numberOfZiro++;
				}
			}

			System.out.println("���������� ����������: " + numberOfPositive);
			System.out.println("���������� �������������: " + numberOfNegative);
			System.out.println("���������� �����: " + numberOfZiro);

			scan.close();
		}
	}
