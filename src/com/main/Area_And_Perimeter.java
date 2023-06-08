package com.main;


import java.util.Scanner;

/*
	1.circle
		a.area
		b.perimeter
		
	2.triangle
		a.normal
			1.area
			2.perimeter
		b.Equilateral
			1.area
			2.perimeter
		c.right angled triangle(katkon)
			1.area
			2.perimeter
		
	3.square
		1.Area 
		2.Perimeter
		
	4.rectangle
		1.Area
		2.Perimeter

*/

public class Area_And_Perimeter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.circle \n" + "2.triangle \n" + "3.square \n" + "4.rectangle");
			System.out.println("Please Enter Number Between 1 to 4 and Press 'X' for exit ");

			String choise = sc.next();

			// for exit
			if (choise.equals("x") || choise.equals("X")) {
				break;
			}

			else {
				switch (choise) {

				// ------------------------------------------------------------------------------------------
				// for Circle
				case "1":
					System.out.println("For Circle");

					System.out.println("Enter Radius Of Circle");
					float radius = sc.nextFloat();

					System.out.println("a.area \n" + "b.perimeter \n");
					System.out.println("Select From Above Options : ");

					String cir = sc.next();

					switch (cir) {

					case "a":
						System.out.println("Area Of Circle");

						float area = (float) (Math.PI * Math.pow(radius, 2));

						System.out.println("Area Of Circle is " + area + "\n");

						break;

					case "b":
						System.out.println("Perimeter Of Circle");

						float parimeter = (float) (2 * Math.PI * radius);

						System.out.println("Perimeter of Circle is " + parimeter + "\n");

						break;

					default:
						break;
					}
					break;

				// ----------------------------------------------------------------------------------------------------------
				// for Triangle
				case "2":
					System.out.println("For Triangle");

					System.out.println("a.Triangle \n" + "b.Equilateral \n" + "c.Right Angled Triangle \n");

					String triangle_type = sc.next();

					switch (triangle_type) {

					///////////////////////////////////
					// triangle
					case "a":
						System.out.println("Triangle");

						System.out.println("Enter Lenght of First Edge");
						float tri_first = sc.nextFloat();

						System.out.println("Enter Lenght of Second Edge");
						float tri_second = sc.nextFloat();

						System.out.println("Enter Lenght of Third Edge");
						float tri_third = sc.nextFloat();

						System.out.println("1.Area \n" + "2.Perimeter \n");
						String triangle_t = sc.next();

						switch (triangle_t) {

						case "1":
							System.out.println("Area Of Triangle");

							float s = (tri_first + tri_second + tri_third) / 2;

							float triangle_area = (float) Math
									.sqrt(s * (s - tri_first) * (s - tri_second) * (s - tri_third));

							System.out.println("Area Of Triangle is " + triangle_area + "\n");

							break;

						case "2":
							System.out.println("Perimeter Of Triangle");

							float triangle_perimeter = tri_first + tri_second + tri_third;

							System.out.println("Perimeter Of Triangle is " + triangle_perimeter + "\n");

							break;

						default:
							break;
						}

						break;

					///////////////////////////////////
					// Equilateral Triangle
					case "b":

						System.out.println("Equilateral Triangle");

						System.out.println("Enter Length Of Edge");
						float triangle_edge = sc.nextFloat();

						System.out.println("1.Area \n" + "2.Perimeter \n");

						String triangle_eq = sc.next();

						switch (triangle_eq) {

						case "1":

							System.out.println("Area Of Equilateral Triangle");

							float area_tt = (float) (Math.sqrt(3) * (Math.pow(triangle_edge, 2))) / 4;

							System.out.println("Area Of Equilateral Triangle is " + area_tt + "\n");

							break;

						case "2":
							System.out.println("Perimeter Of Equilateral Triangle");

							float perimeter_tt = 3 * triangle_edge;

							System.out.println("Perimeter Of Equilateral Triangle is " + perimeter_tt + "\n");

							break;
						default:
							break;
						}

						break;

					///////////////////////////////////
					// Right Angled Triangle
					case "c":
						System.out.println("Right Angled Triangle");

						System.out.println("Enter Value Of one Edge");
						float tri_payo = sc.nextFloat();

						System.out.println("Enter Value Of Second Edge");
						float tri_vedh = sc.nextFloat();

						System.out.println("1.Area \n" + "2.Perimeter \n");

						String triangle_right = sc.next();

						switch (triangle_right) {

						case "1":
							System.out.println("Right Angle Triangle Area");

							float area_ra = (tri_payo * tri_vedh) / 2;

							System.out.println("Area Of Right Angle Triangle is " + area_ra + "\n");

							break;

						case "2":
							System.out.println("Right Angle Triangle Perimeter");

							float perimeter_ra = (float) (tri_payo + tri_vedh
									+ Math.sqrt(Math.pow(tri_payo, 2) + Math.pow(tri_vedh, 2)));

							System.out.println("Perimeter Of Right Angle Triangle is " + perimeter_ra + "\n");

							break;

						default:
							break;
						}

						break;

					default:
						break;
					}

					break;

				// ------------------------------------------------------------------------------------------
				// for Square
				case "3":
					System.out.println("For Square");

					System.out.println("Enter The Length Of Side ");

					float len = sc.nextFloat();

					System.out.println("a.Area \n" + "b.Perimeter \n");

					String square = sc.next();

					switch (square) {

					case "a":
						System.out.println("Area Of Square");

						System.out.println("Area of square is " + Math.pow(len, 2) + "\n");

						break;

					case "b":
						System.out.println("Perimeter Of Square");

						System.out.println("Perimeter of square is " + 4 * len + "\n");

						break;

					default:
						break;
					}

					break;

				// ------------------------------------------------------------------------------------------
				// for Rectangle
				case "4":
					System.out.println("For Rectangle");

					System.out.println("Enter Lenght of one side - ");
					float rec_len = sc.nextFloat();

					System.out.println("Enter Length of second side - ");
					float rec_lenn = sc.nextFloat();

					System.out.println("a.Area \n" + "b.Perimeter \n");

					String rec = sc.next();

					switch (rec) {
					case "a":

						System.out.println("Area of Rectangle");

						System.out.println("Area Of Rectangle is " + rec_len * rec_lenn + "\n");

						break;

					case "b":

						System.out.println("Perimeter of rectangle");

						System.out.println("Perimeter Of Rectangle is " + 2 * (rec_len + rec_lenn) + "/n");

						break;

					default:
						break;
					}

					break;

				}

			}

		}
	}
}