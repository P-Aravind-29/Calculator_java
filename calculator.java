package org.calculator;

import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
public class calculator {                //only 2 number arithmetic operations  
	
	calculator(){
		
		Frame frame = new Frame("Calculator");
		TextField display=new TextField("");
		display.setBounds(100, 130, 250, 50);
		
		// Numbers Button
		Button one = new Button("1");
		one.setBounds(100, 200, 30, 30);
		ActionListener onein = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "1";
				display.setText(exp);
			}	
		};
		one.addActionListener(onein);
		
		Button two = new Button("2");
		two.setBounds(150, 200, 30, 30);
		ActionListener twoin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "2";
				display.setText(exp);		
			}	
		};
		two.addActionListener(twoin);
		
		Button three = new Button("3");
		three.setBounds(200, 200, 30, 30);
		ActionListener threein = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "3";
				display.setText(exp);		
			}	
		};
		three.addActionListener(threein);
		
		Button four = new Button("4");
		four.setBounds(100, 250, 30, 30);
		ActionListener fourin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "4";
				display.setText(exp);		
			}	
		};
		four.addActionListener(fourin);
		
		Button five = new Button("5");
		five.setBounds(150, 250, 30, 30);
		ActionListener fivein = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "5";
				display.setText(exp);		
			}	
		};
		five.addActionListener(fivein);
		
		Button six = new Button("6");
		six.setBounds(200, 250, 30, 30);
		ActionListener sixin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "6";
				display.setText(exp);		
			}	
		};
		six.addActionListener(sixin);
		
		Button seven = new Button("7");
		seven.setBounds(100, 300, 30, 30);
		ActionListener sevenin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "7";
				display.setText(exp);		
			}	
		};
		seven.addActionListener(sevenin);
		
		Button eight = new Button("8");
		eight.setBounds(150, 300, 30, 30);
		ActionListener eightin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "8";
				display.setText(exp);		
			}	
		};
		eight.addActionListener(eightin);
		
		Button nine = new Button("9");
		nine.setBounds(200, 300, 30, 30);
		ActionListener ninein = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "9";
				display.setText(exp);		
			}	
		};
		nine.addActionListener(ninein);
		
		Button zero = new Button("0");
		zero.setBounds(150, 350, 30, 30);
		ActionListener zeroin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "0";
				display.setText(exp);	
			}	
		};
		zero.addActionListener(zeroin);
		
		// Operator Buttons	
		Button add = new Button("+");
		add.setBounds(250, 200, 50, 30);
		ActionListener addin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "+";
				display.setText(exp);
				if(exp.contains("++")) {
					display.setText(exp.replace("++", "+"));
				}
			}
		};
		add.addActionListener(addin);
		
		
		Button sub = new Button("-");
		sub.setBounds(250, 250, 50, 30);
		ActionListener subin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "-";
				display.setText(exp);
				if(exp.contains("--")) {
					display.setText(exp.replace("--", "-"));;
				}
			}	
		};
		sub.addActionListener(subin);
		
		
		Button mul = new Button("*");
		mul.setBounds(250, 300, 50, 30);
		ActionListener mulin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "*";
				display.setText(exp);
				if(exp.contains("**")) {
					display.setText(exp.replace("**", "*"));;
				}
			}	
		};
		mul.addActionListener(mulin);
		
		
		Button div = new Button("/");
		div.setBounds(250, 350, 50, 30);
		ActionListener divin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();	
				exp += "/";
				display.setText(exp);
				if(exp.contains("//")) {
					display.setText(exp.replace("//", "/"));;
				}
			}	
		};
		div.addActionListener(divin);
		
		// Equal operation
		Button equal = new Button("=");
		equal.setBounds(200, 350, 30, 30);
		ActionListener equalin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String exp = display.getText();
				Pattern pattern = Pattern.compile("(\\d+)(\\+|\\-|\\*|/)(\\d+)");
		        Matcher matcher = pattern.matcher(exp);
		        
		        if (matcher.find()) {
		            String firstOperand = matcher.group(1);
		            String operator = matcher.group(2);
		            String secondOperand = matcher.group(3);
		            
		            int firstOp = Integer.parseInt(firstOperand);
		            int secondOp = Integer.parseInt(secondOperand);
		            
		            int result;
					switch(operator) {
		            case "+":
	                    result = firstOp + secondOp;
	                    display.setText(String.valueOf(result));
	                    break;
	                case "-":
	                    result = firstOp - secondOp;
	                    display.setText(String.valueOf(result));
	                    break;
	                case "*":
	                    result = firstOp * secondOp;
	                    display.setText(String.valueOf(result));
	                    break;
	                case "/":
	                   
	                    if (secondOp == 0) {
	                        display.setText((":Undefined"));
	                        return;
	                    }
	                    result = firstOp / secondOp;
	                    display.setText(String.valueOf(result));
	                    break;
		            }
		        }  
			}	
		};
		equal.addActionListener(equalin);
		
		// Clear
		Button clear = new Button("c");
		clear.setBounds(100, 350, 30, 30);
		ActionListener clearin = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");	
			}	
		};
		clear.addActionListener(clearin);
		
		//Window closing
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(display);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(zero);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
		frame.add(equal);
		frame.add(clear);
		
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new calculator();
		
	}

}
