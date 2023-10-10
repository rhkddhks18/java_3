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
        long lastWise = 0;
        List<Wisesaying> wiseSayings = new ArrayList<>();
        while (true) {
            System.out.print("명령) ");
            String commed = sc.nextLine().trim();

            if (commed.equals("종료")){
                break;
            }
            else if (commed.equals("등록")){
                long id = lastWise + 1;
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();
                Arrays arr[] = new Arrays[0];
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);

                Wisesaying wisesaying = new Wisesaying(id, author, content);
                wiseSayings.add(wisesaying);

                lastWise = id;
            }
            else if (commed.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------");
                for(int i = wiseSayings.size()-1; i >= 0; i--){
                    Wisesaying wisesaying = wiseSayings.get(i);
                    System.out.printf("%d,%s,%s \n", wisesaying.getId(),wisesaying.getAuthor(), wisesaying.getContent());
                }
            }
        }
    }
}
