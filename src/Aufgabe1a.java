
/*public class Aufgabe1a {
public static void main(String[] args) {
int a = 7;															// A. Korrekt B. Nicht Korrekt C.Nicht Korrekt D.Nicht Korrekt
int b = 3;															// E. Korrekt F. Nicht Korrekt
magic(a, b);
System.out.println("a = " + a + "; b = " + b);
}
public static void magic(int a, int b) {
if (a > b) {
int tmp = a;
a = b;
b = tmp;
return;
}
}
}*/

/*public class Aufgabe1a {										// A. Nicht Korrekt B.Korrekt C.Falsch D. Nicht Korrekt (wenn Arrays zu groﬂ sind)
	public static void main(String[] args) {					// E. Nicht Korrekt F. Korrekt
		int[] a = { -100, -4 };
		magic(a);
		System.out.println("a[0] = " + a[0] + "; a[1] = " + a[1]);
	}

	public static void magic(int[] a) {
		a[0] = a[1] - a[0];
		a[1] = a[1] - a[0];
		a[0] = a[1] + a[0];
	}
}
*/

/*public class Aufgabe1a {											// A. Korrekt B. Nicht Korrekt C. Nicht Korrekt D. Korrekt
	public static void main(String[] args) {						// E. Nicht Korrekt F. Korrekt
		int[] a = { 7, 3, 5, 8, 2 };
		magic(a);
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				System.out.print(a[i] + ", ");
				continue;
			}
			System.out.println(a[i]);
		}
	}

	public static int[] magic(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			a[i] = 2 * b[i];
		}
		return b;
	}
}
*/

/*public class Aufgabe1a {										// A. Nicht Korrekt B. Nicht Korrekt C. Korrekt D. Nicht Korrekt 
	public static void main(String[] args) {					// E. Nicht Korrekt F. Korrekt
		int a = 3;
		int[] b = { 7, 3, 5 };
		b = magic(a, b);
		for (int i : b) {
			System.out.print(i + ", ");
		}
	}

	public static int[] magic(int a, int[] b) {
		int[] c = new int[a * b.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = b[i % a];
		}
		return c;
	}
}
*/

/*public class Aufgabe1a {											// A. Nicht Korrekt B. Nicht Korrekt C. Nicht Korrekt D. Korrekt
	public static void main(String[] args) {						// E. Korrekt F. Nicht Korrekt
		int a = 123;
		System.out.println(magic2(magic1(a)));
	}

	public static int[] magic1(int a) {
		int[] b = new int[a + "".length()];
		int i = 0;
		while (a > 0) {
			b[i++] = a % 10;
			a /= 10;
		}
		return b;
	}

	public static int magic2(int[] b) {
		int a = 0;
		for (int i = 0; i < b.length; i++) {
			a += b[i];
		}
		return a;
	}
} */

/*public class Aufgabe1a {
	public static void main(String[] args) {
		int anzahlFluege = Integer.parseInt(args[0]);

		
		int ueberbuchungen = 0;
		
		double mittelwert;
		double prozent;
		int gesamtErscheinen = 0;
		
		for (int j = 0; j < anzahlFluege; j++) {
			int erscheinen = 0;
			for (int i = 1; i <= 78; i++) {

				double f = Math.random();
				if (f <= 0.92) {
					erscheinen++;

				}

			}
			if (erscheinen > 75) {
				ueberbuchungen++;
			}
			gesamtErscheinen += erscheinen;
		}
		

		mittelwert = Double.valueOf (gesamtErscheinen) / anzahlFluege;
		prozent = (ueberbuchungen * 100) / anzahlFluege;
		
		prozent = prozent * 100 ;
		prozent = (int) prozent ;
		prozent = (double) prozent /100 ;
		
		System.out.println("java FlugSimulator " + anzahlFluege);
		System.out.println("Ueberbuchungen: " + ueberbuchungen + "(" + prozent + "%)");
		System.out.println("Mittelwert: " + mittelwert);
		System.out.println(gesamtErscheinen);
	}

}
*/

/*import javax.swing.JOptionPane;

public class Aufgabe1a {
        public static void main (String [] args){
        var istVokal = false;
        var eingabe = JOptionPane.showInputDialog(  
                                          "Geben Sie einen Buchstaben ein: ");
        var c = eingabe.charAt(0);
        if (c =='a') {
               istVokal = true;
        }else{
           if (c=='i') {
                    istVokal = true;      
        }else{
           if (c=='e') {
                    istVokal = true;
        }else{
           if (c=='o') {
                    istVokal = true;
        }else{
           if (c=='u') {
                    istVokal = true;
        }else{ 
            istVokal = false;
            
            }
           }   
          }   
         }    
        }
       
       if (istVokal) {
                JOptionPane.showMessageDialog (null, c + " ist ein Vokal!");
       }else{JOptionPane.showMessageDialog( null, c + " ist kein Vokal!");        
       
       }
       }
       } */

/*import javax.swing.JOptionPane;

public class Aufgabe1a {
	public static void main(String[] args) {

		var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein.");

		var zahl = Double.parseDouble(eingabe);

		if (zahl >= 0) {
			JOptionPane.showMessageDialog(null, "Die Zahl ist nicht negativ!");
		} else {
			JOptionPane.showMessageDialog(null, "Die Zahl ist negativ!");
		}
	}

} */

/*import javax.swing.JOptionPane;

public class Aufgabe1a {
	public static void main(String[] args) {

		double diskriminanteD;

		var zahla = JOptionPane.showInputDialog("Geben Sie die Variable a ein.");
		var zahlb = JOptionPane.showInputDialog("Geben Sie die Variable b ein.");
		var zahlc = JOptionPane.showInputDialog("Geben Sie die Variable c ein.");

		var a = Double.parseDouble(zahla);
		var b = Double.parseDouble(zahlb);
		var c = Double.parseDouble(zahlc);

		diskriminanteD = b * b - 4 * a * c;

		if (diskriminanteD == 0) {
			JOptionPane.showMessageDialog(null, "Die Gleichung ax\u00b2 + bx + c= 0 hat eine L\u00f6sung");
		} else {
			if (diskriminanteD > 0) {
				JOptionPane.showMessageDialog(null, "Die Gleichung ax\u00b2 + bx + c = 0 hat zwei L\u00f6sungen");
			} else {
				JOptionPane.showMessageDialog(null, "Die Gleichung ax\u00b2 + bx + c = 0 hat keine L\u00f6sung.");
			}
		}
	}
} */

/*import javax.swing.JOptionPane;

public class Aufgabe1a {
	public static void main(String[] args) {

		boolean Schaltjahr;
		
		do {
			var eingabe = JOptionPane.showInputDialog("Geben Sie eine Jahreszahl ein.");

			var jahreszahl = Integer.parseInt(eingabe);
			
			Schaltjahr = (jahreszahl%4 == 0 ) && (jahreszahl % 100 != 0);
			Schaltjahr = Schaltjahr || (jahreszahl % 400 == 0);

			
			if (Schaltjahr ) {
				JOptionPane.showMessageDialog(null, "Das Jahr " + eingabe + " ist ein Schaltjahr!");

			} else {
				JOptionPane.showMessageDialog(null, "Das Jahr " + eingabe + " ist kein Schaltjahr!");
			}
		} while (!Schaltjahr );

	}
} */

/*public class Aufgabe1a {
	public static void main (String []args) {
		
		boolean Schaltjahr;
		
		Schaltjahr = true;
		Schaltjahr = false;
		
		System.out.println(Schaltjahr);
	}
}*/

/* import javax.swing.JOptionPane;

public class Aufgabe1a {
	public static void main(String[] args) {

		var c = 6;
		int temp;
		do {
			var eingabe = JOptionPane.showInputDialog("Errate eine ganze Zahl zwischen 0 und 10!");

			var zahl = Integer.parseInt(eingabe);

			switch (zahl) {

			case 6:
				JOptionPane.showMessageDialog(null, "Treffer!");
				break;
			case 4, 5, 7, 8:
				JOptionPane.showMessageDialog(null, "Knapp daneben!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Daneben!");
			}
			temp = zahl;
		} while (temp != 6);

	}
}
*/

/* public class Aufgabe1a{
	public static void main (String[]args) {
		var zahl = 0;
		var ausgabe = "";
		
		do {
			ausgabe = ausgabe + zahl;
			System.out.println(ausgabe);
			zahl++;
		}while(zahl < 10);
	}
} */
/* public class Aufgabe1a {
	public static void main(String[] args) {

		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		while (m != n) {
			if (m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
		}
		System.out.println(m);
	}
} */

/*import javax.swing.JOptionPane;

public class Aufgabe1a {
		public static void main (String []args) {
			
			double G1 = 0;
			int zahl = 0;
			int zahl2 = 1;
			
			var Guthaben = JOptionPane.showInputDialog("Geben Sie ihr Guthaben ein.");
			var G0 = Double.parseDouble(Guthaben);
			
			var Zinssatz = JOptionPane.showInputDialog("Geben Sie den Zinssatz ein.");
			var z = Double.parseDouble(Zinssatz);
			
			
			
			while (zahl < 10) {
				G1 = G0 * (1 + z /100);
				G0 = G1;
				
				JOptionPane.showMessageDialog(null,zahl2 + " Jahr: " + G1);
				zahl2++;
				zahl++;
			}
		
			
			
		}
}
*/

import javax.swing.JOptionPane;

public class Aufgabe1a {
	public static void main(String[] args) {

		int maximum = 0;
		int anzahl = 0;
		int y = 0;
		var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein.");
		var x = Integer.parseInt(eingabe);
		
		System.out.println(x);
		
			while (x != 1) {
			
				
				switch (x % 2) {
				
				case 0:
					y = x / 2;
					System.out.println(y );
					
					if(maximum < x) {
						maximum = x;
					}
					x = y;
					anzahl++;
					break;
				
				case 1:
					y = 3 * x + 1;
					System.out.println(y);
					x = y;
					
					if(maximum < y) {
						maximum = y;
					}
					anzahl++;
					break;
				
				}
			} 
			System.out.println("L\u00e4nge der Folge: " + anzahl + "\n" + "Maximum: " + maximum);

	}
}
