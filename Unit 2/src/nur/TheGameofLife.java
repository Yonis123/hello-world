package nur;

import java.util.Scanner;
/**
 * My Life Program
 * This is a program that simulates a world where
 * May 12 2017
 * @author 324038611
 *
 */
public class TheGameofLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		System.out.println("The Game of Life!");
		System.out.println("Enter the amount of live cells(do not enter more than 400 live cells)");
		int[][] array = new int[20][20];
		int numAlivecells = sc.nextInt();
		for (int i = 0; i < numAlivecells; i++) {
			System.out.println("Enter the coordinates (X Y)");
			int x = sc.nextInt();
			int y = sc.nextInt();
			while (x >= 20 || y >= 20) {
				System.out.println("This is a 20 by 20 grid. Both coordinates must be below 20.");
				x = sc.nextInt();
				y = sc.nextInt();
			}

			array[x][y] = 1;

			for (int row = 0; row < array.length; row++) {
				for (int col = 0; col < array[0].length; col++) {
					System.out.print(array[row][col]);
					if (col == 19) {
						System.out.println();
					}
				}
			}

		}
		boolean nextday = true;
		int counter = 0;
		int alivecells = numAlivecells;

		for (int day = 1; nextday = true; day++) {
			alivecells = 0;
			int[][] array2 = new int[20][20];
			for (int row2 = 0; row2 < array2.length; row2++) {
				for (int col2 = 0; col2 < array.length; col2++) {
					array2[row2][col2] = 0;

				}

			}

			System.out.println("would you like to continue to the next day.(True or False");
			nextday = sc.nextBoolean();
			counter = 0;
			if (nextday = true) {
				for (int i = 0; i < array.length; i++) {

					for (int j = 0; j < array[i].length; j++) {
						counter = 0;

						if (array[i][j] == 1) {
							if (array[i].length > j + 1) {
								if (array[i][j + 1] == 1) {
									counter++;

								}
							}

							if (array.length > i - 1 && i - 1 >= 0) {
								if (array[i - 1][j] == 1) {
									counter++;

								}

							}

							if (array.length > j - 1 && j - 1 >= 0) {
								if (array[i][j - 1] == 1) {
									counter++;
								}

							}

							if (array.length > i + 1) {

								if (array[i + 1][j] == 1) {
									counter++;

								}

							}
							if (array.length > i - 1 && array[i].length > j - 1 && j - 1 >= 0  && i - 1 >= 0  ) {
								if (array[i - 1][j - 1] == 1) {
									counter++;
								}
							}
							if (array.length > i - 1 && array[i].length > j + 1 && i - 1 >= 0) {
								if (array[i - 1][j + 1] == 1) {
									counter++;
								}
							}

							
							if (array.length > i + 1 && array[i].length > j + 1) {
								if (array[i + 1][j + 1] == 1) {
									counter++;
								}
							}
							
							if (array.length > i + 1 && array[i].length > j - 1 && j - 1 >= 0) {
								if (array[i + 1][j - 1] == 1) {
									counter++;
								}
							}

							if (counter == 2 || counter == 3) {
								array2[i][j] = 1;
							} else if (counter == 1 || counter == 4 || counter == 5 || counter == 6 || counter == 7
									|| counter == 8) {
								array2[i][j] = 0;
								alivecells--;
							}

							counter = 0;

						} else if (array[i][j] == 0) {
							counter = 0;
							if (array[i].length > j + 1) {

								counter=0;
								if (array[i].length > j + 1) {
									if (array[i][j + 1] == 1) {
										counter++;
									}
								}
								if (array[i].length > j - 1 && j - 1 >= 0) {
									if (array[i][j - 1] == 1) {
										counter++;
									}
								}
								if (array.length > i - 1 && i - 1 >= 0) {
									if (array[i - 1][j] == 1) {
										counter++;
									}
								}
								if (array.length > i + 1) {
									if (array[i + 1][j] == 1) {
										counter++;
									}
								}
								if (array.length > i - 1 && array[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
									if (array[i - 1][j - 1] == 1) {
										counter++;
									}
								}
								if (array.length > i - 1 && array[i].length > j + 1 && i - 1 >= 0) {
									if (array[i - 1][j + 1] == 1) {
										counter++;
									}
								}
								if (array.length > i + 1 && array[i].length > j - 1 && j - 1 >= 0) {
									if (array[i + 1][j - 1] == 1) {
										counter++;
									}
								}
								if (array.length > i + 1 && array[i].length > j + 1) {
									if (array[i + 1][j + 1] == 1) {
										counter++;
									}
								}
								if (counter == 3) {
									array2[i][j] = 1;
									alivecells++;
								}
								else if (counter == 1 || counter == 2 || counter == 4 || counter == 5 || counter == 6|| counter == 7 || counter == 8) {
									array2[i][j] = 0;
								}

								
							}
						
					
							array = array2;
							for (int k = 0; k < 20; k++) {
								for (int l = 0; l < 20; l++) {
									System.out.print(array[k][l]);
								}
								System.out.println();
							}
							if (alivecells == 0) {
								System.out.println("All the live cells are dead. Game Over");
							}

						}

					}
				}
			}
		}
	}
	}








