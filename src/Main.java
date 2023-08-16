import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //お酒の種類を格納
        List<String> alcohol = Arrays.asList("beer","wine","whisky","shochu", "vodka");

        //Streamを生成
        alcohol.stream()

        //'w'で始まるアルコールを抽出（中間操作）
        .filter(s -> s.startsWith("v"))
        //大文字に変換（中間処理）
        .map(s -> s.toUpperCase())
        //変換したのもを出力（終端操作）
        .forEach(s -> System.out.println(s));

    }
}
