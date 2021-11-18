package carracing;

import java.util.List;

public class CarRacing {
    public static void main(String[] args) {
        int cars = InputView.inputCarNumber();
        int round = InputView.inputRound();

        System.out.println("실행 결과");
        Track track = new Track(cars);
        for (int i = 0; i < round; i++) {
            track.forward();
            List<Integer> steps = track.getSteps();
            ResultView.printSteps(steps);
        }
    }
}
