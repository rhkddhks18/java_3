package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }
    public  void run() {
        System.out.println("== 명언 앱 ==");
        long lastWise = 1;
        List<Wisesaying> wiseSayings = new ArrayList<>();
        while (true) {
            System.out.print("명령) ");
            String commed = sc.nextLine().trim();

            if (commed.equals("종료")){
                break;
            }
            else if (commed.equals("등록")){
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();
                Arrays arr[] = new Arrays[0];
                System.out.printf("%d번 명언이 등록되었습니다.", lastWise);

                Wisesaying wisesaying = new Wisesaying(lastWise, author, content);
                wiseSayings.add(wisesaying);

                lastWise++;
            }
            else if (commed.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------");
                System.out.println();
            }
        }
    }
}
