package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Akshaj";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "AkshajKashyap";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        
        Team team = new Team("f26-13");
        team.addMember("Akshaj");
        team.addMember("Alex");
        team.addMember("Branden");
        team.addMember("Kun");
        team.addMember("Max");
        team.addMember("Michael");
        return team;
    }
}
