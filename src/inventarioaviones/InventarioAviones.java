package inventarioaviones;

public class InventarioAviones {

    public static void main(String[] args) {

        Inventario in = new Inventario();
        Comercial av1 = new Comercial(4, 350, "HK345");
        Carga c1 = new Carga(320000, 250, "N7224N");

        System.out.println("Agregando Pera...");
        Paquete p= new Paquete("Pera", 120000.0);
        c1.addPaquete(p);
        
        System.out.println("Agregando Papa...");
        Paquete p2=new Paquete("Papa", 150000.0);
        c1.addPaquete(p2);
        
        System.out.println("Agregando Zanahoria...");
        Paquete p3=new Paquete("Zanahoria", 100000.0);
        c1.addPaquete(p3);
        
        String[] nombres = {"Hannah Abbott", "Bathsheda Babbling",
            "Regulus Arcturus Black", "Fleur Delacour", "Gregory Goyle"};

        String[] ids = {"1EFAA", "AM27363", "US27272", "GBR2828",
            "US35353"};

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Agregando a... " + nombres[i] + "...");
            av1.addPasajero(new Pasajero(nombres[i], ids[i]));

        }
        
        in.addAvion(av1);
        in.addAvion(c1);
        in.listarAviones();
        
    }

}
