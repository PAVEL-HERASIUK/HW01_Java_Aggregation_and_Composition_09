package by.htp.les09.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	// 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы:
	//    дополнить текст, вывести на консоль текст, заголовок текста.

	private List<Word> sentence;

	public Sentence() {
		this.sentence = new ArrayList<Word>();
	}

	public Sentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public Sentence(Word... word) {
		this.sentence = new ArrayList<Word>();
		for (Word symbols : word) {
			sentence.add(symbols);
		}
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public Word getSentence(int index) {
		return sentence.get(index);
	}

	public void setSentence(Word word) {
		this.sentence.add(word);
	}

	public void setSentence(int index, Word word) {
		this.sentence.add(index, word);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}
}