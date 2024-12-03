public class Cezar {

    String sifruj(String text){
        String zasifrovano = "";
        for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);
            char znakSifrovany = (char)(znak +1);
            zasifrovano = zasifrovano + znakSifrovany;
        }
        return zasifrovano;
    }
}
