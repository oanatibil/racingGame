package org.fasttrackit;

public class Game {

    private Track[] tracks = new Track[10];

    // ? int[] integers = new int[10];?

    Vehicle firstCompetitor;
    Vehicle secondCompetitor;

    public void start() {

        addTracks();
        displayAvailableTracks();

    }

    private void addTracks()
    {

        Track track1 = new Track("highway", 300);
        Track track2 = new Track("seaside", 100);

        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvailableTracks() {

        System.out.println("Available tracks:");
        System.out.println(tracks[0].getName());
        System.out.println(tracks[1].getName());

    }



}
