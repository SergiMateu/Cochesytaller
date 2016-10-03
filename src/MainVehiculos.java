public class MainVehiculos {

    public static void main(String[] args) {

        Coche Jaguar= new Coche (&quot;1234ENG&quot;,&quot;Jaguar&quot;,&quot;TheRoadIsYours&quot;, 200000);

        Coche BMW= new Coche (&quot;9065AME&quot;,&quot;BMW&quot;,&quot;LoveAtFirstDrive&quot;, 60000);

        Coche Lexus= new Coche (&quot;5638DDD&quot;,&quot;Lexus&quot;,&quot;FastAndGlorious&quot;, 120000);

        Coche Austin= new Coche (&quot;3564GER&quot;,&quot;Austin&quot;,&quot;BeLikeBond&quot;, 150000);

        Coche RomeoAlfaJulietta= new Coche (&quot;4749JAV&quot;,&quot;RomeoAlfaJulietta&quot;,&quot;DramaMasterpiece&quot;, 12000);

        RegistroVehiculos registro = new RegistroVehiculos();

        registro.registrarVehiculo(Jaguar);

        registro.registrarVehiculo(BMW);

        registro.registrarVehiculo(Lexus);

        registro.registrarVehiculo(Austin);

        registro.registrarVehiculo(RomeoAlfaJulietta);

// Debes comprobar que el HashSet no permite duplicados

        registro.registrarVehiculo(RomeoAlfaJulietta);

        System.out.println(registro.obtenerTodos());

        registro

                .obtenerVehiculo(&quot;4749JAV&quot;)

.ifPresent(

                coche -&gt; System.out.println(&quot;Coche con matricula 4749JAV: &quot; + coche)

);

        registro

                .obtenerVehiculosMarca(&quot;Lexus&quot;)

// esto es un bucle tradicional expresado con Java 8

.forEach(

                coche -&gt; System.out.println(coche)

);

        registro

                .obtenerVehiculoPrecioMax()

// esta expresión es equivalente a verificar diferente de null con Java 8

                .ifPresent(

                        coche -&gt; System.out.println(&quot;Coche Max precio: &quot; + coche)

);

        System.out.println(&quot;Eliminando coche con matricula 1234ENG&quot;);

        registro

                .eliminarVehiculo(&quot;1234ENG&quot;);

        System.out.println(registro.obtenerTodos());