package by.htp.les09.view;

import by.htp.les09.entity.Sentence;
import by.htp.les09.entity.Text;
import by.htp.les09.entity.Word;

public class TextView {

	public void printTitle(String name) {
		System.out.println(name);
	}

	public void printText(Text text) {
		for (Sentence symbol : text.getText()) {
			for (Word number : symbol.getSentence()) {
				System.out.print("  " + number.getWord());
			}
			System.out.println(" . ");
		}
	}
}
