package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String star = JOptionPane.showInputDialog("WHAT IS YOUR STAR SIGN?");
		if (star.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null, "Aries is full of life and possesses high energy");
		} else if (star.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null,
					"Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical");
		} else if (star.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null, "The Gemini symbol is that of a pair of twins");
		} else if (star.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null,
					" The typical cancer person is all about home and family and is very dedicated and loyal to friends and family");
		} else if (star.equalsIgnoreCase("leo")) {
			JOptionPane.showMessageDialog(null,
					"the best characteristics of the leo; proud, regal, relaxed, and in charge.");
		} else if (star.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null,
					"Virgo people are mild mannered on the surface, but underneath there is a flurry of activity");
		} else if (star.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null,
					"Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign");
		} else if (star.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null,
					"The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative");
		} else if (star.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"Sagittarians crave the freedom of the open road, both metaphorically and physically");
		} else if (star.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Capricorn people are the type that are goal oriented and driven to succeed despite all odds");
		} else if (star.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Aquarians are often generous with their time and resources");
		} else if (star.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null,
					"Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselve");
		}
	}
}