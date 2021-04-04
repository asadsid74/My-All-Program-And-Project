package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int A_id;
	private String Ans;
	@ManyToOne
	private Question quid;

	public void setA_id(int a_id) {
		A_id = a_id;
	}

	public int getA_id() {
		return A_id;
	}

	public String getAns() {
		return Ans;
	}

	public void setAns(String ans) {
		Ans = ans;
	}

	public Question getQuid() {
		return quid;
	}

	public void setQuid(Question quid) {
		this.quid = quid;
	}

	@Override
	public String toString() {
		return "Answer [A_id=" + A_id + ", Ans=" + Ans + ", quid=" + quid + "]";
	}

}
