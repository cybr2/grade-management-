package com.ydoow.models;

import java.time.LocalDateTime;

import com.ydoow.utilities.DateTimeUtil;

public class GradeRecord {
    private int id;
    private String gradingPeriod;
    private String activityType;
    private double score;
    private double maxScore;
    private double weight;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Section section;
    private Student student;

    public GradeRecord(String gradingPeriod, String activityType, double score, double maxScore, double weight, Section section, Student student){
        this.gradingPeriod = gradingPeriod;
        this.activityType = activityType;
        this.score = score;
        this.maxScore = maxScore;
        this.weight = weight;
        this.section = section;
        this.student = student;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public GradeRecord(int id,String gradingPeriod, String activityType, double score, double maxScore, double weight, Section section, Student student){
        this.id = id;
        this.gradingPeriod = gradingPeriod;
        this.activityType = activityType;
        this.score = score;
        this.maxScore = maxScore;
        this.weight = weight;
        this.section = section; 
        this.student = student;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getGradingPeriod() {
        return gradingPeriod;
    }

    public String getActivityType() {
        return activityType;
    }

    public double getScore() {
        return score;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Section getSection() {
        return section;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGradingPeriod(String gradingPeriod) {
        this.gradingPeriod = gradingPeriod;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void updateGradeScore(double score,double maxScore, double weight){
        this.score = score;
        this.maxScore = maxScore;
        this.weight = weight;
        this.updatedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "GradeRecord{" +
                "id=" + id +
                ", student=" + student.getLastName() + ", " + student.getFirstName() +
                ", section=" + section.getName() +
                ", gradingPeriod='" + gradingPeriod + '\'' +
                ", activityType='" + activityType + '\'' +
                ", score=" + score +
                ", maxScore=" + maxScore +
                ", weight=" + weight +
                ", createdAt='" + DateTimeUtil.format(createdAt) + '\'' +
                ", updatedAt='" + DateTimeUtil.format(updatedAt) + '\'' +
                '}';
    }
  
}
