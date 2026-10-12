// bahar topkaya 240446001 week3 lab1
public class PlaylistDemo {
    public static void main(String[] args){
        System.out.println("=== Playlist Track Demo ===\n");
        // TODO: Create one Track object using EACH of the four constructors.

        // --- Default constructor ------
        Track defaultTrack = new Track();
        System.out.println("default Track:");
        System.out.println(defaultTrack.toString() + "\n");

// --- Title-only constructor ---
        Track titleTrack = new Track("Neon Lights ");
        System.out.println("Title-only track:");
        System.out.println(titleTrack.toString() + "\n");

// --- Title + artist constructor ---
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack.toString() + "\n");

// --- Full constructor ---
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 0.0, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack.toString() + "\n");

// --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", 3.30, false);
        System.out.println(invalidTrack.toString() + "\n");

// --- Getter test ---
        Track explicitTrack = new Track("Stardust", "Stellar Echo", 4.02 , true);
        System.out.println("Getter Test:");
        System.out.println("Title:     " + explicitTrack.getTitle());
        System.out.println("Artist:    " + explicitTrack.getArtist());
        System.out.println("Duration:  " + explicitTrack.getDurationFormatted());
        System.out.println("Explicit:  " + explicitTrack.isExplicit());
    }
}