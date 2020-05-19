package pr1.uebung03;

import static pr.MakeItSimple.*;

public class Rechner_Kyrill {
	
	public static void main(String[] args) {
		
		println("Zahlenrätsel");
		println("");
		
		int star = 0; 
		int rectangleup = 0;
		int rhombus = 0;
		int heart = 0;
		int rectangledown = 0;
		int square = 0;
		int circledot = 0;
		int pike = 0;
		int circlecross = 0;
		int circle = 0;
		
		boolean bool = false;
		
		int i = 0;
		int ii = 0;
		int iii = 0;
		
		int term1 = star*100 + rectangleup*10 + rhombus;
		int term2 = heart*100 + rectangleup*10 + rectangledown;
		int term3 = rectangledown*100 + square*10 + square;
		int term4 = heart*100 + rectangledown*10 + circledot;
		int term5 = square*100 + square*10 + star;
		int term6 = pike*100 + square*10 + circledot;
		int term7 = rhombus*100 + rectangleup*10 + circlecross;
		int term8 = square*100 + rectangledown*10 + heart;
		int term9 = heart*100 + rectangledown*10 + circle;
		
	while (!bool)			
	{
		while (star < 10)
		{
			rectangleup=0;
			while(rectangleup < 10)
				{
					rhombus=0;
					while(rhombus < 10)
					{
						heart=0;
						while (heart< 10)
						{
							rectangledown=0;
							while (rectangledown< 10)
							{
								square=0;
								while (square< 10)
								{
									circledot=0;
									while (circledot< 10)
									{
										pike=0;
										while (pike < 10)
										{
											circlecross=0;
											while (circlecross< 10)
											{
												while (circle< 10)
												{
														i++;	
													println(i);
													if ((term1!=0)&&(term1 + term2 == term3) && (term4 + term5 == term6) && (term7 + term8 == term9) &&
															(term1 - term4 == term7) && (term2 - term5 == term8) && (term3 - term6 == term9))
														{
															bool =true;
														println("Lösung gefunden");
														}
													
												}
												circle++;
											}
											circlecross++;
										}
										pike++;
									}
									circledot++;
								}
								square++;
							}
							rectangledown++;
						}
						heart++;
					}
					rectangleup++;
				}
				star++;
		}
	}
		
//		if ((term1 + term2 == term3) && (term4 + term5 == term6) && (term7 + term8 == term9) &&
//			(term1 - term4 == term7) && (term2 - term5 == term8) && (term3 - term6 == term9))
//		{
//			println("Lösung gefunden");
//		}
//			
		
		
//		println( a + "" + b + "" + c + "" + " + " + d + "" + b + "" + e + "" + " = " + b + "" + g + "" + g + "");
//		println( " - " + "    - " + "    - ");
//		println( d + "" + e + "" + f + "" + " + " + g + "" + g + "" + a + "" + " = " + i + "" + g + "" + h + "");
//		println( " = " + "    = " + "    = ");
//		println( c + "" + b + "" + h + "" + " + " + g + "" + e + "" + d + "" + " = " + d + "" + e + "" + j + "");
	}
}

