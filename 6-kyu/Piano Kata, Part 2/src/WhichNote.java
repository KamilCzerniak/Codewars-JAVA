public class WhichNote {
    public static String whichNote(int keyPressCount) {
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        return notes[((keyPressCount - 1) % 88) % 12];
    }
}
