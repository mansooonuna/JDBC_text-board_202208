package com.mansooonuna.exam.board;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void run() {
        Scanner sc = Container.scanner;
        ArrayList<Article> articles = new ArrayList<>();
        int articleNo = 0;

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("/usr/article/list")) {
                System.out.println("== 게시물 리스트 == ");
                if (articles.isEmpty()) {
                    System.out.println("게시물이 존재하지 않습니다.");
                } else {
                    System.out.println("번호 / 제목");
                    for (int i = 0; i < articles.size(); i++) {
                        System.out.println(articles.get(i).articleNo + "/" + articles.get(i).body);
                    }
                }

            } else if (cmd.equals("/usr/article/write")) {
                System.out.println("== 게시물 등록 ==");
                System.out.print("제목 : ");
                String cmdTitle = sc.nextLine().trim();
                System.out.print("내용 : ");
                String cmdBody = sc.nextLine().trim();
                articleNo++;
                Article article = new Article(articleNo, cmdTitle, cmdBody);
                System.out.println(article);
                System.out.println(articleNo + "번 게시물이 입력되었습니다.");
                articles.add(article);

            } else if (cmd.equals("exit")) {
                System.out.println("== 시스템 종료 ==");
                break;
            }
        }
        sc.close();
    }
}
