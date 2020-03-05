//Excecise on Pages 745 - 748


import javax. swing.*;
import java.awt.*;
import java.awt.event.*;

public class JResortCal extends JFrame implements ItemListener
{
	//instance variables and constants for this class
	final double BASE_PRICE = 200.00;
	final double WEEKEND = 100.00;
	final double BREAKFAST_PREMIUM = 20.00;
	final double GOLD_PREMIUM = 75;
	Double totalPrice = BASE_PRICE;


	//instance objects for this class
	JCheckBox weekendBox = new JFrameCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);
	JCheckBox breakfastBox = new JFrameCheckBox("Breakfast premium $" + BREAKFAST_PREMIUM, false);
	JCheckBox golfBox = new JFrameCheckBox("Golf $" + GOLF_PREMIUM, false);
	
	JLabel resortLabel = new Label("Resort Price Calculator");
	JLabel optionExplainLabel = new Label("Base price for a room is $" + BASE_PRICE + ".");
	JLabel optionExplainLabel2 = new Label("Check the option you want.");
	JLabel priceLabel  = new Label("The price for your stay is");

	JTextField totPrice = new JTextField(4);

	//Default constructor for the class
	public JResortCal
	{
		super("Resort Price Estimator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FLowLayout());
		add(resortLabel);
		add(optionExplained);
		add(optionExplained2);
		add(weekendBox);
		add(priceLabel);
		add(totPrice);

		//Display the original total price in the totPrice field
		totPrice.setText("$" + totalPrice);

		//Add event Listeners for all the JCheckBoxes
		weekendBox.addItemListener(this);
		breakfastBox.addItemListener(this);
		golfBox.addItemListener(this);
	}

		@Override 
		public void itemStateChanged(ItemEvent event)
		{
			Object source = event.getSource();
			int select = event.getStateChange();

				if (soure == weekendBox)
				{
					if(select == ItemEvent.SELECTED)
					{
					totalPrice += WEEKEND_PREMIUM;
					}
					else
					{
						totalPrice -= WEEKEND_PREMIUM;
					}
			
				else
					if (source == breakfastBox)
					{
						if(select == ItemEvent.SELECTED)
						{
						totalPrice += BREAKFAST_PREMIUM;
						}
						else
						{
							totalPrice -= BREAKFAST_PREMIUM;
					}
					else //Must be a golfbox by default
					{
						if(select == ItemEvent.SELECTED)
						{
							totalPrice += GOLF_PREMIUM;
						}
						else
						{
							totalPrice -= GOLF_PREMIUM;
						}
					}
				}

			totPrice.setText("$" + totalPrice);
			}
		
				
				public static void main(String[] args)
				{
					JResortCal aFrame = new JResortCal()
					final int WIDTH = 300;
					final int HEIGHT =200;
					aFrame.SetSize(WIDTH, HEIGHT);
					aFrame.setVisible(true);
				}
			}