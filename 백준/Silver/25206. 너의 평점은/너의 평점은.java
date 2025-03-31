import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        float totalGrade = 0; // (학점 × 과목 평점)의 총합
        float totalCredit = 0; // 학점 총합
        
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken(); // 과목명
            float credit = Float.parseFloat(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급
            
            if (grade.equals("P")) continue; // "P" 과목 제외

            totalCredit += credit; // 학점 합산
            
            // 등급에 따른 평점 계산
            float score = 0;
            if (grade.equals("A+")) score = 4.5f;
            else if (grade.equals("A0")) score = 4.0f;
            else if (grade.equals("B+")) score = 3.5f;
            else if (grade.equals("B0")) score = 3.0f;
            else if (grade.equals("C+")) score = 2.5f;
            else if (grade.equals("C0")) score = 2.0f;
            else if (grade.equals("D+")) score = 1.5f;
            else if (grade.equals("D0")) score = 1.0f;
            else if (grade.equals("F")) score = 0.0f;
            
            totalGrade += credit * score; // (학점 × 과목 평점) 합산
        }
        
        System.out.printf("%.6f", totalGrade / totalCredit);
    }
}
