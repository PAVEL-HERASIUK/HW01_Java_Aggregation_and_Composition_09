package by.htp.les09.main;

import by.htp.les09.entity.Sentence;
import by.htp.les09.entity.Text;
import by.htp.les09.entity.Word;
import by.htp.les09.view.TextView;

public class Main {

	public static void main(String[] args, TextView see) {

		Sentence sentenceOne = new Sentence(new Word(" I "), new Word(" lean "), new Word(" java "));
		Sentence sentenceTwy = new Sentence(new Word(" End "), new Word(" of "), new Word(" Course "),
				new Word(" Soon "));
		Text text = new Text(" A Complete Guide to Java: Herbert Schildt ", sentenceOne, sentenceTwy);

		sentenceOne.setSentence(3, new Word(" C++ "));

		TextView view = new TextView();
		see.printTitle(text.getTitle());
		see.printText(text);
	}
}
