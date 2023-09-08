import java.util.List;

public class Taxi {
    static int taxiCount=0;
    int id;
    String position;
    int freeTime; 
    int earning;

    Taxi(){
        this.id = taxiCount++;
        this.position = "A";
        this.freeTime = 6;
        this.earning = 0;
    }

    public void display(List<Taxi> tx)
   {
        System.out.println("********************************************************************");
        System.out.println("TAXI ID   POSITION    FREE TIME   EARNING\n");
        System.out.println("********************************************************************");
        for(int i=0;i<tx.size();i++)
        {
            System.out.println(tx.get(i).id+"   "+tx.get(i).position+"   "+tx.get(i).freeTime+"   "+tx.get(i).earning);
        }
        System.out.println("********************************************************************");
   }

}
