package com.mansooonuna.exam.board;

import java.util.Scanner;

/**
 공공재를 담아두는 곳
 처음에 한 번만 실행되게끔 - 메모리 점유도 낮춤
 */

public class Container {
    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }
}
