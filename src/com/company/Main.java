package com.company;

import com.company.model.Question;
import com.company.model.Test;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello!!!\n" +
                "Welcome to the test");


        Scanner sc = new Scanner(System.in);

        Test one = new Test();
        List<Question> questionList = one.questions;
        int NoQuestion = 0;

        for (Question q: questionList) {
            NoQuestion++;
            System.out.println(q.getDescription());
            System.out.print("Your Answer: ");
            String answer = sc.nextLine();
            if (q.getCorrectAnswer().equalsIgnoreCase(answer)) {
                System.out.println("Correct");
                one.calification+=1;
            }else
                System.out.println("Wrong!");
        }
        System.out.println("Your Score: "+ one.calification + " of "+ NoQuestion);








        /*
        Question one = new Question();
        System.out.println(one.getDescription());
        System.out.println("Answer: ");
        String answer = sc.nextLine();

        if ((one.getCorrectAnswer()).equalsIgnoreCase(answer))
            System.out.println("Correct");
            else
            System.out.println("Wrong!");
        */

    }
}
