package lesson4.src.example2;

public class DemoVoteBox {
    public static void main(String[] args) {
        VoteBox bulletin = new VoteBox();
        bulletin.add("YesName");
        bulletin.add("ggggg");
        bulletin.toString();
        bulletin.clear();
        bulletin.toString();
        bulletin.add("volandemord");
        bulletin.toString();

    }
}
