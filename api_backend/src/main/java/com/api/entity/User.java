package com.api.entity;

import java.util.Map;

public class User {
	private int totalSolved;
	private int totalQuestions;
	private int easySolved;
	private int totalEasy;
	private int mediumSolved;
	private int totalMedium;
	private int hardSolved;
	private int totalHard;
	private double acceptanceRate;
	private int ranking;
	private int contributionPoints;
	private int reputation;
	private Map<String,Integer> submissionCalendar;
	
	public User() {
		
	}
	
	public User(String status,String message,int totalSolved, int totalQuestions, int easySolved, int totalEasy, int mediumSolved, int totalMedium,
			int hardSolved, int totalHard, double acceptanceRate, int ranking, int contributionPoints, int reputation,
			Map<String, Integer> submissionCalendar) {
		super();
		this.totalSolved = totalSolved;
		this.totalQuestions = totalQuestions;
		this.easySolved = easySolved;
		this.totalEasy = totalEasy;
		this.mediumSolved = mediumSolved;
		this.totalMedium = totalMedium;
		this.hardSolved = hardSolved;
		this.totalHard = totalHard;
		this.acceptanceRate = acceptanceRate;
		this.ranking = ranking;
		this.contributionPoints = contributionPoints;
		this.reputation = reputation;
		this.submissionCalendar = submissionCalendar;
	}
	
//	public User(Object obj) {
//		super();
//		this.totalSolved = totalSolved;
//		this.totalQuestions = totalQuestions;
//		this.easySolved = easySolved;
//		this.totalEasy = totalEasy;
//		this.mediumSolved = mediumSolved;
//		this.totalMedium = totalMedium;
//		this.hardSolved = hardSolved;
//		this.totalHard = totalHard;
//		this.acceptanceRate = acceptanceRate;
//		this.ranking = ranking;
//		this.contributionPoints = contributionPoints;
//		this.reputation = reputation;
//		this.submissionCalendar = submissionCalendar
//	}

	public int getTotalSolved() {
		return totalSolved;
	}

	public void setTotalSolved(int totalSolved) {
		this.totalSolved = totalSolved;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public int getEasySolved() {
		return easySolved;
	}

	public void setEasySolved(int easySolved) {
		this.easySolved = easySolved;
	}

	public int getTotalEasy() {
		return totalEasy;
	}

	public void setTotalEasy(int totalEasy) {
		this.totalEasy = totalEasy;
	}

	public int getMediumSolved() {
		return mediumSolved;
	}

	public void setMediumSolved(int mediumSolved) {
		this.mediumSolved = mediumSolved;
	}

	public int getTotalMedium() {
		return totalMedium;
	}

	public void setTotalMedium(int totalMedium) {
		this.totalMedium = totalMedium;
	}

	public int getHardSolved() {
		return hardSolved;
	}

	public void setHardSolved(int hardSolved) {
		this.hardSolved = hardSolved;
	}

	public int getTotalHard() {
		return totalHard;
	}

	public void setTotalHard(int totalHard) {
		this.totalHard = totalHard;
	}

	public double getAcceptanceRate() {
		return acceptanceRate;
	}

	public void setAcceptanceRate(double acceptanceRate) {
		this.acceptanceRate = acceptanceRate;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getContributionPoints() {
		return contributionPoints;
	}

	public void setContributionPoints(int contributionPoints) {
		this.contributionPoints = contributionPoints;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public Map<String, Integer> getSubmissionCalendar() {
		return submissionCalendar;
	}

	public void setSubmissionCalendar(Map<String, Integer> submissionCalendar) {
		this.submissionCalendar = submissionCalendar;
	}
	
	
	
	

}
