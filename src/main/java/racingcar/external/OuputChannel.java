package racingcar.external;

public class OuputChannel implements Output {
    @Override
    public void out(String s) {
        System.out.println(s);
    }
}
