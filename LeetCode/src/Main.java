import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static List<String> assignRanks(List<Integer> scores) {
            List<String> edited = new ArrayList<>(Collections.nCopies(scores.size(), ""));
            List<Integer> sortedScores = new ArrayList<>(scores);
            Collections.sort(sortedScores, Collections.reverseOrder());

            for (int i = 0; i < sortedScores.size(); i++) {
                int index = scores.indexOf(sortedScores.get(i));
                if (i == 0) {
                    edited.set(index, "Gold Medal");
                } else if (i == 1) {
                    edited.set(index, "Silver Medal");
                } else if (i == 2) {
                    edited.set(index, "Bronze Medal");
                } else {
                    edited.set(index, String.valueOf(i + 1));
                }
            }
            return edited;
        }




    public static void main(String[] args) {

    }
}