import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Player> players = buildPlayersList();
        Player playerMaxpoint = getPlayerMaxPoints(players);
        System.out.println("Mejor jugador  " + playerMaxpoint);

        double averageScore = getAverageScore(players);
        System.out.println("Mediana de canastas de todos jugadores  " + averageScore);

        OptionalDouble provaScore = players.stream()// versio mas corta de calcular mediana
                .mapToInt(Player::getPlayerScore)
                .average();
        System.out.println("prova Score" + provaScore);

        List<Player> listOfTopFive = getTopFive(players);
        System.out.println("Top 5 mejores jugadores " + listOfTopFive);
        System.out.println("");

        List<Player> listNameTeam = getTeamOrdinate(players);
        System.out.println("Jugadores ordenados por el nombre de equipo" + listNameTeam);
        System.out.println("");

        //media de eauipo concreto
        String teamName = "Zenit";
        double avg = calculateAvgPointsByTeam(players, "Zenit");
        System.out.println("AVG de los puntos de los jugadores del equipo " + teamName + " es " + avg);

    }

    private static List<Player> getTeamOrdinate(List<Player> players) {
        return players.stream()
                .sorted(Comparator.comparing(Player::getTeamName))
                .collect(Collectors.toList());
    }

    private static List<Player> getTopFive(List<Player> players) {
        return players.stream()
                .sorted(Comparator.comparing(Player::getPlayerScore).reversed())// sravnivaem iz array Player c atributom
                // PlayerScore i perevorachivaem spisok
                .limit(5)//escojer 5 de la lista invertida de mas a menos
                .collect(Collectors.toList());//mojno coroche toList()
    }


    private static double getAverageScore(List<Player> players) {
        double score = 0;
        int leng = players.size();
        for (int i = 0; i < players.size(); i++) {
            score = score + players.get(i).getPlayerScore();
        }
        return (score = score / players.size());

    }

    private static List<Player> buildPlayersList() {
        List<Player> players = new ArrayList<>();// array create
        Player Ron = new Player("Ron", "123", 200,
                "12.01.91", 10000, 200, 60, "Zenit");
        Player Harry = new Player("Harry", "456", 231, "13.02.92",
                7000, 500, 80, "UNICS");
        Player Don = new Player("Don", "789", 205, "14.03.93",
                7000, 300, 90, "UNICS");
        Player Sam = new Player("Sam", "987", 206, "15.04.94",
                1000, 400, 78, "Barca");
        Player Pol = new Player("Pol", "654", 207, "16.05.93",
                2000, 200, 51, "UNICS");
        Player Max = new Player("Max", "321", 208, "17.05.92",
                3000, 700, 100, "Zenit");
        Player Lex = new Player("Lex", "111", 209, "18.06.91",
                4000, 300, 35, "UNICS");
        Player Tom = new Player("Tom", "222", 210, "19.07.90",
                5000, 400, 60, "Barca");
        Player John = new Player("John", "333", 220, "20.08.91",
                7000, 800, 70, "Barca");
        Player Ivan = new Player("Ivan", "444", 215, "21.09.90",
                8000, 1000, 90, "Zenit");
        players.add(Ron);// eto budut yacheiki s dannimi
        players.add(Harry);
        players.add(Don);
        players.add(Sam);
        players.add(Pol);
        players.add(Max);
        players.add(Lex);
        players.add(Tom);
        players.add(John);
        players.add(Ivan);

        return players;


    }

    private static Player getPlayerMaxPoints(List<Player> players) {

        Player playerMaxPoint = players.get(0);// sravnivaem s etim pervim i esli u nego menshe, to zapisivaem ego
        for (int i = 0; i < players.size(); i++) {
            Player currentPlayer = players.get(i);
            if (currentPlayer.getPlayerScore() > playerMaxPoint.getPlayerScore()) {
                playerMaxPoint = currentPlayer;
            }

//        for (Player currentPlayer : players) {
//            if (currentPlayer.getPlayerScore() > playerMaxPoint.getPlayerScore()) {
//                playerMaxPoint = currentPlayer;
//            }
        }
        return playerMaxPoint;
    }

    private static double calculateAvgPointsByTeam(List<Player> players, String teamName) {
        //1.creo un ArrayList auxiliar vacio
        List<Player> playersFromTeam = new ArrayList<>();


//        for(int i=0; i< playerFromTeam.size; i++() {// tradicional bucle
//            Player currentPlayer = playerFromTeam.get(i);
//        }
        //2agrupar jugadores de un equipo en particular en Arraylist aux

        for (Player currentPlayer : players) {//for each bucle de manera corta de for zapolniaem
            if (currentPlayer.getTeamName().equalsIgnoreCase(teamName)) {
                playersFromTeam.add(currentPlayer);
            }
        }//vamos tener todos los jugadores del mismo equipo

        //3. calcular AVG d puntos  de los jugadores del ArrayList aux(mataro por ex, imia budem vvodit pozje )

        double totalPoints = 0;//vvodim peremennuu dlia podscheta
        for (Player currentPlayer : playersFromTeam) {//for-each vibiraem iz novogo massiva
            totalPoints += currentPlayer.getPlayerScore();
        }
        double avg = totalPoints / playersFromTeam.size();//media, razmerom etogo vtorogo massiva cotorii budet sobran
        return avg;
    }
}
