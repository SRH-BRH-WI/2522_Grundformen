public class Main {

    // diese Methode ist im Bezug zum Parameter "polymorph"
    public static void ausgabeFlächeUndUmfang(Grundform form) {
        //System.out.println( form.getRadius() );
        System.out.print( form.getClass().getName() );
        System.out.println("fläche ist " + form.berechneFläche());
        System.out.print( form.getClass().getName() );
        System.out.println("umfang ist " + form.berechneUmfang());
    }

    public static void main(String[] args) {
        Grundform dummy = new Grundform();
        Kreis kreis = new Kreis(7.2);
        Quadrat quadrat = new Quadrat(4.8);

        System.out.println("Radius: " + kreis.getRadius());

        ausgabeFlächeUndUmfang(dummy);
        ausgabeFlächeUndUmfang(kreis);
        ausgabeFlächeUndUmfang(quadrat);
    }
}
