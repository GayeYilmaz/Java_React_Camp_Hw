public class Main {

    public static void main(String[] args) {
        Player  gaye= new Player(1,"Gaye","Yılmas",1998,"122334");
        Verification verification = new EdevletVerification();
        PlayerManagement playerManagement = new PlayerManagement(verification);
        playerManagement.add(gaye);
	// write your code here

    }
}
