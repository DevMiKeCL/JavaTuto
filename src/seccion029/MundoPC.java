package seccion029;

public class MundoPC {
    public static void main(String []args){
        Monitor m1 = new Monitor("MSi",27.1);
        Monitor m2 = new Monitor("AOC",32.0);
        Teclado t1 = new Teclado("USB", "RAZER");
        Teclado t2 = new Teclado("USB", "Logitech");
        Raton r1 = new Raton("USB", "Belkin");
        Raton r2 = new Raton("USB", "Razer");
        Computadora pc1 = new Computadora("Mike", m1,t1,r1,500000);
        Computadora pc2 = new Computadora("Katherine", m2,t2,r2,800000);

        Orden orden1 = new Orden();
        orden1.agregarPC(pc1);
        orden1.agregarPC(pc2);
        orden1.mostrarOrden();
    }
}
