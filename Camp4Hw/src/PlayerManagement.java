/**
 * @author gaye3
 * @since 7.05.2021
 */
public class PlayerManagement extends Player{
    private Verification verification ;

    public PlayerManagement(Verification verification){

        this.verification = verification;
    }

    public void add(Player player){
        System.out.println("Player who has "+player.getId() +" id added.");


    }
    public void update(Player player){
        System.out.println("Player who has "+player.getId()+" id updated");
    }
    public void delete(int id){
        System.out.println("Palyer who has "+id+" id deleted");
    }
}
