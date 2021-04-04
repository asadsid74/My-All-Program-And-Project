package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Q_id;
	private String QuestionTYpe;
	//here mapped by is use for decrease 3rd table
	@OneToMany(mappedBy = "quid")
	private List<Answer> answers;

	public int getQ_id() {
		return Q_id;
	}

	public void setQ_id(int q_id) {
		Q_id = q_id;
	}

	public String getQuestionTYpe() {
		return QuestionTYpe;
	}

	public void setQuestionTYpe(String questionTYpe) {
		QuestionTYpe = questionTYpe;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	@Override
	public String toString() {
		return "Question [Q_id=" + Q_id + ", QuestionTYpe=" + QuestionTYpe + ", answers=" + answers + "]";
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}