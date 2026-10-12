// bahar topkaya 240446001 week3 lab1
public class Track {

    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicits;
}
// TODO 1: Full constructor (all four parameters).
public Track(String title, String artist, int durationSeconds, boolean isExplicit ){
    this.title = title;
    this.artist = artist;
    this.isExplicit = isExplicit;
    if (durationSeconds >= 0) {
        this.durationSeconds = durationSeconds;
    }
    else {
        System.out.println("warning: Invalid duration. Setting to 0.");
    }
}
// TODO 2: Title + artist constructor.bbn
public Track( String Title, String artist){
    this(title, artist, 0, false);
}
// TODO 3: Title-only constructor.
public Track(String title){
    this(title, "unknown artist", 0, false);
}
//TODO 4: Default constructor.
public Track(){
    this("unknowntitle","Unknown Artist", 0, false );
}
// TODO 5: Getters for all four fields
public String getTitle(){
    return title;
}
public String getArtist(){
    return artist;
}
public int getDurationSeconds(){
    return durationSeconds;
}
public boolean getIsExplicit(){
    return isExplicit;
}
// TODO 6: getDurationFormatted()
public String getDurationFormatted(){
    int minutes = durationSeconds / 60;
    int seconds = seconds % 60;
    return String.format("%d:%02d" , minutes, seconds);
}
// TODO 7: toString()
@Override
public String toString(){
    String info = '/' " + title + '/' by "' + artist + ' "[" + getDurationFormatted() + "]";
    if (isExplicit) {
        info += " [EXPLICIT]";
    }
    return info;
}























