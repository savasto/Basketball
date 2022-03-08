public class Player {
private String playerName;
private String playerPassport;
private int playerHeight;
private String playerBirthDate;
private int playerScore;//numero de canastas
private int playerRebound;
private int playerAssistance;
private String teamName;

    public Player(String playerName, String playerPassport, int playerHeight, String playerBirthDate,
                  int playerScore, int playerRebound, int playerAssistance, String teamName) {
        this.playerName = playerName;
        this.playerPassport = playerPassport;
        this.playerHeight = playerHeight;
        this.playerBirthDate = playerBirthDate;
        this.playerScore = playerScore;
        this.playerRebound = playerRebound;
        this.playerAssistance = playerAssistance;
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "\n Player{" +
                "playerName='" + playerName + '\'' +
                ", playerPassport='" + playerPassport + '\'' +
                ", playerHeight=" + playerHeight +
                ", playerBirthDate='" + playerBirthDate + '\'' +
                ", playerScore=" + playerScore +
                ", playerRebound=" + playerRebound +
               ", playerAssistance=" + playerAssistance +
                ", teamName='" + teamName + '\'' +
                '}';

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPassport() {
        return playerPassport;
    }

    public void setPlayerPassport(String playerPassport) {
        this.playerPassport = playerPassport;
    }

    public double getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(int playerHeight) {
        this.playerHeight = playerHeight;
    }

    public String getPlayerBirthDate() {
        return playerBirthDate;
    }

    public void setPlayerBirthDate(String playerBirthDate) {
        this.playerBirthDate = playerBirthDate;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerRebound() {
        return playerRebound;
    }

    public void setPlayerRebound(int playerRebound) {
        this.playerRebound = playerRebound;
    }

    public int getPlayerAssistance() {
        return playerAssistance;
    }

    public void setPlayerAssistance(int playerAssistance) {
        this.playerAssistance = playerAssistance;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
