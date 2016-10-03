public class MainTaller {

    public static void main(String[] args) {

        Persona jose = new Persona(&quot;39425364H&quot;, &quot;111111111&quot;, &quot;Jose&quot;, &quot;Tomás&quot;, 35, 45000.00);

        Persona maria = new Persona(&quot;39425654W&quot;, &quot;33333333&quot;, &quot;Maria&quot;, &quot;Gallego&quot;, 55, 61300.20);

        Persona carlos = new Persona(&quot;39425355Q&quot;, &quot;22222222&quot;, &quot;Carlos&quot;, &quot;Torres&quot;, 22, 23000.00);

        Persona anna = new Persona(&quot;39425987J&quot;, &quot;444444444&quot;, &quot;Anna&quot;, &quot;Pina&quot;, 26, 17654.88);

        Coche Jaguar= new Coche (&quot;1234ENG&quot;,&quot;Jaguar&quot;,&quot;TheRoadIsYours&quot;, 200000);

        Coche BMW= new Coche (&quot;9065AME&quot;,&quot;BMW&quot;,&quot;LoveAtFirstDrive&quot;, 60000);

        Coche Lexus= new Coche (&quot;5638DDD&quot;,&quot;Lexus&quot;,&quot;FastAndGlorious&quot;, 120000);

        Coche Austin= new Coche (&quot;3564GER&quot;,&quot;Austin&quot;,&quot;BeLikeBond&quot;, 150000);

        Taller taller = new Taller();

        taller.registrarReparacion(jose, Jaguar);

        taller.registrarReparacion(maria, BMW);

        taller.registrarReparacion(carlos, Lexus);

        taller.registrarReparacion(anna, Austin);

        System.out.println(taller.obtenerCoche(jose));

// debes comprobar que las personas aparecen ordenadas según el criterio especificado en el comparador

// que se pasa al constructor del TreeMap

        System.out.println(taller.obtenerClientes());

    }