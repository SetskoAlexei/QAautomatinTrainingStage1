package thereads;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Port extends Runner {
    private List<Ships> ships;
    static private int portCapacity = 0;
    private int maxPortCapacity = 1000;


    public void uploadDockCargo(){
        for (int numberShip = 0; numberShip < ships.size (); numberShip++){
            if (ships.get (numberShip).getShipTarget().equals (ShipTarget.UPLOAD)  ){
                if (portCapacity + ships.get (numberShip).getCapacity () < maxPortCapacity){
                    try {
                        TimeUnit.MILLISECONDS.sleep (ships.get (numberShip).getCapacity ());
                        portCapacity += ships.get (numberShip).getCapacity ();
                        System.out.println ("контейнеры выгружены в порт с коробля " + ships.get (numberShip).getName () + " текущая загруженность порта " + portCapacity);

                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
                else {
                    try {
                        numberShip--;
                        System.out.println ("разгрузка невозможна, порт заполнен, ожидайте");
                        TimeUnit.MILLISECONDS.sleep (300);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        }
    }
    public void downloadDockCargo()  {
        for (int numberShip = 0; numberShip < ships.size (); numberShip++) {
            if (ships.get (numberShip).getShipTarget ().equals (ShipTarget.DOWNLOAD)) {
                if (portCapacity >= ships.get (numberShip).getCapacity ()){
                    try {
                        TimeUnit.MILLISECONDS.sleep (ships.get (numberShip).getCapacity ());
                        portCapacity -= ships.get (numberShip).getCapacity ();
                        System.out.println ("контейнеры отгружены на " + ships.get (numberShip).getName () + " текущая загруженность порта" + portCapacity);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
                else {
                    try {
                        numberShip--;
                        System.out.println ("в порту недостаточно груза, ожидайте");
                        TimeUnit.MILLISECONDS.sleep (300);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        }
    }
    public Port(List<Ships> ships) {
        this.ships = ships;
    }
}