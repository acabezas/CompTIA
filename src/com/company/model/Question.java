package com.company.model;


public class Question {

    private String description;
    private String correctAnswer;

    {
        description = "A technician replaces a failed hard drive with a brand new one. The technician boots from a\n" +
                "PE CD and attempts to install a custom OS build deployed from the network. The hard\n" +
                "drive is visible in the system’s BIOS. However, once in the preinstallation environment, the\n" +
                "drive is not recognized in the imaging process and the process fails. Which of the following\n" +
                "is MOST likely the cause of failure?\n" +
                "A. The boot CD has failed and needs to be replaced.\n" +
                "B. The hard drive needs to have its configuration manually defined in the BIOS.\n" +
                "C. The PC’s power supply is not providing enough power to the new hard drive.\n" +
                "D. The hard drive has not been partitioned correctly.";
        correctAnswer = "D";

    }

    //CONSTRUCTORS

    public Question(String description, String correctAnswer) {
        this.description = description;
        this.correctAnswer = correctAnswer;
    }


    //SETTERS & GETTESRTS
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
