package com.example.quizapp.Models;

public class Questions {
    String thematicAreaName;
    String subjectName;
    String gradeName;
    String option1;
    String option2;
    String option3;
    String option4;
    String question;
    String correctAnswer;

    public Questions(String thematicAreaName, String gradeName, String subjectName, String option1, String option2, String option3, String option4, String question, String correctAnswer) {
        this.thematicAreaName = thematicAreaName;
        this.subjectName = subjectName;
        this.gradeName = gradeName;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getThematicAreaName() {
        return thematicAreaName;
    }

    public void setThematicAreaName(String thematicAreaName) {
        this.thematicAreaName = thematicAreaName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}