package pr1.uebung03;

import static pr.MakeItSimple.*;

public class Rechner {
	
	public static void main(String[] args) {
		
		println("Zahlenrätsel");
		
		//0
		int star = 0; 
		//1
		int rectangleup = 0;
		//2
		int rhombus = 0;
		//3
		int heart = 0;
		//4
		int rectangledown = 0;
		//5
		int square = 0;
		//6
		int circledot = 0;
		//7
		int pike = 0;
		//8
		int circlecross = 0;
		//9
		int circle = 0;
			

		int term1 = 0; 
		int term2 = 0;
		int term3 = 0;
		int term4 = 0;
		int term5 = 0;
		int term6 = 0;
		int term7 = 0;
		int term8 = 0;
		int term9 = 0;
		
		
		while (star < 10)
		{				
		while (rectangleup == star)
			rectangleup++;
			while(rectangleup < 10)
			{
				while (rhombus == star || rhombus == rectangleup )
					rhombus++;
					while(rhombus < 10)
					{
						while (heart == star 
								|| heart == rectangleup
								|| heart == rhombus)
							heart++;
							while (heart< 10)
							{
								while (rectangledown == star 
										|| rectangledown == rectangleup 
										|| rectangledown == rhombus
										|| rectangledown == heart)
									rectangledown++;
									while (rectangledown< 10)
									{
										while (square == star 
												|| square == rectangleup 
												|| square == rhombus 
												|| square == heart
												|| square == rectangledown)
											square++;
											while (square< 10)
											{
												while (circledot == star 
														|| circledot == rectangleup 
														|| circledot == rhombus 
														|| circledot == heart 
														|| circledot == rectangledown 
														|| circledot == square)
													circledot++;
													while (circledot< 10)
													{
														while (pike == star 
																|| pike == rectangleup 
																|| pike == rhombus 
																|| pike == heart 
																|| pike == rectangledown 
																|| pike == square 
																|| pike == circledot)
															pike++;
															while (pike < 10)
															{
																while (circlecross == star 
																		|| circlecross == rectangleup 
																		|| circlecross == rhombus 
																		|| circlecross == heart 
																		|| circlecross == rectangledown 
																		|| circlecross == square 
																		|| circlecross == pike)
																	circlecross++;
																	while (circlecross< 10)
																	{	
																		while (circle == star 
																		|| circle == rectangleup 
																		|| circle == rhombus 
																		|| circle == heart 
																		|| circle == rectangledown 
																		|| circle == square 
																		|| circle == pike
																		|| circle == circlecross)
																		circle++;
																		while (circle< 10)
																		{
																			if (star + heart <= rectangledown 
																					&& heart + square <= pike
																					&& rhombus + square <= heart 
																					&& star - heart >= 0
																					&& heart - square >= 0 
																					&& rectangledown - pike >= 0)
																			{
																			term1 = star*100 + rectangleup*10 + rhombus;
																			term2 = heart*100 + rectangleup*10 + rectangledown;
																			term3 = rectangledown*100 + square*10 + square;
																			term4 = heart*100 + rectangledown*10 + circledot;
																			term5 = square*100 + square*10 + star;
																			term6 = pike*100 + square*10 + circlecross;
																			term7 = rhombus*100 + rectangleup*10 + circlecross;
																			term8 = square*100 + rectangledown*10 + heart;
																			term9 = heart*100 + rectangledown*10 + circle;
																			
																			
																			if (term1 + term2 == term3 
																				&& term4 + term5 == term6 
																				&& term7 + term8 == term9
																				&& term1 - term4 == term7
																				&& term2 - term5 == term8
																				&& term3 - term6 == term9)
																			{
																				println( term1 + " + " + term2 + " = " + term3);
																				println( " - " + "    - " + "    - ");
																				println( term4 + " + " + term5 + " = " + term6);
																				println( " = " + "    = " + "    = ");
																				println( term7 + " + " + term8 + " = " + term9);
																				
																			}
																			}
																	circle++;		
																	}
																circle=0;
																circlecross++;	
																}
															circlecross=0;
															pike++;	
															}
														pike=0;
														circledot++;
														}
													circledot=0;
													square++;	
													}
												square=0;
												rectangledown++;
												}
											rectangledown=0;
											heart++;
											}
										heart=0;
										rhombus++;
										}
									rhombus=0;
									rectangleup++;
									}
								rectangleup=0;
								star++;
								}
						println("Lösung gefunden");
						}
					}
					
					
				
		