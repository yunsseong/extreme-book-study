package chapter15.dice_game;

public class DiceGameV1 {
    public void play() {
        SixFaceDice sixFaceDice = new SixFaceDice();
        int rollResult = sixFaceDice.roll();
        System.out.println("주사위 숫자는 " + rollResult + "입니다.");
        if (rollResult > 3) {
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("당신이 졌습니다.");
        }
    }
}
