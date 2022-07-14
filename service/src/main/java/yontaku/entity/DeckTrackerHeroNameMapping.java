package yontaku.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DeckTrackerHeroNameMapping {

    @Id
    private String deckTrackerHeroName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "heroId")
    private Hero hero;

    public String getDeckTrackerHeroName() {
        return deckTrackerHeroName;
    }
    public void setDeckTrackerHeroName(String deckTrackerHeroName) {
        this.deckTrackerHeroName = deckTrackerHeroName;
    }
    // public String getHeroName() {
    //     return heroName;
    // }
    // public void setHeroName(String heroName) {
    //     this.heroName = heroName;
    // }

}

