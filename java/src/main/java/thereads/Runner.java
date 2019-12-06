package thereads;


import java.util.Arrays;
import java.util.List;

public class Runner {
    static Thread download;
    static Thread upload;
    static List<Ships> ships = Arrays.asList (
            new Ships ("Kutuzov", 430, ShipTarget.UPLOAD),
            new Ships ("King of Sea", 400, ShipTarget.DOWNLOAD),
            new Ships ("Alexandr", 580, ShipTarget.UPLOAD),
            new Ships ("Victory", 350, ShipTarget.UPLOAD),
            new Ships ("Lucky", 420, ShipTarget.DOWNLOAD),
            new Ships ("Vicing", 450, ShipTarget.DOWNLOAD)
    );

    public static void main(String[] args)  {

        Port port = new Port (ships);
        download = new Thread (() -> port.uploadDockCargo ());
        upload = new Thread (() -> port.downloadDockCargo ());
        download.start ();
        upload.start ();
    }
}
