package PrevalidationTGBot;

public  class Config {

    public final String BOT_USERNAME ;
    public  final String BOT_TOKEN;
    public  final int CREATOR_ID ;


    public Config() {

        this.BOT_USERNAME = System.getenv("BOT_USERNAME");

        this.BOT_TOKEN = System.getenv("BOT_TOKEN");

        this.CREATOR_ID = Integer.parseInt(System.getenv("CREATOR_ID"));
    }


    public String getBOT_USERNAME() {
        return BOT_USERNAME;
    }
    public String getBOT_TOKEN() {
        return BOT_TOKEN;
    }
    public int getCREATOR_ID() {
        return CREATOR_ID;
    }

}
