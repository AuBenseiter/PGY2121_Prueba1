package Models;

import java.util.List;

public class Clubes {
    private List<Club> clubes;

    public void Club(){
    }

    public List<Club> getClubes() {
        return clubes;
    }

    public void setClubes(List<Club> clubes) {
        this.clubes = clubes;
    }

    public void ConcatenarColoresClubes()
    {
        String colores = "";

        for (Club club: this.clubes) {
            colores += club.getColores() + ", ";
        }
        System.out.println(colores);
    }
}
