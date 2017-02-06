package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Videojuego Battlefield =new Videojuego(1, "Battlefield 1", "Electronic Arts", LocalDate.of(2016,6,10),30584252,
                "Shooter", 56.99 , 14, 25587466, " Xbox One , Windows. " );
        Videojuego GTAV =new Videojuego(1, "Grand Theft Auto V", "Rockstar Games", LocalDate.of(2013,9,17),76584150,
                "Shooter", 47.99 , 14, 2065874, " Ps4 , Xbox One , PC. " );
        Videojuego Fifa_2015 =new Videojuego(1, "Fifa 2015", "EA Sports", LocalDate.of(2015,9,8),29584150,
                "Deportes", 57.99 , 14, 2065874, " Ps4 , Xbox One. " );
        Videojuego Thelastofus =new Videojuego(1, "The last of us", "Electronic Arts", LocalDate.of(2014,6,21),40584150,
                "Aventuras", 67.99 , 14, 2, " Ps4 , Xbox One. " );
        Videojuego Callofduty =new Videojuego(1, "Call of duty", "Activision", LocalDate.of(2014,9,12),21584150,
                "Shooter", 45.99 , 14, 2065874, " Ps4 , Xbox One. " );
        Videojuego Mylittlepony =new Videojuego(1, "My little pony", "Electronic Arts", LocalDate.of(2013,9,2),2584150,
                "Simulador", 19.99 , 10, 2, " Nintendo DS " );
        Videojuego MonumentValley =new Videojuego(1, "Monument valley", "Pico Arts", LocalDate.of(2015,1,2),80224150,
                "Puzzle", 3.99 , 12, 1, " Android , IOS " );
        Videojuego lol =new Videojuego(1, "Leage Of Leagens", "Riot Games", LocalDate.of(2013,1,2),80224150,
                "RPG", 0 , 14, 60000000, " Windows, IOS " );
        Videojuego Maple =new Videojuego(1, "Maple Stroy", "Arena Games", LocalDate.of(2011,1,25),11224150,
                "Aventura", 0 , 14, 6000000, " Windows, IOS " );
        Videojuego dota =new Videojuego(1, "Dota 2", "Arena Games", LocalDate.of(2011,10,21),30224150,
                "RPG", 0 , 14, 20145698, " Windows, IOS " );


       List<Videojuego> listavideojuegos = new ArrayList<>();

        listavideojuegos.add(Battlefield);
        listavideojuegos.add(GTAV );
        listavideojuegos.add(Fifa_2015);
        listavideojuegos.add(Thelastofus);
        listavideojuegos.add(Callofduty);
        listavideojuegos.add(Mylittlepony);
        listavideojuegos.add(MonumentValley);
        listavideojuegos.add(lol);
        listavideojuegos.add(Maple);
        listavideojuegos.add(dota);

        System.out.println("##### Top 5 ventas videojuegos #####");
        System.out.println();

        listavideojuegos.sort(Comparator.comparing(Videojuego::getN_ventas).reversed());

        listavideojuegos.subList(0,5).stream().map(Videojuego::getNombre).forEach(System.out::println);

        System.out.println();
        System.out.println("##### Videojuegos que se han lanzado entre 2014 y 2016 #####");
        System.out.println();


        for (Videojuego v: listavideojuegos){

            if (v.getFecha_lanzamiento().isBefore(LocalDate.of(2016,1,1)) && v.getFecha_lanzamiento().isAfter(LocalDate.of(2014,1,1))){

                System.out.println(v.getNombre());
            }
        }

        System.out.println();
        System.out.println("##### Videojuegos que se han lanzado entre 2014 y 2016  y desarrolado por EA Sports y ventas superiores a 20 millones#####");
        System.out.println();

        for (Videojuego v: listavideojuegos){

            if (v.getFecha_lanzamiento().isBefore(LocalDate.of(2016,1,1)) && v.getFecha_lanzamiento().isAfter(LocalDate.of(2014,1,1))){
                if (v.getCompañia().equalsIgnoreCase("EA Sports") && v.getN_ventas() >= 20000000)

                System.out.println(v.getNombre());
            }
        }

        System.out.println();
            System.out.println("##### Videojuegos para Ps4 y su precio este entre 40 y 60 Euros #####");
        System.out.println();

        for (Videojuego v: listavideojuegos){

            if (v.getPlataforma().contains("Ps4")){
                if (v.getPrecio()>= 40.00 && v.getPrecio() <=60.00)

                    System.out.println(v.getNombre());
            }
        }




    }
}