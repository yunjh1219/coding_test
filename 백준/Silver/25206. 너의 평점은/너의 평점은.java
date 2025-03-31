import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name[] = new String[20];
        float hakjum[] = new float[20];
        String jumsu[] = new String[20];
        
        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            name[i] = st.nextToken(); //각 과목명 
            hakjum[i] = Float.parseFloat(st.nextToken()); //각 과목 학점
            jumsu[i] = st.nextToken(); // 각 강의 점수      
        }
        
        float grade = 0; //강의 점수
        float sum = 0; //학점 총합
        
        //학점의 총합
        for(int i=0; i<20; i++){
            if(!jumsu[i].equals("P")){
                 sum += hakjum[i];
            }
        }
        
        // (학점*과목평점)의 합을 구함
        for(int i=0; i<20; i++){
            
            if (jumsu[i].equals("P")) continue; // "P" 과목은 제외  (✅ 추가해야 함)
            
            if(jumsu[i].equals("A+")){grade += hakjum[i]*4.5;}
            else if(jumsu[i].equals("A0")){grade += hakjum[i]*4;}
            else if(jumsu[i].equals("B+")){grade += hakjum[i]*3.5;}
            else if(jumsu[i].equals("B0")){grade += hakjum[i]*3;}
            else if(jumsu[i].equals("C+")){grade += hakjum[i]*2.5;} 
            else if(jumsu[i].equals("C0")){grade += hakjum[i]*2;}
            else if(jumsu[i].equals("D+")){grade += hakjum[i]*1.5;}
            else if(jumsu[i].equals("D0")){grade += hakjum[i]*1.0;}
            else if(jumsu[i].equals("F")){grade += hakjum[i]*0;}
        }
        // 전공평점 계산 후 소수점 4자리까지 출력
        float result = grade / sum;
        System.out.printf("%.4f\n", result);
    }
}