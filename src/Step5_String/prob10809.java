package Step5_String;

import java.util.*;

/*
소문자 알파벳 a부터 z가 있다.
소문자 알파벳으로만 입력받은 문자열 str가 있다.

문자열 str에 해당 알파벳이 포함되어 있지 않다면 -1,
포함되어 있다면 해당 알파벳이 문자열에서 처음 등장하는 위치를 출력한다.

단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
*/

public class prob10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int arr[] = new int[26];   // 소문자 알파벳의 위치를 가리킬 배열이다 (소문자 알파벳은 총 26개)
                                   // arr[0]은 a를, arr[1]은 b를 ~ arr[25]는 z를 의미한다.
        for (int i=0; i<26; i++){  // 각 문자들의 위치를 맨 처음 -1로 초기화 시킨다.
            arr[i] = -1;           // 단어의 첫 번째 글자는 0번째 위치이기 때문에, i=0부터 그대로 시작하면 된다.
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);  //단어의 첫 번째 글자는 0이기에, i=0 을 그대로 대입하면 된다.
            if(arr[ch - 'a'] == -1){  // ch - 'a' 는 문자열 str의 i번째 문자를 숫자로 변환하는 것이다.  ( a - 'a' = 0 / b - 'a' = 1 / c - 'a' = 2 가 된다. )
                arr[ch - 'a'] = i;    // arr [ch - 'a']는 문자열 str의 i번째에 위치해 있다고 저장하는 것이다.
            }                         // 예를 들어 'str이 baekjoon'이라고 한다면, [ i=0 -> 'str의 0번째엔 b가 있다' ] 라는 것이다.
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
