package org.binarySearch.dfsbfs.boj2667;

import java.util.*;
import java.io.*;

public class Main{
    // variables made with
    static int N;
    static int cx, cy;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "\n");

        int N = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());

            }
        }

        // bfs 객체 내부의 bfs 메소드 사용
        // 첫 좌표 (0, 0) 좌표 입력
        bfs(0, 0);
    }

    public static void bfs(int x, int y){
        Queue<Node> q = new ArrayDeque<>();
        visited[x][y] = true;
    }

    static boolean rangeCheck(){
        return cx >= 0 && cy >= 0 && cx < M && cy < N;
    }
}
