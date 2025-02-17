package yontaku.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Account implements Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountid_seq")
    @SequenceGenerator(name = "accountid_seq", sequenceName = "accountid_seq", allocationSize = 1)
    private int id;
    private String oicdUserName;
    private String name;
    private boolean evaluateByMinderRanking;
    private LocalDateTime updatedAt;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private Integer tierTableId;

    public String getOicdUserName() {
        return oicdUserName;
    }
    public void setOicdUserName(String oicdUserName) {
        this.oicdUserName = oicdUserName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getTierTableId() {
        return tierTableId;
    }
    public void setTierTableId(Integer tierTableId) {
        this.tierTableId = tierTableId;
    }
    public boolean isEvaluateByMinderRanking() {
        return evaluateByMinderRanking;
    }
    public void setEvaluateByMinderRanking(boolean evaluateByMinderRanking) {
        this.evaluateByMinderRanking = evaluateByMinderRanking;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
